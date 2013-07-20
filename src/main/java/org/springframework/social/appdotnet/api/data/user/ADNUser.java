package org.springframework.social.appdotnet.api.data.user;

import org.springframework.social.appdotnet.api.data.ADNAnnotation;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Represents an app.net user
 * @author Arik Galansky
 */
public class ADNUser {
    private final String id;
    private final String username;
    private final String name;
    private final ADNUserDescription description;
    private final String timezone;
    private final String locale;
    private final ADNImage avatarImage;
    private final ADNImage coverImage;
    private final ADNUserType type;
    private final Date createdAt;
    private final ADNUserCounts counts;
    private final Map<String, Object> appData;
    private final boolean followsYou;
    private final boolean youBlocked;
    private final boolean youFollow;
    private final boolean youMuted;
    private final boolean youCanSubscribe;
    private final boolean youCanFollow;
    private final String verifiedDomain;
    private final String canonicalUrl;
    private final List<ADNAnnotation> annotations;

    public enum ADNUserType {
        HUMAN, FEED, BOT
    }

    public ADNUser(String id, String username, String name, ADNUserDescription description, String timezone, String locale, ADNImage avatarImage, ADNImage coverImage, String type, Date createdAt, ADNUserCounts counts, Map<String, Object> appData, boolean followsYou, boolean youBlocked, boolean youFollow, boolean youMuted, boolean youCanSubscribe, boolean youCanFollow, String verifiedDomain, String canonicalUrl, List<ADNAnnotation> annotations) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.description = description;
        this.timezone = timezone;
        this.locale = locale;
        this.avatarImage = avatarImage;
        this.coverImage = coverImage;
        if(type != null) {
            this.type = ADNUserType.valueOf(type.toUpperCase());
        } else {
            this.type = null;
        }
        this.createdAt = createdAt;
        this.counts = counts;
        this.appData = appData;
        this.followsYou = followsYou;
        this.youBlocked = youBlocked;
        this.youFollow = youFollow;
        this.youMuted = youMuted;
        this.youCanSubscribe = youCanSubscribe;
        this.youCanFollow = youCanFollow;
        this.verifiedDomain = verifiedDomain;
        this.canonicalUrl = canonicalUrl;
        this.annotations = annotations;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public ADNUserDescription getDescription() {
        return description;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getLocale() {
        return locale;
    }

    public ADNImage getAvatarImage() {
        return avatarImage;
    }

    public ADNImage getCoverImage() {
        return coverImage;
    }

    public ADNUserType getType() {
        return type;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public int getFollowingCount() {
        return counts.getFollowing();
    }

    public int getFollowersCount() {
        return counts.getFollowers();
    }

    public int getPostsCount() {
        return counts.getPosts();
    }

    public int getStarsCount() {
        return counts.getStars();
    }

    public Map<String, Object> getAppData() {
        return appData;
    }

    public boolean isFollowsYou() {
        return followsYou;
    }

    public boolean isYouBlocked() {
        return youBlocked;
    }

    public boolean isYouFollow() {
        return youFollow;
    }

    public boolean isYouMuted() {
        return youMuted;
    }

    public boolean isYouCanSubscribe() {
        return youCanSubscribe;
    }

    public boolean isYouCanFollow() {
        return youCanFollow;
    }

    public String getCanonicalUrl() {
        return canonicalUrl;
    }

    public String getVerifiedDomain() {
        return verifiedDomain;
    }

    public List<ADNAnnotation> getAnnotations() {
        return annotations;
    }
}

package org.springframework.social.appdotnet.api.data.user;

import java.util.Date;
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
    private final String type;
    private final Date createdAt;
    private final ADNUserCounts counts;
    private final Map<String, Object> appData;
    private final boolean followsYou;
    private final boolean youFollow;
    private final boolean youMuted;

    public ADNUser(String id, String username, String name, ADNUserDescription description, String timezone,
                   String locale, ADNImage avatarImage, ADNImage coverImage, String type, Date createdAt,
                   ADNUserCounts counts, Map<String, Object> appData, boolean followsYou, boolean youFollow, boolean youMuted) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.description = description;
        this.timezone = timezone;
        this.locale = locale;
        this.avatarImage = avatarImage;
        this.coverImage = coverImage;
        this.type = type;
        this.createdAt = createdAt;
        this.counts = counts;
        this.appData = appData;
        this.followsYou = followsYou;
        this.youFollow = youFollow;
        this.youMuted = youMuted;
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

    public String getType() {
        return type;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public ADNUserCounts getCounts() {
        return counts;
    }

    public Map<String, Object> getAppData() {
        return appData;
    }

    public boolean isFollowsYou() {
        return followsYou;
    }

    public boolean isYouFollow() {
        return youFollow;
    }

    public boolean isYouMuted() {
        return youMuted;
    }
}

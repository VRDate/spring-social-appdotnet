package org.springframework.social.appdotnet.api.data.user;

import java.util.Map;

/**
 * @author Arik Galansky
 */
public class ADNUser {
    private String id;
    private String username;
    private String name;
    private ADNUserDescription description;
    private String timezone;
    private String locale;
    private ADNImage avatarImage;
    private ADNImage coverImage;
    private String type;
    private String createdAt;
    private Map<String, Integer> counts;
    // TODO Arikg: String? JSONObject? Object?
    private Object appData;
    private Boolean followsYou;
    private Boolean youFollow;
    private Boolean youMuted;

    public ADNUser(String id, String username, String name, ADNUserDescription description, String timezone,
                   String locale, ADNImage avatarImage, ADNImage coverImage, String type, String createdAt,
                   Map<String, Integer> counts, Object appData, Boolean followsYou, Boolean youFollow, Boolean youMuted) {
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

    public String getCreatedAt() {
        return createdAt;
    }

    public Map<String, Integer> getCounts() {
        return counts;
    }

    public Object getAppData() {
        return appData;
    }

    public Boolean getFollowsYou() {
        return followsYou;
    }

    public Boolean getYouFollow() {
        return youFollow;
    }

    public Boolean getYouMuted() {
        return youMuted;
    }
}

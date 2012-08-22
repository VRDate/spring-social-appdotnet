package org.springframework.social.appdotnet.api.data.user;

import java.util.Map;

/**
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
    private final String createdAt;
    private final Map<String, Integer> counts;
    // TODO Arikg: String? JSONObject? Object?
    private final Object appData;
    private final Boolean followsYou;
    private final Boolean youFollow;
    private final Boolean youMuted;

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

    public Boolean followsYou() {
        return followsYou;
    }

    public Boolean youFollow() {
        return youFollow;
    }

    public Boolean youMuted() {
        return youMuted;
    }
}

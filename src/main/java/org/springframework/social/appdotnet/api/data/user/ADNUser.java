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
    private ADNImage avatar_image;
    private ADNImage cover_image;
    private String type;
    private String created_at;
    // TODO Arikg: map or object?
    private Map<String, Integer> counts;
    // TODO Arikg: String? JSONObject? Object?
    private Object app_data;
    private Boolean follows_you;
    private Boolean you_follow;
    private Boolean you_muted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ADNUserDescription getDescription() {
        return description;
    }

    public void setDescription(ADNUserDescription description) {
        this.description = description;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public ADNImage getAvatar_image() {
        return avatar_image;
    }

    public void setAvatar_image(ADNImage avatar_image) {
        this.avatar_image = avatar_image;
    }

    public ADNImage getCover_image() {
        return cover_image;
    }

    public void setCover_image(ADNImage cover_image) {
        this.cover_image = cover_image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public Map<String, Integer> getCounts() {
        return counts;
    }

    public void setCounts(Map<String, Integer> counts) {
        this.counts = counts;
    }

    public Object getApp_data() {
        return app_data;
    }

    public void setApp_data(Object app_data) {
        this.app_data = app_data;
    }

    public Boolean getFollows_you() {
        return follows_you;
    }

    public void setFollows_you(Boolean follows_you) {
        this.follows_you = follows_you;
    }

    public Boolean getYou_follow() {
        return you_follow;
    }

    public void setYou_follow(Boolean you_follow) {
        this.you_follow = you_follow;
    }

    public Boolean getYou_muted() {
        return you_muted;
    }

    public void setYou_muted(Boolean you_muted) {
        this.you_muted = you_muted;
    }
}

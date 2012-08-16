package org.springframework.social.appdotnet.api.data.filter;

import java.util.List;

/**
 * @author Arik Galansky
 */
public class ADNFilter {
    private String id;
    private String type;
    private String name;
    private List<String> user_ids;
    private List<String> hashtags;
    private List<String> link_domains;
    private List<String> mention_user_ids;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getUser_ids() {
        return user_ids;
    }

    public void setUser_ids(List<String> user_ids) {
        this.user_ids = user_ids;
    }

    public List<String> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<String> hashtags) {
        this.hashtags = hashtags;
    }

    public List<String> getLink_domains() {
        return link_domains;
    }

    public void setLink_domains(List<String> link_domains) {
        this.link_domains = link_domains;
    }

    public List<String> getMention_user_ids() {
        return mention_user_ids;
    }

    public void setMention_user_ids(List<String> mention_user_ids) {
        this.mention_user_ids = mention_user_ids;
    }
}

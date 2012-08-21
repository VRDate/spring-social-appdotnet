package org.springframework.social.appdotnet.api.data.post;

import org.springframework.social.appdotnet.api.data.entities.ADNEntities;
import org.springframework.social.appdotnet.api.data.user.ADNUser;

import java.util.Date;

/**
 * @author Arik Galansky
 */
public class ADNPost {
    private String id;
    private ADNUser user;
    private Date createdAt;
    private String text;
    private String html;
    private ADNPostSource source;
    private String replyTo;
    private String threadId;
    private Integer numReplies;
    // TODO Arikg: add annotations
    private ADNEntities entities;
    private Boolean deleted;

    public ADNPost(String id, ADNUser user, Date createdAt, String text, String html, ADNPostSource source,
                   String replyTo, String threadId, Integer numReplies, ADNEntities entities, Boolean deleted) {
        this.id = id;
        this.user = user;
        this.createdAt = createdAt;
        this.text = text;
        this.html = html;
        this.source = source;
        this.replyTo = replyTo;
        this.threadId = threadId;
        this.numReplies = numReplies;
        this.entities = entities;
        this.deleted = deleted;
    }

    public String getId() {
        return id;
    }

    public ADNUser getUser() {
        return user;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getText() {
        return text;
    }

    public String getHtml() {
        return html;
    }

    public ADNPostSource getSource() {
        return source;
    }

    public String getReplyTo() {
        return replyTo;
    }

    public String getThreadId() {
        return threadId;
    }

    public Integer getNumReplies() {
        return numReplies;
    }

    public ADNEntities getEntities() {
        return entities;
    }

    public Boolean getDeleted() {
        return deleted;
    }
}
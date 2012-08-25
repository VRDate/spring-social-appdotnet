package org.springframework.social.appdotnet.api.data.post;

import org.springframework.social.appdotnet.api.data.entities.ADNEntities;
import org.springframework.social.appdotnet.api.data.user.ADNUser;

import java.util.Date;

/**
 * Represents a post inside App.net
 *
 * @author Arik Galansky
 */
public class ADNPost {
    private final String id;
    private final ADNUser user;
    private final Date createdAt;
    private final String text;
    private final String html;
    private final ADNPostSource source;
    private final String replyTo;
    private final String threadId;
    private final Integer numReplies;
    // TODO Arikg: add annotations
    private final ADNEntities entities;
    private final Boolean deleted;

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

    public Boolean isDeleted() {
        return deleted;
    }
}
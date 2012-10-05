package org.springframework.social.appdotnet.api.data.post;

import org.springframework.social.appdotnet.api.data.entities.ADNEntities;
import org.springframework.social.appdotnet.api.data.user.ADNUser;

import java.util.Date;
import java.util.List;
import java.util.Map;

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
    private final String canonicalUrl;
    private final String threadId;
    private final int replyCount;
    private final int starCount;
    private final int repostCount;
    private final List<ADNAnnotation> annotations;
    private final ADNEntities entities;
    // HACK: rename to avoid serialization collision with deprecated "deleted" field.
    private final boolean _deleted;
    private final boolean machineOnly;
    private final boolean youStarred;
    private final List<ADNUser> starredBy;
    private final boolean youReposted;
    private final List<ADNUser> reposters;
    private final ADNPost repostOf;

    public ADNPost(String id, ADNUser user, Date createdAt, String text, String html, ADNPostSource source,
                   String replyTo, String canonicalUrl, String threadId, int replyCount, int starCount, int repostCount,
                   List<ADNAnnotation> annotations, ADNEntities entities, boolean deleted, boolean machineOnly,
                   boolean youStarred, List<ADNUser> starredBy, boolean  youReposted, List<ADNUser> reposters, ADNPost repostOf) {
        this.id = id;
        this.user = user;
        this.createdAt = createdAt;
        this.text = text;
        this.html = html;
        this.source = source;
        this.replyTo = replyTo;
        this.canonicalUrl = canonicalUrl;
        this.threadId = threadId;
        this.replyCount = replyCount;
        this.starCount = starCount;
        this.repostCount = repostCount;
        this.annotations = annotations;
        this.entities = entities;
        this._deleted = deleted;
        this.machineOnly = machineOnly;
        this.youStarred = youStarred;
        this.starredBy = starredBy;
        this.youReposted = youReposted;
        this.reposters = reposters;
        this.repostOf = repostOf;
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

    public String getCanonicalUrl() {
        return canonicalUrl;
    }

    public String getThreadId() {
        return threadId;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public int getStarCount() {
        return starCount;
    }

    public int getRepostCount() {
        return repostCount;
    }

    public List<ADNAnnotation> getAnnotations() {
        return annotations;
    }

    public ADNEntities getEntities() {
        return entities;
    }

    public boolean isDeleted() {
        return _deleted;
    }

    public boolean isMachineOnly() {
        return machineOnly;
    }

    public boolean isYouStarred() {
        return youStarred;
    }

    public List<ADNUser> getStarredBy() {
        return starredBy;
    }

    public boolean isYouReposted() {
        return youReposted;
    }

    public List<ADNUser> getReposters() {
        return reposters;
    }

    public ADNPost getRepostOf() {
        return repostOf;
    }
}
package org.springframework.social.appdotnet.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.appdotnet.api.data.entities.ADNEntities;
import org.springframework.social.appdotnet.api.data.post.ADNAnnotation;
import org.springframework.social.appdotnet.api.data.post.ADNPost;
import org.springframework.social.appdotnet.api.data.post.ADNPostSource;
import org.springframework.social.appdotnet.api.data.user.ADNUser;

import java.util.Date;
import java.util.List;

/**
 * Mixin class for adding Jackson annotations to {@link org.springframework.social.appdotnet.api.data.post.ADNPost}
 *
 * @author Arik Galansky
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ADNPostMixin {
    @JsonCreator
    ADNPostMixin(
            @JsonProperty("id") String id,
            @JsonProperty("user") ADNUser user,
            @JsonProperty("created_at") Date createdAt,
            @JsonProperty("text") String text,
            @JsonProperty("html") String html,
            @JsonProperty("source") ADNPostSource source,
            @JsonProperty("reply_to") String replyTo,
            @JsonProperty("canonical_url") String canonicalUrl,
            @JsonProperty("thread_id") String threadId,
            @JsonProperty("num_replies") int replyCount,
            @JsonProperty("num_stars") int starCount,
            @JsonProperty("num_reposts") int repostCount,
            @JsonProperty("annotations") List<ADNAnnotation> annotations,
            @JsonProperty("entities") ADNEntities entities,
            @JsonProperty("is_deleted") boolean deleted,
            @JsonProperty("machine_only") boolean machineOnly,
            @JsonProperty("you_starred") boolean  youStarred,
            @JsonProperty("starred_by") List<ADNUser> starredBy,
            @JsonProperty("you_reposted") boolean youReposted,
            @JsonProperty("reposters") List<ADNUser> reposters,
            @JsonProperty("repost_of") ADNPost repostOf
    ) {
    }
}

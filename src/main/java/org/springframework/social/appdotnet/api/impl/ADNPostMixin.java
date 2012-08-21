package org.springframework.social.appdotnet.api.impl;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.appdotnet.api.data.entities.ADNEntities;
import org.springframework.social.appdotnet.api.data.post.ADNPostSource;
import org.springframework.social.appdotnet.api.data.user.ADNUser;

import java.util.Date;

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
            @JsonProperty("replyTo") String replyTo,
            @JsonProperty("thread_id") String threadId,
            @JsonProperty("num_replies") Integer numReplies,
            @JsonProperty("entities") ADNEntities entities,
            @JsonProperty("deleted") Boolean deleted
    ) {
    }
}

package org.springframework.social.appdotnet.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Mixin class for adding Jackson annotations to {@link org.springframework.social.appdotnet.api.data.entities.ADNMention}
 *
 * @author Arik Galansky
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ADNMentionMixin {
    @JsonCreator
    ADNMentionMixin(
            @JsonProperty("name") String name,
            @JsonProperty("id") String id,
            @JsonProperty("pos") Integer pos,
            @JsonProperty("len") Integer len
    ) {
    }
}

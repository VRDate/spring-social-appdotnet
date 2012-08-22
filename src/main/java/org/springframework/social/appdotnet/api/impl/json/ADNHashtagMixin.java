package org.springframework.social.appdotnet.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Mixin class for adding Jackson annotations to {@link org.springframework.social.appdotnet.api.data.entities.ADNHashtag}
 *
 * @author Arik Galansky
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ADNHashtagMixin {
    @JsonCreator
    ADNHashtagMixin(
            @JsonProperty("name") String name,
            @JsonProperty("pos") Integer pos,
            @JsonProperty("len") Integer len
    ) {
    }
}

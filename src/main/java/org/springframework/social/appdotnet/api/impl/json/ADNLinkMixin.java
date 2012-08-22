package org.springframework.social.appdotnet.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Mixin class for adding Jackson annotations to {@link org.springframework.social.appdotnet.api.data.entities.ADNLink}
 *
 * @author Arik Galansky
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ADNLinkMixin {
    @JsonCreator
    ADNLinkMixin(
            @JsonProperty("text") String text,
            @JsonProperty("url") String url,
            @JsonProperty("pos") Integer pos,
            @JsonProperty("len") Integer len
    ) {
    }
}
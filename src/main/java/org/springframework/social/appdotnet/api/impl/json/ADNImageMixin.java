package org.springframework.social.appdotnet.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Mixin class for adding Jackson annotations to {@link org.springframework.social.appdotnet.api.data.user.ADNImage}
 *
 * @author Arik Galansky
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ADNImageMixin {
    @JsonCreator
    ADNImageMixin(
            @JsonProperty("height") int height,
            @JsonProperty("width") int width,
            @JsonProperty("url") String url,
            @JsonProperty("is_default") boolean isDefault
    ) {
    }
}

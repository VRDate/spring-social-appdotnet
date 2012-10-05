package org.springframework.social.appdotnet.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Mixin class for adding Jackson annotations to {@link org.springframework.social.appdotnet.api.data.post.ADNPostSource}
 *
 * @author Arik Galansky
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ADNPostSourceMixin {
    @JsonCreator
    ADNPostSourceMixin(
            @JsonProperty("name") String name,
            @JsonProperty("link") String link
    ) {
    }
}

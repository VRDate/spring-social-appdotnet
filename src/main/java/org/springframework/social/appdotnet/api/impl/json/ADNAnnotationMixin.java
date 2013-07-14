package org.springframework.social.appdotnet.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Map;

/**
 * Mixin class for adding Jackson annotations to {@link org.springframework.social.appdotnet.api.data.ADNAnnotation}
 *
 * @author Arik Galansky
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ADNAnnotationMixin {
    @JsonCreator
    ADNAnnotationMixin(
            @JsonProperty("type") String type,
            @JsonProperty("value") Map<String, Object> value
    ) {
    }
}

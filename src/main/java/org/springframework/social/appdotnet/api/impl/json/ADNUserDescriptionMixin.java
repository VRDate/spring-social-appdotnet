package org.springframework.social.appdotnet.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.appdotnet.api.data.entities.ADNEntities;

/**
 * Mixin class for adding Jackson annotations to {@link org.springframework.social.appdotnet.api.data.user.ADNUserDescription}
 *
 * @author Arik Galansky
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ADNUserDescriptionMixin {
    @JsonCreator
    ADNUserDescriptionMixin(
            @JsonProperty("text") String text,
            @JsonProperty("html") String html,
            @JsonProperty("entities") ADNEntities entities
    ) {
    }
}

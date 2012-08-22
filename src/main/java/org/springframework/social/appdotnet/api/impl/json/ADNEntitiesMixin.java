package org.springframework.social.appdotnet.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.appdotnet.api.data.entities.ADNHashtag;
import org.springframework.social.appdotnet.api.data.entities.ADNLink;
import org.springframework.social.appdotnet.api.data.entities.ADNMention;

import java.util.List;

/**
 * Mixin class for adding Jackson annotations to {@link org.springframework.social.appdotnet.api.data.entities.ADNEntities}
 *
 * @author Arik Galansky
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ADNEntitiesMixin {
    @JsonCreator
    ADNEntitiesMixin(
            @JsonProperty("mentions") List<ADNMention> mentions,
            @JsonProperty("hashtags") List<ADNHashtag> hashtags,
            @JsonProperty("links") List<ADNLink> links
    ) {
    }
}
package org.springframework.social.appdotnet.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Mixin class for adding Jackson annotations to {@link org.springframework.social.appdotnet.api.data.ADNResponseMeta}
 *
 * @author Arik Galansky
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ADNResponseMetaMixin {
    @JsonCreator
    public ADNResponseMetaMixin(
            @JsonProperty("code") int code,
            @JsonProperty("max_id") String maxId,
            @JsonProperty("min_id") String minId,
            @JsonProperty("more") boolean more,
            @JsonProperty("error_message") String errorMessage,
            @JsonProperty("error_slug") String errorSlug
    ) {
    }
}

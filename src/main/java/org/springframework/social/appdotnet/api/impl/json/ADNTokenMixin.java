package org.springframework.social.appdotnet.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.appdotnet.api.data.user.ADNUser;

import java.util.List;

/**
 * Mixin class for adding Jackson annotations to {@link org.springframework.social.appdotnet.api.data.ADNToken}
 *
 * @author Arik Galansky
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ADNTokenMixin {
    @JsonCreator
    ADNTokenMixin(
            @JsonProperty("user") ADNUser user,
            @JsonProperty("scopes") List<String> scopes
    ) {
    }
}

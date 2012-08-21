package org.springframework.social.appdotnet.api.impl;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.appdotnet.api.data.user.ADNImage;
import org.springframework.social.appdotnet.api.data.user.ADNUserDescription;

import java.util.Map;

/**
 * Mixin class for adding Jackson annotations to {@link org.springframework.social.appdotnet.api.data.user.ADNUser}
 *
 * @author Arik Galansky
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ADNUserMixin {
    @JsonCreator
    ADNUserMixin(
            @JsonProperty("id") String id,
            @JsonProperty("username") String username,
            @JsonProperty("name") String name,
            @JsonProperty("description") ADNUserDescription description,
            @JsonProperty("timezone") String timezone,
            @JsonProperty("locale") String locale,
            @JsonProperty("avatar_image") ADNImage avatarImage,
            @JsonProperty("cover_image") ADNImage coverImage,
            @JsonProperty("type") String type,
            @JsonProperty("created_at") String createdAt,
            @JsonProperty("counts") Map<String, Integer> counts,
            @JsonProperty("app_data") Object appData,
            @JsonProperty("follows_you") Boolean followsYou,
            @JsonProperty("you_follow") Boolean youFollow,
            @JsonProperty("you_muted") Boolean youMuted
    ) {
    }
}

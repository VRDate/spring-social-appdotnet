package org.springframework.social.appdotnet.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.appdotnet.api.data.ADNAnnotation;
import org.springframework.social.appdotnet.api.data.user.ADNImage;
import org.springframework.social.appdotnet.api.data.user.ADNUserCounts;
import org.springframework.social.appdotnet.api.data.user.ADNUserDescription;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Mixin class for adding Jackson annotations to {@link org.springframework.social.appdotnet.api.data.user.ADNUser}
 *
 * @author Arik Galansky
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ADNUserMixin {
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
            @JsonProperty("created_at") Date createdAt,
            @JsonProperty("counts") ADNUserCounts counts,
            @JsonProperty("app_data") Map<String, Object> appData,
            @JsonProperty("follows_you") boolean followsYou,
            @JsonProperty("you_blocked") boolean youBlocked,
            @JsonProperty("you_follow") boolean youFollow,
            @JsonProperty("you_muted") boolean youMuted,
            @JsonProperty("you_can_subscribe") boolean youCanSubscribe,
            @JsonProperty("you_can_follow") boolean youCanFollow,
            @JsonProperty("verified_domain") String verifiedDomain,
            @JsonProperty("canonical_url") String canonicalUrl,
            @JsonProperty("annotations") List<ADNAnnotation> annotations
    ) {
    }
}

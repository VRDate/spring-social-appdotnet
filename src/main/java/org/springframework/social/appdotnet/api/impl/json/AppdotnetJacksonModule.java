package org.springframework.social.appdotnet.api.impl.json;

import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.module.SimpleModule;
import org.springframework.social.appdotnet.api.data.ADNResponseMeta;
import org.springframework.social.appdotnet.api.data.ADNToken;
import org.springframework.social.appdotnet.api.data.entities.ADNEntities;
import org.springframework.social.appdotnet.api.data.entities.ADNHashtag;
import org.springframework.social.appdotnet.api.data.entities.ADNLink;
import org.springframework.social.appdotnet.api.data.entities.ADNMention;
import org.springframework.social.appdotnet.api.data.post.ADNAnnotation;
import org.springframework.social.appdotnet.api.data.post.ADNPost;
import org.springframework.social.appdotnet.api.data.post.ADNPostSource;
import org.springframework.social.appdotnet.api.data.user.ADNImage;
import org.springframework.social.appdotnet.api.data.user.ADNUser;
import org.springframework.social.appdotnet.api.data.user.ADNUserCounts;
import org.springframework.social.appdotnet.api.data.user.ADNUserDescription;

/**
 * Jackson Module class to add mixin annotations to Appdotnet model classes.
 *
 * @author Arik Galansky
 */
public class AppdotnetJacksonModule extends SimpleModule {

    public AppdotnetJacksonModule() {
        super("AppdotnetJacksonModule", new Version(1, 0, 0, null));
    }

    @Override
    public void setupModule(SetupContext context) {
        context.setMixInAnnotations(ADNPost.class, ADNPostMixin.class);
        context.setMixInAnnotations(ADNPostSource.class, ADNPostSourceMixin.class);
        context.setMixInAnnotations(ADNAnnotation.class, ADNAnnotationMixin.class);
        context.setMixInAnnotations(ADNEntities.class, ADNEntitiesMixin.class);
        context.setMixInAnnotations(ADNHashtag.class, ADNHashtagMixin.class);
        context.setMixInAnnotations(ADNMention.class, ADNMentionMixin.class);
        context.setMixInAnnotations(ADNLink.class, ADNLinkMixin.class);
        context.setMixInAnnotations(ADNUser.class, ADNUserMixin.class);
        context.setMixInAnnotations(ADNUserDescription.class, ADNUserDescriptionMixin.class);
        context.setMixInAnnotations(ADNUserCounts.class, ADNUserCountsMixin.class);
        context.setMixInAnnotations(ADNImage.class, ADNImageMixin.class);
        context.setMixInAnnotations(ADNToken.class, ADNTokenMixin.class);
        context.setMixInAnnotations(ADNResponseMeta.class, ADNResponseMetaMixin.class);
    }
}

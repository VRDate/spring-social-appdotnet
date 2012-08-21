package org.springframework.social.appdotnet.api.impl;

import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.module.SimpleModule;
import org.springframework.social.appdotnet.api.data.post.ADNPost;
import org.springframework.social.appdotnet.api.data.user.ADNUser;

/**
 * Jackson Module class to add mixin annotations to Appdotnet model classes.
 *
 * @author Arik Galansky
 */
class AppdotnetJacksonModule extends SimpleModule {

    public AppdotnetJacksonModule() {
        super("AppdotnetJacksonModule", new Version(1, 0, 0, null));
    }

    @Override
    public void setupModule(SetupContext context) {
        context.setMixInAnnotations(ADNPost.class, ADNPostMixin.class);
        context.setMixInAnnotations(ADNUser.class, ADNUserMixin.class);
    }
}

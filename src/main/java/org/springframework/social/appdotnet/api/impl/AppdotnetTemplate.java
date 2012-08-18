package org.springframework.social.appdotnet.api.impl;

import org.springframework.social.appdotnet.api.Appdotnet;
import org.springframework.social.appdotnet.api.PostsOperations;
import org.springframework.social.appdotnet.api.UsersOperations;
import org.springframework.social.appdotnet.api.impl.PostsTemplate;
import org.springframework.social.appdotnet.api.impl.UsersTemplate;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;

/**
 * @author Arik Galansky
 */
public class AppdotnetTemplate extends AbstractOAuth2ApiBinding implements Appdotnet {

    private PostsOperations postsOperations;
    private UsersOperations usersOperations;

    public AppdotnetTemplate(String accessToken) {
        super(accessToken);
        postsOperations = new PostsTemplate(accessToken, getRestTemplate());
        usersOperations = new UsersTemplate(accessToken, getRestTemplate());
    }

    @Override
    public PostsOperations postsOperations() {
        return postsOperations;
    }

    @Override
    public UsersOperations usersOperations() {
        return usersOperations;
    }
}

package org.springframework.social.appdotnet.api.impl;

import org.springframework.social.appdotnet.api.PostsOperations;
import org.springframework.social.appdotnet.api.data.post.ADNPost;
import org.springframework.web.client.RestTemplate;

/**
 * @author Arik Galansky
 */
public class PostsTemplate extends AbstractAppdotnetOperations implements PostsOperations {

    public PostsTemplate(String accessToken, RestTemplate restTemplate) {
        super(accessToken, restTemplate);
    }

    @Override
    protected String getVersion() {
        return VERSION_0;
    }

    @Override
    public ADNPost get(String id) {
        return restTemplate.getForObject(buildUri("posts/" + id), ADNPost.class);
    }
}

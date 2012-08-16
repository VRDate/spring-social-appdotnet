package org.springframework.social.appdotnet.api.impl;

import org.springframework.social.appdotnet.api.UsersOperations;
import org.springframework.social.appdotnet.api.data.user.ADNUser;
import org.springframework.web.client.RestTemplate;

/**
 * @author Arik Galansky
 */
public class UsersTemplate extends AbstractAppdotnetOperations implements UsersOperations {

    public UsersTemplate(String accessToken, RestTemplate restTemplate) {
        super(accessToken, restTemplate);
    }

    @Override
    protected String getVersion() {
        return VERSION_0;
    }

    @Override
    public ADNUser get(String id) {
        return restTemplate.getForObject(buildUri("users/" + id), ADNUser.class);
    }

    @Override
    public ADNUser getUserProfile() {
        return get("me");
    }

}

package org.springframework.social.appdotnet.api.impl;

import org.springframework.social.appdotnet.api.UsersOperations;
import org.springframework.social.appdotnet.api.data.ADNResponse;
import org.springframework.social.appdotnet.api.data.user.ADNUser;
import org.springframework.social.appdotnet.api.data.user.ADNUsers;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

/**
 * Implementation of {@link UsersOperations}, accessing App.net user related resources
 *
 * @author Arik Galansky
 */
class UsersTemplate extends AbstractAppdotnetOperations implements UsersOperations {

    public UsersTemplate(String accessToken, RestTemplate restTemplate) {
        super(accessToken, restTemplate, "users", VERSION_0);
    }

    @Override
    public ADNUser get(String id) {
        return restTemplate.getForObject(buildUri(id), UserResponse.class).getData();
    }

    @Override
    public ADNUser getUserProfile() {
        return get("me");
    }

    @Override
    public ADNUser follow(String id) {
        return restTemplate.getForObject(buildUri(id + "follow"), UserResponse.class).getData();
    }

    @Override
    public void unfollow(String id) {
        restTemplate.delete(buildUri(id + "follow"));
    }

    @Override
    public ADNUsers getFollowers(String id) {
        return getUsers(null, id + "followers");
    }

    @Override
    public ADNUsers getFollowing(String id) {
        return getUsers(null, id + "following");
    }

    @Override
    public ADNUser mute(String id) {
        return restTemplate.postForObject(buildUri(id + "mute"), null, UserResponse.class).getData();

    }

    @Override
    public void unmute(String id) {
        restTemplate.delete(buildUri(id + "mute"));
    }

    @Override
    public ADNUsers getMutedUsers() {
        return getUsers(null, "me/muted");
    }

    // private

    private ADNUsers getUsers(Map<String, String> extraParams, String action) {
        ADNResponse<List<ADNUser>> response = restTemplate.getForObject(buildUri(action, extraParams), UsersResponse.class);
        return new ADNUsers(response.getData(), createPaging(response.getMeta()));
    }
}

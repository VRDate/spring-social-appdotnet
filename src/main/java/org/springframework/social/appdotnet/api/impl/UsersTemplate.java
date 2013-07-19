package org.springframework.social.appdotnet.api.impl;

import org.springframework.social.appdotnet.api.UsersOperations;
import org.springframework.social.appdotnet.api.data.ADNResponse;
import org.springframework.social.appdotnet.api.data.user.ADNUser;
import org.springframework.social.appdotnet.api.data.user.ADNUsers;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
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
        return get(id, null);
    }

    @Override
    public ADNUser get(String id, Map<String, String> extraParams) {
        return restTemplate.getForObject(buildUri(id, extraParams), UserResponse.class).getData();
    }

    @Override
    public ADNUser getUserProfile() {
        return getUserProfile(null);
    }

    @Override
    public ADNUser getUserProfile(Map<String, String> extraParams) {
        return get("me", extraParams);
    }

    @Override
    public ADNUsers get(List<String> ids) {
        return get(ids, null);
    }

    @Override
    public ADNUsers get(List<String> ids, Map<String, String> extraParams) {
        if(extraParams == null) {
            extraParams = new HashMap<String, String>();
        }
        extraParams.put("ids", concatListToString(ids));
        return getUsers(extraParams, "");
    }

    @Override
    public ADNUsers search(String q, Integer count) {
        return search(q,count, null);
    }

    @Override
    public ADNUsers search(String q, Integer count, Map<String, String> extraParams) {
        if(extraParams == null) {
            extraParams = new HashMap<String, String>();
        }
        extraParams.put("q", q);
        if(count != null) {
            extraParams.put("count", count.toString());
        }
        return getUsers(extraParams, "search");
    }

    @Override
    public ADNUser follow(String id) {
        return restTemplate.postForObject(buildUri(id + "/follow"), null, UserResponse.class).getData();
    }

    @Override
    public void unfollow(String id) {
        restTemplate.delete(buildUri(id + "/follow"));
    }

    @Override
    public ADNUsers getFollowers(String id) {
        return getUsers(null, id + "/followers");
    }

    @Override
    public List<String> getFollowersIds(String id) {
        return (List<String>) restTemplate.getForObject(buildUri(id + "/followers/ids"), ADNResponse.class).getData();
    }

    @Override
    public ADNUsers getFollowing(String id) {
        return getUsers(null, id + "/following");
    }

    @Override
    public List<String> getFollowingIds(String id) {
        return (List<String>) restTemplate.getForObject(buildUri(id + "/following/ids"), ADNResponse.class).getData();
    }

    @Override
    public ADNUser mute(String id) {
        return restTemplate.postForObject(buildUri(id + "/mute"), null, UserResponse.class).getData();

    }

    @Override
    public void unmute(String id) {
        restTemplate.delete(buildUri(id + "/mute"));
    }

    @Override
    public ADNUsers getMutedUsers() {
        return getUsers(null, "me/muted");
    }

    @Override
    public ADNUsers getMutedUsers(String id) {
        return getUsers(null, id + "/muted");
    }

    // private

    private ADNUsers getUsers(Map<String, String> extraParams, String action) {
        ADNResponse<List<ADNUser>> response = restTemplate.getForObject(buildUri(action, extraParams), UsersResponse.class);
        return new ADNUsers(response.getData(), createPaging(response.getMeta()));
    }

    private String concatListToString(List<String> items) {
        StringBuilder sb = new StringBuilder();
        String delim = "";
        for (String i : items) {
            sb.append(delim).append(i);
            delim = ",";
        }
        return sb.toString();
    }
}

package org.springframework.social.appdotnet.api.impl;

import org.springframework.social.appdotnet.api.UsersOperations;
import org.springframework.social.appdotnet.api.data.post.ADNPost;
import org.springframework.social.appdotnet.api.data.post.ADNPostsList;
import org.springframework.social.appdotnet.api.data.user.ADNUser;
import org.springframework.social.appdotnet.api.data.user.ADNUsersList;
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
        return restTemplate.getForObject(buildUri(id), ADNUser.class);
    }

    @Override
    public ADNUser getUserProfile() {
        return get("me");
    }

    @Override
    public ADNUser follow(String id) {
        return restTemplate.postForObject(buildUri(id + "follow"), null, ADNUser.class);
    }

    @Override
    public void unfollow(String id) {
        restTemplate.delete(buildUri(id + "follow"));
    }

    @Override
    public List<ADNUser> getFollowers(String id) {
        return restTemplate.getForObject(buildUri(id + "followers"), ADNUsersList.class);
    }

    @Override
    public List<ADNUser> getFollowing(String id) {
        return restTemplate.getForObject(buildUri(id + "following"), ADNUsersList.class);
    }

    @Override
    public ADNUser mute(String id) {
        return restTemplate.postForObject(buildUri(id + "mute"), null, ADNUser.class);
    }

    @Override
    public void unmute(String id) {
        restTemplate.delete(buildUri(id + "mute"));
    }

    @Override
    public List<ADNUser> getMutedUsers() {
        return restTemplate.getForObject(buildUri("me/following"), ADNUsersList.class);
    }

    @Override
    public List<ADNPost> getPosts(String userId, Map<String, String> extraParams) {
        return restTemplate.getForObject(buildUri(userId + "/posts", extraParams), ADNPostsList.class);
    }

    @Override
    public List<ADNPost> getPosts(String userId) {
        return getPosts(userId, null);
    }

    @Override
    public List<ADNPost> getMentions(String userId, Map<String, String> extraParams) {
        return restTemplate.getForObject(buildUri(userId + "/mentions", extraParams), ADNPostsList.class);
    }

    @Override
    public List<ADNPost> getMentions(String userId) {
        return getMentions(userId, null);
    }
}

package org.springframework.social.appdotnet.api;

import org.springframework.social.appdotnet.api.data.user.ADNUser;

import java.util.List;

/**
 * @author Arik Galansky
 */
public interface UsersOperations {
    public ADNUser get(String id);

    public ADNUser getUserProfile();

    public ADNUser follow(String id);

    public void unfollow(String id);

    public List<ADNUser> getFollowers(String id);

    public List<ADNUser> getFollowing(String id);

    public ADNUser mute(String id);

    public void unmute(String id);

    public List<ADNUser> getMuted();

}

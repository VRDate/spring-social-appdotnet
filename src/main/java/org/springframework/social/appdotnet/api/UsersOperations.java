package org.springframework.social.appdotnet.api;

import org.springframework.social.appdotnet.api.data.user.ADNUser;

/**
 * @author Arik Galansky
 */
public interface UsersOperations {
    public ADNUser get(String id);

    public ADNUser getUserProfile();

    // TODO Arikg: uncomment and implement
//    public ADNUser follow(String id);
//
//    public ADNUser unfollow(String id);
//
//    public List<ADNUser> getFollowers(String id);
//
//    public List<ADNUser> getFollowing(String id);

}

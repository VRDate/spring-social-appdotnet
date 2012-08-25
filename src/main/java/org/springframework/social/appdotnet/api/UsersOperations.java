package org.springframework.social.appdotnet.api;

import org.springframework.social.appdotnet.api.data.post.ADNPost;
import org.springframework.social.appdotnet.api.data.user.ADNUser;

import java.util.List;
import java.util.Map;

/**
 * Interface defining the operations for retrieving information about App.net users.
 *
 * @author Arik Galansky
 */
public interface UsersOperations {
    /**
     * Retrieve a specific user's information
     *
     * @param id user id of the user to get
     * @return User an {@link ADNUser} object representing requested user profile
     */
    public ADNUser get(String id);

    /**
     * Retrieve currently logged in user information
     *
     * @return User an {@link ADNUser} object representing current user profile
     */
    public ADNUser getUserProfile();

    /**
     * Start following the user who's ID was specified
     *
     * @param id App.net user id of the user you wish to start following
     * @return an {@link ADNUser} object representing the user that you are now following
     */
    public ADNUser follow(String id);

    /**
     * Stop following the user who's ID was specified
     *
     * @param id App.net user id of the user you wish to stop following
     */
    public void unfollow(String id);

    /**
     * Get all the followers of the user specified
     *
     * @param id App.net id of the user you wish to get followers of
     * @return a List of {@link ADNUser} objects representing all the user's followers
     */
    public List<ADNUser> getFollowers(String id);

    /**
     * Get all the users that the specified user is following
     *
     * @param id App.net id of the user you wish to get a following list of
     * @return a List of {@link ADNUser} objects representing all the users that the specified user is following
     */
    public List<ADNUser> getFollowing(String id);

    /**
     * Mute the user who's ID was specified
     *
     * @param id App.net user id of the user you wish to mute
     * @return an {@link ADNUser} object representing the user that that is muted
     */
    public ADNUser mute(String id);

    /**
     * Un-Mute the user who's ID was specified
     *
     * @param id App.net user id of the user you remove from muted list
     */
    public void unmute(String id);

    /**
     * Get all the users that the currently logged in user is following.
     * Note: that this method can only be called for current logged in user.
     *
     * @return a List of {@link ADNUser} objects representing all the users that the logged in user muted
     */
    public List<ADNUser> getMutedUsers();

    /**
     * Retrieve all posts created by the specified user
     *
     * @param userId App.net user ID of the user whose posts you wish to retrieve
     * @return a List of {@link ADNPost} objects all created by the user specified (without the user in the)
     */
    public List<ADNPost> getPosts(String userId);

    /**
     * Retrieve all posts created by the specified user
     *
     * @param userId App.net user ID of the user whose posts you wish to retrieve
     * @param extraParams extra parameters to modify the query, best used with {@link GeneralParametersBuilder}
     * @return a List of {@link ADNPost} objects all created by the user specified (without the user in the)
     */
    public List<ADNPost> getPosts(String userId, Map<String, String> extraParams);

    /**
     * Retrieve all posts that the specified user was mentioned in
     *
     * @param userId App.net user ID of the user whose mentions you wish to retrieve
     * @return a List of {@link ADNPost} objects in which the user is mentioned
     */
    public List<ADNPost> getMentions(String userId);

    /**
     * Retrieve all posts that the specified user was mentioned in
     *
     * @param userId      userId App.net user ID of the user whose mentions you wish to retrieve
     * @param extraParams extra parameters to modify the query, best used with {@link GeneralParametersBuilder}
     * @return a List of {@link ADNPost} objects in which the user is mentioned
     */
    public List<ADNPost> getMentions(String userId, Map<String, String> extraParams);

}

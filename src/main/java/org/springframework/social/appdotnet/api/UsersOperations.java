package org.springframework.social.appdotnet.api;

import org.springframework.social.appdotnet.api.data.user.ADNUser;
import org.springframework.social.appdotnet.api.data.user.ADNUsers;

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
    public ADNUsers getFollowers(String id);

    /**
     * Get all the users that the specified user is following
     *
     * @param id App.net id of the user you wish to get a following list of
     * @return a List of {@link ADNUser} objects representing all the users that the specified user is following
     */
    public ADNUsers getFollowing(String id);

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
    public ADNUsers getMutedUsers();

}

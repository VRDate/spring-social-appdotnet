package org.springframework.social.appdotnet.api;

import org.springframework.social.appdotnet.api.data.user.ADNUser;
import org.springframework.social.appdotnet.api.data.user.ADNUserUpdate;
import org.springframework.social.appdotnet.api.data.user.ADNUsers;

import java.io.IOException;
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
     * Retrieve a specific user's information
     *
     * @param id user id of the user to get
     * @param extraParams extra parameters to modify the query, best used with {@link GeneralUserParametersBuilder}
     * @return User an {@link ADNUser} object representing requested user profile
     */
    public ADNUser get(String id, Map<String, String> extraParams);

    /**
     * Retrieve currently logged in user information
     *
     * @return User an {@link ADNUser} object representing current user profile
     */
    public ADNUser getUserProfile();

    /**
     * Retrieve currently logged in user information

     * @param extraParams extra parameters to modify the query, best used with {@link GeneralUserParametersBuilder}
     * @return User an {@link ADNUser} object representing current user profile
     */
    public ADNUser getUserProfile(Map<String, String> extraParams);

    /**
     * Retrieve a information for a list of users
     *
     * @param ids a list of user id's of the users to get
     * @return a List of {@link ADNUser} objects representing requested users profile
     */
    public ADNUsers get(List<String> ids);

    /**
     * Retrieve a information for a list of users
     *
     * @param ids a list of user id's of the users to get
     * @param extraParams extra parameters to modify the query, best used with {@link GeneralUserParametersBuilder}
     * @return a List of {@link ADNUser} objects representing requested users profile
     */
    public ADNUsers get(List<String> ids, Map<String, String> extraParams);

    /**
     * Search the App.net user base.
     *
     * @param q The search query. Supports @username or #tag searches as well as normal search terms. Searches username, display name, bio information. Does not search posts.
     * @param count (Optional) The number of Users to return, up to a maximum of 200. Defaults to 20 if not specified.
     * @return a List of {@link ADNUser} objects representing requested users profile
     */
    public ADNUsers search(String q, Integer count);

    /**
     * Search the App.net user base.
     *
     * @param q The search query. Supports @username or #tag searches as well as normal search terms. Searches username, display name, bio information. Does not search posts.
     * @param count (Optional) The number of Users to return, up to a maximum of 200. Defaults to 20 if not specified.
     * @param extraParams extra parameters to modify the query, best used with {@link GeneralUserParametersBuilder}
     * @return a List of {@link ADNUser} objects representing requested users profile
     */
    public ADNUsers search(String q, Integer count, Map<String, String> extraParams);

    /**
     * Updated the user profile with all the values in the ADNUserUpdate object
     *
     * @param user a {@link ADNUserUpdate} object used to update the user profile
     */
    public void update(ADNUserUpdate user) throws IOException;

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
     * Get all the followers of the user specified
     *
     * @param id App.net id of the user you wish to get followers of
     * @return a List of {@link ADNUser} objects representing all the user's followers
     */
    public List<String> getFollowersIds(String id);

    /**
     * Get all the users that the specified user is following
     *
     * @param id App.net id of the user you wish to get a following list of
     * @return a List of strings representing all the users that the specified user is following
     */
    public ADNUsers getFollowing(String id);

    /**
     * Get all the ids of users that the specified user is following
     *
     * @param id App.net id of the user you wish to get a following list of
     * @return a List of strings representing all the user ids that the specified user is following
     */
    public List<String> getFollowingIds(String id);

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
     * Get all the users that the currently logged in user muted.
     *
     * @return a List of {@link ADNUser} objects representing all the users that the logged in user muted
     */
    public ADNUsers getMutedUsers();

    /**
     * Get all the users that the currently logged in user muted.

     * @param id App.net user id of the user you want a list of all the users he muted.
     *
     * @return a List of {@link ADNUser} objects representing all the users that the logged in user muted
     */
    public ADNUsers getMutedUsers(String id);

    /**
     * Block the user who's ID was specified
     *
     * @param id App.net user id of the user you wish to mute
     * @return an {@link ADNUser} object representing the user that that is blocked
     */
    public ADNUser block(String id);

    /**
     * Un-Block the user who's ID was specified
     *
     * @param id App.net user id of the user you remove from blocked list
     */
    public void unblock(String id);

    /**
     * Get all the users that the currently logged in user blocked.
     *
     * @return a List of {@link ADNUser} objects representing all the users that the logged in user blocked
     */
    public ADNUsers getBlockedUsers();

    /**
     * Get all the users that the currently logged in user blocked.

     * @param id App.net user id of the user you want a list of all the users he blocked.
     *
     * @return a List of {@link ADNUser} objects representing all the users that the logged in user blocked
     */
    public ADNUsers getBlockedUsers(String id);

    /**
     * Get all the users that reposted a post
     *
     * @param postId The id of the post users reposted
     * @return a List of {@link ADNUser} objects representing all the users that reposted
     */
    public ADNUsers getReposters(String postId);

    /**
     * Get all the users that starred a post
     *
     * @param postId The id of the post people starred
     * @return a List of {@link ADNUser} objects representing all the users that starred the post
     */
    public ADNUsers getStarred(String postId);

}

package org.springframework.social.appdotnet.api;

import org.springframework.social.appdotnet.api.data.post.ADNPost;
import org.springframework.social.appdotnet.api.data.post.ADNPosts;

import java.util.Map;

/**
 * Interface defining the operations for retrieving information about App.net posts.
 *
 * @author Arik Galansky
 */
public interface PostsOperations {

    /**
     * Retrieve a specific post and it's meta information
     *
     * @param id the post id, of the specific post to retrieve
     * @return an object representing a Post in app.net
     */
    public ADNPost get(String id);

    /**
     * Creates a new simple post
     *
     * @param text the text of the post to be created
     * @return the post object with all it's meta data (e.g. id, creation time...)
     */
    //TODO arikg: Add more create methods with more params
    public ADNPost create(String text);

    /**
     * Creates a new simple post replying to a post
     *
     * @param text the text of the post to be created
     * @param replyTo optional id of the post being replied to
     * @return the post object with all it's meta data (e.g. id, creation time...)
     */
    public ADNPost create(String text, String replyTo);

    /**
     * Delete an existing post made by the user
     *
     * @param id the identifier of the post to delete
     */
    public void delete(String id);

    /**
     * Repost a post
     *
     * @param id the identifier of the post to repost
     * @return an object representing a Post in app.net
     */
    public ADNPost repost(String id);

    /**
     * Unrepost a post
     *
     * @param id the identifier of the post to unrepost
     */
    public void unrepost(String id);

    /**
     * Save a given Post to the user's stars.
     *
     * @param id the identifier of the post to star
     * @return an object representing a Post in app.net
     */
    public ADNPost star(String id);


    /**
     * Remove a given Post to the user's stars.
     *
     * @param id the identifier of the post to unstar
     */
    public void unstar(String id);

    /**
     * Retrieve the latest posts from the user personal stream (this includes only posts from users he is following)
     *
     * @return A Posts object containing a list of posts and extra data
     */
    public ADNPosts getPersonalStream();

    /**
     * Retrieve the latest posts from the user personal stream (this includes only posts from users he is following)
     *
     * @param extraParams extra parameters to modify the query, best used with {@link GeneralParametersBuilder}
     * @return A Posts object containing a list of posts and extra data
     */
    public ADNPosts getPersonalStream(Map<String, String> extraParams);

    /**
     * Retrieve the latest posts from the global stream
     *
     * @return A Posts object containing a list of posts and extra data
     */
    public ADNPosts getGlobalStream();

    /**
     * Retrieve the latest posts from the global stream
     *
     * @param extraParams extra parameters to modify the query, best used with {@link GeneralParametersBuilder}
     * @return A Posts object containing a list of posts and extra data
     */
    public ADNPosts getGlobalStream(Map<String, String> extraParams);

    /**
     * Retrieve the latest posts that contain the specified hashtag
     *
     * @return A Posts object containing a list of posts and extra data
     */
    public ADNPosts getHashtagStream(String hashtag);

    /**
     * Retrieve the latest posts that contain the specified hashtag
     *
     * @param extraParams extra parameters to modify the query, best used with {@link GeneralParametersBuilder}
     * @return A Posts object containing a list of posts and extra data
     */
    public ADNPosts getHashtagStream(String hashtag, Map<String, String> extraParams);

    /**
     * Retrieve all posts that are in the stream of replies to a specified post
     *
     * @return A Posts object containing a list of posts and extra data
     */
    public ADNPosts getPostReplies(String id);

    /**
     * Retrieve all posts that are in the stream of replies to a specified post
     *
     * @param extraParams extra parameters to modify the query, best used with {@link GeneralParametersBuilder}
     * @return A Posts object containing a list of posts and extra data
     */
    public ADNPosts getPostReplies(String id, Map<String, String> extraParams);

    /**
     * Retrieve all posts created by the specified user
     *
     * @param userId App.net user ID of the user whose posts you wish to retrieve
     * @return A Posts object containing a list of posts and extra data
     */
    public ADNPosts getUserPosts(String userId);

    /**
     * Retrieve all posts created by the specified user
     *
     * @param userId      App.net user ID of the user whose posts you wish to retrieve
     * @param extraParams extra parameters to modify the query, best used with {@link GeneralParametersBuilder}
     * @return A Posts object containing a list of posts and extra data
     */
    public ADNPosts getUserPosts(String userId, Map<String, String> extraParams);

    /**
     * Retrieve all posts that the specified user was mentioned in
     *
     * @param userId App.net user ID of the user whose mentions you wish to retrieve
     * @return A Posts object containing a list of posts and extra data
     */
    public ADNPosts getUserMentions(String userId);

    /**
     * Retrieve all posts that the specified user was mentioned in
     *
     * @param userId      userId App.net user ID of the user whose mentions you wish to retrieve
     * @param extraParams extra parameters to modify the query, best used with {@link GeneralParametersBuilder}
     * @return A Posts object containing a list of posts and extra data
     */
    public ADNPosts getUserMentions(String userId, Map<String, String> extraParams);
}

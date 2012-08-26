package org.springframework.social.appdotnet.api;

import org.springframework.social.appdotnet.api.data.post.ADNPost;

import java.util.List;
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
     * Delete an existing post made by the user
     *
     * @param id the identifier of the post to delete
     */
    public void delete(String id);

    /**
     * Retrieve the latest posts from the user personal stream (this includes only posts from users he is following)
     *
     * @return List of Post objects
     */
    public List<ADNPost> getPersonalStream();

    /**
     * Retrieve the latest posts from the user personal stream (this includes only posts from users he is following)
     *
     * @param extraParams extra parameters to modify the query, best used with {@link GeneralParametersBuilder}
     * @return List of Post objects
     */
    public List<ADNPost> getPersonalStream(Map<String, String> extraParams);

    /**
     * Retrieve the latest posts from the global stream
     *
     * @return List of Post objects
     */
    public List<ADNPost> getGlobalStream();

    /**
     * Retrieve the latest posts from the global stream
     *
     * @param extraParams extra parameters to modify the query, best used with {@link GeneralParametersBuilder}
     * @return List of Post objects
     */
    public List<ADNPost> getGlobalStream(Map<String, String> extraParams);

    /**
     * Retrieve the latest posts that contain the specified hashtag
     *
     * @return List of Post objects
     */
    public List<ADNPost> getHashtagStream(String hashtag);

    /**
     * Retrieve the latest posts that contain the specified hashtag
     *
     * @param extraParams extra parameters to modify the query, best used with {@link GeneralParametersBuilder}
     * @return List of Post objects
     */
    public List<ADNPost> getHashtagStream(String hashtag, Map<String, String> extraParams);

    /**
     * Retrieve all posts that are in the stream of replies to a specified post
     *
     * @return List of Post objects
     */
    public List<ADNPost> getPostReplies(String id);

    /**
     * Retrieve all posts that are in the stream of replies to a specified post
     *
     * @param extraParams extra parameters to modify the query, best used with {@link GeneralParametersBuilder}
     * @return List of Post objects
     */
    public List<ADNPost> getPostReplies(String id, Map<String, String> extraParams);
}

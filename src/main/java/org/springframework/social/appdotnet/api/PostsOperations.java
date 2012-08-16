package org.springframework.social.appdotnet.api;

import org.springframework.social.appdotnet.api.data.post.ADNPost;

/**
 * @author Arik Galansky
 */
public interface PostsOperations {
    public ADNPost get(String id);
}

package org.springframework.social.appdotnet.api;

import org.springframework.social.appdotnet.api.data.post.ADNPost;

import java.util.List;

/**
 * @author Arik Galansky
 */
public interface PostsOperations {
    public ADNPost get(String id);

    public List<ADNPost> getStream(String userId);
}

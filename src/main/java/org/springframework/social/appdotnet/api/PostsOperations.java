package org.springframework.social.appdotnet.api;

import org.springframework.social.appdotnet.api.data.post.ADNPost;

import java.util.List;

/**
 * @author Arik Galansky
 */
public interface PostsOperations {

    public ADNPost get(String id);

    public void delete(String id);

    public List<ADNPost> getPersonalStream();

    public List<ADNPost> getUserCreated(String userId);

    public List<ADNPost> getUserMentions(String userId);

    public List<ADNPost> getGlobalStream();

    public List<ADNPost> getHashtagStream(String hashtag);

    public List<ADNPost> getPostReplies(String id);


}

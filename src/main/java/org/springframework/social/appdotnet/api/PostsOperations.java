package org.springframework.social.appdotnet.api;

import org.springframework.social.appdotnet.api.data.post.ADNPost;

import java.util.List;
import java.util.Map;

/**
 * @author Arik Galansky
 */
// TODO javadoc
public interface PostsOperations {

    public ADNPost get(String id);

    public ADNPost create(String text);

    public void delete(String id);

    public List<ADNPost> getPersonalStream();

    public List<ADNPost> getPersonalStream(Map<String, String> extraParams);

    public List<ADNPost> getGlobalStream();

    public List<ADNPost> getGlobalStream(Map<String, String> extraParams);

    public List<ADNPost> getHashtagStream(String hashtag);

    public List<ADNPost> getHashtagStream(String hashtag, Map<String, String> extraParams);

    public List<ADNPost> getPostReplies(String id);

    public List<ADNPost> getPostReplies(String id, Map<String, String> extraParams);
}

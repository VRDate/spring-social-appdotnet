package org.springframework.social.appdotnet.api.impl;

import org.springframework.social.appdotnet.api.PostsOperations;
import org.springframework.social.appdotnet.api.data.post.ADNPost;
import org.springframework.social.appdotnet.api.data.post.ADNPostsList;
import org.springframework.social.support.URIBuilder;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Arik Galansky
 */
//TODO Arikg: add general parameters to all streams
//TODO Arikg: create post + edit AppdotnetAdapter to use it
public class PostsTemplate extends AbstractAppdotnetOperations implements PostsOperations {

    // TODO Arikg: this is a bad solution, the endpoint should probably change
    private String userPostsBaseURl;

    public PostsTemplate(String accessToken, RestTemplate restTemplate) {
        super(accessToken, restTemplate, "posts", VERSION_0);
        this.userPostsBaseURl = new StringBuilder().append("https://alpha-api.app.net/stream/")
                .append(VERSION_0).append("/").append("users").append("/").toString();
    }

    @Override
    public ADNPost get(String id) {
        return restTemplate.getForObject(buildUri(id), ADNPost.class);
    }

    @Override
    public void delete(String id) {
        restTemplate.delete(buildUri(id));
    }

    @Override
    public List<ADNPost> getPersonalStream() {
        return restTemplate.getForObject(buildUri("stream"), ADNPostsList.class);
    }

    @Override
    public List<ADNPost> getUserCreated(String userId) {
        return restTemplate.getForObject(buildUsersPostsUri(userId + "/posts"), ADNPostsList.class);
    }

    @Override
    public List<ADNPost> getUserMentions(String userId) {
        return restTemplate.getForObject(buildUsersPostsUri(userId + "/mentions"), ADNPostsList.class);
    }

    // TODO Arikg: remove when the endpoint changes or find a more elegant solution
    private String buildUsersPostsUri(String uri) {
        return URIBuilder.fromUri(userPostsBaseURl + uri).queryParam("access_token", accessToken).build().toString();
    }

    @Override
    public List<ADNPost> getGlobalStream() {
        return restTemplate.getForObject(buildUri("stream/global"), ADNPostsList.class);
    }

    @Override
    public List<ADNPost> getHashtagStream(String hashtag) {
        return restTemplate.getForObject(buildUri("tag/" + hashtag), ADNPostsList.class);
    }

    @Override
    public List<ADNPost> getPostReplies(String id) {
        return restTemplate.getForObject(buildUri(id + "/replies"), ADNPostsList.class);
    }
}

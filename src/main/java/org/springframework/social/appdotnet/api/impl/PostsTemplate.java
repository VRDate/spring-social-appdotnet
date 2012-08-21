package org.springframework.social.appdotnet.api.impl;

import org.springframework.social.appdotnet.api.PostsOperations;
import org.springframework.social.appdotnet.api.data.post.ADNPost;
import org.springframework.social.appdotnet.api.data.post.ADNPostsList;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Implementation of {@link PostsOperations}, accessing App.net posts resources
 *
 * @author Arik Galansky
 */
//TODO Arikg: add general parameters to all streams
class PostsTemplate extends AbstractAppdotnetOperations implements PostsOperations {

    public PostsTemplate(String accessToken, RestTemplate restTemplate) {
        super(accessToken, restTemplate, "posts", VERSION_0);
    }

    @Override
    public ADNPost get(String id) {
        return restTemplate.getForObject(buildUri(id), ADNPost.class);
    }

    @Override
    public ADNPost create(String text) {
        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
        map.add("text", text);
        return restTemplate.postForObject(buildUri(), map, ADNPost.class);
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

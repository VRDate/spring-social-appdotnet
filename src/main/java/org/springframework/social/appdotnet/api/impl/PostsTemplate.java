package org.springframework.social.appdotnet.api.impl;

import org.springframework.social.appdotnet.api.PostsOperations;
import org.springframework.social.appdotnet.api.data.post.ADNPost;
import org.springframework.social.appdotnet.api.data.post.ADNPostsList;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

/**
 * Implementation of {@link PostsOperations}, accessing App.net posts resources
 *
 * @author Arik Galansky
 */
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
    public List<ADNPost> getPersonalStream(Map<String, String> extraParams) {
        return restTemplate.getForObject(buildUri("stream", extraParams), ADNPostsList.class);
    }

    @Override
    public List<ADNPost> getPersonalStream() {
        return getPersonalStream(null);
    }

    @Override
    public List<ADNPost> getGlobalStream(Map<String, String> extraParams) {
        return restTemplate.getForObject(buildUri("stream/global", extraParams), ADNPostsList.class);
    }

    @Override
    public List<ADNPost> getGlobalStream() {
        return getGlobalStream(null);
    }

    @Override
    public List<ADNPost> getHashtagStream(String hashtag, Map<String, String> extraParams) {
        return restTemplate.getForObject(buildUri("tag/" + hashtag, extraParams), ADNPostsList.class);
    }

    @Override
    public List<ADNPost> getHashtagStream(String hashtag) {
        return getHashtagStream(hashtag, null);
    }

    @Override
    public List<ADNPost> getPostReplies(String id, Map<String, String> extraParams) {
        return restTemplate.getForObject(buildUri(id + "/replies", extraParams), ADNPostsList.class);
    }

    @Override
    public List<ADNPost> getPostReplies(String id) {
        return getPostReplies(id, null);
    }
}

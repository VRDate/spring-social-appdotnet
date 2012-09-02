package org.springframework.social.appdotnet.api.data.post;

import org.springframework.social.appdotnet.api.data.ADNPaging;

import java.util.List;

/**
 * A class extending a generic list of posts with extra paging data
 *
 * @author Arik Galansky
 */
public class ADNPosts {
    private List<ADNPost> posts;
    private ADNPaging paging;

    public ADNPosts(List<ADNPost> posts, ADNPaging paging) {
        this.posts = posts;
        this.paging = paging;
    }

    public List<ADNPost> getPosts() {
        return posts;
    }

    public void setPosts(List<ADNPost> posts) {
        this.posts = posts;
    }

    public ADNPaging getPaging() {
        return paging;
    }

    public void setPaging(ADNPaging paging) {
        this.paging = paging;
    }
}
package org.springframework.social.appdotnet.api.data.user;

public class ADNUserCounts {
    private final int following;
    private final int followers;
    private final int posts;
    private final int stars;

    public ADNUserCounts(int following, int followers, int posts, int stars) {
        this.following = following;
        this.followers = followers;
        this.posts = posts;
        this.stars = stars;
    }

    public int getFollowing() {
        return following;
    }

    public int getFollowers() {
        return followers;
    }

    public int getPosts() {
        return posts;
    }

    public int getStars() {
        return stars;
    }
}

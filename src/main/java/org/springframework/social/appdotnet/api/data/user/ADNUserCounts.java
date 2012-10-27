package org.springframework.social.appdotnet.api.data.user;

public class ADNUserCounts {
    private final int followingCount;
    private final int followerCount;
    private final int postCount;
    private final int starCount;

    public ADNUserCounts(int followingCount, int followerCount, int postCount, int starCount) {
        this.followingCount = followingCount;
        this.followerCount = followerCount;
        this.postCount = postCount;
        this.starCount = starCount;
    }

    public int getFollowingCount() {
        return followingCount;
    }

    public int getFollowerCount() {
        return followerCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getStarCount() {
        return starCount;
    }
}

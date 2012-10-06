package org.springframework.social.appdotnet.api.data;

/**
 * @author Arik Galansky
 */
public class ADNPaging {
    private final String minId;
    private final String maxId;
    private final boolean more;

    public ADNPaging(String minId, String maxId, boolean more) {
        this.minId = minId;
        this.maxId = maxId;
        this.more = more;
    }

    public String getMinId() {
        return minId;
    }

    public String getMaxId() {
        return maxId;
    }

    public boolean hasMore() {
        return more;
    }
}

package org.springframework.social.appdotnet.api.data;

/**
 * @author Arik Galansky
 */
public class ADNPaging {
    private String minId;
    private String maxId;
    private Boolean more;

    public ADNPaging() {
    }

    public ADNPaging(String minId, String maxId, Boolean more) {
        this.minId = minId;
        this.maxId = maxId;
        this.more = more;
    }

    public String getMinId() {
        return minId;
    }

    public void setMinId(String minId) {
        this.minId = minId;
    }

    public String getMaxId() {
        return maxId;
    }

    public void setMaxId(String maxId) {
        this.maxId = maxId;
    }

    public Boolean hasMore() {
        return more;
    }

    public void setMore(Boolean more) {
        this.more = more;
    }
}

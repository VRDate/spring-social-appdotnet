package org.springframework.social.appdotnet.api.data;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author Arik Galansky
 */
public class ADNResponseMeta {
    private final int code;
    private final String maxId;
    private final String minId;
    private final boolean more;
    private final String errorMessage;
    private final String errorSlug;

    public ADNResponseMeta(int code, String maxId, String minId, boolean more, String errorMessage, String errorSlug) {
        this.code = code;
        this.maxId = maxId;
        this.minId = minId;
        this.more = more;
        this.errorMessage = errorMessage;
        this.errorSlug = errorSlug;
    }

    public int getCode() {
        return code;
    }

    public String getMaxId() {
        return maxId;
    }

    public String getMinId() {
        return minId;
    }

    public boolean hasMore() {
        return more;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getErrorSlug() {
        return errorSlug;
    }
}

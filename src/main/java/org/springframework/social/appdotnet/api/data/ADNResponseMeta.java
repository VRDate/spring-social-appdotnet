package org.springframework.social.appdotnet.api.data;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author Arik Galansky
 */
// TODO Arikg: remove setters
@JsonIgnoreProperties(ignoreUnknown = true)
public class ADNResponseMeta {
    private String max_id;
    private String min_id;
    private Boolean more;
    private String code;
    private String error_message;
    private String error_slug;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getError_message() {
        return error_message;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message;
    }

    public String getError_slug() {
        return error_slug;
    }

    public void setError_slug(String error_slug) {
        this.error_slug = error_slug;
    }

    public String getMax_id() {
        return max_id;
    }

    public void setMax_id(String max_id) {
        this.max_id = max_id;
    }

    public String getMin_id() {
        return min_id;
    }

    public void setMin_id(String min_id) {
        this.min_id = min_id;
    }

    public Boolean getMore() {
        return more;
    }

    public void setMore(Boolean more) {
        this.more = more;
    }


}

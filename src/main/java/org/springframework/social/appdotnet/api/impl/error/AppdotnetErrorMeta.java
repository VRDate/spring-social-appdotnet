package org.springframework.social.appdotnet.api.impl.error;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author Arik Galansky
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class AppdotnetErrorMeta {
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
}

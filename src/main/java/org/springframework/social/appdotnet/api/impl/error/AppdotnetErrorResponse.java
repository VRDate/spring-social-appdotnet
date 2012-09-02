package org.springframework.social.appdotnet.api.impl.error;

/**
 * @author Arik Galansky
 */
class AppdotnetErrorResponse {
    private AppdotnetErrorMeta meta;

    public AppdotnetErrorMeta getMeta() {
        return meta;
    }

    public void setMeta(AppdotnetErrorMeta meta) {
        this.meta = meta;
    }
}

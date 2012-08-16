package org.springframework.social.appdotnet.api.impl;

import org.springframework.web.client.RestTemplate;

/**
 * @author Arik Galansky
 */
public abstract class AbstractAppdotnetOperations {
    protected static final String VERSION_0 = "0";

    protected final RestTemplate restTemplate;
    protected final String accessToken;

    public AbstractAppdotnetOperations(String accessToken, RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        this.accessToken = accessToken;
    }

    protected String buildUri(String uri) {
        return new StringBuilder().append("https://alpha-api.app.net/stream/")
                .append(getVersion()).append("/").append(uri).toString();
    }

    protected abstract String getVersion();
}

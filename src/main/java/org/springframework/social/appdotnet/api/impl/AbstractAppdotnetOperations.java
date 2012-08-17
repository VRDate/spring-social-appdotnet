package org.springframework.social.appdotnet.api.impl;

import org.springframework.social.support.URIBuilder;
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
        StringBuilder sb = new StringBuilder().append("https://alpha-api.app.net/stream/")
                .append(getVersion()).append("/").append(uri);
        return URIBuilder.fromUri(sb.toString()).queryParam("access_token", accessToken).build().toString();
    }

    protected abstract String getVersion();
}

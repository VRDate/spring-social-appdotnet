package org.springframework.social.appdotnet.api.impl;

import org.springframework.social.support.URIBuilder;
import org.springframework.web.client.RestTemplate;

/**
 * Superclass to all App.net sub-api implementation templates
 *
 * @author Arik Galansky
 */
abstract class AbstractAppdotnetOperations {
    protected static final String VERSION_0 = "0";

    protected final RestTemplate restTemplate;
    protected final String accessToken;
    private final String baseUrl;

    public AbstractAppdotnetOperations(String accessToken, RestTemplate restTemplate, String name, String version) {
        this.restTemplate = restTemplate;
        this.accessToken = accessToken;
        this.baseUrl = new StringBuilder().append("https://alpha-api.app.net/stream/")
                .append(version).append("/").append(name).append("/").toString();
    }

    protected String buildUri(String uri) {
        return URIBuilder.fromUri(baseUrl + uri).queryParam("access_token", accessToken).build().toString();
    }

    protected String buildUri() {
        return buildUri("");
    }
}

package org.springframework.social.appdotnet.api.impl;

import org.springframework.social.support.URIBuilder;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

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

    protected String buildUri(String uri, Map<String, String> params) {
        URIBuilder builder = URIBuilder.fromUri(baseUrl + uri);
        if (accessToken != null) {
            builder = builder.queryParam("access_token", accessToken);
        }
        if (params != null && !params.isEmpty()) {
            for (Map.Entry<String, String> param : params.entrySet()) {
                builder.queryParam(param.getKey(), param.getValue());
            }
        }
        return builder.build().toString();
    }

    protected String buildUri(String uri) {
        return buildUri(uri, null);
    }

    protected String buildUri() {
        return buildUri("");
    }
}

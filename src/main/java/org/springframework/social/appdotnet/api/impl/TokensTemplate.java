package org.springframework.social.appdotnet.api.impl;

import org.springframework.social.appdotnet.api.TokenOperations;
import org.springframework.social.appdotnet.api.data.ADNToken;
import org.springframework.web.client.RestTemplate;

/**
 * @author Arik Galansky
 */
public class TokensTemplate extends AbstractAppdotnetOperations implements TokenOperations {
    public TokensTemplate(String accessToken, RestTemplate restTemplate) {
        super(accessToken, restTemplate, "token", VERSION_0);
    }

    @Override
    public ADNToken get() {
        return restTemplate.getForObject(buildUri(), ADNToken.class);
    }
}

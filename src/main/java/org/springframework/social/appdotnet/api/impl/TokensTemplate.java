package org.springframework.social.appdotnet.api.impl;

import org.springframework.social.appdotnet.api.TokensOperations;
import org.springframework.social.appdotnet.api.data.ADNToken;
import org.springframework.web.client.RestTemplate;

/**
 * Implementation of {@link TokensOperations}, accessing App.net token resources
 *
 * @author Arik Galansky
 */
class TokensTemplate extends AbstractAppdotnetOperations implements TokensOperations {
    public TokensTemplate(String accessToken, RestTemplate restTemplate) {
        super(accessToken, restTemplate, "token", VERSION_0);
    }

    @Override
    public ADNToken getToken() {
        return restTemplate.getForObject(buildUri(), ADNToken.class);
    }
}

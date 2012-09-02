package org.springframework.social.appdotnet.api.impl;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.social.appdotnet.api.Appdotnet;
import org.springframework.social.appdotnet.api.PostsOperations;
import org.springframework.social.appdotnet.api.TokensOperations;
import org.springframework.social.appdotnet.api.UsersOperations;
import org.springframework.social.appdotnet.api.impl.error.AppdotnetErrorHandler;
import org.springframework.social.appdotnet.api.impl.json.AppdotnetJacksonModule;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.web.client.RestTemplate;

import static java.util.Collections.singletonList;

/**
 * This is the central class for interacting with App.net.
 * From it you can get the sub-api classes and execute operation on the app.net api.
 *
 * @author Arik Galansky
 */
public class AppdotnetTemplate extends AbstractOAuth2ApiBinding implements Appdotnet {

    private PostsOperations postsOperations;
    private UsersOperations usersOperations;
    private TokensOperations tokensOperations;

    /**
     * Create a new instance of AppdotnetTemplate
     *
     * @param accessToken an access token acquired through OAuth authentication with Appdotnet
     */
    public AppdotnetTemplate(String accessToken) {
        super(accessToken);
        initSubApis(accessToken);
    }

    private void initSubApis(String accessToken) {
        postsOperations = new PostsTemplate(accessToken, getRestTemplate());
        usersOperations = new UsersTemplate(accessToken, getRestTemplate());
        tokensOperations = new TokensTemplate(accessToken, getRestTemplate());
    }

    @Override
    protected MappingJacksonHttpMessageConverter getJsonMessageConverter() {
        MappingJacksonHttpMessageConverter converter = super.getJsonMessageConverter();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new AppdotnetJacksonModule());
        converter.setObjectMapper(objectMapper);
        return converter;
    }

    @Override
    protected void configureRestTemplate(RestTemplate restTemplate) {
        restTemplate.setErrorHandler(new AppdotnetErrorHandler());
        restTemplate.setInterceptors(singletonList((ClientHttpRequestInterceptor) new AppdotnetRequestInterceptor()));

    }

    @Override
    public PostsOperations postsOperations() {
        return postsOperations;
    }

    @Override
    public UsersOperations usersOperations() {
        return usersOperations;
    }

    @Override
    public TokensOperations tokensOperations() {
        return tokensOperations;
    }
}

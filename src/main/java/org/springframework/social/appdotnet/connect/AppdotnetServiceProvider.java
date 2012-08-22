package org.springframework.social.appdotnet.connect;

import org.springframework.social.appdotnet.api.Appdotnet;
import org.springframework.social.appdotnet.api.impl.AppdotnetTemplate;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.oauth2.OAuth2Template;

/**
 * App.net ServiceProvider implementation
 * @author Arik Galansky
 */
public class AppdotnetServiceProvider extends AbstractOAuth2ServiceProvider<Appdotnet> {
    public AppdotnetServiceProvider(String clientId, String clientSecret) {
        super(new OAuth2Template(clientId, clientSecret,
                "https://alpha.app.net/oauth/authenticate",
                "https://alpha.app.net/oauth/access_token"));
    }

    @Override
    public Appdotnet getApi(String accessToken) {
        return new AppdotnetTemplate(accessToken);
    }
}

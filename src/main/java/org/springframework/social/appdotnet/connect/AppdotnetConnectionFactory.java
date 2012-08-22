package org.springframework.social.appdotnet.connect;

import org.springframework.social.appdotnet.api.Appdotnet;
import org.springframework.social.connect.support.OAuth2ConnectionFactory;

/**
 * App.net ConnectionFactory implementation - basic Oauth 2
 *
 * @author Arik Galansky
 */
public class AppdotnetConnectionFactory extends OAuth2ConnectionFactory<Appdotnet> {
    public AppdotnetConnectionFactory(String clientId, String clientSecret) {
        super("appdotnet", new AppdotnetServiceProvider(clientId, clientSecret), new AppdotnetAdapter());
    }
}

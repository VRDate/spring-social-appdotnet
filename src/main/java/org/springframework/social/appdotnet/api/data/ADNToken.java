package org.springframework.social.appdotnet.api.data;

import org.springframework.social.appdotnet.api.data.user.ADNUser;

import java.util.List;

/**
 * Represents the currently logged in user token
 *
 * @author Arik Galansky
 */
public class ADNToken {
    private final ADNUser user;
    private final List<String> scopes;

    public ADNToken(ADNUser user, List<String> scopes) {
        this.user = user;
        this.scopes = scopes;
    }

    public ADNUser getUser() {
        return user;
    }

    public List<String> getScopes() {
        return scopes;
    }
}

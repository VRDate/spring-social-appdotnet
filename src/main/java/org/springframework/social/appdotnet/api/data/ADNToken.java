package org.springframework.social.appdotnet.api.data;

import org.springframework.social.appdotnet.api.data.user.ADNUser;

import java.util.List;

/**
 * Represents the currently logged in user token
 *
 * @author Arik Galansky
 */
public class ADNToken {
    private ADNUser user;
    private List<String> scopes;

    public ADNUser getUser() {
        return user;
    }

    public void setUser(ADNUser user) {
        this.user = user;
    }

    public List<String> getScopes() {
        return scopes;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }
}

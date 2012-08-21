package org.springframework.social.appdotnet.api;

import org.springframework.social.appdotnet.api.data.ADNToken;

/**
 * Interface defining the operations for working with tokens.
 *
 * @author Arik Galansky
 */
public interface TokensOperations {
    /**
     * Get the currently active user token
     *
     * @return the current user {@link ADNToken}, which includes the user and a list of granted access scopes
     */
    public ADNToken getToken();
}

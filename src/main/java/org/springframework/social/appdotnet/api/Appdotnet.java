package org.springframework.social.appdotnet.api;

import org.springframework.social.appdotnet.api.PostsOperations;
import org.springframework.social.appdotnet.api.UsersOperations;

/**
 * @author Arik Galansky
 */
public interface Appdotnet {
    public PostsOperations postsOperations();

    public UsersOperations usersOperations();
}
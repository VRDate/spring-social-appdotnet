package org.springframework.social.appdotnet.api;

/**
 * @author Arik Galansky
 */
public interface Appdotnet {
    public PostsOperations postsOperations();

    public UsersOperations usersOperations();
}
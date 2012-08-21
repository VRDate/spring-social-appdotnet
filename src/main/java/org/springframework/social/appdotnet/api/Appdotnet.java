package org.springframework.social.appdotnet.api;

/**
 * Interface specifying a basic set of operations for interacting with App.net
 *
 * @author Arik Galansky
 */
public interface Appdotnet {
    /**
     * Getting the sub api of App.net in charge of posts operations
     *
     * @return sub-api containing the posts operations.
     */
    public PostsOperations postsOperations();

    /**
     * Getting the sub api of App.net in charge of users operations
     *
     * @return sub-api containing the users operations.
     */
    public UsersOperations usersOperations();

    /**
     * Getting the sub api of App.net in charge of tokens operations
     *
     * @return sub-api containing the tokens operations.
     */
    public TokensOperations tokensOperations();
}
package org.springframework.social.appdotnet.api;

import java.util.HashMap;
import java.util.Map;

/**
 * A general parameters builder object for queries returning a list of posts. It can be used to modify the returned data.
 *
 * @author Arik Galansky
 */
public class GeneralParametersBuilder {

    private Map<String, String> parameters;

    private GeneralParametersBuilder() {
        parameters = new HashMap<String, String>();
    }

    public static GeneralParametersBuilder create() {
        return new GeneralParametersBuilder();
    }

    public GeneralParametersBuilder sinceId(String id) {
        parameters.put("since_id", id);
        return this;
    }

    public GeneralParametersBuilder beforeId(String id) {
        parameters.put("before_id", id);
        return this;
    }

    public GeneralParametersBuilder count(Integer count) {
        parameters.put("count", Integer.toString(count));
        return this;
    }

    public GeneralParametersBuilder includeMuted(boolean value) {
        parameters.put("include_muted", value ? "1" : "0");
        return this;
    }

    public GeneralParametersBuilder includeDeleted(boolean value) {
        parameters.put("include_deleted", value ? "1" : "0");
        return this;
    }

    public GeneralParametersBuilder includeDirectedPosts(boolean value) {
        parameters.put("include_directed_posts", value ? "1" : "0");
        return this;
    }

    public GeneralParametersBuilder includeMachine(boolean value) {
        parameters.put("include_machine", value ? "1" : "0");
        return this;
    }

    public GeneralParametersBuilder includeAnnotations(boolean value) {
        parameters.put("include_annotations", value ? "1" : "0");
        return this;
    }

    public GeneralParametersBuilder includeStarredBy(boolean value) {
        parameters.put("include_starred_by", value ? "1" : "0");
        return this;
    }

    public GeneralParametersBuilder includeReposters(boolean value) {
        parameters.put("include_reposters", value ? "1" : "0");
        return this;
    }

    public GeneralParametersBuilder includeUser(boolean value) {
        parameters.put("include_user", value ? "1" : "0");
        return this;
    }

    public Map<String, String> build() {
        return new HashMap<String, String>(parameters);
    }

}

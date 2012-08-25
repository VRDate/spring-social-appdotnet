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

    public GeneralParametersBuilder includeUser(Boolean value) {
        parameters.put("include_user", Boolean.toString(value));
        return this;
    }

    public GeneralParametersBuilder includeReplies(Boolean value) {
        parameters.put("include_replies", Boolean.toString(value));
        return this;
    }

    public GeneralParametersBuilder includeAnnotations(Boolean value) {
        parameters.put("include_annotations", Boolean.toString(value));
        return this;
    }

    public Map<String, String> build() {
        return new HashMap<String, String>(parameters);
    }

}

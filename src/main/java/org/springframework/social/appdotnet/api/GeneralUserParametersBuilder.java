package org.springframework.social.appdotnet.api;

import java.util.HashMap;
import java.util.Map;

/**
 * A general parameters builder object for user queries . It can be used to modify the returned data.
 *
 * @author Arik Galansky
 */
public class GeneralUserParametersBuilder {
    private Map<String, String> parameters;

    private GeneralUserParametersBuilder() {
        parameters = new HashMap<String, String>();
    }

    public static GeneralUserParametersBuilder create() {
        return new GeneralUserParametersBuilder();
    }

    public GeneralUserParametersBuilder includeAnnotations(boolean value) {
        parameters.put("include_annotations", value ? "1" : "0");
        return this;
    }

    public GeneralUserParametersBuilder includeUserAnnotations(boolean value) {
        parameters.put("include_user_annotations", value ? "1" : "0");
        return this;
    }

    public GeneralUserParametersBuilder includeHtml(boolean value) {
        parameters.put("include_html", value ? "1" : "0");
        return this;
    }

    public Map<String, String> build() {
        return new HashMap<String, String>(parameters);
    }
}

package org.springframework.social.appdotnet.api.data.post;

import java.util.Map;

public class ADNAnnotation {
    private final String type;
    private final Map<String, Object> value;

    public ADNAnnotation(String type, Map<String, Object> value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public Map<String, Object> getValue() {
        return value;
    }
}

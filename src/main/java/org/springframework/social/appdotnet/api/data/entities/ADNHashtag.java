package org.springframework.social.appdotnet.api.data.entities;

/**
 * @author Arik Galansky
 */
public class ADNHashtag extends ADNEntity {
    private final String name;

    public ADNHashtag(String name, Integer pos, Integer len) {
        super(pos, len);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

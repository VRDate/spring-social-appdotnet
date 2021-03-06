package org.springframework.social.appdotnet.api.data.entities;

/**
 * Represents a hashtag inside a post
 *
 * @author Arik Galansky
 */
public class ADNHashtag extends ADNEntity {
    private final String name;

    public ADNHashtag(String name, int position, int length) {
        super(position, length);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

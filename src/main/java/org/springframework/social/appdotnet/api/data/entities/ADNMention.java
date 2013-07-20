package org.springframework.social.appdotnet.api.data.entities;

/**
 * Represents a user mention inside a post
 *
 * @author Arik Galansky
 */
public class ADNMention extends ADNEntity {
    private final String id;
    private final String name;

    public ADNMention(String name, String id, int position, int length) {
        super(position, length);
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

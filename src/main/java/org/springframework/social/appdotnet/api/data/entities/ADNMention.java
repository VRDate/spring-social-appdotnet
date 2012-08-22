package org.springframework.social.appdotnet.api.data.entities;

/**
 * @author Arik Galansky
 */
public class ADNMention extends ADNEntity {
    private String id;
    private String name;

    public ADNMention(String name, String id, Integer pos, Integer len) {
        super(pos, len);
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

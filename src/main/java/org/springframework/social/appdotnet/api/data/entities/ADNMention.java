package org.springframework.social.appdotnet.api.data.entities;

/**
 * @author Arik Galansky
 */
public class ADNMention extends ADNEntity {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

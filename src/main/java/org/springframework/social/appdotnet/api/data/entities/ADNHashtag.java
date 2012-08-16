package org.springframework.social.appdotnet.api.data.entities;

/**
 * @author Arik Galansky
 */
public class ADNHashtag extends ADNEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

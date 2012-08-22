package org.springframework.social.appdotnet.api.data.post;

/**
 * @author Arik Galansky
 */
public class ADNPostSource {
    private String name;
    private String link;

    public ADNPostSource(String name, String link) {
        this.name = name;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }

}

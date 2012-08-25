package org.springframework.social.appdotnet.api.data.entities;

/**
 * Represents a link inside a post
 *
 * @author Arik Galansky
 */
public class ADNLink extends ADNEntity {
    private final String text;
    private final String url;

    public ADNLink(String text, String url, Integer pos, Integer len) {
        super(pos, len);
        this.text = text;
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public String getUrl() {
        return url;
    }
}

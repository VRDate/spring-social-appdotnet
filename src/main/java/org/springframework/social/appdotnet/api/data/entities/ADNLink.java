package org.springframework.social.appdotnet.api.data.entities;

/**
 * @author Arik Galansky
 */
public class ADNLink extends ADNEntity {
    private String text;
    private String url;

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

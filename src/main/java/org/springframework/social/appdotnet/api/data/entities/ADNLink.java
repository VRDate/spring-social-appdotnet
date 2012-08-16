package org.springframework.social.appdotnet.api.data.entities;

/**
 * @author Arik Galansky
 */
public class ADNLink extends ADNEntity {
    private String url;
    private String text;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

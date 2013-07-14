package org.springframework.social.appdotnet.api.data.entities;

/**
 * Represents a link inside a post
 *
 * @author Arik Galansky
 */
public class ADNLink extends ADNEntity {
    private final String text;
    private final String url;
    private final Integer amendedLength;

    public ADNLink(String url, String text, int position, int length, Integer amendedLength) {
        super(position, length);
        this.text = text;
        this.url = url;
        this.amendedLength = amendedLength;
    }

    public String getText() {
        return text;
    }

    public String getUrl() {
        return url;
    }

    public Integer getAmendedLength() {
        return amendedLength;
    }
}

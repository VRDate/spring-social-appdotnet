package org.springframework.social.appdotnet.api.data.user;

/**
 * Represents an image in App.net
 *
 * @author Arik Galansky
 */
public class ADNImage {
    private final Integer height;
    private final Integer width;
    private final String url;

    public ADNImage(Integer height, Integer width, String url) {
        this.height = height;
        this.width = width;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWidth() {
        return width;
    }
}

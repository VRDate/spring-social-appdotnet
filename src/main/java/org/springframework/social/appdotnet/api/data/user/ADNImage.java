package org.springframework.social.appdotnet.api.data.user;

/**
 * @author Arik Galansky
 */
public class ADNImage {
    private Integer height;
    private Integer width;
    private String url;

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

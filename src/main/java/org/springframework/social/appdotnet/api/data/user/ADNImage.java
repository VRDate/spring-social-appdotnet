package org.springframework.social.appdotnet.api.data.user;

/**
 * @author Arik Galansky
 */
public class ADNImage {
    private Integer height;
    private Integer width;
    private String url;

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

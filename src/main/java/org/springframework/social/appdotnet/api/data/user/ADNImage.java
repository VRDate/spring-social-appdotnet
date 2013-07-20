package org.springframework.social.appdotnet.api.data.user;

/**
 * Represents an image in App.net
 *
 * @author Arik Galansky
 */
public class ADNImage {
    private final int height;
    private final int width;
    private final String url;
    private final boolean isDefault;

    public ADNImage(int height, int width, String url, boolean isDefault) {
        this.height = height;
        this.width = width;
        this.url = url;
        this.isDefault = isDefault;
    }

    public String getUrl() {
        return url;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isDefault() {
        return isDefault;
    }
}

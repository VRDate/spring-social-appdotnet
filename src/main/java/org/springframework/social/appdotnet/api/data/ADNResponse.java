package org.springframework.social.appdotnet.api.data;

/**
 * @author Arik Galansky
 */
public class ADNResponse<T> {
    private T data;
    private ADNResponseMeta meta;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ADNResponseMeta getMeta() {
        return meta;
    }

    public void setMeta(ADNResponseMeta meta) {
        this.meta = meta;
    }
}

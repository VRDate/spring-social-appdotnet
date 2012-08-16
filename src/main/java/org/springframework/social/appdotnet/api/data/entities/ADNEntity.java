package org.springframework.social.appdotnet.api.data.entities;

/**
 * @author Arik Galansky
 */
public abstract class ADNEntity {
    private Integer pos;
    private Integer len;

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public Integer getLen() {
        return len;
    }

    public void setLen(Integer len) {
        this.len = len;
    }
}

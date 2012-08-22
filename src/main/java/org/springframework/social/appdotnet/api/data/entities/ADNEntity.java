package org.springframework.social.appdotnet.api.data.entities;

/**
 * @author Arik Galansky
 */
public abstract class ADNEntity {
    private Integer pos;
    private Integer len;

    protected ADNEntity(Integer pos, Integer len) {
        this.pos = pos;
        this.len = len;
    }

    public Integer getPos() {
        return pos;
    }

    public Integer getLen() {
        return len;
    }
}

package org.springframework.social.appdotnet.api.data.entities;

/**
 * A parent to all meta entities inside posts (e.g. links, mentions, hashtags)
 *
 * @author Arik Galansky
 */
public abstract class ADNEntity {
    private final Integer pos;
    private final Integer len;

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

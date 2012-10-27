package org.springframework.social.appdotnet.api.data.entities;

/**
 * A parent to all meta entities inside posts (e.g. links, mentions, hashtags)
 *
 * @author Arik Galansky
 */
public abstract class ADNEntity {
    private final int pos;
    private final int len;

    protected ADNEntity(int pos, int len) {
        this.pos = pos;
        this.len = len;
    }

    public int getPos() {
        return pos;
    }

    public int getLen() {
        return len;
    }
}

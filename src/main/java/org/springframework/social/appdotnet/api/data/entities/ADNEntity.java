package org.springframework.social.appdotnet.api.data.entities;

/**
 * A parent to all meta entities inside posts (e.g. links, mentions, hashtags)
 *
 * @author Arik Galansky
 */
public abstract class ADNEntity {
    private final int position;
    private final int length;

    protected ADNEntity(int position, int length) {
        this.position = position;
        this.length = length;
    }

    public int getPosition() {
        return position;
    }

    public int getLength() {
        return length;
    }
}

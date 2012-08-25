package org.springframework.social.appdotnet.api.data.entities;

import java.util.List;

/**
 * An object containing all the meta entities inside a post
 *
 * @author Arik Galansky
 */
public class ADNEntities {
    private final List<ADNMention> mentions;
    private final List<ADNHashtag> hashtags;
    private final List<ADNLink> links;

    public ADNEntities(List<ADNMention> mentions, List<ADNHashtag> hashtags, List<ADNLink> links) {
        this.mentions = mentions;
        this.hashtags = hashtags;
        this.links = links;
    }

    public List<ADNMention> getMentions() {
        return mentions;
    }

    public List<ADNHashtag> getHashtags() {
        return hashtags;
    }

    public List<ADNLink> getLinks() {
        return links;
    }
}

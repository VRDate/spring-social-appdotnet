package org.springframework.social.appdotnet.api.data.entities;

import java.util.List;

/**
 * @author Arik Galansky
 */
public class ADNEntities {
    private List<ADNMention> mentions;
    private List<ADNHashtag> hashtags;
    private List<ADNLink> links;

    public List<ADNMention> getMentions() {
        return mentions;
    }

    public void setMentions(List<ADNMention> mentions) {
        this.mentions = mentions;
    }

    public List<ADNHashtag> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<ADNHashtag> hashtags) {
        this.hashtags = hashtags;
    }

    public List<ADNLink> getLinks() {
        return links;
    }

    public void setLinks(List<ADNLink> links) {
        this.links = links;
    }
}

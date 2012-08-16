package org.springframework.social.appdotnet.api.data.user;

import org.springframework.social.appdotnet.api.data.entities.ADNEntities;

/**
 * @author Arik Galansky
 */
public class ADNUserDescription {
    private String text;
    private String html;
    private ADNEntities entities;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public ADNEntities getEntities() {
        return entities;
    }

    public void setEntities(ADNEntities entities) {
        this.entities = entities;
    }
}

package org.springframework.social.appdotnet.api.data.user;

import org.springframework.social.appdotnet.api.data.ADNPaging;

import java.util.ArrayList;
import java.util.List;

/**
 * A class extending a generic list of users with extra paging data
 *
 * @author Arik Galansky
 */
public class ADNUsers extends ArrayList<ADNUser> {
    private List<ADNUser> users;
    private ADNPaging paging;

    public ADNUsers(List<ADNUser> users, ADNPaging paging) {
        this.users = users;
        this.paging = paging;
    }

    public List<ADNUser> getUsers() {
        return users;
    }

    public void setUsers(List<ADNUser> users) {
        this.users = users;
    }

    public ADNPaging getPaging() {
        return paging;
    }

    public void setPaging(ADNPaging paging) {
        this.paging = paging;
    }
}
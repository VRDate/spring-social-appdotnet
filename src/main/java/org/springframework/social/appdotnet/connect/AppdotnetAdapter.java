package org.springframework.social.appdotnet.connect;

import org.springframework.social.appdotnet.api.Appdotnet;
import org.springframework.social.appdotnet.api.data.user.ADNUser;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;

/**
 * App.net ApiAdapter implementation
 *
 * @author Arik Galansky
 */
public class AppdotnetAdapter implements ApiAdapter<Appdotnet> {
    @Override
    public boolean test(Appdotnet appNet) {
        try {
            appNet.usersOperations().getUserProfile();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void setConnectionValues(Appdotnet appNet, ConnectionValues values) {
        ADNUser user = appNet.usersOperations().getUserProfile();
        values.setProviderUserId(user.getId());
        values.setDisplayName("@" + user.getUsername());
        values.setProfileUrl("alpha.app.net/" + user.getUsername());
        values.setImageUrl(user.getAvatarImage().getUrl());
    }

    @Override
    public UserProfile fetchUserProfile(Appdotnet appNet) {
        ADNUser user = appNet.usersOperations().getUserProfile();
        return new UserProfileBuilder().setUsername(user.getUsername()).setName(user.getName()).build();
    }

    @Override
    public void updateStatus(Appdotnet appNet, String message) {
        appNet.postsOperations().create(message);
    }
}

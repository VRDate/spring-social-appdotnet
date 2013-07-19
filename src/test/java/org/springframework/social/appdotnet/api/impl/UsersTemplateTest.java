package org.springframework.social.appdotnet.api.impl;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.social.appdotnet.api.GeneralUserParametersBuilder;
import org.springframework.social.appdotnet.api.data.user.ADNUser;
import org.springframework.social.appdotnet.api.data.user.ADNUsers;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.springframework.http.HttpMethod.DELETE;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.POST;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

/**
 * @author Arik Galansky
 */
public class UsersTemplateTest extends AbstractAppdotnetApiTest {

    @Test
    public void getUserProfile() {
        mockServer.expect(requestTo(AppdotnetTemplate.BASE_URL + "0/users/me?access_token=ACCESS_TOKEN")).andExpect(method(GET))
                .andRespond(withSuccess(new ClassPathResource("/testdata/user.json", getClass()), MediaType.APPLICATION_JSON));
        ADNUser user = appdotnet.usersOperations().getUserProfile();
        assertBasicUser(user, "1", "mthurman", "Mark Thurman");

        assertEquals("Hi, I'm Mark Thurman and I'm teaching you about the @appdotnet Stream #API.", user.getDescription().getText());
        assertEquals("Hi, I'm Mark Thurman and I'm <a href=\"https://github.com/appdotnet/api_spec\" rel=\"nofollow\">teaching you</a> about the <span itemprop=\"mention\" data-mention-name=\"appdotnet\" data-mention-id=\"3\">@appdotnet</span> Stream #<span itemprop=\"hashtag\" data-hashtag-name=\"api\">API</span>.", user.getDescription().getHtml());
        assertEquals("appdotnet", user.getDescription().getEntities().getMentions().get(0).getName());
        assertEquals("3", user.getDescription().getEntities().getMentions().get(0).getId());
        assertEquals(52, user.getDescription().getEntities().getMentions().get(0).getPosition());
        assertEquals(10, user.getDescription().getEntities().getMentions().get(0).getLength());
        assertEquals("api", user.getDescription().getEntities().getHashtags().get(0).getName());
        assertEquals(70, user.getDescription().getEntities().getHashtags().get(0).getPosition());
        assertEquals(4, user.getDescription().getEntities().getHashtags().get(0).getLength());
        assertEquals("teaching you", user.getDescription().getEntities().getLinks().get(0).getText());
        assertEquals("https://github.com/appdotnet/api-spec", user.getDescription().getEntities().getLinks().get(0).getUrl());
        assertEquals(29, user.getDescription().getEntities().getLinks().get(0).getPosition());
        assertEquals(12, user.getDescription().getEntities().getLinks().get(0).getLength());

        assertEquals("US/Pacific", user.getTimezone());
        assertEquals("en_US", user.getLocale());

        assertEqualsImage(user.getAvatarImage(), 200, 200, "https://example.com/avatar_image.jpg", false);
        assertEqualsImage(user.getCoverImage(), 264, 960, "https://example.com/cover_image.jpg", false);

        assertEquals(ADNUser.ADNUserType.HUMAN, user.getType());
        assertEqualsDate(user.getCreatedAt(), "2012-07-16 17:23:34");

        assertEquals(100, user.getFollowingCount());
        assertEquals(200, user.getFollowersCount());
        assertEquals(24, user.getPostsCount());
        assertEquals(76, user.getStarsCount());

        assertEquals(false, user.isFollowsYou());
        assertEquals(false, user.isYouBlocked());
        assertEquals(false, user.isYouFollow());
        assertEquals(false, user.isYouMuted());
        assertEquals(true, user.isYouCanSubscribe());
        assertEquals(true, user.isYouCanFollow());

        assertEquals("example.com", user.getVerifiedDomain());
        assertEquals("https://alpha.app.net/mthurman", user.getCanonicalUrl());

        assertEqualsAnnotation(user, 0, "net.app.core.directory.blog", "url", "http://myawesomeblog.com");
    }

    @Test
    public void getUserProfileWithParams() {
        mockServer.expect(requestTo(AppdotnetTemplate.BASE_URL +
                "0/users/me?access_token=ACCESS_TOKEN&include_html=1&include_annotations=0&include_user_annotations=0"))
                .andExpect(method(GET))
                .andRespond(withSuccess(new ClassPathResource("/testdata/user.json", getClass()), MediaType.APPLICATION_JSON));
        ADNUser user = appdotnet.usersOperations().getUserProfile(
                GeneralUserParametersBuilder.create()
                        .includeAnnotations(false)
                        .includeHtml(true)
                        .includeUserAnnotations(false)
                        .build());
        assertBasicUser(user, "1", "mthurman", "Mark Thurman");
    }

    @Test
    public void getUserById() {
        mockServer.expect(requestTo(AppdotnetTemplate.BASE_URL + "0/users/1?access_token=ACCESS_TOKEN")).andExpect(method(GET))
                .andRespond(withSuccess(new ClassPathResource("/testdata/user.json", getClass()), MediaType.APPLICATION_JSON));
        ADNUser user = appdotnet.usersOperations().get("1");
        assertBasicUser(user, "1", "mthurman", "Mark Thurman");
    }

    @Test
    public void getUserWithParams() {
        mockServer.expect(requestTo(AppdotnetTemplate.BASE_URL +
                "0/users/1?access_token=ACCESS_TOKEN&include_html=1&include_annotations=0&include_user_annotations=0"))
                .andExpect(method(GET))
                .andRespond(withSuccess(new ClassPathResource("/testdata/user.json", getClass()), MediaType.APPLICATION_JSON));
        ADNUser user = appdotnet.usersOperations().get("1",
                GeneralUserParametersBuilder.create()
                        .includeAnnotations(false)
                        .includeHtml(true)
                        .includeUserAnnotations(false)
                        .build());
        assertBasicUser(user, "1", "mthurman", "Mark Thurman");
    }

    @Test
    public void getUsers() {
        mockServer.expect(requestTo(AppdotnetTemplate.BASE_URL + "0/users/?access_token=ACCESS_TOKEN&ids=1%2C2")).andExpect(method(GET))
                .andRespond(withSuccess(new ClassPathResource("/testdata/users.json", getClass()), MediaType.APPLICATION_JSON));
        ADNUsers users = appdotnet.usersOperations().get(Arrays.asList("1", "2"));
        assertEquals(2, users.getUsers().size());
        assertBasicUser(users.getUsers().get(0), "1", "dalton", "Dalton Caldwell");
        assertBasicUser(users.getUsers().get(1), "2", "berg", "Bryan Berg");
    }

    @Test
    public void getUsersWithParams() {
        mockServer.expect(requestTo(AppdotnetTemplate.BASE_URL +
                "0/users/?access_token=ACCESS_TOKEN&include_html=1&ids=1%2C2&include_annotations=0&include_user_annotations=0"))
                .andExpect(method(GET))
                .andRespond(withSuccess(new ClassPathResource("/testdata/users.json", getClass()), MediaType.APPLICATION_JSON));
        ADNUsers users = appdotnet.usersOperations().get(Arrays.asList("1", "2"),
                GeneralUserParametersBuilder.create()
                        .includeAnnotations(false)
                        .includeHtml(true)
                        .includeUserAnnotations(false)
                        .build());
        assertEquals(2, users.getUsers().size());
        assertBasicUser(users.getUsers().get(0), "1", "dalton", "Dalton Caldwell");
        assertBasicUser(users.getUsers().get(1), "2", "berg", "Bryan Berg");
    }

    @Test
    public void getFollowers() {
        mockServer.expect(requestTo(AppdotnetTemplate.BASE_URL + "0/users/1/followers?access_token=ACCESS_TOKEN")).andExpect(method(GET))
                .andRespond(withSuccess(new ClassPathResource("/testdata/users.json", getClass()), MediaType.APPLICATION_JSON));
        ADNUsers users = appdotnet.usersOperations().getFollowers("1");
        assertEquals(2, users.getUsers().size());
        assertBasicUser(users.getUsers().get(0), "1", "dalton", "Dalton Caldwell");
        assertBasicUser(users.getUsers().get(1), "2", "berg", "Bryan Berg");
    }

    @Test
    public void getFollowersIds() {
        mockServer.expect(requestTo(AppdotnetTemplate.BASE_URL + "0/users/1/followers/ids?access_token=ACCESS_TOKEN")).andExpect(method(GET))
                .andRespond(withSuccess(new ClassPathResource("/testdata/users_ids.json", getClass()), MediaType.APPLICATION_JSON));
        List<String> ids = appdotnet.usersOperations().getFollowersIds("1");
        assertEquals(2, ids.size());
        assertEquals("2", ids.get(0));
        assertEquals("3", ids.get(1));
    }

    @Test
    public void getFollowing() {
        mockServer.expect(requestTo(AppdotnetTemplate.BASE_URL + "0/users/1/following?access_token=ACCESS_TOKEN")).andExpect(method(GET))
                .andRespond(withSuccess(new ClassPathResource("/testdata/users.json", getClass()), MediaType.APPLICATION_JSON));
        ADNUsers users = appdotnet.usersOperations().getFollowing("1");
        assertEquals(2, users.getUsers().size());
        assertBasicUser(users.getUsers().get(0), "1", "dalton", "Dalton Caldwell");
        assertBasicUser(users.getUsers().get(1), "2", "berg", "Bryan Berg");
    }

    @Test
    public void getFollowingIds() {
        mockServer.expect(requestTo(AppdotnetTemplate.BASE_URL + "0/users/1/following/ids?access_token=ACCESS_TOKEN")).andExpect(method(GET))
                .andRespond(withSuccess(new ClassPathResource("/testdata/users_ids.json", getClass()), MediaType.APPLICATION_JSON));
        List<String> ids = appdotnet.usersOperations().getFollowingIds("1");
        assertEquals(2, ids.size());
        assertEquals("2", ids.get(0));
        assertEquals("3", ids.get(1));
    }

    @Test
    public void follow() {
        mockServer.expect(requestTo(AppdotnetTemplate.BASE_URL + "0/users/1/follow?access_token=ACCESS_TOKEN")).andExpect(method(POST))
                .andRespond(withSuccess(new ClassPathResource("/testdata/user.json", getClass()), MediaType.APPLICATION_JSON));
        ADNUser user = appdotnet.usersOperations().follow("1");
        assertBasicUser(user, "1", "mthurman", "Mark Thurman");
    }

    @Test
    public void unfollow() {
        mockServer.expect(requestTo(AppdotnetTemplate.BASE_URL + "0/users/1/follow?access_token=ACCESS_TOKEN")).andExpect(method(DELETE))
                .andRespond(withSuccess(new ClassPathResource("/testdata/user.json", getClass()), MediaType.APPLICATION_JSON));
        appdotnet.usersOperations().unfollow("1");
    }

    @Test
    public void mute() {
        mockServer.expect(requestTo(AppdotnetTemplate.BASE_URL + "0/users/1/mute?access_token=ACCESS_TOKEN")).andExpect(method(POST))
                .andRespond(withSuccess(new ClassPathResource("/testdata/user.json", getClass()), MediaType.APPLICATION_JSON));
        ADNUser user = appdotnet.usersOperations().mute("1");
        assertBasicUser(user, "1", "mthurman", "Mark Thurman");
    }

    @Test
    public void unmute() {
        mockServer.expect(requestTo(AppdotnetTemplate.BASE_URL + "0/users/1/mute?access_token=ACCESS_TOKEN")).andExpect(method(DELETE))
                .andRespond(withSuccess(new ClassPathResource("/testdata/user.json", getClass()), MediaType.APPLICATION_JSON));
        appdotnet.usersOperations().unmute("1");
    }

    @Test
    public void getMuted() {
        mockServer.expect(requestTo(AppdotnetTemplate.BASE_URL + "0/users/1/muted?access_token=ACCESS_TOKEN")).andExpect(method(GET))
                .andRespond(withSuccess(new ClassPathResource("/testdata/users.json", getClass()), MediaType.APPLICATION_JSON));
        ADNUsers users = appdotnet.usersOperations().getMutedUsers("1");
        assertEquals(2, users.getUsers().size());
        assertBasicUser(users.getUsers().get(0), "1", "dalton", "Dalton Caldwell");
        assertBasicUser(users.getUsers().get(1), "2", "berg", "Bryan Berg");
    }

    @Test
    public void getMutedByMe() {
        mockServer.expect(requestTo(AppdotnetTemplate.BASE_URL + "0/users/me/muted?access_token=ACCESS_TOKEN")).andExpect(method(GET))
                .andRespond(withSuccess(new ClassPathResource("/testdata/users.json", getClass()), MediaType.APPLICATION_JSON));
        ADNUsers users = appdotnet.usersOperations().getMutedUsers();
        assertEquals(2, users.getUsers().size());
        assertBasicUser(users.getUsers().get(0), "1", "dalton", "Dalton Caldwell");
        assertBasicUser(users.getUsers().get(1), "2", "berg", "Bryan Berg");
    }

    @Test
    public void block() {
        mockServer.expect(requestTo(AppdotnetTemplate.BASE_URL + "0/users/1/block?access_token=ACCESS_TOKEN")).andExpect(method(POST))
                .andRespond(withSuccess(new ClassPathResource("/testdata/user.json", getClass()), MediaType.APPLICATION_JSON));
        ADNUser user = appdotnet.usersOperations().block("1");
        assertBasicUser(user, "1", "mthurman", "Mark Thurman");
    }

    @Test
    public void unblock() {
        mockServer.expect(requestTo(AppdotnetTemplate.BASE_URL + "0/users/1/block?access_token=ACCESS_TOKEN")).andExpect(method(DELETE))
                .andRespond(withSuccess(new ClassPathResource("/testdata/user.json", getClass()), MediaType.APPLICATION_JSON));
        appdotnet.usersOperations().unblock("1");
    }

    @Test
    public void getBlocked() {
        mockServer.expect(requestTo(AppdotnetTemplate.BASE_URL + "0/users/1/blocked?access_token=ACCESS_TOKEN")).andExpect(method(GET))
                .andRespond(withSuccess(new ClassPathResource("/testdata/users.json", getClass()), MediaType.APPLICATION_JSON));
        ADNUsers users = appdotnet.usersOperations().getBlockedUsers("1");
        assertEquals(2, users.getUsers().size());
        assertBasicUser(users.getUsers().get(0), "1", "dalton", "Dalton Caldwell");
        assertBasicUser(users.getUsers().get(1), "2", "berg", "Bryan Berg");
    }

    @Test
    public void getBlockedMe() {
        mockServer.expect(requestTo(AppdotnetTemplate.BASE_URL + "0/users/me/blocked?access_token=ACCESS_TOKEN")).andExpect(method(GET))
                .andRespond(withSuccess(new ClassPathResource("/testdata/users.json", getClass()), MediaType.APPLICATION_JSON));
        ADNUsers users = appdotnet.usersOperations().getBlockedUsers();
        assertEquals(2, users.getUsers().size());
        assertBasicUser(users.getUsers().get(0), "1", "dalton", "Dalton Caldwell");
        assertBasicUser(users.getUsers().get(1), "2", "berg", "Bryan Berg");
    }

}

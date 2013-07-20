package org.springframework.social.appdotnet.api.impl;

import org.junit.Before;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.social.appdotnet.api.data.user.ADNImage;
import org.springframework.social.appdotnet.api.data.user.ADNUser;
import org.springframework.test.web.client.MockRestServiceServer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import static junit.framework.Assert.assertEquals;

/**
 * @author Arik Galansky
 */
public class AbstractAppdotnetApiTest {
    protected AppdotnetTemplate appdotnet;
    protected MockRestServiceServer mockServer;
    protected HttpHeaders responseHeaders;

    @Before
    public void setup() {
        appdotnet = new AppdotnetTemplate("ACCESS_TOKEN");
        mockServer = MockRestServiceServer.createServer(appdotnet.getRestTemplate());
        responseHeaders = new HttpHeaders();
        responseHeaders.setContentType(MediaType.APPLICATION_JSON);
    }

    protected void assertBasicUser(ADNUser adnUser, String expectedId, String expectedUsername, String expectedName) {
        assertEquals(expectedId, adnUser.getId());
        assertEquals(expectedUsername, adnUser.getUsername());
        assertEquals(expectedName, adnUser.getName());
    }

    protected void assertEqualsDate(Date createdAt, String expectedDateTime) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        assertEquals(expectedDateTime, dateFormat.format(createdAt));
    }

    protected void assertEqualsImage(ADNImage avatarImage, int expectedHeight, int expectedWidth, String expectedUrl, boolean expectedDefault) {
        assertEquals(expectedHeight, avatarImage.getHeight());
        assertEquals(expectedWidth, avatarImage.getWidth());
        assertEquals(expectedUrl, avatarImage.getUrl());
        assertEquals(expectedDefault, avatarImage.isDefault());
    }

    protected void assertEqualsAnnotation(ADNUser user, int expectedIndex, String expectedType, String expectedValueKey, String expectedValueValue) {
        assertEquals(expectedType, user.getAnnotations().get(expectedIndex).getType());
        assertEquals(expectedValueValue, user.getAnnotations().get(expectedIndex).getValue().get(expectedValueKey));
    }
}

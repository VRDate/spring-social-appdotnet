package org.springframework.social.appdotnet.api.impl;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.support.HttpRequestWrapper;

import java.io.IOException;

/**
 * Request interceptor class used to make the request suitable for app.net interaction by setting appropriate headers.
 *
 * @author Arik Galansky
 */
class AppdotnetRequestInterceptor implements ClientHttpRequestInterceptor {
    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        HttpRequestWrapper requestWrapper = new HttpRequestWrapper(request);
        requestWrapper.getHeaders().set("X-ADN-Migration-Overrides",
                "response_envelope=1&disable_min_max_id=1&follow_pagination=1");

        return execution.execute(requestWrapper, body);
    }
}

package com.tekphile.finagle_playground;

import com.twitter.finagle.Service;
import com.twitter.util.Future;
import org.jboss.netty.handler.codec.http.DefaultHttpResponse;
import org.jboss.netty.handler.codec.http.HttpRequest;
import org.jboss.netty.handler.codec.http.HttpResponse;
import org.jboss.netty.handler.codec.http.HttpResponseStatus;

public class App {

    public static void main(String[] args) {
        Service<HttpRequest, HttpResponse> service = new Service<HttpRequest, HttpResponse>() {
            @Override
            public Future<HttpResponse> apply(HttpRequest request) {
                return Future.value(new DefaultHttpResponse(request.getProtocolVersion(), HttpResponseStatus.OK));
            }
        };
    }

}

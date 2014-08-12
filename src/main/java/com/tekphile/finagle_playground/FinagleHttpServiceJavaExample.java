package com.tekphile.finagle_playground;

import com.twitter.finagle.Http;
import com.twitter.finagle.ListeningServer;
import com.twitter.finagle.Service;
import com.twitter.util.Await;
import com.twitter.util.Future;
import com.twitter.util.TimeoutException;
import org.jboss.netty.handler.codec.http.DefaultHttpResponse;
import org.jboss.netty.handler.codec.http.HttpRequest;
import org.jboss.netty.handler.codec.http.HttpResponse;
import org.jboss.netty.handler.codec.http.HttpResponseStatus;

public class FinagleHttpServiceJavaExample {

    public static void main(String[] args) throws InterruptedException {
        Service<HttpRequest, HttpResponse> service = new Service<HttpRequest, HttpResponse>() {
            @Override
            public Future<HttpResponse> apply(HttpRequest req) {
                // must parameterize Future to HttpResponse
                return Future.<HttpResponse>value(new DefaultHttpResponse(req.getProtocolVersion(), HttpResponseStatus.OK));
            }
        };

        ListeningServer server = Http.serve(":8080", service);
        try {
            Await.ready(server);
        } catch (TimeoutException e) { //TODO: submit bug ticket for intellij (first try upgrading)
            e.printStackTrace();

        }
    }

}

package com.tekphile.finagle_playground;

import com.twitter.finagle.Http;
import com.twitter.finagle.ListeningServer;
import com.twitter.finagle.Service;
import com.twitter.util.Await;
import com.twitter.util.Future;
import org.jboss.netty.handler.codec.http.DefaultHttpResponse;
import org.jboss.netty.handler.codec.http.HttpRequest;
import org.jboss.netty.handler.codec.http.HttpResponse;
import org.jboss.netty.handler.codec.http.HttpResponseStatus;

public class FinagleHttpServiceJavaExample {

    public static void main(String[] args) { //throws InterruptedException {
//        Service<HttpRequest, HttpResponse> service = new Service<HttpRequest, HttpResponse>() {
//            @Override
//            public Future<HttpResponse> apply(HttpRequest req) {
//                return Future.value(new DefaultHttpResponse(req.getProtocolVersion(), HttpResponseStatus.OK));
//            }
//        };
//
//        ListeningServer server = Http.serve(":8080", service);
//        Await.ready(server);
    }

}

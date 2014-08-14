package com.tekphile.finagle_playground;

import com.twitter.finagle.Http;
import com.twitter.finagle.Service;
import com.twitter.util.Await;
import com.twitter.util.Duration;
import com.twitter.util.Future;
import com.twitter.util.Try;
import org.jboss.netty.handler.codec.http.*;
import scala.runtime.AbstractFunction1;
import scala.runtime.BoxedUnit;
import static java.lang.System.out;

public class FinagleHttpClientJavaExample {

    public static void main(String[] args) throws Exception {
        Service<HttpRequest,HttpResponse> client = Http.newService("google.com:80");
        DefaultHttpRequest request = new DefaultHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.GET, "/");

        // not sure if this is the cleanest way to do this...
        // java8 lambdas FTW?
        Future<HttpResponse> response = client.apply(request);
        response.onSuccess(new AbstractFunction1<HttpResponse, BoxedUnit>() {
            @Override
            public BoxedUnit apply(HttpResponse v1) {
                out.println("GET success: " + v1);
                return BoxedUnit.UNIT;
            }
        });

        Await.ready(response);

        // or just go for it?
        ////HttpResponse httpResponse = client.apply(request).get(Duration.fromSeconds(5)).get();
        ////out.println(httpResponse);
    }
}

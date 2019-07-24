package main.java.httpserver;

import java.util.Random;

public class RequestHandler {

    static void start() {
        String requestBoby = "Action: ";
        String request = "";
        int r = new Random().nextInt(HttpMethods.values().length);
        HttpMethods cases = HttpMethods.values()[r];
        switch (cases) {
            case GET:
             request = requestBoby + "GET some info";
             break;
            case POST:
                request = requestBoby + "POST some info";
                break;
            case PUT:
                request = requestBoby + "PUT some info";
                break;
            case DELETE:
                request = requestBoby + "DELETE some info";
                break;
        }
        System.out.println(request);
    }

}

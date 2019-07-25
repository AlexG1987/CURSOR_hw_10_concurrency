package main.java.httpserver;

import java.util.Random;

class RequestHandler {

    static void runHttpMethod() {
        String requestBody = "Action: ";
        String request = "";
        int r = new Random().nextInt(HttpMethods.values().length);
        HttpMethods cases = HttpMethods.values()[r];
        switch (cases) {
            case GET:
             request = requestBody + "GET some info";
             break;
            case POST:
                request = requestBody + "POST some info";
                break;
            case PUT:
                request = requestBody + "PUT some info";
                break;
            case DELETE:
                request = requestBody + "DELETE some info";
                break;
        }
        System.out.println(request);
    }

}

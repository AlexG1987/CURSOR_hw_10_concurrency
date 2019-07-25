package main.java.httpserver;

public class RequestThread extends Thread {

    RequestThread(String name) {
        super(name);
    }

    public void run() {

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter = 1;
        while (!isInterrupted()) {
            System.out.print("Request № " + counter++ + " ");
            RequestHandler.runHttpMethod();
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }

}

package main.java.httpserver;

public class Server {

    public static void startServer() {
        RequestThread r = new RequestThread("RequestHandler ");
        r.start();
        try{
            RequestThread.sleep(1000);
            r.interrupt();
            RequestThread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
    }
}

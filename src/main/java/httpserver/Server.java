package main.java.httpserver;

public class Server {

    public static void startServer() {
        System.out.println("Thread: " + Thread.currentThread().getName());
        Server server = new Server();
        for (int i = 1; i < 10; i++)
            try {
                RequestHandler.start();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}

package main.java;

import main.java.firemandep.FireManDepartment;
import main.java.httpserver.Server;

class Main {

    public static void main(String[] args) {
        System.out.println("Task one - HTTP Server");
        Server.startServer();
        System.out.println();
        System.out.println("Task two - FireMan Department");
        FireManDepartment.alarm();
    }
}

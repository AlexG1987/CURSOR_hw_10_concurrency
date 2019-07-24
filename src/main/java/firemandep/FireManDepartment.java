package main.java.firemandep;

public class FireManDepartment {

    public static void alarm() {

        System.out.println("ALARM!!! Fire in a hole!");
        FireManThread fireManThread = new FireManThread();
        new Thread(fireManThread, "Alex").start();
        new Thread(fireManThread, "Bob").start();
        new Thread(fireManThread, "Dylan").start();
            try {
                Thread.sleep(1100);
                fireManThread.disable();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!");
            }
        System.out.println("Job done, fire extinguished successfully!!!");
        }

    }


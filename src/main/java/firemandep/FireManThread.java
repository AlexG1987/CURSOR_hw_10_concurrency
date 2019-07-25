package main.java.firemandep;

class FireManThread implements Runnable {

    private boolean isActive;

    void disable() {
        isActive = false;
    }

    FireManThread() {
        isActive = true;
    }

    public void run() {
        int phase = 1;
        while (isActive) {
            System.out.println("Fire extinguish by " + Thread.currentThread().getName() + " in phase " + phase++);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Extinguish has been interrupted");
            }
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}





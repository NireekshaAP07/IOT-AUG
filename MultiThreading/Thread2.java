public class Thread2 extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {

            System.out.println("Thread2 " + i);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
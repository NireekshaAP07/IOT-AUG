public class Thread3 extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {

            System.out.println("Thread3 " + i);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
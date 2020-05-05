public class Main {

    public static void main(String[] args) throws InterruptedException {
        OddThread test1 = new OddThread();
        EvenThread test2 = new EvenThread();
        Thread thread1 = new Thread(test1);
        Thread thread2 = new Thread(test2);
        thread1.start();
        thread1.join();
        thread2.start();
    }
}

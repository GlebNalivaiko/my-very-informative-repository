package lesson19.homework;

public class TreadStart {
    public static void main(String[] args) {
        MyThreads T1 = new MyThreads();
        MyThreads T2 = new MyThreads();
        MyThreads T3 = new MyThreads();
        try {
            T3.start();
            T3.join();
            T2.start();
            T2.join();
            T1.start();
            T1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

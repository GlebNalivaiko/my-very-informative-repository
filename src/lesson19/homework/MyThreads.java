package lesson19.homework;

public class MyThreads extends Thread{
    @Override
    public void run() {
        System.out.println(this.getName()+"=>"+getClass());
    }
}

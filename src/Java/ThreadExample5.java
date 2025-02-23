package Java;

//MultiTreading
import java.lang.*;
public class ThreadExample5 implements Runnable{
    @Override
    public void run(){
        System.out.println("run thread");
    }
    public static void main(String[] args) {
        Thread t1 = new Thread("Demo 1");
        Thread t2 = new Thread("Demo 2");
        Thread t3 = new Thread("Demo 3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());
    }
}

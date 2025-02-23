package Java;

import java.lang.*;
public class ThreadExample3 extends Thread{
    public void run(){
        System.out.println("Thread");
    }

    public static void main(String[] args) {
        ThreadExample3 t1 = new ThreadExample3();
        ThreadExample3 t2 = new ThreadExample3();
        ThreadExample3 t3 = new ThreadExample3();
        t1.setPriority(3);
        t2.setPriority(2);
        t3.setPriority(7);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        System.out.println("Get the current thread name: " + Thread.currentThread().getName());
        Thread.currentThread().setPriority(8);
        System.out.println("The Priority of Current Thread is: " + Thread.currentThread().getPriority());

        ThreadExample3 t4 = new ThreadExample3();
        System.out.println(t4.getPriority()); // 8

        t4.setPriority(11);
        System.out.println(t4.getPriority());
    }
}

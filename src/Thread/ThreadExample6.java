package Thread;

// Asynchronously
import java.lang.*;
class Task implements Runnable{
    public void run(){
        System.out.println("Run thread : " + Thread.currentThread().getName());
    }
}
public class ThreadExample6 extends Thread {
    public static void main(String[] args) {
        for(int i = 0 ; i<10; i++){
            Thread t = new Thread(new Task());
            t.start();
        }
        System.out.println(Thread.currentThread().getName());
    }
}

//        // Single Thread
//        Thread t = new Thread(new Task());
//        t.start();
//        System.out.println(Thread.currentThread().getName());

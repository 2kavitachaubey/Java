package Revision;

import java.util.TreeMap;
import java.util.concurrent.Semaphore;

class ThreadSema implements Runnable{
    Semaphore ss;
    ThreadSema(Semaphore ss){
        this.ss = ss;
    }
    public void run(){
        try {
            ss.acquire();
            for(int i =0 ; i < 5; i++){
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            }
            ss.release();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
public class U3ThreadSemaphore {
    public static void main(String[] args) {
        Semaphore ss = new Semaphore(1);
        Thread n = new Thread(new ThreadSema(ss),"Thread 1");
        Thread  m= new Thread(new ThreadSema(ss),"Thread 2");
        n.start();
        m.start();
    }
}

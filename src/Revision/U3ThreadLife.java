package Revision;
import java.lang.*;
class MyThread implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is running...");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Thread is finised...");
    }
}
public class U3ThreadLife{
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        System.out.println("State of Thread: " + t.getState());

        t.start();

        try {
            Thread.sleep(1000);
            System.out.println("State of Thread: " + t.getState());
        }catch (InterruptedException e){
            System.out.println(e);
        }

        try{
            t.join();
        }catch (InterruptedException e){
            System.out.println(e);
        }

        System.out.println("State after thread finishes: " + t.getState());
    }
}

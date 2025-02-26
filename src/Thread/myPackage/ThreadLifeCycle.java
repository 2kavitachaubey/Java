package Thread.myPackage;

import java.lang.*;
class ThreadRun extends Thread{
    public void run(){
        System.out.println("The running: "+ Thread.currentThread().getName());
        try{
            Thread.sleep(400);
            System.out.println(Thread.currentThread().getName()+ " wake up after sleep");
        }catch (InterruptedException e){
            System.out.println("Thread Interrupted: "+ e.getMessage());
        }
    }
}
public class ThreadLifeCycle {
    public static void main(String[] args) {
        ThreadRun t = new ThreadRun();
        System.out.println("Thread state after creation: "+ t.getState()); //state
        t.start();
        System.out.println("In Runnable state: "+ t.getState());
        t.run();

        try {
            Thread.sleep(400);
            System.out.println("Thread is running: "+ t.getState());
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            t.join();   // dead
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Thread complete the life cycle: "+ t.getState());
    }
}

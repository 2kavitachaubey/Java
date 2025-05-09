package Revision;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class task implements Runnable{
    public void run(){
        System.out.println("running..");
    }
}

public class U3ThreadPool {
    public static void main(String[] args) {
        ExecutorService service  = Executors.newFixedThreadPool(5);
        for(int i = 0 ;i<5; i++){
            service.execute(new task());
        }
        System.out.println(Thread.currentThread().getName());
        service.shutdown();
    }
}

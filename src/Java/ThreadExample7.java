package Java;

//Thread Pool
import java.lang.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample7 implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for(int i = 1; i<=100; i++){
            service.execute(new ThreadExample7());
        }
        System.out.println(Thread.currentThread().getName());
    }
}

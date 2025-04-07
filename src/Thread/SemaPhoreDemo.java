package Thread;
import java.lang.*;
import java.util.concurrent.*;
class semaphoreExample implements Runnable{
    Semaphore sema = new Semaphore(2);
    @Override
    public void run(){
        try {
            sema.acquire();
            System.out.println("Begin the Thread: " + Thread.currentThread().getName());
            for(int i = 0; i<5; i++){
                System.out.println("Thread is running: "+ Thread.currentThread().getName());
                Thread.sleep(400);
            }
            sema.release();
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
public class SemaPhoreDemo {
    public static void main(String[] args) {
        semaphoreExample t = new semaphoreExample();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t,"Hinata");
        Thread t3 = new Thread(t,"Sasuke");
        t1.setName("Kavita");
        t1.start();
        t2.start();
        t3.start();
    }
}

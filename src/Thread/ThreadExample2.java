package Thread;

//Implements Runnable
import java.lang.*;

public class ThreadExample2 implements Runnable{
    @Override
    public void  run(){
        System.out.println("Thread Occurs");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new ThreadExample2());
        t.start();
    }
}

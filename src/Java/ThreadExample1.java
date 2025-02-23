package Java;

// Extends thread class
import java.lang.*;
public class ThreadExample1 extends Thread{
    public void run(){
        System.out.println("It's an thread");
    }

    public static void main(String[] args) {
        ThreadExample1 t = new ThreadExample1();
        t.start();
        System.out.println(t.getName());
    }
}

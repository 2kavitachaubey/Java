package Thread;
import java.lang.*;
public class TenThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Run program");
    }

    public static void main(String[] args) {
        for (int i = 0; i<10;i++){
            Thread thread = new Thread();
            thread.start();
            System.out.println(thread.getName());
        }
    }
}

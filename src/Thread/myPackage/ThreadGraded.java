package Thread.myPackage;

import java.lang.*;
public class ThreadGraded implements Runnable {
    private String a1;
    public ThreadGraded(String a1){
        this.a1 = a1;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        for(int i = 1; i<=100;i++){
            Thread t = new Thread(new ThreadGraded());
            t.start();
        }
    }
}

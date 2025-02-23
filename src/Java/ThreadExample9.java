package Java;
// Synchronized method

import java.lang.*;
class Tables{
    synchronized void printTable(int num){
        for(int i = 1 ; i<=5 ; i++){
            System.out.println(num*i);
            try {
                Thread.sleep(400);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class Thread10 extends Thread{
    Tables t1;
    Thread10(Tables t1){
        this.t1 = t1;
    }
    public void run(){
        t1.printTable(5);
    }
}
class Thread20 extends Thread{
    Tables t1;
    Thread20(Tables t){
        this.t1 = t;
    }
    public void run(){
        t1.printTable(100);
    }
}
public class ThreadExample9 extends Thread{
    public static void main(String[] args) {
        Tables t = new Tables();
        Thread10 t1 = new Thread10(t);
        Thread20 t2 = new Thread20(t);
        t1.start();
        t2.start();
    }
}

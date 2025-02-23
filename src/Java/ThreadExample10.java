package Java;

import java.lang.*;
class MyTable{
    void printTable(int num){
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(num * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
class MyThread1 extends Thread{
    MyTable t1;
    MyThread1(MyTable t1){
        this.t1 = t1;
    }
    public void run(){
        t1.printTable(5);
    }
}
class MyThread2 extends Thread{
    MyTable t1;
    MyThread2(MyTable t){
        this.t1 = t;
    }
    public void run(){
        t1.printTable(100);
    }
}
public class ThreadExample10 extends Thread{
    public static void main(String[] args) {
        MyTable t = new MyTable();
        MyThread1 t1 = new MyThread1(t);
        MyThread2 t2 = new MyThread2(t);
        t1.start();
        t2.start();
    }
}

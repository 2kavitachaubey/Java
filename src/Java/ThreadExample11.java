package Java;

import java.lang.*;
class CountTable{
    synchronized static void printTable(int num){
        for(int i = 1 ; i<=5 ; i++){
            System.out.println(num*i);
            try {
                Thread.sleep(300);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class Thread01 extends Thread{
    public void run(){
        CountTable.printTable(5);
    }
}
class Thread02 extends Thread{
    public void run(){
        CountTable.printTable(100);
    }
}
class Thread03 extends Thread{
    public void run(){
        CountTable.printTable(4);
    }
}
class Thread04 extends Thread{
    public void run(){
        CountTable.printTable(7);
    }
}

public class ThreadExample11 extends Thread{
    public static void main(String[] args) {
        Thread01 t1 = new Thread01();
        Thread02 t2 = new Thread02();
        Thread03 t3 = new Thread03();
        Thread04 t4 = new Thread04();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

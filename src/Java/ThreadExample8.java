package Java;


// Without synchronized
import java.lang.*;
class Table {
    void printTable(int num){
        for(int i = 1; i<=5 ; i++){
            System.out.println(num*i);
            try{
                Thread.sleep(400); // millisecond
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class Thread1 extends Thread{
    Table t;     //Declare an object of Table Class
    Thread1(Table t){
        this.t = t;  // Initialize the object
    }
    public void run(){
        t.printTable(5);  // call the print Table in the Table class
    }
}
class Thread2 extends Thread{
    Table t;
    Thread2(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(100);
    }
}
public class ThreadExample8 {
    public static void main(String[] args) {
        Table t = new Table();
        Thread1 t1 = new Thread1(t);
        Thread2 t2 = new Thread2(t);
        t1.start();
        t2.start();
    }
}

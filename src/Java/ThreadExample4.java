package Java;

import java.lang.*;

// By Thread()
//public class ThreadExample4 extends Thread{
//    public static void main(String[] args) {
//        Thread t = new Thread();
//        t.start();
//        System.out.println(t.getName());
//    }
//}


//Thread(String str);
//public class ThreadExample4 extends Thread{
//    public static void main(String[] args) {
//        Thread t = new Thread("My Thread");
//        t.start();
//        System.out.println(t.getName());
//    }
//}


//By Thread(Runnable)
//public class ThreadExample4 implements Runnable{
//@Override
//    public void run(){
//        System.out.println("Hello Thread");
//    }
//    public static void main(String[] args) {
//        Thread t = new Thread(new ThreadExample4());
//        t.start();
//        System.out.println(t.getName());
//    }
//}


// By Thread(Runnable, String)
public class ThreadExample4 implements Runnable{
    @Override
    public void run(){
        System.out.println("Hello Thread");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new ThreadExample4(), "It's a Thread");
        t.start();
        System.out.println(t.getName());
    }
}

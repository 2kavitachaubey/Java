package Revision;
class MyNumber {
    public synchronized void num(int n){
        for (int i = 0; i <=n; i++){
            if(i % 2 ==0){
                System.out.println("It's even: " + i);
            }
        }
    }
    public synchronized void odd(int n){
        for(int i =0 ; i<=n ; i++){
            if(i % 2 != 0){
                System.out.println("Odd: " + i);
            }
        }
    }
}
class MyTask implements Runnable{
     MyNumber n;
     MyTask(MyNumber t){
         this.n = t;
     }
    public void run() {
        n.num(100);
        n.odd(100);
    }
}
public class U3ThreadSynchronization {
    public static void main(String[] args) {
        MyNumber n = new MyNumber();
        Thread t1 = new Thread(new MyTask(n));
        t1.start();
    }
}

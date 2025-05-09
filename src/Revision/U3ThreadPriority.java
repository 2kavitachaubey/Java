package Revision;

public class U3ThreadPriority implements Runnable {
    public void run(){
    }

    public static void main(String[] args) {
        for(int i = 0 ; i <20; i++){
            Thread t = new Thread(new U3ThreadPriority(), "Thread"+i);
            System.out.println(t.getName());
            t.start();

            int a = (int)(Math.random()*10 + 1);
            t.setPriority(a);
            System.out.println(t.getPriority());

        }
    }
}

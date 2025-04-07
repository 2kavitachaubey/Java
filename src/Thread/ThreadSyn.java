package Thread;
class MyAnime{
    synchronized static void animeName(String n){  // Method -- synchronized void animeName(String n)
        for (int i = 0; i < 5; i++) {
            System.out.println(n + " " + i);
        }
        try {
            Thread.sleep(400);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class ThreadOne extends Thread{
    public void run(){
        MyAnime.animeName("Naruto");
    }
}
class ThreadTwo extends Thread{
    public void run(){
        MyAnime.animeName("Sakamoto");
    }
}

//    void animeName(String n){  // Method -- synchronized void animeName(String n)
//        synchronized(this) {  // Block
//            for (int i = 0; i < 5; i++) {
//                System.out.println(n + " " + i);
//            }
//            try {
//                Thread.sleep(400);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//    }
//}
//class ThreadOne extends Thread{
//    MyAnime a;
//    ThreadOne(MyAnime a){
//        this.a = a;
//    }
//    public void run(){
//        a.animeName("Naruto");
//    }
//}
//class ThreadTwo extends Thread{
//    MyAnime a;
//    ThreadTwo(MyAnime a){
//        this.a = a;
//    }
//    public void run(){
//        a.animeName("Sakamoto");
//    }
//}
public class ThreadSyn {
    public static void main(String[] args) {
//        MyAnime anime = new MyAnime();
//        ThreadOne t1 = new ThreadOne(anime);
//        ThreadTwo t2 = new ThreadTwo(anime);
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        t1.start();
        t2.start();
    }
}

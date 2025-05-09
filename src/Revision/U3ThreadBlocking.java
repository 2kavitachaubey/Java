//package Revision;
//
//import java.util.LinkedList;
//import java.util.List;
//
//public class U3ThreadBlocking<E> {
//    private List<E> queue= new LinkedList<E>();
//    private int limit = 10;
//    U3ThreadBlocking(int limit){
//        this.limit = limit;
//    }
//    public synchronized void enqueue(E item) throws InterruptedException{
//        while(this.queue.size() == this.limit){
//            wait();
//        } if (this.queue.size() == 0) {
//            notifyAll();
//        }
//        this.queue.add(item);
//    }
//    public synchronized void dequeue(E item) throws InterruptedException{
//        while (this.queue.size() == 0){
//            wait();
//        } if (this.queue.size() == this.limit) {
//            notifyAll();
//        }
//        this.queue.remove(0);
//    }
//
//    public static void main(String[] args) {
////        U3ThreadBlocking blockingDeQue = new U3ThreadBlocking(5);
////        Thread producer = new Thread(blockingDeQue);
////        for(int i = 0; i<10;i++){
////            producer.enqueue(i);
//
//        }
//    }
//
//}

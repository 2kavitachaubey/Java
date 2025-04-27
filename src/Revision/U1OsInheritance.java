package Revision;

class MyfirstClass{
    public void run(){
        System.out.println("hello");
    }
}
class MysecondClass extends MyfirstClass{
    @Override
    public void run(){
        System.out.println("world");
    }
}
public class U1OsInheritance {
    public static void main(String[] args) {
        MyfirstClass ms = new MysecondClass();
        ms.run();
    }
}

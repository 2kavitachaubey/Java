package Java;

// class - class == extends
// interface - class == implements
// interface - interface == extends

interface P{
    void display();
    void config();
}
interface Q{
    void run();
}
interface R extends Q{

}

class T implements P,R{
    public void display(){
        System.out.println("hello");
    }
    public void config(){
        System.out.println("world");
    }
    public void run(){
        System.out.println("..Bye");
    }
}
public class Interface3 {
    public static void main(String[] args) {
        P p1 = new T();
        p1.display();
        p1.config();

        Q q1 = new T();
        q1.run();
    }
}

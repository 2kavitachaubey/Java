package CoreJava;

class C {
    String about = "I'm a super class variable.";
    void me(){
        System.out.println("It's all about super class methods.");
    }
}
class D extends C{
    String more = "I'm a sub class variable";
    void show(){
        System.out.println(more);
        System.out.println(super.about);
    }
    void me(){
        System.out.println("It's all about sub class methods.");
    }
    void display(){
        super.me();
        me();
    }
}

public class Super2 {
    public static void main(String[] args) {
        D d = new D();
        d.show();
        d.display();
    }
}
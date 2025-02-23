package CoreJava;

class FinalClass{         // If we write final before class it can't not be extends by other subclass...
    final void display(){
        System.out.println("I'm the final method.");
    }
}
class Second extends FinalClass{
//    void display(){}  // can't override the final method

}
public class FinalKeyword {
    public static void main(String[] args) {
        final int a = 20;
//        a = 10;  // can't do that because a variable become constant

        Second s = new Second();
        s.display();
    }
}

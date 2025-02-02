package Java;

class Calculate{
    public void display(){
        System.out.println("My name is Kavita Chaubey");
    }
}
class Runtime extends Calculate{
    public void display(){
        System.out.println("I am Runtime Polymorphism");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Runtime r1 = new Runtime();
        r1.display();
    }
}

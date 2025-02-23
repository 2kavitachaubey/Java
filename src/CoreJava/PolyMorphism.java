package CoreJava;

class MyClass{
    public void display(String name){
        System.out.println("My Name is " + name);
    }
    public void display(){
        System.out.println("College : DIT");
    }
}
public class PolyMorphism {
    public static void main(String[] args) {
        MyClass m = new MyClass();
        m.display("Kavita Chaubey");
        m.display();
    }
}

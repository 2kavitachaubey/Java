package CoreJava;

public class ConstructorObject {
    // if don't have any argument in constructor it's a default constructor
    int a,b;
    ConstructorObject(int num1, int num2){
        a = num1;
        b = num2;
    }
    public  void display(){
        System.out.println(a + " " + b);
    }
    public static void main(String[] args) {
        ConstructorObject co = new ConstructorObject(50,40);
        co.display();
    }
}

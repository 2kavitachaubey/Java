package Java;

// there is alway a super class for every class but it's not visible
class A extends Object{
    public A() {
        super();
        System.out.println("Hello A");
    }
    public A(int n){
        System.out.println("Hello A " + n);
    }
}
class B extends A{
    public B(){
        super();                      // call the default constructor of super class
        System.out.println("Hello B");
    }
    public B(int n){
        this();   // go to constructor of current class...
//        super();
//        super(n);                      // call the parameterized constructor of super class
        System.out.println("Hello B " +n);
    }
}

public class Super {
    public static void main(String[] args) {
        B b1 = new B(2);
    }
}

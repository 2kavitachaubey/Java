package Java;

class CompileTime{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b, double c){ // same name method
        return a+b+c;
    }
}
public class Overloading {
    public static void main(String[] args) {
        CompileTime c1 = new CompileTime();
        System.out.println(c1.add(11,12));
        System.out.println(c1.add(23,242,54));
        System.out.println(c1.add(12,43,64));
    }
}

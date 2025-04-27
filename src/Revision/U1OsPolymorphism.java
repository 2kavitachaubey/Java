package Revision;

class Overload{
    String myName = "Kavita";
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(double a,double b,double c){
        System.out.println(a+b+c);
    }
}
class Overrides extends Overload{
    @Override
    public void add(int a,int b){
        System.out.println(a - b);
    }
    String myName = "Muskan";
    public void name(){
        System.out.println(super.myName);
    }
}
public class U1OsPolymorphism {
    public static void main(String[] args) {
        Overrides o = new Overrides();
        o.add(9,2,4);
        o.add(2,5);

        o.name();
        o.add(4,6);
    }
}

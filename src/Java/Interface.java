package Java;
interface Pw{
    int number = 10;              // variable are STATIC and FINAL(constant)
    String myName = "Kavita";
    void shows();
    void config();
}
class Newpw implements Pw{
    public void shows(){
        System.out.println("Hey I'm show.");
    }
    public void config(){
        System.out.println("Hey I'm config.");
    }
}
public class Interface {
    public static void main(String[] args) {
        Pw object = new Newpw();
        object.shows();
        object.config();

        System.out.println(Pw.myName);
        System.out.println(Pw.number);
    }
}

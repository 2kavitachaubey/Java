package Revision;
interface MyInterface{
    void name();
    int number = 5;
}
class myClas implements MyInterface{
    public void name(){
        System.out.println("Its Kavita");
    }
    public void num(){
        System.out.println(number);
    }
}
public class U1OsInterface {
    public static void main(String[] args) {
        myClas c = new myClas();
        c.name();
        c.num();
    }
}

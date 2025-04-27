package Revision;
abstract class AbClas{
    void display(){
    }
    void message(){
        System.out.println("That's it for today..");
    }
}
class myClass extends AbClas{
    @Override
    public void display(){
        System.out.println("And I'm iron man.");
    }
}
public class U1OsAbstruction {
    public static void main(String[] args) {
        AbClas ab = new myClass();
        ab.display();
        ab.message();
    }
}

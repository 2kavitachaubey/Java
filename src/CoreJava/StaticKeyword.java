package CoreJava;
// Static keyword - We don't need to call can object. Used in memory management...
class Employee{
    int name ;
    int salary;
    static String ceo;
    Employee(){
        name = 1;
        salary = 120000;
        System.out.println("I'm a constructor");
    }

    static {
        ceo = "Mark Zuckerberg";
        System.out.println("I'm static block");  // static always print before constructor
    }

    public void show(){
        System.out.println(name + " : " + salary + " : " + ceo);
    }

}

public class StaticKeyword {
    int num = 10;
    public static void main(String[] args) {  // static so that we don't have to create an object for this..
//        num = 6;  // we can't load a non static variable in a static method
        Employee kavita = new Employee();
        Employee muskan = new Employee();

        kavita.show();
        muskan.show();
    }
}

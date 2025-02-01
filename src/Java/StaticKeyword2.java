package Java;

class Emp{
    String name;
    int salary;
    static String ceo;

    public void show(){
        System.out.println(name + " : " + salary + " : " + ceo);
    }
}

public class StaticKeyword2 {
    public static void main(String[] args) {
        Emp kavita = new Emp();
        Emp muskan = new Emp();

        Emp.ceo = "Mark zuckerberg"; // it is common for both.

        kavita.name = "Kavita Chaubey";
        kavita.salary = 100000;

        muskan.name = "Muskan Saini";
        muskan.salary = 100000;

        kavita.show();
        muskan.show();
    }
}

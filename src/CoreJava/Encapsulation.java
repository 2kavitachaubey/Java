package CoreJava;
class Mydata{
    private String name;
    private int age;

    // We can access private member by methods.
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }

    public  int getAge(){
        return age;
    }
    public void setAge(int a){
        this.age = a;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Mydata md = new Mydata();
        md.setName("kavita");
        md.setAge(22);

        System.out.println(md.getName());
        System.out.println(md.getAge());
    }
}

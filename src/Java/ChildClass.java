package Java;

// Sub Class
public class ChildClass extends ParentClass{
    public int mul(int num1, int num2){
        return num1 * num2;
    }
    public int div(int num1, int num2){
        return num1 / num2;
    }

    public static void main(String[] args) {
        ChildClass c1 = new ChildClass();
        System.out.println(c1.add(12,23));
        System.out.println(c1.sub(23,23));
        System.out.println(c1.mul(23,65));
        System.out.println(c1.div(67,2));
    }
}

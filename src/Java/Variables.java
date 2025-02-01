package Java;
class Example{
    int num1 = 1;         //Instance Variable
    static int num2 = 2;  //Class Variable
    void method(){
        int num3 = 3;     //Local Variable
        System.out.println("Local Variable: " + num3);
    }
}
public class Variables {

    public static void main(String[] args){
        Example obj = new Example();
        System.out.println("Instance Variable: " + obj.num1);
        System.out.println("Class Variable: " + Example.num2);
        obj.method();
    }
}

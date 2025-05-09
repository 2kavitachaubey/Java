package Revision;

public class U1ExTCF {
    public void Cal(int a, int b){

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        }finally {
            System.out.println("I'll run even if exception doesn't occurs.");
        }
    }
    public static void main(String[] args) {
        U1ExTCF u = new U1ExTCF();
        u.Cal(9,0);
    }
}

package CoreJava;

public class Exception2 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        try{
            j = 18/i;
            if(j==0)
                throw new ArithmeticException();
        }catch (ArithmeticException e){
            j = 18/1;
            System.out.println("It's a default Result.." + e);
        }
        finally {
            System.out.println("I will execute even if there is an error..");
        }
        System.out.println(j);
        System.out.println("hello miss j.");
    }
}
package Java;

public class Exception1 {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        int[] arr = new int[5];
        String mySelf = null;
        String changeString = "abc";
        try{
            j = 18/i;
            int k = Integer.parseInt(changeString);
            System.out.println(mySelf.length());
            System.out.println(arr[1]);
            System.out.println(arr[5]);
        }catch (ArithmeticException e){
            System.out.println("Can't divide by zero...");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("It's out of limit...");
        }catch (NullPointerException e){
            System.out.println("It's a null value..");
        }catch (NumberFormatException e){
            System.out.println("It can't be changed..");
        }
        finally {
            System.out.println("I will execute even if there is an error..");
        }
        System.out.println(j);
        System.out.println("hello miss j.");
    }
}

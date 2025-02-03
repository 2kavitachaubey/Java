package Java;
import java.io.IOException;
import java.security.spec.ECField;

public class Exception4 {
    void m() throws IOException{
        throw new IOException();
    }
    void n() throws IOException{
        m();  //
    }
    void p(){
        try {
            n();  //2
        }catch (Exception e){
            System.out.println("Exception handled");
        }
    }
    public static void main(String[] args) {
        Exception4 e = new Exception4();
        e.p();   //1
        System.out.println("Normal flow...");
    }
}

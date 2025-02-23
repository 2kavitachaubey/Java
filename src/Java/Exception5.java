package Java;

import java.io.*;
class A12{
    void display() throws IOException{
        throw new IOException("Error Occur");
    }
}
public class Exception5 {
    public static void main(String[] args) {
        try{
            A12 a = new A12();
            a.display();
        }catch(Exception e){
            System.out.println("Exception handled");
        }
        System.out.println("Hello Exception");
    }
}

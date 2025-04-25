package ClientServerModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.net.*;
public class ServerCal {
    public static void main(String[] args) {
        try {
            System.out.println("Waiting for connection...");
            ServerSocket ss = new ServerSocket(9806);
            Socket s = ss.accept();
            System.out.println("Connection Established...");
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            int n = Integer.parseInt(br.readLine());
            PrintWriter p = new PrintWriter(s.getOutputStream(),true);
            System.out.println("Factorial of number is "+ calculator(n) );
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public static int calculator(int n){
        int fac = n;
        while (fac > 1){
            fac*=1;
            fac--;
        }
        return fac;
    }
}

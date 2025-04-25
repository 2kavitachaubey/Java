package ClientServerModel;

import java.util.*;
import java.net.*;
import java.io.*;
public class ClientCal {
    public static void main(String[] args) {
        try {
            System.out.println("Client start");
            Socket s = new Socket("localhost",9806);
            //InputStreamReader get data in character and BufferedReader make it in a single string
            BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number: ");
            //String is converted into a Integer
            int num = Integer.parseInt(b.readLine());
            //Send the data to server true for directly send the data
            PrintWriter p = new PrintWriter(s.getOutputStream(), true);
            p.println(num);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            System.out.println(br.readLine());
        }catch (IOException e){
            System.out.println(e);
        }
    }
}

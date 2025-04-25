package ClientServerModel;

import java.util.*;
import java.io.*;
import java.net.*;
public class ClientMessage {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localHost",4455);
            BufferedReader b = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String msg = b.readLine();
            System.out.println(msg);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}

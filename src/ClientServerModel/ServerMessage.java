package ClientServerModel;
import java.util.*;
import java.io.*;
import java.net.*;
public class ServerMessage {
    public static void main(String[] args) {
        try(ServerSocket ss = new ServerSocket(4455);) {
            Socket s = ss.accept();
            System.out.println("Connection Established...");
            PrintStream p = new PrintStream(s.getOutputStream());
            p.println("Hello everyone this is my first socket program.");
            s.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}

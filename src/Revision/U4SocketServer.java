package Revision;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//public class U4SocketServer {
//    public static void main(String[] args) {
//        ServerSocket ss = new ServerSocket(4455);
//        Socket s = ss.accept();
//        BufferedReader b = new BufferedReader(new InputStreamReader(s.getInputStream()));
//        int num1 = Integer.parseInt(b.readLine());
//        int num2 = Integer.parseInt(b.readLine());
//        int sum = num1+num2;
//        PrintWriter p = new PrintWriter(s.getOutputStream(),true);
//        p.println(sum);
//    }
//}

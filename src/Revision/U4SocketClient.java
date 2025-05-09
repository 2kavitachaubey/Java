package Revision;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.net.Socket;
//
//public class U4SocketClient {
//    public static void main(String[] args) {
//        Socket s = new Socket("localHost",4455);
//        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter number 1: ");
//        int num1 = Integer.parseInt(b.readLine());
//        System.out.println("Enter number 1: ");
//        int num2 = Integer.parseInt(b.readLine());
//
//        PrintWriter p = new PrintWriter(s.getOutputStream(),true);
//        p.println(num1);
//        p.println(num2);
//        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//        System.out.println(br.readLine());
//
//        s.close();
//    }
//}

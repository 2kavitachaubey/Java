package ClientServerModel;

import javax.swing.*;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client extends JFrame {
    public Client(){
        JLabel calculate = new JLabel("Calculator");
        calculate.setBounds(10,10,100,40);
        add(calculate);

        JLabel num1 = new JLabel("Number 1: ");
        num1.setBounds(10,40,100,40);
        add(num1);

        JLabel num2 = new JLabel("Number 2: ");
        num2.setBounds(10,80,100,40);
        add(num2);

        JTextField tf1 = new JTextField();
        tf1.setBounds(100,40,80,30);
        add(tf1);

        JTextField tf2 = new JTextField();
        tf2.setBounds(100,80,80,30);
        add(tf2);

        JButton b1 = new JButton("+");
        b1.setBounds(10,140,50,50);
        add(b1);

        JButton b2 = new JButton("-");
        b2.setBounds(70,140,50,50);
        add(b2);

        JButton b3 = new JButton("*");
        b3.setBounds(130,140,50,50);
        add(b3);

        JButton b4 = new JButton("/");
        b4.setBounds(190,140,50,50);
        add(b4);

        JLabel result = new JLabel("Solution: ");
        result.setBounds(10,210,100,40);
        add(result);

        JTextField tf3 = new JTextField();
        tf3.setBounds(100,210,80,30);
        add(tf3);

        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

//        try{
//            Socket socket = new Socket("localhost",5000);
//            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
//            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//
//        }
    }

    public static void main(String[] args) {
        new Client();
    }
}

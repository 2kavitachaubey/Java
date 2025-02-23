package Swing;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingCalc extends JFrame{
    SwingCalc(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLayout(null);

        JTextField number1, number2, result;
        JButton b1, b2;

        JLabel num1 = new JLabel("Enter First Number: ");
        num1.setBounds(50,20,150,30);
        JLabel num2 = new JLabel("Enter Second Number: ");
        num2.setBounds(50,50,150,30);
        JLabel r1 = new JLabel("Result: ");
        r1.setBounds(50, 80, 150, 30);

        number1 = new JTextField();
        number1.setBounds(200,20,100,20);
        number2 = new JTextField();
        number2.setBounds(200,60,100,20);
        result = new JTextField();
        result.setBounds(200,90,100,20);

        b1 = new JButton("+");
        b1.setBounds(50,150,50,50);
        b2 = new JButton("/");
        b2.setBounds(100,150,50,50);

        add(num1);
        add(num2);
        add(r1);
        add(number1);
        add(number2);
        add(result);
        add(b1);
        add(b2);

        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ex){
                double a = Double.parseDouble(number1.getText());
                double b = Double.parseDouble(number2.getText());
                double c = 0;
                if(ex.getSource() == b1){
                    c=a+b;
                }
                result.setText(String.valueOf(c));
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(number1.getText());
                double b = Double.parseDouble(number2.getText());
                double c = 0;
                if(e.getSource() == b2){
                    try{
                        if(e.getSource() == b2){
                        c = a /b;}
                    }catch (Exception ex){
                        JOptionPane.showMessageDialog(null,"Can't divide by zero...");
                        System.out.println(0);
                    }
                }
                result.setText(String.valueOf(c));
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingCalc();
    }
}

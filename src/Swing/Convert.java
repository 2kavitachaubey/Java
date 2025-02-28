package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Convert extends JFrame{
    public Convert(){
        JLabel jl = new JLabel("Enter the value for Calsius: ");
        jl.setBounds(10,20,200,40);
        add(jl);

        JTextField jf = new JTextField();
        jf.setBounds(200,30,100,30);
        add(jf);

        JButton jb = new JButton("Convert");
        jb.setBounds(100,80,100,30);
        add(jb);

        JLabel result  = new JLabel();
        result.setBounds(120,120,150,40);
        add(result);

        setSize(500,500);
        setVisible(true);
        setLayout(null);
        setTitle("Conversion of temperature");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double degree = Double.parseDouble(jf.getText());
                    double f = (degree * 9 / 5) + 32;
                    result.setText("Fahrenheit: " + String.format("%.2f", f));
                } catch (NumberFormatException ex) {
                    result.setText("Invalid input! Enter a number.");
                }
            }
        });

    }

    public static void main(String[] args) {
        new Convert();
    }
}

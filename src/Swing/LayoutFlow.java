package Swing;

import java.awt.*;
import javax.swing.*;
public class LayoutFlow extends JFrame{
    LayoutFlow(){
        JButton b1 = new JButton("Center");
        JButton b2 = new JButton("Left");
        JButton b3 = new JButton("Right");

        setLayout(new FlowLayout(FlowLayout.CENTER, 20,10));
        add(b1);
        add(b2);
        add(b3);

        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LayoutFlow();
    }
}

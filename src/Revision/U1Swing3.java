package Revision;

import javax.swing.*;
import java.awt.*;

public class U1Swing3 extends JFrame {
    U1Swing3(){
        JButton b1 = new JButton("submit");
        JButton b2 = new JButton("submit");
        JButton b3 = new JButton("submit");
        JButton b4 = new JButton("submit");
        JButton b5 = new JButton("submit");

        add(b1, BorderLayout.EAST);
        add(b2, BorderLayout.WEST);
        add(b3, BorderLayout.NORTH);
        add(b4, BorderLayout.SOUTH);
        add(b5, BorderLayout.CENTER);

        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new U1Swing3();
    }
}

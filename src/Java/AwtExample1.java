package Java;

import java.awt.*;
public class AwtExample1 extends Frame{
    AwtExample1(){
        Button b = new Button("Click me");
        b.setBounds(50,100,80,30);

        add(b);
        setSize(500,300);
        setTitle("My first GUI");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AwtExample1();
    }
}

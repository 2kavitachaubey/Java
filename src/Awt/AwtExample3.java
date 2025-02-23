package Awt;

import java.awt.*;

public class AwtExample3 {
    AwtExample3(){
        Frame f = new Frame();

        Label l = new Label("Components of Awt");
        l.setBounds(30,50,150,30);
        f.add(l);

        Button b = new Button("Click it");
        b.setBounds(30,80,130,30);
        f.add(b);

        TextField tf = new TextField();
        tf.setBounds(30,120,130,30);
        f.add(tf);

        TextArea ta = new TextArea();
        ta.setBounds(30,160,130,70);
        f.add(ta);

        Checkbox cb = new Checkbox("Yes",true);
        cb.setBounds(30, 220,50,50);
        f.add(cb);

        Checkbox cb2 = new Checkbox("No");
        cb2.setBounds(30, 250,50,50);
        f.add(cb2);

        Choice c = new Choice();
        c.setBounds(30,300,130,50);
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Black");
        c.add("Grey");
        f.add(c);

//        List l1=new List(6);
//        l1.setBounds(80,80, 100,100);
//        l1.add("Red");
//        l1.add("Blue");
//        l1.add("Black");
//        l1.add("Pink");
//        l1.add("White");
//        l1.add("Green");
//        f.add(l1);



        f.setSize(500,500);
        f.setTitle("Awt Example");
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AwtExample3();
    }
}

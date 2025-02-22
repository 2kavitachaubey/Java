package Java;
import java.awt.*;
public class AwtExample2 {
    public AwtExample2(){
        Frame f = new Frame("title");

        Label l = new Label("Employee id: ");
        TextField t = new TextField();
        Button b = new Button("Submit");

        l.setBounds(30,100,80,30);
        t.setBounds(30,120,80,30);
        b.setBounds(110,120,80,30);

        f.add(l);
        f.add(t);
        f.add(b);

        f.setSize(500,300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {

        new AwtExample2();
    }
}

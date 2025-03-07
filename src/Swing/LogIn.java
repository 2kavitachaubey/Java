package Swing;
import javax.swing.*;
public class LogIn extends JFrame{
    public LogIn(){
        JLabel jn = new JLabel("Name: ");
        jn.setBounds(10,10,60,40);
        add(jn);
        JTextField fn = new JTextField();
        fn.setBounds(80,15,100,30);
        add(fn);

        JLabel jp = new JLabel("Program: ");
        jp.setBounds(10,50,60,40);
        add(jp);
        JTextField fp = new JTextField();
        fp.setBounds(80,55,100,30);
        add(fp);

        JLabel ps = new JLabel("Password: ");
        ps.setBounds(10,80,60,40);
        add(ps);
        JPasswordField pf = new JPasswordField();
        pf.setBounds(80,85,100,30);
        add(pf);

        setSize(400,400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LogIn();
    }
}

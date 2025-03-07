package Swing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn extends JFrame{
    public LogIn(){
        JLabel jn = new JLabel("Name: ");
        jn.setBounds(10,10,60,40);
        add(jn);
        JTextField fn = new JTextField();
        fn.setBounds(90,15,100,30);
        add(fn);

        JLabel jp = new JLabel("Program: ");
        jp.setBounds(10,50,60,40);
        add(jp);
        JTextField fp = new JTextField();
        fp.setBounds(90,55,100,30);
        add(fp);

        JLabel ps = new JLabel("Password: ");
        ps.setBounds(10,90,70,40);
        add(ps);
        JPasswordField pf = new JPasswordField();
        pf.setBounds(90,95,100,30);
        add(pf);

        JButton jb = new JButton("Submit");
        jb.setBounds(140,170,100,40);
        add(jb);

        setSize(400,400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String password = pf.getText();
                    if(password == "kavitacha"){
                        JOptionPane.showMessageDialog();
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        new LogIn();
    }
}

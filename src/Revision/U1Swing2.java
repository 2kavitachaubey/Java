package Revision;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class U1Swing2 extends JFrame{
    U1Swing2(){
        setSize(400,400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel namel = new JLabel("Name: ");
        namel.setBounds( 10, 10,80,40);
        add(namel);

        JLabel passl = new JLabel("Password");
        passl.setBounds(10,60,80,40);
        add(passl);

        JTextField lf = new JTextField();
        lf.setBounds(100,10,100,40);
        add(lf);

        JPasswordField jb = new JPasswordField();
        jb.setBounds(100,60,100,40);
        add(jb);

        JLabel logl = new JLabel();
        logl.setBounds(10,170,150,40);
        add(logl);

        JButton b = new JButton("conform");
        b.setBounds(20,120,100,40);
        add(b);

        setVisible(true);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String name = lf.getText();
                String pass = new String(jb.getPassword());
                try{
                    if(name.equals("admin") && pass.equals("12345")){
                        logl.setText("Login Successfully");
                    }
                    else{
                        logl.setText("Incorrect");
                    }
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null,"exception occur..");
                }
            }
        });
    }
    public static void main(String[] args) {
        new U1Swing2();
    }
}

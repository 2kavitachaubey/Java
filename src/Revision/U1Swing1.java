package Revision;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class U1Swing1 extends JFrame{
    JTextField tf;
    JLabel lf;
    JButton jb;
    U1Swing1(){
        setSize(400,400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel jl = new JLabel("Number: ");
        jl.setBounds( 10, 10,80,40);
        add(jl);
        tf = new JTextField();
        tf.setBounds(100,10,100,40);
        add(tf);

        lf = new JLabel();
        lf.setBounds(100,140,100,40);
        add(lf);

        jb = new JButton("submit");
        jb.setBounds(40,80,100,40);
        add(jb);

        setVisible(true);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int num = Integer.parseInt(tf.getText());
                try{
                    if(num%2 == 0){
                        lf.setText("Even number");
                    }
                    else{
                        lf.setText("odd");
                    }
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null,"exception occur..");
                }
            }
        });
    }
    public static void main(String[] args) {
        new U1Swing1();
    }
}

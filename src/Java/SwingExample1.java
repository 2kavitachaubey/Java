package Java;

//import com.sun.tools.javac.Main;
//import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
import javax.swing.*;

public class SwingExample1 extends JFrame implements ActionListener  {
    JTextField tf; JLabel l; JButton b;

    public SwingExample1()  {
        tf=new JTextField();
        tf.setBounds(50,50, 150,20);
        l=new JLabel();
        l.setBounds(50,100, 300,20);
        b=new JButton("Find IP");
        b.setBounds(50,150,95,30);
        b.addActionListener(this);
        add(b);add(tf);add(l);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String host = tf.getText();
            String ip =java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of "+host+" is: "+ip);
        }catch(Exception ex){
            ex.printStackTrace();

        }
    }
    public static void main(String[] args) {
        new SwingExample1();
    }
}

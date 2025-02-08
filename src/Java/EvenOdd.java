package Java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenOdd extends JFrame {
    public EvenOdd(){
        JLabel l = new JLabel("Enter the number: ");
        l.setBounds(10,10,150,40);
        add(l);
        JTextField f = new JTextField();
        f.setBounds(120, 20, 50,20);
        add(f);

        JButton b = new JButton("Submit");
        b.setBounds(100,50,80,40);
        add(b);

        JLabel ls = new JLabel();
        ls.setBounds(80,100,120,40);
        add(ls);

        setTitle("Found Odd or Even");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);
        setLayout(null);
        setVisible(true);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(f.getText());
                    if(number % 2 == 0){
                        ls.setText("It's an even number.");
                    }
                    else{
                        ls.setText("It's an odd number.");
                    }
                }catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,"The number is not in integer format.");
                }
            }
        });
    }

    public static void main(String[] args) {
        new EvenOdd();
    }
}

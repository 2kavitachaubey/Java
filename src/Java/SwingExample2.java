package Java;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class SwingExample2 extends JFrame implements ActionListener {
    JTextField lengthField, widthField, resultField;
    JButton calculateButton;
    SwingExample2(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(400,400);
        setLayout(null);

        JLabel l = new JLabel("length: ");
        l.setBounds(20, 20, 60, 20);
        JLabel widthLabel = new JLabel("Width:");
        widthLabel.setBounds(20, 50, 60, 20);
        JLabel resultLabel = new JLabel("Area:");
        resultLabel.setBounds(20, 80, 60, 20);

        lengthField = new JTextField();
        lengthField.setBounds(90, 20, 150, 20);
        widthField = new JTextField();
        widthField.setBounds(90, 50, 150, 20);
        resultField = new JTextField();
        resultField.setBounds(90, 80, 150, 20);
        resultField.setEditable(false);

        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(90, 110, 100, 30);
        calculateButton.addActionListener(this);

        add(l);
        add(widthLabel);
        add(resultLabel);
        add(lengthField);
        add(widthField);
        add(resultField);
        add(calculateButton);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == calculateButton){
            try{
                double length = Double.parseDouble(lengthField.getText());
                double width = Double.parseDouble(widthField.getText());
                double area = length*width;

                resultField.setText(String.format("%.4f", area));
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "not valid");
            }
        }
    }

    public static void main(String[] args) {
      new SwingExample2();
    }
}

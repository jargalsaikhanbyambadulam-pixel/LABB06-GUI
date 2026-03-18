import java.awt.event.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Pizza Order");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Songoltoo hiine vv:");
        label.setBounds(80, 10, 200, 20);
        frame.add(label);

        JButton btn1 = new JButton("Pepperoni");
        btn1.setBounds(80, 80, 120, 30);
        frame.add(btn1);

        JButton btn2 = new JButton("Hawaii");
        btn2.setBounds(80, 120, 120, 30);
        frame.add(btn2);

        //event
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pepperoni songoloo");
            }
        });

        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hawaii songogdloo");
            }
        });

        frame.setVisible(true);
    }
}

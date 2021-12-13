import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        final int r = 0, g = 0, b = 0;

        // the main window
        Window frame = new Window("window", 111, 111, 111);
        frame.setLayout(new BorderLayout(20, 10)); // adding margin for width and height
        // creating labels
        JLabel label1 = new JLabel("one");
        JLabel label2 = new JLabel("two");
        JLabel label3 = new JLabel("three");
        JLabel label4 = new JLabel("four");
        JLabel label5 = new JLabel("five");
        JLabel label6 = new JLabel("six");


        // creating a panels
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();

        // setting panels background colors
        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.black);
        panel4.setBackground(Color.BLUE);
        panel5.setBackground(Color.CYAN);


        // adding button
        JButton button = new JButton();
        button.setText("change color");
        button.setBackground(Color.BLACK);
        button.setForeground(Color.white);

        button.setFocusable(false);

        // changing panels Background colors randomly
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setBackground(
                        new Color((int) (Math.random()*250)+1,
                                (int) (Math.random()*250)+1,
                                (int) (Math.random()*250)+1)
                );

                panel2.setBackground(
                        new Color((int) (Math.random()*250)+1,
                                (int) (Math.random()*250)+1,
                                (int) (Math.random()*250)+1)
                );

                panel3.setBackground(
                        new Color((int) (Math.random()*250)+1,
                                (int) (Math.random()*250)+1,
                                (int) (Math.random()*250)+1)
                );

                panel4.setBackground(
                        new Color((int) (Math.random()*250)+1,
                                (int) (Math.random()*250)+1,
                                (int) (Math.random()*250)+1)
                );

                panel5.setBackground(
                        new Color((int) (Math.random()*250)+1,
                                (int) (Math.random()*250)+1,
                                (int) (Math.random()*250)+1)
                );
            }
        });


        // adding labels to panels
        panel1.add(label1);
        panel2.add(label2);
        panel3.add(label3);
        panel4.add(label4);
        panel5.add(label5);
        panel5.add(button);


        frame.add(panel1, BorderLayout.EAST);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.NORTH);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);

    }
}

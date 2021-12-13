import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Window frame = new Window("grid layout manager", 221, 100, 33);
        frame.setLocation(200, 200);
        frame.setLayout(new GridLayout(4, 3, 10, 20));

        for(int i = 0 ; i < 10 ; i++){
            JPanel panel = new JPanel();
            panel.setBackground(new Color((int)(Math.random()*250)+1, (int)(Math.random()*250)+1, (int)(Math.random()*250)+1));
            frame.add(panel);
        }


        frame.setVisible(true);
    }
}

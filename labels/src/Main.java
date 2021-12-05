import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        Window window = new Window("sometitle");
        // window.setLayout(null);
        JLabel label = new JLabel("something is running here");

        label.setForeground(Color.white);
        label.setFont(new Font("Yu Gothic UI Regular", Font.BOLD, 30));

        // adding image
        ImageIcon image = new ImageIcon("../warning.png");
        label.setIcon(image);

        // size

        // text position
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setIconTextGap(100);

        // putting label in the frame
        window.add(label);



    }
}

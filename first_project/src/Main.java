import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 460);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("welcome");
        frame.getContentPane().setBackground(new Color(215, 21, 215, 207));
        ImageIcon theLogo = new ImageIcon("../pyramids.jpg");
        frame.setIconImage(theLogo.getImage());
    }
}

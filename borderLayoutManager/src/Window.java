import javax.swing.*;
import java.awt.*;


public class Window extends JFrame {
    Window(String title) {
        this.setTitle(title);
        this.setVisible(true);
        this.setSize(800, 500);
        this.getContentPane().setBackground(new Color(194, 8, 199));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    Window(String title, int r, int g, int b) {
        this.setTitle(title);
        this.setVisible(true);
        this.setSize(800, 500);
        this.getContentPane().setBackground(new Color(r, g, b));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
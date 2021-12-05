import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Window frame = new Window("panales");
        frame.setLayout(null);


        JLabel label = new JLabel("i am blue");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(Color.black);


        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.CYAN);
        bluePanel.setBounds(0, 0, 200, 200);
        bluePanel.setLayout(new BorderLayout());


        JPanel smallPanel = new JPanel();
        smallPanel.setBackground(new Color(33, 44, 192));
        smallPanel.setSize(40, 40);

        JPanel redPanel = new JPanel();
        redPanel.setBounds(200, 200, 200, 200);
        redPanel.setBackground(Color.RED);

        JPanel greenPanel = new JPanel();
        greenPanel.setBounds(400, 0, 200, 200);
        greenPanel.setBackground(Color.green);

        JPanel blackPanel = new JPanel();
        blackPanel.setBounds(0, 400, 600, 100);
        blackPanel.setBackground(Color.black);

        bluePanel.add(label);
        blackPanel.add(smallPanel);

        frame.add(bluePanel);
        frame.add(blackPanel);
        frame.add(greenPanel);
        frame.add(redPanel);

    }
}

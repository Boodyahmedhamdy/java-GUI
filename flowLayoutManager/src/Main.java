import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("nothing");
        Window frame = new Window("Flow Layout Manager");
        // frame.setLayout(new BorderLayout()); .. the default layout to the frame
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel.setPreferredSize(new Dimension(300, 400));
        for(int i = 0 ; i < 20 ; i++) {
            panel.add(new JButton(""+i));
        }

        JPanel smallPanel = new JPanel();
        smallPanel.setPreferredSize(new Dimension(100, 90));
        smallPanel.setBackground(Color.RED);

        panel.add(smallPanel);
        frame.add(panel);
        frame.setVisible(true);
    }
}

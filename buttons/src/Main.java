import javax.swing.*;
import java.awt.*;


public class Main {

    public static void main(String[] args) {

        Window frame = new Window("theWindow");
        frame.setLayout(null);

        ImageIcon icon = new ImageIcon("warning.png");

        JButton button = new JButton();

        button.setBounds(10, 10, 200, 100);
        button.addActionListener(e -> System.out.println("something"));
        button.setText("click me softly");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.RIGHT);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.ITALIC, 30));
        button.setForeground(Color.green);
        button.setBackground(new Color(0x676767));
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setEnabled(true);


        frame.add(button);



    }

}

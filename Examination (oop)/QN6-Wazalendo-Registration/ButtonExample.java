import javax.swing.*;
import java.awt.event.*;

public class ButtonExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Button Example");
        JButton button = new JButton("Save");

        button.setBounds(100, 80, 100, 30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button clicked!");
            }
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
package Main.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThirdPage extends JFrame {
    private JButton prevButton;
    private JButton exitButton;
    private JLabel welcomeLabel;

    public ThirdPage() {
        setLayout(new FlowLayout());
        welcomeLabel = new JLabel("Welcome to the Final Page");
        add(welcomeLabel);

        prevButton = new JButton("Previous");
        add(prevButton);

        exitButton = new JButton("Exit");
        add(exitButton);

        event e = new event();
        prevButton.addActionListener(e);
        exitButton.addActionListener(e);
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == prevButton) {
                SecondPage second = new SecondPage();
                second.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                second.setSize(350, 200);
                second.setVisible(true);
                dispose();
            } else if (e.getSource() == exitButton) {
                System.exit(0);
            }
        }
    }
}

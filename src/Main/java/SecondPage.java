package Main.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondPage extends JFrame {
    private JLabel welcomeLabel;
    private JButton previousButton, nextButton;

    public SecondPage() {
        super("Second Page");
        setLayout(new FlowLayout());

        welcomeLabel = new JLabel("Welcome to the Second Page");
        add(welcomeLabel);

        previousButton = new JButton("Previous");
        add(previousButton);

        nextButton = new JButton("Next");
        add(nextButton);

        ButtonHandler handler = new ButtonHandler();
        previousButton.addActionListener(handler);
        nextButton.addActionListener(handler);

        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == previousButton) {
                setVisible(false);
                MainPage mainPage = new MainPage();
            } else if (event.getSource() == nextButton) {
                setVisible(false);
                ThirdPage finalPage = new ThirdPage();
            }
        }
    }
}

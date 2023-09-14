package Main.java;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainPage extends JFrame {
    private JLabel welcomeLabel;
    private JButton nextButton;

    public MainPage() {
        super("Main Page");
        setLayout(new FlowLayout());

        welcomeLabel = new JLabel("Welcome to the Main Page");
        add(welcomeLabel);

        nextButton = new JButton("Next");
        add(nextButton);

        ButtonHandler handler = new ButtonHandler();
        nextButton.addActionListener(handler);

        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == nextButton) {
                setVisible(false);
                SecondPage secondPage = new SecondPage();
            }
        }
    }

    public static void main(String[] args) {
        MainPage main = new MainPage();
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setSize(350, 200);
        main.setVisible(true);
    }
}



package org.example;
import javax.swing.*;
import java.awt.*;


public class InitializeWelcomeFrame {
    private void initializeWelcomeFrame() {
        JFrame welcomeFrame = new JFrame("Welcome to Cities Game");
        welcomeFrame.setSize(400, 100);
        welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welcomeFrame.setLayout(new FlowLayout());

        JLabel welcomeLabel = new JLabel("Welcome to Cities Game! Press Start to begin.");
        JButton startButton = new JButton("Start");
        startButton.addActionListener(e -> {
            welcomeFrame.setVisible(false);
            JComponent gameFrame = null;
            gameFrame.setVisible(true);
        });

        welcomeFrame.add(welcomeLabel);
        welcomeFrame.add(startButton);
        welcomeFrame.setLocationRelativeTo(null);
    }
}
package org.example;

import javax.swing.*;

public class CitiesGame {


    private JFrame welcomeFrame;
    public JFrame gameFrame;
    private JTextField userInputField;
    private JLabel computerResponseLabel;
    private JButton startButton;
    private JButton makeMoveButton;
    private DefaultListModel<String> citiesListModel;
    private JList<String> citiesList;
    private int userScore = 0;
    private int computerScore = 0;



    public JFrame getWelcomeFrame() {
        return welcomeFrame;
    }

    public void setWelcomeFrame(JFrame welcomeFrame) {
        this.welcomeFrame = welcomeFrame;
    }


    public void startGame() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                welcomeFrame.setVisible(true);
            }
        });
    }
}


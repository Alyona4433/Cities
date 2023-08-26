package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cities = CityLoader.loadCities("cities.txt");
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                JTextField userInputField = new JTextField(20);
                JLabel computerResponseLabel = new JLabel();
                JButton makeMoveButton = new JButton("Make Move");
                DefaultListModel<String> citiesListModel = new DefaultListModel<>();
                JList<String> citiesList = new JList<>(citiesListModel);

                InitializeGameFrame gameFrameInitializer = new InitializeGameFrame(userInputField, computerResponseLabel, makeMoveButton, citiesListModel, citiesList);

                JFrame welcomeFrame = new JFrame("Welcome to Cities Game");
                welcomeFrame.setSize(400, 100);
                welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                welcomeFrame.setLayout(new FlowLayout());

                JLabel welcomeLabel = new JLabel("Welcome to Cities Game! Press Start to begin.");
                JButton startButton = new JButton("Start");
                startButton.addActionListener(new ActionListener() {


                    @Override
                    public void actionPerformed(ActionEvent e) {
                        welcomeFrame.setVisible(false);
                        gameFrameInitializer.getGameFrame().setVisible(true);
                    }
                });



                welcomeFrame.add(welcomeLabel);
                welcomeFrame.add(startButton);
                welcomeFrame.setLocationRelativeTo(null);

                welcomeFrame.setVisible(true);
            }
        });
    }
}

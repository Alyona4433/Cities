package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InitializeGameFrame {
    private JTextField userInputField;
    private JLabel computerResponseLabel;
    private JButton makeMoveButton;
    private DefaultListModel<String> citiesListModel;
    private JList<String> citiesList;

    public InitializeGameFrame(JTextField userInputField, JLabel computerResponseLabel, JButton makeMoveButton, DefaultListModel<String> citiesListModel, JList<String> citiesList) {
        this.userInputField = userInputField;
        this.computerResponseLabel = computerResponseLabel;
        this.makeMoveButton = makeMoveButton;
        this.citiesListModel = citiesListModel;
        this.citiesList = citiesList;

        initializeGameFrame();
    }

    private void initializeGameFrame() {
        JFrame gameFrame = new JFrame("Cities Game");
        gameFrame.setSize(400, 500);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setLayout(new BorderLayout());

        JPanel userInputPanel = new JPanel();
        userInputField = new JTextField(20);
        userInputPanel.add(new JLabel("Enter a city: "));
        userInputPanel.add(userInputField);

        JPanel computerResponsePanel = new JPanel();
        computerResponseLabel = new JLabel();
        computerResponsePanel.add(new JLabel("Computer's response: "));
        computerResponsePanel.add(computerResponseLabel);

        makeMoveButton = new JButton("Make Move");
        makeMoveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add your logic here for processing user input and generating computer response
            }
        });

        citiesListModel = new DefaultListModel<>();
        citiesList = new JList<>(citiesListModel);
        JScrollPane scrollPane = new JScrollPane(citiesList);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(makeMoveButton);

        gameFrame.add(userInputPanel, BorderLayout.NORTH);
        gameFrame.add(computerResponsePanel, BorderLayout.CENTER);
        gameFrame.add(scrollPane, BorderLayout.CENTER);
        gameFrame.add(buttonsPanel, BorderLayout.SOUTH);
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setVisible(false);
    }

    private JFrame gameFrame;

    public JFrame getGameFrame() {
        return gameFrame;

    }
}
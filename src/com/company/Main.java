package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    //bringing objects into scope. the ones that are used in other classes
    private int counts = 0;
    private JLabel label1;
    private JFrame frame;
    private JButton button;
    private JPanel panel;
    private JLabel label2;


    public Main(){
        //creating jframe object
        frame = new JFrame();
        //creating a button object
        button = new JButton("Click me");
        button.addActionListener(this);

        //creating a label object
        label1 = new JLabel("Number of Clicks: 0");

        //creating jpanel object
        panel = new JPanel();
        //setting up jpanel
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 20, 50));
        panel.setLayout(new GridLayout(0,1));
        //basic: setting border, setting layout, setting elements in layout
        panel.add(button);
        panel.add(label1);

        //adding the panel to the frame
        frame.add(panel,BorderLayout.CENTER);
        //setting what happens when you close the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setting title of window
        frame.setTitle("Kinematics Simulation Interface");
        //setting window to match a certain size
        frame.pack();
        //make the window visible
        frame.setVisible(true);




    }

    public static void main(String[] args) {
        //this below is creating a new GUI from the GUI class above. its calling the class
        new Main();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        counts++;
        label1.setText("Number of Clicks: " + counts);
    }
}

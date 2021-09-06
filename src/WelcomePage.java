import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
public class WelcomePage implements ActionListener {
    JFrame frame = new JFrame("Welcome Page");
    JLabel welcomelabel = new JLabel("Hello!");
    JLabel HelloLabel = new JLabel("Image Placeholder");
    ImageIcon image = new ImageIcon();

    WelcomePage(String userId){
        //adding a menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu home = new JMenu("Home");
        JMenu  accounts = new JMenu("Accounts");
        JMenu  profile = new JMenu("Profile");
        // JMenu exit = new JMenu("Exit");

        // exit.addActionListener(new ActionListener(){
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         // TODO Auto-generated method stub
        //         frame.dispose();                
        //     }            
        // });

        menuBar.setBounds(0, 0, 800, 30);
        //menuBar.setBackground(Color.blue);
        menuBar.setForeground(Color.WHITE);
        menuBar.setFont(new Font(null, Font.BOLD, 30));

        menuBar.add(home);
        menuBar.add(accounts);
        menuBar.add(profile);
        //menuBar.add(exit);

        //adding images and Label
        JPanel panel = new JPanel();
        panel.setBounds(20, 50, 200, 100);

        
        // ImageIcon image = new ImageIcon("Spark8.jpeg");
        // label.setIcon(image);     
        


        HelloLabel.setBounds(20, 100, 400,100);
        HelloLabel.setIcon(new ImageIcon("src/Spark8.jpeg"));


        //adding all components to the frame
        frame.add(menuBar);
        frame.add(HelloLabel);

        // welcomelabel.setBounds(20, 100, 200, 40);
        // welcomelabel.setFont(new Font(null, Font.ITALIC, 20));
        // welcomelabel.setText("Hello " +  userId);


        frame.add(welcomelabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocation(200, 160);

        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        
        
    }
    
}

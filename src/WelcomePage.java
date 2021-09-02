import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
public class WelcomePage implements ActionListener {
    JFrame frame = new JFrame("Welcome Page");
    JLabel welcomelabel = new JLabel("Hello!");

    WelcomePage(String userId){
        JMenuBar menuBar = new JMenuBar();
        JMenu home = new JMenu("Home");
        JMenu  accounts = new JMenu("Accounts");
        JMenu  profile = new JMenu("Profile");
        JMenu exit = new JMenu("Exit");

        exit.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                System.exit(1);
                
            }
            
        });

        menuBar.setBounds(0, 0, 800, 30);
        //menuBar.setBackground(Color.blue);
        menuBar.setForeground(Color.WHITE);
        menuBar.setFont(new Font(null, Font.BOLD, 30));

        menuBar.add(home);
        menuBar.add(accounts);
        menuBar.add(profile);
        menuBar.add(exit);

        frame.add(menuBar);

        welcomelabel.setBounds(20, 100, 200, 40);
        welcomelabel.setFont(new Font(null, Font.ITALIC, 20));
        welcomelabel.setText("Hello " +  userId);


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

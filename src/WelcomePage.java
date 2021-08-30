import java.awt.Font;

import javax.swing.*;
public class WelcomePage {
    JFrame frame = new JFrame("Welcome Page");
    JLabel welcomelabel = new JLabel("Hello!");

    WelcomePage(){

        welcomelabel.setBounds(20, 100, 200, 40);
        welcomelabel.setFont(new Font(null, Font.ITALIC, 20));

        frame.add(welcomelabel);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    
}

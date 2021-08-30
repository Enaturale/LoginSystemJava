import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage implements ActionListener{

    //components
    JFrame frame = new JFrame();
    JButton login = new JButton("Login");
    JButton reset = new JButton("Reset");
    JTextField userID = new JTextField();
    JPasswordField userPassword = new JPasswordField();
    JLabel idLabel= new JLabel("ID: ");
    JLabel passLabel= new JLabel("Password: ");
    JLabel messageLabel = new JLabel("");

 

    HashMap<String, String>  logininfo = new HashMap<String, String>();

    LoginPage(HashMap<String, String> logininfoOriginal){

        logininfo = logininfoOriginal;

        idLabel.setBounds(50, 100, 75, 25);
        passLabel.setBounds(50, 150, 75, 25);

        userID.setBounds(125, 100, 200, 25);
        userPassword.setBounds(125, 150, 200, 25);

        login.setBounds(125, 200, 100, 25);
        login.addActionListener(this);

        reset.setBounds(225, 200, 100, 25);
        reset.addActionListener(this);


        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new  Font(null, Font.BOLD, 30));

        frame.add(idLabel);
        frame.add(passLabel);
        frame.add(messageLabel);
        frame.add(userID);
        frame.add(userPassword);
        frame.add(login);
        frame.add(reset);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Login Page");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setLocation(400, 180);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}

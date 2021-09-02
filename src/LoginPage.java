import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
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
    JLabel messageLabel = new JLabel("", Label.LEFT);

 

    HashMap<String, String>  logininfo = new HashMap<String, String>();

    LoginPage(HashMap<String, String> logininfoOriginal){

        logininfo = logininfoOriginal;

        idLabel.setBounds(50, 100, 75, 25);
        passLabel.setBounds(50, 150, 75, 25);

        userID.setBounds(125, 100, 200, 25);
        userPassword.setBounds(125, 150, 200, 25);

        login.setBounds(125, 200, 100, 25);
        login.addActionListener(this);
        login.setFocusable(false);

        reset.setBounds(225, 200, 100, 25);
        reset.addActionListener(this);
        reset.setFocusable(false);



        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new  Font(null, Font.BOLD, 20));

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

        //what happens to the resert button. The code is to clear the fields
        if(e.getSource() == reset){
            userID.setText("");
            userPassword.setText("");
        }

        if(e.getSource()== login){
            //first, we will retrive the user id and password
            String userId = userID.getText();
            String password = String.valueOf(userPassword.getPassword());

            //next, we will verify the information usin hashmap
            if(logininfo.containsKey(userId)){ //if the user id was found
                if(logininfo.get(userId).equals(password)){ //if the fetched user id is the same with the associated password
                       JOptionPane.showMessageDialog(null, "Login Successful");
                       messageLabel.setText("Login is successful");
                       messageLabel.setForeground(Color.GREEN);
                       frame.dispose();
                       WelcomePage welcomePage = new WelcomePage(userId);
                }
                else{ //if the user id is not equal to the password used
                    JOptionPane.showMessageDialog(null, "We can see you like making mistakes. Login not successful");
                    messageLabel.setText("Wrong Password, Please.");
                    messageLabel.setForeground(Color.RED);
                    userID.setText("");
                    userPassword.setText("");                   

                }
            }
            else{
                JOptionPane.showMessageDialog(null, "User Name not Found");
                messageLabel.setText("No No. Wrong ID!");
                messageLabel.setForeground(Color.RED);                

            }
        }
        
    }
    
}

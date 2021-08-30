import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;



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

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}

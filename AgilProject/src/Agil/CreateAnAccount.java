package Agil;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CreateAnAccount {
		
	
	JFrame frame = new JFrame();
	JTextField userField = new JTextField();
	JTextField passwordField = new JTextField();
	
	JLabel userLabel = new JLabel("UserName");
	JLabel passwordLabel = new JLabel("Password");
	JLabel reEnterPasswordLabel = new JLabel("Enter Password Again");
	
	CreateAnAccount( String User, String Password ){
		userLabel.setBounds(0,0,200,35);
		passwordLabel.setBounds(0,0,250,35);
		userLabel.setFont(new Font (null, Font.PLAIN,25));
		passwordLabel.setFont(new Font(null,Font.PLAIN,25));
		
	}
	
	
}

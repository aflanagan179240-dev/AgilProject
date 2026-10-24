package Agil;

import java.awt.*;
import java.util.Arrays;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CreateAnAccount extends JFrame  {
	private JTextField username = new JTextField(18);
    private JPasswordField password = new JPasswordField(18);
    private JPasswordField confirm = new JPasswordField(18);
     private JLabel message = new JLabel(" ", SwingConstants.CENTER);
	
	 public CreateAnAccount(){
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout (12,12));
		JLabel title = new JLabel("Create An  Account", SwingConstants.CENTER);
		title.setFont(new Font("", Font.BOLD,22));
		title.setBorder(BorderFactory.createEmptyBorder(25,10,10,10));
		add(title, BorderLayout.NORTH);
		JPanel form = new JPanel(new GridLayout());
		form.setLayout(new GridLayout(3, 2, 10, 10));
		form.add(new JLabel("Username:"));
		form.add(username);
		form.add(new JLabel("Password:"));
		form.add(password);
		form.add(new JLabel("Confirm password:"));
		form.add(confirm);
		
		
		
		
	}
	
	
}

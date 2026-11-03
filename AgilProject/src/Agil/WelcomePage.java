package Agil;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
	
	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("Hello");
	private JButton b1 = new JButton ("Show Available Rooms");
	
	
	WelcomePage (String userId){
		frame.setLayout(null);
		welcomeLabel.setBounds(50,50,200,35);
		welcomeLabel.setFont(new Font (null,Font.PLAIN ,25));
		welcomeLabel.setText("Hello" + userId);
		frame.add(welcomeLabel);
	
		
		
		b1.setBounds(80,120,240,40);
		frame.add(b1);
		
		b1.addActionListener(e ->{
			new AvailableRooms("Booking Accomadation");
			frame.dispose();
		});
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setVisible(true);
		
		
		
		
	}
	
	
	
}

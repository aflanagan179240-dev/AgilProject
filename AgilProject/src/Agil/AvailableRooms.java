package Agil;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
  public class AvailableRooms extends JFrame implements ActionListener {
	  
	  private JLabel l0 = new JLabel("Booking Accomidation Students");
	  private JLabel l1 = new JLabel("Pick a Date");
	  private JLabel l2 = new JLabel("Floor");
	  private JLabel l3 = new JLabel("Spefic Room");
	  private JLabel l4 = new JLabel("Check out Time");
	  private JLabel l5 = new JLabel("Booked");
	  private JTextField t1 = new JTextField("0",40);
	  
	  private JPanel p1 = new JPanel();
	  
	  private JButton b1 = new JButton("Show Availble Rooms");
	  private JButton b2 = new JButton("show Price");
	  
	  Integer [] dates = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16
			  				,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
	  
	 String [] theFloor = {"GroundFloor", "SecondFloor", "thirdFloor", "FourthFloor"};
	 String [] typesOfRooms = {"En-Suite (€200)", "SharedRoom (€100)","PentHouse(€300 )","SingleRoom(€50 )", "Terrance(€150)"};
	 
	 private JComboBox<Integer> c1 = new JComboBox<Integer> (dates);
	 private JComboBox c2 = new JComboBox(theFloor);
	 private JComboBox c3 = new JComboBox(typesOfRooms);
	 private JComboBox c4 = new JComboBox();
	 
	 
	public AvailableRooms(String s) {
		super(s);
		
		Font f = new Font("TimesRoman",Font.BOLD,20);
		
		l0.setFont(f);
		
		p1.setLayout(new GridLayout (8, 2));
		add(p1);
		p1.add(l0);
		p1.add(l1);p1.add(c1);
		p1.add(l2);p1.add(c2);
		p1.add(l3);p1.add(c3);
		p1.add(l4);
		
		p1.add(b1);
		p1.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setSize(600,400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	 
	  
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	
	
	}
}

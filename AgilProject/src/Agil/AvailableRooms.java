package Agil;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
  public class AvailableRooms extends JFrame implements ActionListener {
	  private JLabel l0 = new JLabel("Booking Accomidation Students");
	  private JLabel l1 = new JLabel("Pick a Date");
	  private JLabel l2 = new JLabel("Spefic Room");
	  private JLabel l3 = new JLabel("Check out Time");
	  
	  Integer [] dates = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16
			  				,17,18,19,20,21,22,23,24,25,26,27,28,
			  											29,30,31};
	 String [] theFloor = {"GroundFloor", "SecondFloor", "thirdFloor", "FourthFloor"};
	 String [] typesOfRooms = {"En-Suite", "SharedRoom","PentHouse","SingleRoom", "Terrance"};
	  
	 private JComboBox<Integer> c1 = new JComboBox<Integer> (dates);
	 private JComboBox c2 = new JComboBox(theFloor);
	 private JComboBox c3 = new JComboBox(typesOfRooms);
	 
	  
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	
	
	}
}

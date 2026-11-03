package Agil;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
  public class AvailableRooms extends JFrame implements ActionListener {
	  
	  private JLabel l0 = new JLabel("Booking Accomidation Students");
	  private JLabel l1 = new JLabel("Pick a Date");
	  private JLabel l2 = new JLabel("Floor Type");
	  private JLabel l3 = new JLabel("Spefic Room");
	  private JLabel l4 = new JLabel("Check out Time");
	  private JTextField t1 = new JTextField("0",40);
	  private JLabel l5 = new JLabel("Room Availability");
	  private JTextField t2 = new JTextField("");
	  
	  private JPanel p1 = new JPanel();
	  
	  private JMenuBar mbar = new JMenuBar();
	  private JMenu options = new JMenu("Options");
	  private JMenuItem help = new JMenuItem ("Help");
	  private JMenuItem exit = new JMenuItem ("exit");
	  private JMenuItem info = new JMenuItem ("info");
	  
	  private JButton b1 = new JButton("show Price");
	  private JButton b2 = new JButton("Book Room");
	  private JButton b3 = new JButton("Cancel Booking ");
	  
	  Integer [] dates = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16
			  				,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
	  
	 String [] theFloor = {"GroundFloor", "SecondFloor", "thirdFloor", "FourthFloor"};
	 String [] typesOfRooms = {" €50 SingleRoom ", "€100 SharedRoom", " €150 Terrance", " €200 En-Suite " };
	 String [] checkOutTimes = {"9:00 AM", "10:00 AM" , "11:00 AM", "12:00PM"};
	 private JComboBox<Integer> c1 = new JComboBox<Integer> (dates);
	 private JComboBox c2 = new JComboBox(theFloor);
	 private JComboBox c3 = new JComboBox(typesOfRooms);
	 private JComboBox c4 = new JComboBox(checkOutTimes);
	 
	 
	public AvailableRooms(String s) {
		super(s);
		setLayout(new BorderLayout());
		l0.setFont(new Font("TimesRoman",Font.BOLD,20));
		add(l0, BorderLayout.NORTH);
		
		
		p1.setLayout(new GridLayout(6,4,15,15));
		
		t2.setEditable(false);;
		
		//Spaceing
				
		
		p1.add(l1);
        p1.add(c1);

        p1.add(l2);
        p1.add(c2);

        p1.add(l3);
        p1.add(c3);

        p1.add(l4);
        p1.add(c4);
        
        p1.add(l5);
        p1.add(t2);

        add(p1, BorderLayout.CENTER);
		
		
		JPanel buttonPanel =  new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(b1);
		buttonPanel.add(b2);
		buttonPanel.add(b3);
		add(buttonPanel,BorderLayout.SOUTH);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		
		setSize(600,400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	 
	  
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	
	
	}
}

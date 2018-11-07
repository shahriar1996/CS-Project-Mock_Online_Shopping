/**
 * Author: Arif Shahriar, Alvin Madison, Mohammed Safwat
 * Instructor: Zakaria Baani 
 * CourseID: 2082.01
 * 
 * This is our final group project where we are making a mock online shopping system.
 * We have phones, laptops, and accessories in our inventory and we are making a mock
 * web-site to sell out product to customers.
 * 
 */

package laptopCollection;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class LaptopClass extends JFrame implements ActionListener{
	/**
	 * 
	 */	
	private static final long serialVersionUID = 1L;
	
	// Initial variables for laptopClass.
	private JPanel panel1 = new JPanel(new BorderLayout());
	private JPanel panel2 = new JPanel(new BorderLayout());
	
	private JPanel headerPanel = new JPanel (new FlowLayout());
	private JPanel optionPanel = new JPanel (new BorderLayout());
	
	private JPanel addAllPhone = new JPanel (new FlowLayout());
	
	private JPanel macPanel = new JPanel(new BorderLayout());
	private JLabel macLbl = new JLabel("MacBook", SwingConstants.CENTER);

	private JPanel hpPanel = new JPanel(new BorderLayout());
	private JLabel hpLbl = new JLabel("HP", SwingConstants.CENTER);
	
	private JPanel dellPanel = new JPanel(new BorderLayout());
	private JLabel dellLbl = new JLabel("DELL", SwingConstants.CENTER);
	
	private JLabel companyHeaderLbl = new JLabel("AMA Online Shopping", SwingConstants.CENTER);
	private JLabel pickOptionLbl = new JLabel("***PICK WHICH PHONE YOU WANT TO SHOP FROM US***", SwingConstants.CENTER);
	
	private JButton macBtn = new JButton();
	private JButton hpBtn = new JButton();
	private JButton dellBtn = new JButton();

	/*
	 * Description: This is default constructor.
	 * Parameter: It does not take a parameter.
	 * Precondition: Has to pass the name of the JFrame.
	 * Postcondition: Will output the whole frame.
	 */
	public LaptopClass() {
		
		macBtn.setIcon(new ImageIcon("mac.png"));
		macBtn.setBackground(Color.LIGHT_GRAY);
		dellBtn.setIcon(new ImageIcon("dell.png"));
		dellBtn.setBackground(Color.LIGHT_GRAY);
		hpBtn.setIcon(new ImageIcon("hp.png"));
		hpBtn.setBackground(Color.LIGHT_GRAY);
		
		setSize(750,450); 
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		addComponentsToPanels();
		addPanelsToFrame();
		addListeners();
	}
	
	
	/*
	 * Description: This method add the components to the panel.
	 * Parameter: It does not take a parameter.
	 * Precondition:When the method is called it adds all the components
	 * to the panel.
	 * Postcondition: Add the components to the panel.
	 * Throws:
	 */
	public void addComponentsToPanels() {
		
		headerPanel.add(companyHeaderLbl);
		companyHeaderLbl.setFont(new Font("AMA Online Shopping", Font.ROMAN_BASELINE,20));
		companyHeaderLbl.setForeground(Color.BLACK);
		
		macPanel.add(macBtn, BorderLayout.CENTER);
		macLbl.setFont(new Font("MacBook", Font.BOLD, 15));
		macPanel.add(macLbl, BorderLayout.SOUTH);
		
		hpPanel.add(hpBtn, BorderLayout.CENTER);
		hpLbl.setFont(new Font("HTC", Font.BOLD, 15));
		hpPanel.add(hpLbl, BorderLayout.SOUTH);
		
		dellPanel.add(dellBtn, BorderLayout.CENTER);
		dellLbl.setFont(new Font("HTC", Font.BOLD, 15));
		dellPanel.add(dellLbl, BorderLayout.SOUTH);
		
		
		addAllPhone.add(macPanel);
		addAllPhone.add(hpPanel);
		addAllPhone.add(dellPanel);

		
		optionPanel.add(pickOptionLbl);
		pickOptionLbl.setFont(new Font("***PICK WHICH PHONE YOU WANT TO SHOP FROM US***", Font.ITALIC,15));
		pickOptionLbl.setForeground(Color.RED);
		
		
		panel1.add(headerPanel, BorderLayout.NORTH);
		panel1.add(addAllPhone, BorderLayout.CENTER);
		
		panel2.add(panel1, BorderLayout.NORTH);
		panel2.add(optionPanel, BorderLayout.CENTER);
	}

	/*
	 * Description: An Event object that represents an event when a button is clicked.
	 * Parameter: It does not take a parameter.
	 * Precondition: All buttons have to add to the actionLister to make it work.
	 * Postcondition: It receives all events and sends them to appropriate listeners.
	 * Throws:
	 */
	public void addListeners() {
		macBtn.addActionListener(this);
		dellBtn.addActionListener(this);
		hpBtn.addActionListener(this);
	}

	/*
	 * Description: This method will add the panel to the JFrame.
	 * Parameter: It does not take a parameter.
	 * Precondition: When the method is called it adds all the components
	 * to the frame.
	 * Postcondition: It output the design of the frame.
	 * Throws:
	 */
	public void addPanelsToFrame() {
		add(panel2);
	}

	/*
	 * Description: An overrided actionPerformed method.
	 * Parameter: It takes a parameter.
	 * Precondition: User has to click on some functional button.
	 * Postcondition: When the user click on some button, it
	 * figures out what to do right after the button is clicked
	 * and show some output.
	 * Throws:
	 */
	@Override
	public void actionPerformed(ActionEvent callingObj) {
		Object obj = callingObj.getSource();
		
		}
	}


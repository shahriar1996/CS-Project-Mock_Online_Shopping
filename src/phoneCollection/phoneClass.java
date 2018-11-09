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

package phoneCollection;

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

public class phoneClass extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Initial variables for phoneClass.
	private JPanel panel1 = new JPanel(new BorderLayout());
	private JPanel panel2 = new JPanel(new BorderLayout());
	
	private JPanel headerPanel = new JPanel (new FlowLayout());
	private JPanel optionPanel = new JPanel (new BorderLayout());
	
	private JPanel addAllPhone = new JPanel (new FlowLayout());

	private JPanel iphonePanel = new JPanel(new BorderLayout());
	private JLabel iphoneLbl = new JLabel("iPhone", SwingConstants.CENTER);

	private JPanel htcPanel = new JPanel(new BorderLayout());
	private JLabel htcLbl = new JLabel("HTC", SwingConstants.CENTER);
	
	private JPanel samsungPanel = new JPanel(new BorderLayout());
	private JLabel samsungLbl = new JLabel("Samsung", SwingConstants.CENTER);
	
	private JPanel motoPanel = new JPanel(new BorderLayout());
	private JLabel motoLbl = new JLabel("Motorola", SwingConstants.CENTER);
	
	private JLabel companyHeaderLbl = new JLabel("AMA Online Shopping", SwingConstants.CENTER);
	private JLabel pickOptionLbl = new JLabel("***PICK WHICH PHONE YOU WANT TO SHOP FROM US***", SwingConstants.CENTER);
	
	private JButton iPhoneBtn = new JButton();
	private JButton samsungBtn = new JButton();
	private JButton htcBtn = new JButton();
	private JButton motoBtn = new JButton();
	
	/*
	 * Description: This is default constructor.
	 * Parameter: It does not take a parameter.
	 * Precondition: Has to pass the name of the JFrame.
	 * Postcondition: Will output the whole frame.
	 * Throws: 
	 */
	public phoneClass() {
		
		iPhoneBtn.setIcon(new ImageIcon("iphone.png"));
		iPhoneBtn.setBackground(Color.LIGHT_GRAY);
		samsungBtn.setIcon(new ImageIcon("samsung.png"));
		samsungBtn.setBackground(Color.LIGHT_GRAY);
		htcBtn.setIcon(new ImageIcon("htc.png"));
		htcBtn.setBackground(Color.LIGHT_GRAY);
		motoBtn.setIcon(new ImageIcon("moto.png"));
		motoBtn.setBackground(Color.LIGHT_GRAY);
		
		setSize(650,350); 
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
		companyHeaderLbl.setFont(new Font("", Font.ROMAN_BASELINE,20));
		companyHeaderLbl.setForeground(Color.BLACK);
		
		iphonePanel.add(iPhoneBtn, BorderLayout.CENTER);
		iphoneLbl.setFont(new Font("iPhone", Font.BOLD, 15));
		iphonePanel.add(iphoneLbl, BorderLayout.SOUTH);
		
		htcPanel.add(htcBtn, BorderLayout.CENTER);
		htcLbl.setFont(new Font("HTC", Font.BOLD, 15));
		htcPanel.add(htcLbl, BorderLayout.SOUTH);
		
		samsungPanel.add(samsungBtn, BorderLayout.CENTER);
		samsungLbl.setFont(new Font("HTC", Font.BOLD, 15));
		samsungPanel.add(samsungLbl, BorderLayout.SOUTH);
		
		motoPanel.add(motoBtn, BorderLayout.CENTER);
		motoLbl.setFont(new Font("Motorola", Font.BOLD, 15));
		motoPanel.add(motoLbl, BorderLayout.SOUTH);
		
		addAllPhone.add(iphonePanel);
		addAllPhone.add(samsungPanel);
		addAllPhone.add(htcPanel);
		addAllPhone.add(motoPanel);

		
		optionPanel.add(pickOptionLbl);
		pickOptionLbl.setFont(new Font("", Font.ITALIC,15));
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
		iPhoneBtn.addActionListener(this);
		samsungBtn.addActionListener(this);
		htcBtn.addActionListener(this);
		motoBtn.addActionListener(this);
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
		if(obj.equals(iPhoneBtn)) {
			iPhone iphone = new iPhone();
		}
	}

}

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

package onlineShopping;

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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import laptopCollection.LaptopClass;
import phoneCollection.phoneClass;

public class ShoppingCart extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Initial variables for Home page.
	private JMenu optionsMenu = new JMenu("Home");
	private JMenu ProductMenu = new JMenu("Products");
	private JMenuItem m1 = new JMenuItem("Phone");
	private JMenuItem m2 = new JMenuItem("Laptop");
	private JMenuItem m3 = new JMenuItem("Accessories");
	private JMenuItem CloseMenu = new JMenuItem("Close");
	private JMenuBar menuBar = new JMenuBar();
	
	private JPanel productPanel = new JPanel(new FlowLayout());
	private JPanel headerPanel = new JPanel (new FlowLayout());
	private JPanel searchPanel = new JPanel (new FlowLayout());
	
	private JPanel panel1 = new JPanel(new BorderLayout());
	private JPanel panel2 = new JPanel(new BorderLayout());	
	
	private JTextField searchTxtF = new JTextField (45);
	
	private JButton searchBtn = new JButton ("Search");
	private JButton phoneBtn = new JButton();
	private JButton laptopBtn = new JButton();
	private JButton acsBtn = new JButton();
	
	private JLabel companyHeaderLbl = new JLabel("AMA Online Shopping");

	
	/*
	 * Description: This is an overloaded constructor.
	 * Parameter: It takes a parameter type string.
	 * Precondition: Has to pass the name of the JFrame.
	 * Postcondition: Will output the whole frame.
	 * Throws:
	 */
	public ShoppingCart(String title) {
		
		JFrame frame = new JFrame();
		frame.setBackground(Color.BLUE);
		frame.setVisible(true);
		
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(650,350); 
		
		phoneBtn.setIcon(new ImageIcon("phone.png"));
		phoneBtn.setBackground(Color.LIGHT_GRAY);
		
		laptopBtn.setIcon(new ImageIcon("laptop.png"));
		laptopBtn.setBackground(Color.LIGHT_GRAY);

		acsBtn.setIcon(new ImageIcon("acs.png"));
		acsBtn.setBackground(Color.LIGHT_GRAY);
		
		addComponentsToPanels();
		addPanelsToFrame();
		addListeners();
		addMenuBar();
	}
	
	
	/*
	 * Description: This method will add the panel to the JFrame.
	 * Parameter: It does not take a parameter.
	 * Precondition: When the method is called it adds all the components
	 * to the frame.
	 * Postcondition: It output the design of the frame.
	 * Throws: It does not throw any exception
	 */
	public void addPanelsToFrame() {
		add(panel2);
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
		
		searchPanel.add(searchTxtF);
		searchPanel.add(searchBtn);
	
		productPanel.add(phoneBtn);
		productPanel.add(laptopBtn);
		productPanel.add(acsBtn);

		
		panel1.add(headerPanel, BorderLayout.NORTH);
		panel1.add(searchPanel, BorderLayout.CENTER);
		
		panel2.add(panel1, BorderLayout.NORTH);
		panel2.add(productPanel, BorderLayout.CENTER);

	}

	/*
	 * Description: An Event object that represents an event when a button is clicked.
	 * Parameter: It does not take a parameter.
	 * Precondition: All buttons have to add to the actionLister to make it work.
	 * Postcondition: It receives all events and sends them to appropriate listeners.
	 * Throws:
	 */
	public void addListeners() {	
		
		ProductMenu.addActionListener(this);
		CloseMenu.addActionListener(this);
		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);
		searchBtn.addActionListener(this);
		phoneBtn.addActionListener(this);
		laptopBtn.addActionListener(this);
		acsBtn.addActionListener(this);
	}
	
	/*
	 * Description: This method add the menubar on the top of the frame.
	 * Parameter: Does not take any parameters.
	 * Precondition:
	 * Postcondition:
	 * Throws:
	 */
	public void addMenuBar() {

		optionsMenu.add(ProductMenu);
	
		optionsMenu.addSeparator();
		optionsMenu.add(ProductMenu);
		ProductMenu.add(m1);
		ProductMenu.add(m2);
		ProductMenu.add(m3);
		
		optionsMenu.addSeparator();
		optionsMenu.add(CloseMenu);
		
		menuBar.add(optionsMenu);
		
		setJMenuBar(menuBar);
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
		if (obj.equals(phoneBtn)) {
			phoneClass phoneClass = new phoneClass();
		}
		else if (obj.equals(laptopBtn)) {
			LaptopClass laptopClass = new LaptopClass();
		}
		else if(obj.equals(CloseMenu)) {
			System.exit(0);
		}
	}
}
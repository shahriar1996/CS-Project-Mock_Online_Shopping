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

public class ShoppingCart extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JMenu optionsMenu = new JMenu("Home");
	private JMenu ProductMenu = new JMenu("Products");
	private JMenuItem m1 = new JMenuItem("Phone");
	private JMenuItem m2 = new JMenuItem("Laptop");
	private JMenuItem m3 = new JMenuItem("Accessories");
	
	private JMenuItem CloseMenu = new JMenuItem("Close");
	private JMenuBar menuBar = new JMenuBar();
	
	
	private JPanel productPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	private JPanel headerPanel = new JPanel (new FlowLayout(FlowLayout.CENTER));
	private JPanel searchPanel = new JPanel (new FlowLayout(FlowLayout.CENTER));
	
	private JPanel panel1 = new JPanel(new BorderLayout());
	private JPanel panel2 = new JPanel(new BorderLayout());	
	
	private JTextField searchTxtF = new JTextField (20);
	
	private JButton searchBtn = new JButton ("Search");
	private JButton phoneBtn = new JButton();
	private JButton laptopBtn = new JButton();
	private JButton acsBtn = new JButton();

	
	private JLabel companyHeaderLbl = new JLabel("AMA Online Shopping");

	public ShoppingCart(String title) {
		
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(650,350); 
		
		phoneBtn.setIcon(new ImageIcon("phone.png"));
		laptopBtn.setIcon(new ImageIcon("laptop.png"));
		acsBtn.setIcon(new ImageIcon("acs.png"));
		
		addComponentsToPanels();
		addPanelsToFrame();
		addListeners();
		addMenuBar();
	}
	
	private void addPanelsToFrame() {
		add(panel2);
	}

	private void addComponentsToPanels() {
		
		headerPanel.add(companyHeaderLbl);
		companyHeaderLbl.setFont(new Font("AMA Online Shopping", Font.ROMAN_BASELINE,20));
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

	private void addListeners() {	
		
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
	
	private void addMenuBar() {

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
	
	@Override
	public void actionPerformed(ActionEvent callingObj) {
		
		Object obj = callingObj.getSource();
		if (obj.equals(phoneBtn)) {
			phoneClass phoneClass = new phoneClass();
		}
		
	}
	
	public static void main(String[] args) {
		ShoppingCart gui = new ShoppingCart("Mock Online Shopping");
		gui.setVisible(true);
	}

}
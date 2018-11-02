package onlineShopping;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ShoppingCart extends JFrame implements ActionListener{

	private JMenu optionsMenu = new JMenu("Home");
	private JMenu ProductMenu = new JMenu("Products");
	private JMenuItem m1 = new JMenuItem("Phone");
	private JMenuItem m2 = new JMenuItem("Laptop");
	private JMenuItem m3 = new JMenuItem("Accessories");
	
	private JMenuItem CloseMenu = new JMenuItem("Close");
	private JMenuBar menuBar = new JMenuBar();
	
	
	public ShoppingCart(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300); 
		
//		addComponentsToPanels();
//		addPanelsToFrame();
		addListeners();
		addMenuBar();
	}
	
	private void addListeners() {	
		
		ProductMenu.addActionListener(this);
		CloseMenu.addActionListener(this);
		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);
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
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		ShoppingCart gui = new ShoppingCart("Online Shopping");
		gui.setVisible(true);
	}

}
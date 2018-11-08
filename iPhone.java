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

public class iPhone extends JFrame implements ActionListener{

	/**
	 * 
	 */
	//test
	private static final long serialVersionUID = 1L;
	
	// Instance variables for iPhoneClass
	private JPanel headerPanel = new JPanel (new FlowLayout());
	private JLabel companyHeaderLbl = new JLabel("AMA Online Shopping", SwingConstants.CENTER);
	
	private JPanel panel = new JPanel(new BorderLayout());
	private JPanel iPhonePanel = new JPanel(new FlowLayout());
	
	private JButton iPhone8Btn = new JButton();
	private JButton iPhoneXBtn = new JButton();
	private JButton iPhoneXSBtn = new JButton();
	private JButton iPhoneXrBtn = new JButton();

	public iPhone() {
		
		iPhone8Btn.setIcon(new ImageIcon("iphone8.png"));
		iPhone8Btn.setBackground(Color.LIGHT_GRAY);
		iPhoneXBtn.setIcon(new ImageIcon("iphoneX.png"));
		iPhoneXBtn.setBackground(Color.LIGHT_GRAY);
		iPhoneXSBtn.setIcon(new ImageIcon("iphoneXS.png"));
		iPhoneXSBtn.setBackground(Color.LIGHT_GRAY);
		iPhoneXrBtn.setIcon(new ImageIcon("iphoneXR.png"));
		iPhoneXrBtn.setBackground(Color.LIGHT_GRAY);
		
		setSize(650,350); 
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		addComponentsToPanels();
		addPanelsToFrame();
		addListeners();
	}
	
	public void addListeners() {

		iPhone8Btn.addActionListener(this);
		iPhoneXBtn.addActionListener(this);
		iPhoneXSBtn.addActionListener(this);
		iPhoneXrBtn.addActionListener(this);

	}

	public void addPanelsToFrame() {
		add(panel);
	}

	public void addComponentsToPanels() {
		headerPanel.add(companyHeaderLbl);
		companyHeaderLbl.setFont(new Font("AMA Online Shopping", Font.ROMAN_BASELINE,20));
		companyHeaderLbl.setForeground(Color.BLACK);
		
		iPhonePanel.add(iPhone8Btn);
		iPhonePanel.add(iPhoneXBtn);
		iPhonePanel.add(iPhoneXSBtn);
		iPhonePanel.add(iPhoneXrBtn);
		
		panel.add(headerPanel, BorderLayout.NORTH);
		panel.add(iPhonePanel, BorderLayout.CENTER);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}

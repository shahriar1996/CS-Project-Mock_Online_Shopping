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
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class iPhone extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Instance variables for iPhoneClass
	private JPanel headerPanel = new JPanel (new FlowLayout());
	private JLabel companyHeaderLbl = new JLabel("AMA Online Shopping", SwingConstants.CENTER);
	
	private JPanel panel1 = new JPanel(new BorderLayout());
	private JPanel panel2 = new JPanel(new BorderLayout());
	private JPanel panel3 = new JPanel(new BorderLayout());
	private JPanel panel4 = new JPanel(new BorderLayout());
	private JPanel panel5 = new JPanel(new BorderLayout());
	private JPanel panel6 = new JPanel(new BorderLayout());
	private JPanel panel7 = new JPanel(new BorderLayout());
	private JPanel panel8 = new JPanel(new BorderLayout());

	
	private JPanel iPhone8BtnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel iPhoneXBtnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel iPhoneXSBtnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel iPhoneXRBtnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

	private JPanel iPhone8Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel desc8Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel panelA = new JPanel(new BorderLayout());

	private JPanel iPhoneXPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel descXPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel panelB = new JPanel(new BorderLayout());
	
	private JPanel iPhoneXSPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel descXSPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel panelC = new JPanel(new BorderLayout());
	
	private JPanel iPhoneXRPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel descXRPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel panelD = new JPanel(new BorderLayout());
	
	private JLabel iPhone8Lbl = new JLabel("<html>Apple iPhone 8, GSM Unlocked, 64 GB<br/>-------------------------------------------------------");
	private JLabel description8 = new JLabel("<html>*$699.99"
			+ "<br/> *Get it as soon  as, TUE Dec 11"
			+ "<br/> *FREE Shipping"
			+ "<br/> *15 in stock"
			, SwingConstants.CENTER);
	
	private JLabel iPhoneXLbl = new JLabel("<html>Apple iPhone X, GSM Unlocked, 64 GB<br/>-------------------------------------------------------");
	private JLabel descriptionX = new JLabel("<html>*$999.99"
			+ "<br/> *Get it as soon  as, TUE Dec 11"
			+ "<br/> *FREE Shipping"
			+ "<br/> *15 in stock"
			, SwingConstants.CENTER);
	
	private JLabel iPhoneXSLbl = new JLabel("<html>Apple iPhone XS, GSM Unlocked, 64 GB<br/>-------------------------------------------------------");
	private JLabel descriptionXS = new JLabel("<html>*$1100.99"
			+ "<br/> *Get it as soon  as, TUE Dec 11"
			+ "<br/> *FREE Shipping"
			+ "<br/> *15 in stock"
			, SwingConstants.CENTER);
	
	private JLabel iPhoneXRLbl = new JLabel("<html>Apple iPhone XS, GSM Unlocked, 64 GB<br/>-------------------------------------------------------");
	private JLabel descriptionXR = new JLabel("<html>*$799.99"
			+ "<br/> *Get it as soon  as, TUE Dec 11"
			+ "<br/> *FREE Shipping"
			+ "<br/> *15 in stock"
			, SwingConstants.CENTER);
	
	private JButton iPhone8Btn = new JButton();
	private JButton iPhoneXBtn = new JButton();
	private JButton iPhoneXSBtn = new JButton();
	private JButton iPhoneXRBtn = new JButton();

	public iPhone() {
		
		iPhone8Btn.setIcon(new ImageIcon("iphone8.png"));
		iPhone8Btn.setBackground(Color.LIGHT_GRAY);
		iPhoneXBtn.setIcon(new ImageIcon("iphoneX.png"));
		iPhoneXBtn.setBackground(Color.LIGHT_GRAY);
		iPhoneXSBtn.setIcon(new ImageIcon("iphoneXS.png"));
		iPhoneXSBtn.setBackground(Color.LIGHT_GRAY);
		iPhoneXRBtn.setIcon(new ImageIcon("iphoneXR.png"));
		iPhoneXRBtn.setBackground(Color.LIGHT_GRAY);
			
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
		iPhoneXRBtn.addActionListener(this);
	}

	public void addPanelsToFrame() {
		add(panel8);
	}

	public void addComponentsToPanels() {
		headerPanel.add(companyHeaderLbl);
		companyHeaderLbl.setFont(new Font("AMA Online Shopping", Font.ROMAN_BASELINE,20));
		companyHeaderLbl.setForeground(Color.BLACK);
		
		iPhone8BtnPanel.add(iPhone8Btn);
		
		iPhone8Panel.add(iPhone8Lbl);
		iPhone8Lbl.setFont(new Font("iPhone 8", Font.BOLD, 15));
		desc8Panel.add(description8);
		
		iPhoneXBtnPanel.add(iPhoneXBtn);
		
		iPhoneXPanel.add(iPhoneXLbl);
		iPhoneXLbl.setFont(new Font("iPhone X", Font.BOLD, 15));
		descXPanel.add(descriptionX);
		
		iPhoneXSBtnPanel.add(iPhoneXSBtn);
		
		iPhoneXSPanel.add(iPhoneXSLbl);
		iPhoneXSLbl.setFont(new Font("iPhone X", Font.BOLD, 15));
		descXSPanel.add(descriptionXS);
		
		iPhoneXRBtnPanel.add(iPhoneXRBtn);

		iPhoneXRPanel.add(iPhoneXRLbl);
		iPhoneXRLbl.setFont(new Font("iPhone XR", Font.BOLD, 15));
		descXRPanel.add(descriptionXR);
		
		panelA.add(iPhone8Panel, BorderLayout.NORTH);
		panelA.add(desc8Panel, BorderLayout.CENTER);
		
		panelB.add(iPhoneXPanel, BorderLayout.NORTH);
		panelB.add(descXPanel, BorderLayout.CENTER);
		
		panelC.add(iPhoneXSPanel, BorderLayout.NORTH);
		panelC.add(descXSPanel, BorderLayout.CENTER);
		
		panelD.add(iPhoneXRPanel, BorderLayout.NORTH);
		panelD.add(descXRPanel, BorderLayout.CENTER);
		
		panel1.add(iPhone8BtnPanel, BorderLayout.WEST);
		panel1.add(panelA, BorderLayout.CENTER);
		
		panel2.add(iPhoneXBtnPanel, BorderLayout.WEST);
		panel2.add(panelB, BorderLayout.CENTER);
		
		panel3.add(iPhoneXSBtnPanel, BorderLayout.WEST);
		panel3.add(panelC, BorderLayout.CENTER);
		
		panel4.add(iPhoneXRBtnPanel, BorderLayout.WEST);
		panel4.add(panelD, BorderLayout.CENTER);
		
		panel5.add(panel1, BorderLayout.NORTH);
		panel5.add(panel2, BorderLayout.CENTER);
		
		panel6.add(panel5, BorderLayout.NORTH);
		panel6.add(panel3, BorderLayout.CENTER);
		
		panel7.add(panel6, BorderLayout.NORTH);
		panel7.add(panel4, BorderLayout.CENTER);
		
		panel8.add(headerPanel, BorderLayout.NORTH);
		panel8.add(panel7, BorderLayout.CENTER);

	}

	@Override
	public void actionPerformed(ActionEvent callingObj) {
		Object obj = callingObj.getSource();
		if(obj.equals(iPhone8Btn)) {
			iPhone8 iphone8 = new iPhone8();
		}
	}
}

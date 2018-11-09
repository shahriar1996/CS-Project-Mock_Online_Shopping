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

public class iPhone8 extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// "<html>Welcome, Admin <br/>to Car Tooner", SwingConstants.CENTER
	
	private JLabel companyHeaderLbl = new JLabel("AMA Online Shopping", SwingConstants.CENTER);
	private JLabel iphone8Lbl = new JLabel("");
	private JLabel colorLbl = new JLabel("Color");
	private JLabel ramLbl = new JLabel("RAM");
	private JLabel description = new JLabel("<html>*4.7-Inch (diagonal) widescreen LCD multi-touch display with IPS <br/>technology and Retina HD display "
			+ "<br/> *Splash, water, and dust resistant"
			+ "<br/> *12MP camera with Optical image stabilization and Six-element lens"
			+ "<br/> *4K video recording at 24 fps, 30 fps, or 60 fps"
			+ "<br/> *All new glass design with A color-matched, aerospace-grade"
			+ "<br/> aluminum band"
			, SwingConstants.CENTER);
	
	
	
	private JPanel headerPanel = new JPanel (new FlowLayout());
	private JPanel iPhone8Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel namePanel = new JPanel(new BorderLayout());
	private JLabel iphoneLbl = new JLabel("iPhone 8", SwingConstants.CENTER);
	
	private JPanel colorBtnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel ramBtnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel descrPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	
	private JPanel panel = new JPanel (new BorderLayout());
	private JPanel panel1 = new JPanel (new BorderLayout());
	private JPanel panel2 = new JPanel (new BorderLayout());
	private JPanel panel3 = new JPanel (new BorderLayout());
	private JPanel panel4 = new JPanel (new BorderLayout());
	
	private JButton redColorBtn = new JButton("R");
	private JButton goldColorBtn = new JButton("G");
	private JButton silverColorBtn = new JButton("S");
	private JButton whiteColorBtn = new JButton("W");
	
	private JButton ram1 = new JButton("64");
	private JButton ram2 = new JButton("128");

	
	public iPhone8() {
		
		iphone8Lbl.setIcon(new ImageIcon("iphone8.png"));
		iphone8Lbl.setBackground(Color.LIGHT_GRAY);
		
		setSize(750,400); 
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		addComponentsToPanels();
		addPanelsToFrame();
		addListeners();
	}
	
	private void addListeners() {
		redColorBtn.addActionListener(this);
		goldColorBtn.addActionListener(this);		
		silverColorBtn.addActionListener(this);		
		whiteColorBtn.addActionListener(this);
		
		ram1.addActionListener(this);
		ram2.addActionListener(this);
	}

	private void addPanelsToFrame() {
		add(panel4);
	}

	private void addComponentsToPanels() {
		headerPanel.add(companyHeaderLbl);
		companyHeaderLbl.setFont(new Font("", Font.ROMAN_BASELINE,20));
		companyHeaderLbl.setForeground(Color.BLACK);		
		
		iPhone8Panel.add(iphone8Lbl);
		namePanel.add(iphoneLbl);
		iphoneLbl.setFont(new Font("iPhone 8", Font.BOLD, 15));
		iphoneLbl.setForeground(Color.ORANGE);
		
		panel.add(iPhone8Panel, BorderLayout.CENTER);
		panel.add(namePanel, BorderLayout.NORTH);
		
		colorBtnPanel.add(colorLbl);
		colorBtnPanel.add(redColorBtn);
		colorBtnPanel.add(goldColorBtn);
		colorBtnPanel.add(silverColorBtn);
		colorBtnPanel.add(whiteColorBtn);
		
		ramBtnPanel.add(ramLbl);
		ramBtnPanel.add(ram1);
		ramBtnPanel.add(ram2);
		
		descrPanel.add(description);
		
		panel1.add(colorBtnPanel, BorderLayout.NORTH);
		panel1.add(ramBtnPanel, BorderLayout.CENTER);
		
		panel2.add(panel1, BorderLayout.NORTH);
		panel2.add(descrPanel, BorderLayout.CENTER);
		
		panel3.add(panel, BorderLayout.WEST);
		panel3.add(panel2, BorderLayout.CENTER);
		
		panel4.add(headerPanel, BorderLayout.NORTH);
		panel4.add(panel3, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

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
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class iPhone8 extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// How to break lines: "<html>Welcome, Admin <br/>to Car Tooner", SwingConstants.CENTER
	
	private JLabel companyHeaderLbl = new JLabel("AMA Online Shopping", SwingConstants.CENTER);
	private JLabel iphone8Lbl = new JLabel();
	private JLabel colorLbl = new JLabel("Color");
	private JLabel ramLbl = new JLabel("Size");
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
	
	private JLabel productLbl = new JLabel("Product: ");
	private JLabel productFillLbl = new JLabel("iPhone 8");
	private JPanel productPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	
	private JLabel colorLabel = new JLabel("Color: ");
	private JLabel colorFillLbl = new JLabel();
	private JPanel colorPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	
	private JLabel romLabel = new JLabel("Size: ");
	private JLabel romFillLbl = new JLabel();
	private JPanel romPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	
	private JLabel pricelLbl = new JLabel("Price: ");
	private JLabel priceFillLbl = new JLabel();
	private JPanel pricePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	
	private JPanel panelX = new JPanel(new BorderLayout());
	private JPanel panelY = new JPanel(new BorderLayout());
	private JPanel panelZ = new JPanel(new BorderLayout());
	private JPanel boxPanel = new JPanel(new BorderLayout());
	
	private JPanel colorBtnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel ramBtnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel descrPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel addCart = new JPanel(new FlowLayout(FlowLayout.LEFT));
	
	private JPanel panel1 = new JPanel (new BorderLayout());
	private JPanel panel2 = new JPanel (new BorderLayout());
	private JPanel panel3 = new JPanel (new BorderLayout());
	private JPanel panel4 = new JPanel (new BorderLayout());
	private JPanel panel5 = new JPanel (new BorderLayout());
	private JPanel panel6 = new JPanel (new BorderLayout());
	
	private JToggleButton redColorBtn = new JToggleButton("R");
	private JToggleButton goldColorBtn = new JToggleButton("G");
	private JToggleButton silverColorBtn = new JToggleButton("S");
	private JToggleButton whiteColorBtn = new JToggleButton("w");
	
	private JToggleButton rom1 = new JToggleButton("64");
	private JToggleButton rom2 = new JToggleButton("128");

	private JButton add2Cart = new JButton("Add to Cart");
	
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
		
		rom1.addActionListener(this);
		rom2.addActionListener(this);
		
		add2Cart.addActionListener(this);
	}

	private void addPanelsToFrame() {
		add(panel6);
	}

	private void addComponentsToPanels() {
		headerPanel.add(companyHeaderLbl);
		companyHeaderLbl.setFont(new Font("", Font.ROMAN_BASELINE,20));
		companyHeaderLbl.setForeground(Color.BLACK);		
		
		iPhone8Panel.add(iphone8Lbl);
		namePanel.add(iphoneLbl);
		iphoneLbl.setFont(new Font("iPhone 8", Font.BOLD, 15));
		iphoneLbl.setForeground(Color.ORANGE);
	
		colorBtnPanel.add(colorLbl);
		colorBtnPanel.add(redColorBtn);
		colorBtnPanel.add(goldColorBtn);
		colorBtnPanel.add(silverColorBtn);
		colorBtnPanel.add(whiteColorBtn);
		
		ramBtnPanel.add(ramLbl);
		ramBtnPanel.add(rom1);
		ramBtnPanel.add(rom2);
		
		descrPanel.add(description);
		
		productPanel.add(productLbl);
		productPanel.add(productFillLbl);
		
		colorPanel.add(colorLabel);
		colorPanel.add(colorFillLbl);
		
		romPanel.add(romLabel);
		romPanel.add(romFillLbl);
		
		pricePanel.add(pricelLbl);
		pricePanel.add(priceFillLbl);
		
		panelX.add(productPanel, BorderLayout.NORTH);
		panelX.add(colorPanel, BorderLayout.CENTER);
		
		panelY.add(panelX, BorderLayout.NORTH);
		panelY.add(romPanel, BorderLayout.CENTER);
		
		panelZ.add(panelY, BorderLayout.NORTH);
		panelZ.add(pricePanel, BorderLayout.CENTER);
		
		addCart.add(add2Cart);
		
		boxPanel.add(panelZ, BorderLayout.NORTH);
		boxPanel.add(addCart, BorderLayout.CENTER);
		
		panel1.add(iPhone8Panel, BorderLayout.CENTER);
		panel1.add(namePanel, BorderLayout.NORTH);
		
		panel2.add(colorBtnPanel, BorderLayout.NORTH);
		panel2.add(ramBtnPanel, BorderLayout.CENTER);
		
		panel3.add(panel2, BorderLayout.NORTH);
		panel3.add(descrPanel, BorderLayout.CENTER);
		
		panel4.add(panel1, BorderLayout.WEST);
		panel4.add(panel3, BorderLayout.CENTER);
		
		panel5.add(panel4, BorderLayout.WEST);
		panel5.add(boxPanel, BorderLayout.CENTER);
		
		panel6.add(headerPanel, BorderLayout.NORTH);
		panel6.add(panel5, BorderLayout.CENTER);
	}


	@Override
	public void actionPerformed(ActionEvent callingObj) {
		Object obj = callingObj.getSource();
		if(obj.equals(rom1)) {
			romFillLbl.setText("64");
			priceFillLbl.setText("$699.99");
		}else if(obj.equals(rom2)) {
			romFillLbl.setText("128");
			priceFillLbl.setText("$899.99");
		}else if(obj.equals(redColorBtn)) {
			colorFillLbl.setText("Red");
		}else if(obj.equals(goldColorBtn)) {
			colorFillLbl.setText("Gold");
		}else if(obj.equals(silverColorBtn)) {
			colorFillLbl.setText("Silver");
		}else if(obj.equals(whiteColorBtn)) {
			colorFillLbl.setText("White");
		}
	}

}

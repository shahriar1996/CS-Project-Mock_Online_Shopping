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
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class phoneClass extends JFrame implements ActionListener {
	/**
	 * 
	 */

	private JPanel panel = new JPanel(new BorderLayout());
	private JPanel panel2 = new JPanel(new BorderLayout());

	private JPanel headerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	private JPanel phonePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	private JPanel optionPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

	private JLabel companyHeaderLbl = new JLabel("AMA Online Shopping");
	private JLabel pickOptionLbl = new JLabel("***PICK WHICH PHONE YOU WANT TO BUY FROM US***", SwingConstants.CENTER);

	private JButton iPhoneBtn = new JButton();
	private JButton samsungBtn = new JButton();
	private JButton htcBtn = new JButton();
	private JButton motoBtn = new JButton();

	private static final long serialVersionUID = 1L;

	public phoneClass() {

		iPhoneBtn.setIcon(new ImageIcon("iphone.png"));
		samsungBtn.setIcon(new ImageIcon("samsung.png"));
		htcBtn.setIcon(new ImageIcon("htc.png"));
		motoBtn.setIcon(new ImageIcon("moto.png"));

		setSize(650, 350);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		addComponentsToPanels();
		addPanelsToFrame();
		addListeners();

	}

	private void addComponentsToPanels() {
		headerPanel.add(companyHeaderLbl);
		companyHeaderLbl.setFont(new Font("AMA Online Shopping", Font.ROMAN_BASELINE, 20));
		companyHeaderLbl.setForeground(Color.BLACK);

		optionPanel.add(pickOptionLbl);
		pickOptionLbl.setFont(new Font("***PICK WHICH PHONE YOU WANT TO SHOP FROM US***", Font.ITALIC, 15));
		pickOptionLbl.setForeground(Color.RED);

		phonePanel.add(iPhoneBtn);
		phonePanel.add(samsungBtn);
		phonePanel.add(htcBtn);
		phonePanel.add(motoBtn);

		panel.add(headerPanel, BorderLayout.NORTH);
		panel.add(phonePanel, BorderLayout.CENTER);

		panel2.add(panel, BorderLayout.NORTH);
		panel2.add(pickOptionLbl, BorderLayout.CENTER);
	}

	private void addListeners() {
		iPhoneBtn.addActionListener(this);
		samsungBtn.addActionListener(this);
		htcBtn.addActionListener(this);
		motoBtn.addActionListener(this);
	}

	private void addPanelsToFrame() {
		add(panel2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}

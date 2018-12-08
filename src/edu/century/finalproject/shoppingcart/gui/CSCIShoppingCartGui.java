package edu.century.finalproject.shoppingcart.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.border.LineBorder;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

import edu.century.finalproject.shoppingcart.bean.Catalog;
import edu.century.finalproject.shoppingcart.bean.Category;
import edu.century.finalproject.shoppingcart.bean.SubCategory;
import edu.century.finalproject.shoppingcart.collections.ArrayBag;
import edu.century.finalproject.shoppingcart.collections.CategoryCollection;
import edu.century.finalproject.shoppingcart.collections.ShoppingCartCollection;
import edu.century.finalproject.shoppingcart.search.BinaryStringSearch;

public class CSCIShoppingCartGui {
	private String title;
	private CategoryCollection categoryCollection;
	private ShoppingCartCollection shoppingCartCollection;
	private DefaultListModel<String> shoppingCartListModel;
	private JLabel totalAmountLbl;
	private JPanel currentPanel;
	private JFrame frame;
	private JTree tree;

	public CSCIShoppingCartGui(String title, CategoryCollection categoryCollection) {
		this.title = title;
		this.categoryCollection = categoryCollection;
		this.shoppingCartCollection = new ShoppingCartCollection();
	}

	/**
	 * This will generate GUI for Shopping Cart
	 */
	public void showGui() {
		this.currentPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 80, 40));
		this.frame = new JFrame("WELCOME TO " + title);
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("CATALOG");
		List<JPanel> subCategoryPanelList = new ArrayList<>();
		for (int i = 0; i < categoryCollection.getCategoryBag().size(); i++) {
			Category category = categoryCollection.getCategoryBag().get(i);
			DefaultMutableTreeNode categoryNode = new DefaultMutableTreeNode(category.getName());
			for (int j = 0; j < category.getSubcategoryBag().size(); j++) {
				SubCategory subCategory = category.getSubcategoryBag().get(j);
				subCategoryPanelList.add(createSubCategoryPanel(subCategory, shoppingCartCollection));
				DefaultMutableTreeNode subCategoryNode = new DefaultMutableTreeNode(subCategory.getName());
				categoryNode.insert(subCategoryNode, j);
			}
			root.add(categoryNode);
		}
		JPanel jpnlTree = new JPanel();
		this.tree = new JTree(root);
		tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

		jpnlTree.add(new JScrollPane(tree));
		jpnlTree.setBackground(Color.LIGHT_GRAY);
		jpnlTree.setSize(new Dimension(100, 500));

		this.shoppingCartListModel = new DefaultListModel<>();
		JList purchasedCatalog = new JList(shoppingCartListModel);
		purchasedCatalog.setPreferredSize(new Dimension(240, 490));
		purchasedCatalog.setLayoutOrientation(JList.VERTICAL);
		purchasedCatalog.setBorder(new LineBorder(Color.GRAY, 3));

		JPanel jpnlList = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 20));
		jpnlList.setBorder(new LineBorder(Color.DARK_GRAY, 3));
		jpnlList.setPreferredSize(new Dimension(265, JFrame.HEIGHT));
		JLabel lblPurchase = new JLabel("Your Cart");
		lblPurchase.setFont(new Font("Calibri", Font.BOLD, 15));
		lblPurchase.setForeground(Color.darkGray);
		JButton btnPurchase = new JButton("Purchase");
		btnPurchase.setActionCommand("Purchase");
		jpnlList.add(lblPurchase);

		JScrollPane scrollPane = new JScrollPane(purchasedCatalog);
		scrollPane.setPreferredSize(new Dimension(250, 490));
		jpnlList.add(scrollPane, BorderLayout.CENTER);

		jpnlList.add(btnPurchase);
		totalAmountLbl = new JLabel();
		jpnlList.setBackground(Color.LIGHT_GRAY);

		JPanel jpnlAmount = new JPanel(new FlowLayout(FlowLayout.CENTER, 80, 40));
		jpnlAmount.add(totalAmountLbl);
		jpnlAmount.setBorder(new LineBorder(Color.DARK_GRAY, 3));

		JPanel jpnlgreet = new JPanel();
		jpnlgreet.setBackground(Color.GRAY);
		JLabel lblGreet = new JLabel("WELCOME TO " + title);
		lblGreet.setFont(new Font("Calibri", Font.BOLD, 16));
		jpnlgreet.add(lblGreet);
		/*
		 * JLabel lblBanner = new JLabel(); lblBanner.setIcon(new ImageIcon(""));
		 */

		currentPanel.add(getSearchPanel(categoryCollection, shoppingCartCollection), BorderLayout.CENTER);
		frame.getContentPane().add(jpnlList, BorderLayout.EAST);
		frame.getContentPane().add(currentPanel, BorderLayout.CENTER);
		frame.getContentPane().add(jpnlgreet, BorderLayout.NORTH);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().add(jpnlTree, BorderLayout.WEST);
		frame.getContentPane().add(jpnlAmount, BorderLayout.PAGE_END);
		frame.setSize(1850, 900);
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

		// Determine the new location of the window
		int w = frame.getSize().width;
		int h = frame.getSize().height;
		int x = (dim.width - w) / 2;
		int y = (dim.height - h) / 2;

		// Move the window
		frame.setLocation(x, y);
	}

	/**
	 * Generates Search Panel
	 * @param categoryCollection
	 * @param shoppingCartCollection
	 * @return
	 */
	private JPanel getSearchPanel(CategoryCollection categoryCollection,
			ShoppingCartCollection shoppingCartCollection) {
		JPanel searchPanel = new JPanel(new FlowLayout());
		JButton searchBtn = new JButton("Search");
		JTextField searchTxtF = new JTextField(45);
		searchPanel.add(searchTxtF);
		searchPanel.add(searchBtn);
		searchBtn.addActionListener(
				new ShoppingCartSearchListener(searchTxtF, categoryCollection, shoppingCartCollection));
		return searchPanel;
	}

	/**
	 * Generates subCategory Panel group which will help in showing when clicked on tree
	 * @param subCategory
	 * @param shoppingCartCollection
	 * @return
	 */
	private JPanel createSubCategoryPanel(SubCategory subCategory, ShoppingCartCollection shoppingCartCollection) {
		JPanel subCategoryPanel = new JPanel();
		subCategoryPanel.setName(subCategory.getName());
		for (int i = 0; i < subCategory.getCatalogBag().size(); i++) {
			Catalog catalog = subCategory.getCatalogBag().get(i);
			subCategoryPanel.add(this.createShoppingCartPanel(catalog, shoppingCartCollection));
		}
		return subCategoryPanel;
	}

	/**
	 * Generates Catalog Panel for each catalog entry
	 * @param catalog
	 * @param shoppingCartCollection
	 * @return
	 */
	public JPanel createShoppingCartPanel(Catalog catalog, ShoppingCartCollection shoppingCartCollection) {
		JPanel panelProduct = new JPanel(new FlowLayout(FlowLayout.CENTER, 7, 8));
		panelProduct.setPreferredSize(new Dimension(200, 300));
		ImageIcon icon = new ImageIcon(catalog.getImagePath());
		JLabel label = new JLabel(catalog.getName());

		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setForeground(Color.BLACK);
		label.setIcon(icon);
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Trebuchet", Font.BOLD, 12));
		label.setToolTipText("<Html>" + catalog.getName() + "<br> " + catalog.getDescription() + "</html> ");
		JLabel lblDescription = new JLabel("<Html> " + catalog.getDescription() + "</html> ");
		lblDescription.setVerticalTextPosition(JLabel.BOTTOM);
		lblDescription.setHorizontalTextPosition(JLabel.CENTER);

		JLabel lblprice = new JLabel("$ " + catalog.getPrice());
		lblprice.setVerticalTextPosition(JLabel.BOTTOM);
		lblprice.setHorizontalTextPosition(JLabel.CENTER);
		JCheckBox jchkBoxHpLap = new JCheckBox("Buy");

		JComboBox<?> jcmbQty = new JComboBox<>(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		catalog.setQuantity((Integer) jcmbQty.getSelectedItem());


		panelProduct.add(label, BorderLayout.NORTH);
		panelProduct.add(lblDescription, BorderLayout.NORTH);
		panelProduct.add(lblprice, BorderLayout.CENTER);
		panelProduct.add(jchkBoxHpLap);
		panelProduct.add(jcmbQty);
		panelProduct.setBorder(new LineBorder(Color.cyan, 1));

		return panelProduct;
	}

	/**
	 * Shopping Cart Search Listener 
	 *
	 */
	private class ShoppingCartSearchListener implements ActionListener {

		private JTextField searchTxtF;
		private CategoryCollection categoryCollection;
		private ShoppingCartCollection shoppingCartCollection;

		public ShoppingCartSearchListener(JTextField searchTxtF, CategoryCollection categoryCollection,
				ShoppingCartCollection shoppingCartCollection) {
			this.searchTxtF = searchTxtF;
			this.categoryCollection = categoryCollection;
			this.shoppingCartCollection = shoppingCartCollection;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			ArrayBag<Catalog> catalogBag = new ArrayBag<>();
			if (!searchTxtF.getText().trim().isEmpty()) {
				for (int i = 0; i < categoryCollection.getCategoryBag().size(); i++) {
					Category category = categoryCollection.getCategoryBag().get(i);
					for (int j = 0; j < category.getSubcategoryBag().size(); j++) {
						SubCategory subCategory = category.getSubcategoryBag().get(j);
						for (int k = 0; k < subCategory.getCatalogBag().size(); k++) {
							Catalog catalog = subCategory.getCatalogBag().get(k);
							String searchTxt = searchTxtF.getText().toLowerCase().trim();
							String[] names = catalog.getName().toLowerCase().split(" ");
							if (BinaryStringSearch.binarySearch(names,searchTxt) >= 0 || 
									catalog.getName().toLowerCase().contains(searchTxt)) {
								catalogBag.add(catalog);
							}
						}
					}
				}
			}
			currentPanel.removeAll();
			currentPanel.add(getSearchPanel(categoryCollection, shoppingCartCollection), BorderLayout.CENTER);
			if (catalogBag.size() == 0) {
				JOptionPane.showMessageDialog(searchTxtF,
						"Could not find the Item in our catalog " + searchTxtF.getText());
			} else {
				JPanel searchResultsPanel = new JPanel();
				searchResultsPanel.setName("Search Results");
				for (int i = 0; i < catalogBag.size(); i++) {
					Catalog catalog = catalogBag.get(i);
					searchResultsPanel.add(createShoppingCartPanel(catalog, shoppingCartCollection));
				}
				currentPanel.add(searchResultsPanel);
			}
			currentPanel.invalidate();
			currentPanel.validate();
			currentPanel.revalidate();
			currentPanel.repaint();
		}

	}
}

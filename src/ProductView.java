
import javax.swing.*;

import se.chalmers.ait.dat215.project.Product;

import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;

public class ProductView extends JPanel{

	JLabel picLbl;
	private JLabel favoriteLbl;
	private JSpinner amountSpinner;
	private JButton buyBtn;
	private JLabel priceLbl;
	private JLabel productNameLbl;
	private JComboBox<String> addToListCombo;
	private JButton addToListBtn;
	private Product product;
	/*
	 * Creating the panel.
	 */
	public ProductView(Product product, Icon icon) {
		setBackground(Color.LIGHT_GRAY);
		setPreferredSize(new Dimension(635, 300));
		this.product = product;
		
		setLayout(null);
		
		picLbl = new JLabel("150x150 pixlar...");
		picLbl.setBounds(5, 5, 150, 150);
		setImage(icon);
		add(picLbl);
		
		
		favoriteLbl = new JLabel("");
		favoriteLbl.setIcon(new ImageIcon(ProductView.class.getResource("/iconz/omarkerad45.png")));
		favoriteLbl.setBounds(577, 11, 48, 42);
		add(favoriteLbl);
		
		amountSpinner = new JSpinner();
		amountSpinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		amountSpinner.setVerifyInputWhenFocusTarget(false);
		amountSpinner.setRequestFocusEnabled(false);
		amountSpinner.setFont(new Font("HelvLight", Font.PLAIN, 14));
		amountSpinner.setBounds(494, 273, 37, 20);
		add(amountSpinner);
		
		buyBtn = new JButton("Add");
		buyBtn.setFont(new Font("HelvLight", Font.PLAIN, 14));
		buyBtn.setBounds(534, 273, 91, 20);
		add(buyBtn);
		
		priceLbl = new JLabel("price");
		priceLbl.setFont(new Font("HelvLight", Font.PLAIN, 14));
		priceLbl.setBounds(549, 242, 76, 20);
		setPrice(product);
		add(priceLbl);
		
		productNameLbl = new JLabel("Productname");
		productNameLbl.setFont(new Font("HelvLight", Font.PLAIN, 18));
		productNameLbl.setBounds(173, 11, 203, 20);
		setName(product);
		add(productNameLbl);
		
		
		addToListCombo = new JComboBox();
		addToListCombo.setFont(new Font("HelvLight", Font.PLAIN, 14));
		addToListCombo.setBounds(5, 273, 121, 20);
		add(addToListCombo);
		
		addToListBtn = new JButton("Add to list");
		addToListBtn.setFont(new Font("HelvLight", Font.PLAIN, 14));
		addToListBtn.setBounds(130, 273, 101, 20);
		add(addToListBtn);
	}
	
	/**
	 * sets the name of the product.
	 * @param product
	 */
	public void setName (Product product) {
		productNameLbl.setText(product.getName());
		productNameLbl.repaint();
	}
	
	/**
	 * Sets the price of the product (in the view).
	 * @param the product
	 */
	public void setPrice (Product product) {
		priceLbl.setText(product.getPrice() + " kr");
		priceLbl.repaint();
	}
	
	/**
	 * Sets the price of the product (in the view).
	 * @param the icon
	 */
	public void setImage (Icon pic) {
		
		picLbl.setText("");
		picLbl.setIcon(pic);
		picLbl.repaint();
	}
	
	public void setFavoriteIcon (Product product) {
		
	}
}

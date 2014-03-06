
import javax.swing.*;

import java.awt.Font;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

import se.chalmers.ait.dat215.project.Product;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.SystemColor;

public class ListView extends JPanel {
	private JLabel productNameLbl;
	private JLabel priceLbl;
	private JSpinner amountSpinner;
	
	public ListView(String name, double price) {
		setBackground(Color.LIGHT_GRAY);
		setPreferredSize(new Dimension(635, 45));
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(null);
		
		productNameLbl = new JLabel(name);
		productNameLbl.setToolTipText("Show additional information");
		productNameLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		productNameLbl.setForeground(Color.WHITE);
		productNameLbl.setFont(new Font("HelvLight", Font.BOLD, 18));
		productNameLbl.setBounds(10, 11, 198, 26);
		add(productNameLbl);
		
		priceLbl = new JLabel(price + " kr");
		priceLbl.setFont(new Font("HelvLight", Font.PLAIN, 14));
		priceLbl.setBounds(556, 11, 67, 26);
		add(priceLbl);
		
		amountSpinner = new JSpinner();
		amountSpinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		amountSpinner.setToolTipText("Number of pieces");
		amountSpinner.setFont(new Font("HelvLight", Font.PLAIN, 14));
		amountSpinner.setBounds(347, 11, 55, 26);
		add(amountSpinner);
		
		JButton addToCartButton = new JButton("Add to cart");
		addToCartButton.setToolTipText("Add this item to cart");
		addToCartButton.setForeground(Color.DARK_GRAY);
		addToCartButton.setFont(new Font("HelvLight", Font.PLAIN, 14));
		addToCartButton.setBackground(SystemColor.window);
		addToCartButton.setBounds(424, 11, 122, 27);
		add(addToCartButton);
		
	}
	
	/**
	 * Sets the name of the product (in the view).
	 * @param the product
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
		priceLbl.setText(product.getPrice() + "");
		priceLbl.repaint();
	}
}

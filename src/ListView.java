
import javax.swing.*;

import java.awt.Font;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

import se.chalmers.ait.dat215.project.Product;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListView extends JPanel {
	private JLabel productNameLbl;
	private JLabel priceLbl;
	private JSpinner amountSpinner;
	private RegisterController reg = RegisterController.getInstance();
	JLabel pictureLbl;
	
	public ListView(String name, double price, ImageIcon image) {
		setBackground(Color.LIGHT_GRAY);
		setPreferredSize(new Dimension(630, 50));
		setLayout(null);
		
		productNameLbl = new JLabel(name);
		productNameLbl.setName("productNameLbl");
		productNameLbl.setToolTipText("Show additional information");
		productNameLbl.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		productNameLbl.setForeground(Color.WHITE);
		productNameLbl.setFont(new Font("HelvLight", Font.BOLD, 18));
		productNameLbl.setBounds(67, 11, 198, 26);
		add(productNameLbl);
		
		priceLbl = new JLabel(price + " kr");
		priceLbl.setFont(new Font("HelvLight", Font.PLAIN, 14));
		priceLbl.setBounds(532, 11, 67, 26);
		add(priceLbl);
		
		amountSpinner = new JSpinner();
		amountSpinner.setName("amountSpinner");
		amountSpinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		amountSpinner.setToolTipText("Number of pieces");
		amountSpinner.setFont(new Font("HelvLight", Font.PLAIN, 14));
		amountSpinner.setBounds(340, 11, 55, 26);
		add(amountSpinner);
		
		JButton addToCartButton = new JButton("Add to cart");
		addToCartButton.setName("listBuyBtn");
		addToCartButton.addMouseListener(reg);
		addToCartButton.setToolTipText("Add this item to cart");
		addToCartButton.setForeground(Color.DARK_GRAY);
		addToCartButton.setFont(new Font("HelvLight", Font.PLAIN, 14));
		addToCartButton.setBackground(SystemColor.window);
		addToCartButton.setBounds(400, 11, 122, 27);
		add(addToCartButton);
		
		JLabel starLbl = new JLabel("");
		starLbl.setToolTipText("Favorite mark/unmark");
		starLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		starLbl.setIcon(new ImageIcon(ListView.class.getResource("/stars20/omarkerad20.png")));
		starLbl.setBounds(599, 13, 20, 20);
		add(starLbl);
		
		pictureLbl = new JLabel(image);
		pictureLbl.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		pictureLbl.setBounds(5, 5, 40, 40);
		add(pictureLbl);
		
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
	
	public void setImage (Icon pic){
		pictureLbl.setIcon(pic);
	}
	
	
}

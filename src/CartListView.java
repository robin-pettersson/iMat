
import javax.swing.*;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

import se.chalmers.ait.dat215.project.Product;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Rectangle;
import javax.swing.border.LineBorder;

public class CartListView extends JPanel {

	JSpinner amountSpinner;
	JLabel priceLbl;
	JLabel productNameLbl;
	JLabel pictureLbl;
	
	
	public CartListView(String product, String price, double amount, Icon icon) {
		setBounds(new Rectangle(0, 0, 625, 50));
		setSize(new Dimension(630, 40));
		
		setBackground(Color.LIGHT_GRAY);
		setBorder(null);
		setPreferredSize(new Dimension(625, 50));
		setLayout(null);
		
		amountSpinner = new JSpinner();
		amountSpinner.setToolTipText("Number of pieces");
		amountSpinner.setModel(new SpinnerNumberModel(amount, new Double(1), null, new Double(1)));
		amountSpinner.setFont(new Font("HelvLight", Font.PLAIN, 14));
		amountSpinner.setBounds(424, 11, 55, 26);
		add(amountSpinner);
		
		priceLbl = new JLabel(price + " kr");
		priceLbl.setFont(new Font("HelvLight", Font.PLAIN, 14));
		priceLbl.setBounds(502, 11, 67, 26);
		add(priceLbl);
		
		productNameLbl = new JLabel(product);
		productNameLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		productNameLbl.setForeground(Color.WHITE);
		productNameLbl.setFont(new Font("HelvLight", Font.BOLD, 18));
		productNameLbl.setBounds(67, 11, 198, 26);
		add(productNameLbl);
		
		pictureLbl = new JLabel("");
		pictureLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pictureLbl.setIcon(icon);;
		pictureLbl.setBounds(5, 5, 40, 40);
		add(pictureLbl);
		
		JLabel label = new JLabel("X");
		label.setToolTipText("Remove from cart");
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.setForeground(Color.RED);
		label.setFont(new Font("Dialog", Font.BOLD, 24));
		label.setBounds(599, 11, 24, 26);
		add(label);
		// TODO Auto-generated constructor stub
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
		priceLbl.setText(product.getPrice() + "");
		priceLbl.repaint();
	}
	
	/**
	 * Sets the price of the product (in the view).
	 * @param the product
	 */
	public void setImage (Product product) {
		//TODO beh�ver hj�lp. hur s�tter jag mha referens till objektet bilden?
		pictureLbl.setText("");
		//picLbl.setIcon(product.getImageName());
		pictureLbl.repaint();
	}
	
	public String getName () {
		return productNameLbl.getText();
	}
	
	public double getPrice() {		
		return Double.parseDouble(priceLbl.getText());
	}
}

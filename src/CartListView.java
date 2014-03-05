
import javax.swing.*;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

import se.chalmers.ait.dat215.project.Product;
import java.awt.Color;
import java.awt.Cursor;

public class CartListView extends JPanel {

	JSpinner amountSpinner;
	JLabel priceLbl;
	JLabel productNameLbl;
	JLabel pictureLbl;
	
	
	public CartListView() {
		setBackground(Color.LIGHT_GRAY);
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setPreferredSize(new Dimension(635, 70));
		setLayout(null);
		
		amountSpinner = new JSpinner();
		amountSpinner.setToolTipText("Number of pieces");
		amountSpinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		amountSpinner.setFont(new Font("HelvLight", Font.PLAIN, 14));
		amountSpinner.setBounds(464, 26, 57, 20);
		add(amountSpinner);
		
		priceLbl = new JLabel("á 746 kr");
		priceLbl.setFont(new Font("HelvLight", Font.PLAIN, 14));
		priceLbl.setBounds(539, 26, 63, 20);
		add(priceLbl);
		
		productNameLbl = new JLabel("WareName");
		productNameLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		productNameLbl.setForeground(Color.WHITE);
		productNameLbl.setFont(new Font("HelvLight", Font.BOLD, 18));
		productNameLbl.setBounds(75, 22, 198, 26);
		add(productNameLbl);
		
		pictureLbl = new JLabel("pic");
		pictureLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pictureLbl.setBounds(5, 5, 60, 60);
		add(pictureLbl);
		
		JLabel label = new JLabel("X");
		label.setToolTipText("Remove from cart");
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.setForeground(Color.RED);
		label.setFont(new Font("Dialog", Font.BOLD, 24));
		label.setBounds(611, 20, 24, 26);
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

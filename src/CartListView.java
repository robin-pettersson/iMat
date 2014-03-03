
import javax.swing.*;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

import se.chalmers.ait.dat215.project.Product;
import java.awt.Color;

public class CartListView extends JPanel {

	JSpinner amountSpinner;
	JLabel priceLbl;
	JLabel removeLbl;
	JLabel productNameLbl;
	JLabel pictureLbl;
	
	
	public CartListView() {
		setBackground(Color.LIGHT_GRAY);
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setPreferredSize(new Dimension(635, 70));
		setLayout(null);
		
		amountSpinner = new JSpinner();
		amountSpinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		amountSpinner.setFont(new Font("HelvLight", Font.PLAIN, 14));
		amountSpinner.setBounds(491, 26, 57, 20);
		add(amountSpinner);
		
		priceLbl = new JLabel("price");
		priceLbl.setFont(new Font("HelvLight", Font.PLAIN, 14));
		priceLbl.setBounds(428, 26, 63, 20);
		add(priceLbl);
		
		removeLbl = new JLabel("Remove");
		removeLbl.setForeground(Color.WHITE);
		removeLbl.setFont(new Font("HelvLight", Font.BOLD, 14));
		removeLbl.setBounds(554, 26, 71, 15);
		add(removeLbl);
		
		productNameLbl = new JLabel("WareName");
		productNameLbl.setForeground(Color.WHITE);
		productNameLbl.setFont(new Font("HelvLight", Font.BOLD, 18));
		productNameLbl.setBounds(75, 22, 198, 26);
		add(productNameLbl);
		
		pictureLbl = new JLabel("pic");
		pictureLbl.setBounds(5, 5, 60, 60);
		add(pictureLbl);
		
		JLabel label = new JLabel("X");
		label.setForeground(Color.RED);
		label.setFont(new Font("Dialog", Font.BOLD, 24));
		label.setBounds(613, 20, 24, 26);
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
		//TODO behöver hjälp. hur sätter jag mha referens till objektet bilden?
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

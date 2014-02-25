
import javax.swing.*;

import java.awt.Font;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

import se.chalmers.ait.dat215.project.Product;
import java.awt.Dimension;

public class ListView extends JPanel {
	private JLabel productNameLbl;
	private JLabel priceLbl;
	private JSpinner amountSpinner;
	private JButton addBtn;
	
	public ListView() {
		setPreferredSize(new Dimension(635, 50));
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(null);
		
		productNameLbl = new JLabel("WareName");
		productNameLbl.setFont(new Font("HelvLight", Font.PLAIN, 18));
		productNameLbl.setBounds(10, 11, 198, 26);
		add(productNameLbl);
		
		priceLbl = new JLabel("price lbl");
		priceLbl.setFont(new Font("HelvLight", Font.PLAIN, 14));
		priceLbl.setBounds(580, 18, 46, 14);
		add(priceLbl);
		
		amountSpinner = new JSpinner();
		amountSpinner.setFont(new Font("HelvLight", Font.PLAIN, 14));
		amountSpinner.setBounds(439, 17, 37, 20);
		add(amountSpinner);
		
		addBtn = new JButton("L\u00E4gg till");
		addBtn.setFont(new Font("HelvLight", Font.PLAIN, 12));
		addBtn.setBounds(479, 17, 91, 20);
		add(addBtn);
		
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

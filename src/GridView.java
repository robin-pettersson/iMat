import javax.swing.*;

import java.awt.Font;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

import java.awt.Dimension;

import se.chalmers.ait.dat215.project.Product;

import java.awt.Color;
import java.awt.SystemColor;


public class GridView extends JPanel {

	private JLabel productNameLbl;
	private JLabel priceLbl;
	private JSpinner amountSpinner;
	private JButton buyBtn;
	JLabel pictureLbl;
	
	private RegisterController reg = RegisterController.getInstance();
	private JLabel starLbl;
	
	public GridView(String name, double pris, ImageIcon image) {
		
		setBackground(Color.LIGHT_GRAY);
		setPreferredSize(new Dimension(150, 150));
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(null);
		
		productNameLbl = new JLabel(name);
		productNameLbl.setForeground(Color.WHITE);
		productNameLbl.setName("productNameLbl");
		productNameLbl.setFont(new Font("HelvLight", Font.BOLD, 18));
		productNameLbl.setHorizontalAlignment(SwingConstants.LEFT);
		productNameLbl.setBounds(5, 5, 144, 22);
		add(productNameLbl);
		
		priceLbl = new JLabel(pris + " kr");
		priceLbl.setFont(new Font("HelvLight", Font.PLAIN, 13));
		priceLbl.setHorizontalAlignment(SwingConstants.CENTER);
		priceLbl.setBounds(0, 121, 51, 17);
		add(priceLbl);
		
		amountSpinner = new JSpinner();
		amountSpinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		amountSpinner.setName("amountSpinner");
		amountSpinner.setFont(new Font("HelvLight", Font.PLAIN, 13));
		amountSpinner.setBounds(47, 119, 34, 20);
		add(amountSpinner);
		
		buyBtn = new JButton("Add");
		buyBtn.setToolTipText("Add this item to cart");
		buyBtn.setForeground(Color.DARK_GRAY);
		buyBtn.setBackground(SystemColor.window);
		buyBtn.addMouseListener(reg);
		buyBtn.setName("buyBtn");
		buyBtn.setFont(new Font("HelvLight", Font.PLAIN, 12));
		buyBtn.setBounds(87, 119, 58, 20);
		add(buyBtn);
		
		starLbl = new JLabel("");
		starLbl.setIcon(new ImageIcon(GridView.class.getResource("/stars20/omarkerad20.png")));
		starLbl.setBounds(125, 5, 21, 20);
		add(starLbl);
		
		pictureLbl = new JLabel(image);
		pictureLbl.setBackground(Color.WHITE);
		pictureLbl.setBounds(5, 5, 140, 140);
		add(pictureLbl);
		repaint();
		
	}
	
	/**
	 * sets the name of the product.
	 * @param product
	 */
	public void setName (Product product) {
		productNameLbl.setText(product.getName());
		//productNameLbl.repaint();
	}
	
	/**
	 * Sets the price of the product (in the view).
	 * @param the product
	 */
	public void setPrice (Product product) {
		priceLbl.setText(product.getPrice() + "");
		//priceLbl.repaint();
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
}

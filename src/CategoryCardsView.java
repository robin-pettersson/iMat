import javax.swing.*;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

import se.chalmers.ait.dat215.project.Product;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;


public class CategoryCardsView extends JPanel {

	
	JLabel pictureLbl;
	JLabel categoryNameLbl;
	
	public CategoryCardsView() {
		setBackground(Color.LIGHT_GRAY);
		setPreferredSize(new Dimension(160, 170));
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(null);
		
		categoryNameLbl = new JLabel("New label");
		categoryNameLbl.setForeground(Color.WHITE);
		categoryNameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		categoryNameLbl.setFont(new Font("HelvLight", Font.BOLD, 18));
		categoryNameLbl.setBounds(5, 11, 150, 18);
		add(categoryNameLbl);
		
		pictureLbl = new JLabel("pic");
		pictureLbl.setBounds(5, 40, 150, 125);
		add(pictureLbl);
	}
	
	/**
	 * sets the name of the category.
	 * @param product
	 */
	
	//TODO hitta kategorinamnen!
	public void setName (Product product) {
		categoryNameLbl.setText(product.getName());
		categoryNameLbl.repaint();
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
}

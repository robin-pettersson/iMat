
import javax.swing.*;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Dimension;
import se.chalmers.ait.dat215.project.Product;


public class GridView extends JPanel {

	private JLabel productNameLbl;
	private JLabel priceLbl;
	private JSpinner amountSpinner;
	private JButton buyBtn;
	private JLabel pictureLbl;
	
	public GridView() {
		setPreferredSize(new Dimension(160, 160));
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(null);
		
		productNameLbl = new JLabel("warename");
		productNameLbl.setFont(new Font("HelvLight", Font.PLAIN, 18));
		productNameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		productNameLbl.setBounds(5, 5, 150, 22);
		add(productNameLbl);
		
		priceLbl = new JLabel("price");
		priceLbl.setFont(new Font("HelvLight", Font.PLAIN, 14));
		priceLbl.setHorizontalAlignment(SwingConstants.CENTER);
		priceLbl.setBounds(5, 140, 37, 14);
		add(priceLbl);
		
		amountSpinner = new JSpinner();
		amountSpinner.setFont(new Font("HelvLight", Font.PLAIN, 14));
		amountSpinner.setBounds(47, 135, 37, 20);
		add(amountSpinner);
		
		buyBtn = new JButton("L\u00E4gg till");
		buyBtn.setFont(new Font("HelvLight", Font.PLAIN, 12));
		buyBtn.setBounds(87, 135, 69, 20);
		add(buyBtn);
		
		pictureLbl = new JLabel("pic");
		pictureLbl.setBounds(5, 5, 150, 150);
		add(pictureLbl);
		
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
}

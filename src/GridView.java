import javax.swing.*;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Dimension;
import se.chalmers.ait.dat215.project.Product;
import java.awt.Color;


public class GridView extends JPanel {

	private JLabel productNameLbl;
	private JLabel priceLbl;
	private JSpinner amountSpinner;
	private JButton buyBtn;
	JLabel pictureLbl;
	
	private RegisterController reg = RegisterController.getInstance();
	
	public GridView(String name, double pris) {
		
		setBackground(Color.GRAY);
		setPreferredSize(new Dimension(170, 170));
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(null);
		
		productNameLbl = new JLabel(name);
		productNameLbl.setForeground(Color.WHITE);
		productNameLbl.setName("productNameLbl");
		productNameLbl.setFont(new Font("HelvLight", Font.BOLD, 18));
		productNameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		productNameLbl.setBounds(5, 5, 150, 22);
		add(productNameLbl);
		
		priceLbl = new JLabel(pris + " kr");
		priceLbl.setFont(new Font("HelvLight", Font.PLAIN, 14));
		priceLbl.setHorizontalAlignment(SwingConstants.CENTER);
		priceLbl.setBounds(5, 147, 63, 17);
		add(priceLbl);
		
		amountSpinner = new JSpinner();
		amountSpinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		amountSpinner.setName("amountSpinner");
		amountSpinner.setFont(new Font("HelvLight", Font.PLAIN, 14));
		amountSpinner.setBounds(67, 145, 37, 20);
		add(amountSpinner);
		
		buyBtn = new JButton("Add");
		buyBtn.addMouseListener(reg);
		buyBtn.setName("buyBtn");
		buyBtn.setFont(new Font("HelvLight", Font.PLAIN, 12));
		buyBtn.setBounds(108, 145, 58, 20);
		add(buyBtn);
		
		pictureLbl = new JLabel("pic");
		pictureLbl.setBackground(Color.PINK);
		pictureLbl.setBounds(5, 5, 160, 160);
		add(pictureLbl);
		
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
		//TODO behöver hjälp. hur sätter jag mha referens till objektet bilden?
		pictureLbl.setText("");
		//picLbl.setIcon(product.getImageName());
		pictureLbl.repaint();
	}
}


import javax.swing.*;
import java.awt.Font;

public class ProductView extends JPanel{

	
	
	public ProductView() {
		setLayout(null);
		
		JLabel picLbl = new JLabel("pic 70x70pix");
		picLbl.setBounds(10, 11, 70, 14);
		add(picLbl);
		
		JLabel favoriteLbl = new JLabel("star");
		favoriteLbl.setBounds(396, 10, 46, 14);
		add(favoriteLbl);
		
		JSpinner amountSpinner = new JSpinner();
		amountSpinner.setFont(new Font("HelvLight", Font.PLAIN, 14));
		amountSpinner.setBounds(309, 270, 37, 20);
		add(amountSpinner);
		
		JButton buyBtn = new JButton("L\u00E4gg till");
		buyBtn.setFont(new Font("HelvLight", Font.PLAIN, 14));
		buyBtn.setBounds(349, 270, 91, 20);
		add(buyBtn);
		
		JLabel priceLbl = new JLabel("price");
		priceLbl.setFont(new Font("HelvLight", Font.PLAIN, 14));
		priceLbl.setBounds(394, 248, 46, 14);
		add(priceLbl);
		
		JLabel productNameLbl = new JLabel("Productname");
		productNameLbl.setFont(new Font("HelvLight", Font.PLAIN, 18));
		productNameLbl.setBounds(105, 11, 203, 20);
		add(productNameLbl);
		
		JComboBox addToListCombo = new JComboBox();
		addToListCombo.setFont(new Font("HelvLight", Font.PLAIN, 14));
		addToListCombo.setBounds(10, 270, 121, 20);
		add(addToListCombo);
		
		JButton addToListBtn = new JButton("OK");
		addToListBtn.setFont(new Font("HelvLight", Font.PLAIN, 14));
		addToListBtn.setBounds(135, 270, 91, 20);
		add(addToListBtn);
		// TODO Auto-generated constructor stub
	}
}

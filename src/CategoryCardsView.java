import javax.swing.*;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

import se.chalmers.ait.dat215.project.Product;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;


public class CategoryCardsView extends JPanel {
	JLabel categoryNameLbl;
	
	public CategoryCardsView() {
		setBackground(Color.LIGHT_GRAY);
		setPreferredSize(new Dimension(121, 121));
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(null);
		
		categoryNameLbl = new JLabel("New label");
		categoryNameLbl.setForeground(Color.WHITE);
		categoryNameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		categoryNameLbl.setFont(new Font("HelvLight", Font.BOLD, 18));
		categoryNameLbl.setBounds(10, 11, 101, 99);
		add(categoryNameLbl);
	}
	
	

}

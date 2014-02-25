
import javax.swing.*;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;


public class GridView extends JPanel {

	public GridView() {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(null);
		
		JLabel wareNameLbl = new JLabel("warename");
		wareNameLbl.setFont(new Font("HelvLight", Font.PLAIN, 18));
		wareNameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		wareNameLbl.setBounds(5, 5, 150, 22);
		add(wareNameLbl);
		
		JLabel priceLbl = new JLabel("price");
		priceLbl.setFont(new Font("HelvLight", Font.PLAIN, 14));
		priceLbl.setHorizontalAlignment(SwingConstants.CENTER);
		priceLbl.setBounds(5, 140, 37, 14);
		add(priceLbl);
		
		JSpinner amountSpinner = new JSpinner();
		amountSpinner.setFont(new Font("HelvLight", Font.PLAIN, 14));
		amountSpinner.setBounds(47, 135, 37, 20);
		add(amountSpinner);
		
		JButton buyBtn = new JButton("L\u00E4gg till");
		buyBtn.setFont(new Font("HelvLight", Font.PLAIN, 12));
		buyBtn.setBounds(87, 135, 69, 20);
		add(buyBtn);
		
		JLabel pictureLbl = new JLabel("pic");
		pictureLbl.setBounds(5, 5, 150, 150);
		add(pictureLbl);
		// TODO Auto-generated constructor stub
	}
}


import javax.swing.*;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;


public class GridView extends JPanel {

	public GridView() {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(null);
		
		JLabel wareNameLbl = new JLabel("warename");
		wareNameLbl.setFont(new Font("HelvLight", Font.PLAIN, 16));
		wareNameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		wareNameLbl.setBounds(5, 81, 113, 22);
		add(wareNameLbl);
		
		JLabel pictureLbl = new JLabel("pic");
		pictureLbl.setBounds(5, 5, 110, 110);
		add(pictureLbl);
		
		JLabel priceLbl = new JLabel("price");
		priceLbl.setFont(new Font("HelvLight", Font.PLAIN, 14));
		priceLbl.setHorizontalAlignment(SwingConstants.CENTER);
		priceLbl.setBounds(37, 100, 46, 14);
		add(priceLbl);
		// TODO Auto-generated constructor stub
	}
}


import javax.swing.*;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class ListView extends JPanel {
	
	JLabel pictureLbl;
	JLabel wareNameLbl;
	JLabel priceLbl;
	
	public ListView() {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(null);
		
		pictureLbl = new JLabel("pic");
		pictureLbl.setBounds(10, 11, 46, 14);
		add(pictureLbl);
		
		wareNameLbl = new JLabel("WareName");
		wareNameLbl.setFont(new Font("HelvLight", Font.PLAIN, 18));
		wareNameLbl.setBounds(120, 11, 198, 26);
		add(wareNameLbl);
		
		priceLbl = new JLabel("price lbl");
		priceLbl.setFont(new Font("HelvLight", Font.PLAIN, 14));
		priceLbl.setBounds(580, 75, 46, 14);
		add(priceLbl);
		// TODO Auto-generated constructor stub
	}
	
	public void setName () {
		
	}
}

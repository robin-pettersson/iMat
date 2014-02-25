
import javax.swing.*;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class ListView extends JPanel {
	JLabel wareNameLbl;
	JLabel priceLbl;
	
	public ListView() {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(null);
		
		wareNameLbl = new JLabel("WareName");
		wareNameLbl.setFont(new Font("HelvLight", Font.PLAIN, 18));
		wareNameLbl.setBounds(10, 11, 198, 26);
		add(wareNameLbl);
		
		priceLbl = new JLabel("price lbl");
		priceLbl.setFont(new Font("HelvLight", Font.PLAIN, 14));
		priceLbl.setBounds(580, 18, 46, 14);
		add(priceLbl);
		
		JSpinner amountSpinner = new JSpinner();
		amountSpinner.setFont(new Font("HelvLight", Font.PLAIN, 14));
		amountSpinner.setBounds(439, 17, 37, 20);
		add(amountSpinner);
		
		JButton addBtn = new JButton("L\u00E4gg till");
		addBtn.setFont(new Font("HelvLight", Font.PLAIN, 12));
		addBtn.setBounds(479, 17, 91, 20);
		add(addBtn);
		// TODO Auto-generated constructor stub
	}
	
	public void setName () {
		
	}
}

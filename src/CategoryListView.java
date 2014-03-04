
import javax.swing.*;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Font;

public class CategoryListView extends JPanel {

	public CategoryListView() {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JLabel categoryNameLbl = new JLabel("New label");
		categoryNameLbl.setForeground(Color.WHITE);
		categoryNameLbl.setFont(new Font("HelvLight", Font.BOLD, 18));
		categoryNameLbl.setBounds(10, 11, 190, 38);
		add(categoryNameLbl);
		// TODO Auto-generated constructor stub
	}

}

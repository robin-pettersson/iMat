import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import java.awt.SystemColor;


public class ListPopUp extends JPanel {

	/**
	 * Create the panel.
	 */
	public ListPopUp() {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(0, 0, 461, 33);
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblListname = new JLabel("Listname (4 Products)");
		lblListname.setForeground(Color.DARK_GRAY);
		panel_1.add(lblListname);
		lblListname.setFont(new Font("HelvLight", Font.PLAIN, 20));
		
		JLabel lblAddToCart = new JLabel("Add to cart");
		lblAddToCart.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblAddToCart.setForeground(Color.DARK_GRAY);
		lblAddToCart.setFont(new Font("HelvLight", Font.BOLD, 14));
		panel_1.add(lblAddToCart, BorderLayout.EAST);

	}

}

import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.SwingConstants;


public class RightShoppingCart extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public RightShoppingCart() {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(0, 0, 192, 541);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblShoppingCart = new JLabel("Shopping Cart");
		lblShoppingCart.setBounds(12, 12, 105, 20);
		lblShoppingCart.setForeground(Color.DARK_GRAY);
		lblShoppingCart.setFont(new Font("HelvLight", Font.PLAIN, 16));
		panel.add(lblShoppingCart);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 44, 168, 438);
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		table.setForeground(Color.DARK_GRAY);
		table.setFont(new Font("HelvLight", Font.PLAIN, 12));
		table.setBackground(Color.LIGHT_GRAY);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"New column", "New column"
			}
		));
		panel_1.add(table);
		
		JLabel lblTotaly = new JLabel("Sum: 340 kr");
		lblTotaly.setBackground(Color.LIGHT_GRAY);
		lblTotaly.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotaly.setForeground(Color.DARK_GRAY);
		lblTotaly.setFont(new Font("HelvLight", Font.PLAIN, 16));
		panel_1.add(lblTotaly, BorderLayout.SOUTH);
		
		JButton btnCheckOut = new JButton("Check out");
		btnCheckOut.setToolTipText("Sök Produkt");
		btnCheckOut.setForeground(Color.DARK_GRAY);
		btnCheckOut.setFont(new Font("HelvLight", Font.PLAIN, 14));
		btnCheckOut.setBackground(SystemColor.window);
		btnCheckOut.setBounds(75, 494, 105, 35);
		panel.add(btnCheckOut);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setToolTipText("Sök Produkt");
		btnEdit.setForeground(Color.DARK_GRAY);
		btnEdit.setFont(new Font("HelvLight", Font.PLAIN, 14));
		btnEdit.setBackground(SystemColor.window);
		btnEdit.setBounds(12, 494, 59, 35);
		panel.add(btnEdit);

	}
}

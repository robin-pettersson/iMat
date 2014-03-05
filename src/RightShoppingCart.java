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
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;


public class RightShoppingCart extends JPanel {
	
	public JTable table;
	public JPanel panel;
	public JLabel lblTotaly; 
	private static RightShoppingCart rCart = null;
	
	CartController cartController = CartController.getInstance();

	/**
	 * Create the panel.
	 */
	public RightShoppingCart() {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(0, 0, 192, 541);
		panel.setLayout(null);
		
		JLabel lblShoppingCart = new JLabel("Shopping Cart");
		lblShoppingCart.setBounds(12, 12, 105, 20);
		lblShoppingCart.setForeground(Color.DARK_GRAY);
		lblShoppingCart.setFont(new Font("HelvLight", Font.PLAIN, 16));
		panel.add(lblShoppingCart);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 44, 168, 411);
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		table.setEnabled(false);
		table.setName("table");
		table.setSelectionBackground(new Color(184, 207, 229));
		table.setShowGrid(false);
		table.setShowVerticalLines(false);
		table.setShowHorizontalLines(false);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBorder(null);
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
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"New column", "New column"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(30);
		table.getColumnModel().getColumn(1).setMinWidth(25);
		panel_1.add(table);
		
		lblTotaly = new JLabel("");
		lblTotaly.setOpaque(true);
		lblTotaly.setBackground(Color.LIGHT_GRAY);
		lblTotaly.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotaly.setForeground(Color.DARK_GRAY);
		lblTotaly.setFont(new Font("HelvLight", Font.PLAIN, 16));
		panel_1.add(lblTotaly, BorderLayout.SOUTH);
		
		JButton btnCheckOut = new JButton("Check out");
		btnCheckOut.setName("btnCheckOut");
		btnCheckOut.addMouseListener(cartController);
		btnCheckOut.setToolTipText("Proceed to check out");
		btnCheckOut.setForeground(Color.DARK_GRAY);
		btnCheckOut.setFont(new Font("HelvLight", Font.PLAIN, 14));
		btnCheckOut.setBackground(SystemColor.window);
		btnCheckOut.setBounds(75, 494, 105, 27);
		panel.add(btnCheckOut);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setName("btnEdit");
		btnEdit.addMouseListener(cartController);
		btnEdit.setToolTipText("Edit shopping cart");
		btnEdit.setForeground(Color.DARK_GRAY);
		btnEdit.setFont(new Font("HelvLight", Font.PLAIN, 14));
		btnEdit.setBackground(SystemColor.window);
		btnEdit.setBounds(12, 494, 59, 27);
		panel.add(btnEdit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(635, 35));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(12, 460, 168, 25);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label = new JLabel("<<");
		label.setBounds(15, 0, 28, 21);
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setToolTipText("F\u00C3\u00B6reg\u00C3\u00A5ende");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(Color.GRAY);
		label.setFont(new Font("HelvLight", Font.BOLD, 14));
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("1/1");
		label_1.setBounds(68, 0, 32, 21);
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		label_1.setToolTipText("Current page");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.GRAY);
		label_1.setFont(new Font("HelvLight", Font.BOLD, 14));
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel(">>");
		label_2.setBounds(125, 0, 28, 21);
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		label_2.setToolTipText("N\u00C3\u00A4sta");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setForeground(Color.GRAY);
		label_2.setFont(new Font("HelvLight", Font.BOLD, 14));
		panel_2.add(label_2);

	}
	
	public static RightShoppingCart getInstance(){
		if(rCart == null){
			rCart = new RightShoppingCart();
		}
		return rCart;
	}
}

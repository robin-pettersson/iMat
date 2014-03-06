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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.Cursor;


public class RightShoppingCart extends JPanel {
	
	public JTable table;
	public JPanel panel;
	public JLabel lblTotaly;
	public JLabel pageLabel;
	private static RightShoppingCart rCart = null;
	
	int index = 0;
	
	CartController cartController = CartController.getInstance();
	iMatMainController mainController = iMatMainController.getInstance();
	CheckOutController checkOutController = CheckOutController.getInstance();
	

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
		
		final JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 44, 168, 411);
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		table = makeTable();
		panel_1.add(table);
		
		lblTotaly = new JLabel("");
		lblTotaly.setOpaque(true);
		lblTotaly.setBackground(Color.LIGHT_GRAY);
		lblTotaly.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotaly.setForeground(Color.DARK_GRAY);
		lblTotaly.setFont(new Font("HelvLight", Font.PLAIN, 16));
		panel_1.add(lblTotaly, BorderLayout.SOUTH);
		
		JButton btnCheckOut = new JButton("Check out");
		btnCheckOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel p = (JPanel) panel.getParent().getParent().getComponent(1);
				mainController.gotoCard(p , "checkOutPanel");
				checkOutController.gotoCheckOut(p);
			}
		});		btnCheckOut.setName("btnCheckOut");
		btnCheckOut.setToolTipText("Proceed to check out");
		btnCheckOut.setForeground(Color.DARK_GRAY);
		btnCheckOut.setFont(new Font("HelvLight", Font.PLAIN, 14));
		btnCheckOut.setBackground(SystemColor.window);
		btnCheckOut.setBounds(75, 494, 105, 27);
		panel.add(btnCheckOut);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setName("btnEdit");
		btnEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel p = (JPanel) panel.getParent().getParent().getComponent(1);
				checkOutController.gotoCart(p);
				mainController.gotoCard(p , "checkOutPanel");
			}
		});
		btnEdit.setToolTipText("Edit shopping cart");
		btnEdit.setForeground(Color.DARK_GRAY);
		btnEdit.setFont(new Font("HelvLight", Font.PLAIN, 14));
		btnEdit.setBackground(SystemColor.window);
		btnEdit.setBounds(12, 494, 59, 27);
		panel.add(btnEdit);
		
		final JPanel panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(635, 35));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(12, 460, 168, 25);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		pageLabel = new JLabel("1/1");
		pageLabel.setBounds(68, 0, 32, 21);
		pageLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		pageLabel.setToolTipText("Current page");
		pageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pageLabel.setForeground(Color.GRAY);
		pageLabel.setFont(new Font("HelvLight", Font.BOLD, 14));
		panel_2.add(pageLabel);
		
		final JLabel forwardLabel = new JLabel(">>");
		forwardLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		forwardLabel.setEnabled(false);
		
		if(RegisterController.tablesList.size() > 1){
			forwardLabel.setEnabled(true);
		}
		forwardLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int tableSize = RegisterController.tablesList.size();
				if(tableSize > 1 && !(RegisterController.tablesList.isEmpty()) && (index + 1) < tableSize){
					index ++;
					System.out.println(index);
					
					
					JTable newTable = RegisterController.tablesList.get(index);
					panel_1.remove(table);
					table = newTable;
					panel_1.add(table);
					panel_1.revalidate();
					panel_1.repaint();
					
					if(index == tableSize){
						forwardLabel.setEnabled(false);
						panel_2.revalidate();
					}
					
				}
			}
		});
		
		forwardLabel.setBounds(125, 0, 28, 21);
		forwardLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		forwardLabel.setToolTipText("N\u00C3\u00A4sta");
		forwardLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		forwardLabel.setForeground(Color.GRAY);
		forwardLabel.setFont(new Font("HelvLight", Font.BOLD, 14));
		panel_2.add(forwardLabel);
		
		
		final JLabel backLabel = new JLabel("<<");
		backLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		backLabel.setEnabled(false);
		
		if(index > 0){
			backLabel.setEnabled(true);
		}
		
		backLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(index > 0){
					index --;
					
					System.out.println(index);
					JTable oldTable = RegisterController.tablesList.get(index);
					panel_1.remove(table);
					table = oldTable;
					panel_1.add(table);
					panel_1.revalidate();
					panel_1.repaint();
					
					if(index == 0){
						backLabel.setEnabled(false);
						panel_2.revalidate();
					}
					
				}
			}
		});
		
		backLabel.setBounds(15, 0, 28, 21);
		backLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		backLabel.setToolTipText("F\u00C3\u00B6reg\u00C3\u00A5ende");
		backLabel.setHorizontalAlignment(SwingConstants.LEFT);
		backLabel.setForeground(Color.GRAY);
		backLabel.setFont(new Font("HelvLight", Font.BOLD, 14));
		panel_2.add(backLabel);
		

	}
	
	public static RightShoppingCart getInstance(){
		if(rCart == null){
			rCart = new RightShoppingCart();
		}
		return rCart;
	}
	
	public JTable makeTable(){
		
		JTable table = new JTable();
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
		
		return table;
	}
}
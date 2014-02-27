import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Preview extends JPanel {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Preview() {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setPreferredSize(new Dimension(635, 550));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		add(panel);
		panel.setLayout(null);
		
		JPanel deliveryAddressPanel = new JPanel();
		deliveryAddressPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		deliveryAddressPanel.setBackground(Color.LIGHT_GRAY);
		deliveryAddressPanel.setBounds(0, 90, 629, 123);
		panel.add(deliveryAddressPanel);
		deliveryAddressPanel.setLayout(null);
		
		JLabel label = new JLabel("Firstname Lastname");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("HelvLight", Font.PLAIN, 16));
		label.setBounds(12, 12, 252, 17);
		deliveryAddressPanel.add(label);
		
		JLabel label_1 = new JLabel("Streetaddress 88");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setForeground(Color.DARK_GRAY);
		label_1.setFont(new Font("HelvLight", Font.PLAIN, 16));
		label_1.setBounds(12, 41, 252, 17);
		deliveryAddressPanel.add(label_1);
		
		JLabel label_2 = new JLabel("928 82 Towncity");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setForeground(Color.DARK_GRAY);
		label_2.setFont(new Font("HelvLight", Font.PLAIN, 16));
		label_2.setBounds(12, 70, 252, 17);
		deliveryAddressPanel.add(label_2);
		
		JLabel lblYouremailemailcom = new JLabel("youremail@email.com");
		lblYouremailemailcom.setHorizontalAlignment(SwingConstants.LEFT);
		lblYouremailemailcom.setForeground(Color.DARK_GRAY);
		lblYouremailemailcom.setFont(new Font("HelvLight", Font.PLAIN, 16));
		lblYouremailemailcom.setBounds(12, 94, 252, 17);
		deliveryAddressPanel.add(lblYouremailemailcom);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(0, 0, 629, 37);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCheckOut = new JLabel("Preview Purchase");
		lblCheckOut.setForeground(Color.DARK_GRAY);
		lblCheckOut.setFont(new Font("HelvLight", Font.PLAIN, 18));
		lblCheckOut.setBounds(12, 0, 230, 37);
		panel_2.add(lblCheckOut);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		panel_3.setBounds(0, 60, 629, 28);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblPayingMethod = new JLabel("Delivery Address");
		lblPayingMethod.setBounds(12, 0, 129, 20);
		panel_3.add(lblPayingMethod);
		lblPayingMethod.setForeground(Color.DARK_GRAY);
		lblPayingMethod.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		panel_1.setBounds(0, 215, 629, 28);
		panel.add(panel_1);
		
		JLabel lblDeliveryInformaiton = new JLabel("Products");
		lblDeliveryInformaiton.setForeground(Color.DARK_GRAY);
		lblDeliveryInformaiton.setFont(new Font("HelvLight", Font.PLAIN, 14));
		lblDeliveryInformaiton.setBounds(12, 0, 171, 20);
		panel_1.add(lblDeliveryInformaiton);
		
		JPanel productsPanel = new JPanel();
		productsPanel.setLayout(null);
		productsPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		productsPanel.setBackground(Color.LIGHT_GRAY);
		productsPanel.setBounds(0, 245, 629, 299);
		panel.add(productsPanel);
		
		JButton button = new JButton("Cancel");
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font("HelvLight", Font.PLAIN, 14));
		button.setBackground(SystemColor.window);
		button.setBounds(430, 258, 84, 27);
		productsPanel.add(button);
		
		JButton button_1 = new JButton("Confirm");
		button_1.setForeground(Color.DARK_GRAY);
		button_1.setFont(new Font("HelvLight", Font.PLAIN, 14));
		button_1.setBackground(SystemColor.window);
		button_1.setBounds(526, 258, 91, 27);
		productsPanel.add(button_1);
		
		JLabel lblSumKr = new JLabel("Sum: 283 kr");
		lblSumKr.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSumKr.setForeground(Color.DARK_GRAY);
		lblSumKr.setFont(new Font("HelvLight", Font.PLAIN, 18));
		lblSumKr.setBounds(430, 224, 187, 17);
		productsPanel.add(lblSumKr);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Apples - Granny Smith", "5 pcs", "45 kr"},
				{"Apples - Granny Smith", "12 pcs", "34 kr"},
				{"Apples - Granny Smith", "2 pcs", "99 kr"},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(400);
		table.getColumnModel().getColumn(1).setPreferredWidth(15);
		table.getColumnModel().getColumn(2).setPreferredWidth(15);
		table.setRowSelectionAllowed(false);
		table.setFont(new Font("HelvLight", Font.PLAIN, 16));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBackground(Color.LIGHT_GRAY);
		table.setBounds(12, 12, 605, 200);
		productsPanel.add(table);
		
		JButton btnBack = new JButton("Back to check out");
		btnBack.setToolTipText("Return to check out");
		btnBack.setForeground(Color.DARK_GRAY);
		btnBack.setFont(new Font("HelvLight", Font.PLAIN, 14));
		btnBack.setBackground(SystemColor.window);
		btnBack.setBounds(12, 260, 149, 27);
		productsPanel.add(btnBack);
		
		JLabel label_3 = new JLabel("> Check out");
		label_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_3.setToolTipText("Back to check out");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("HelvLight", Font.BOLD, 14));
		label_3.setBounds(47, 36, 96, 20);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Cart");
		label_4.setToolTipText("Return to shopping cart");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("HelvLight", Font.BOLD, 14));
		label_4.setBounds(10, 36, 35, 20);
		panel.add(label_4);
		
		JLabel lblPreview = new JLabel("> Preview");
		lblPreview.setCursor(Cursor.getPredefinedCursor(Cursor.SW_RESIZE_CURSOR));
		lblPreview.setToolTipText("You are here");
		lblPreview.setForeground(Color.DARK_GRAY);
		lblPreview.setFont(new Font("HelvLight", Font.BOLD, 14));
		lblPreview.setBounds(142, 36, 96, 20);
		panel.add(lblPreview);

	}
}

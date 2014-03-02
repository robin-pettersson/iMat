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
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;


public class Preview extends JPanel {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable productsTable;

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
		deliveryAddressPanel.setBorder(null);
		deliveryAddressPanel.setBackground(Color.LIGHT_GRAY);
		deliveryAddressPanel.setBounds(10, 90, 213, 123);
		panel.add(deliveryAddressPanel);
		deliveryAddressPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel fullNameLabel = new JLabel("Firstname Lastname");
		fullNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		fullNameLabel.setForeground(Color.DARK_GRAY);
		fullNameLabel.setFont(new Font("HelvLight", Font.PLAIN, 14));
		deliveryAddressPanel.add(fullNameLabel);
		
		JLabel streetLabel = new JLabel("Streetaddress 88");
		deliveryAddressPanel.add(streetLabel);
		streetLabel.setHorizontalAlignment(SwingConstants.LEFT);
		streetLabel.setForeground(Color.DARK_GRAY);
		streetLabel.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JLabel zipTownLabel = new JLabel("928 82 Towncity");
		deliveryAddressPanel.add(zipTownLabel);
		zipTownLabel.setHorizontalAlignment(SwingConstants.LEFT);
		zipTownLabel.setForeground(Color.DARK_GRAY);
		zipTownLabel.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JLabel emailLabel = new JLabel("youremail@email.com");
		deliveryAddressPanel.add(emailLabel);
		emailLabel.setHorizontalAlignment(SwingConstants.LEFT);
		emailLabel.setForeground(Color.DARK_GRAY);
		emailLabel.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JLabel deliveryLabel = new JLabel("Delivery: 28/10/2014");
		deliveryAddressPanel.add(deliveryLabel);
		deliveryLabel.setHorizontalAlignment(SwingConstants.LEFT);
		deliveryLabel.setForeground(Color.DARK_GRAY);
		deliveryLabel.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
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
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setForeground(Color.DARK_GRAY);
		cancelButton.setFont(new Font("HelvLight", Font.PLAIN, 14));
		cancelButton.setBackground(SystemColor.window);
		cancelButton.setBounds(430, 258, 84, 27);
		productsPanel.add(cancelButton);
		
		JButton confirmButton = new JButton("Confirm");
		confirmButton.setForeground(Color.DARK_GRAY);
		confirmButton.setFont(new Font("HelvLight", Font.PLAIN, 14));
		confirmButton.setBackground(SystemColor.window);
		confirmButton.setBounds(526, 258, 91, 27);
		productsPanel.add(confirmButton);
		
		JLabel lblSumKr = new JLabel("Sum: 283 kr");
		lblSumKr.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSumKr.setForeground(Color.DARK_GRAY);
		lblSumKr.setFont(new Font("HelvLight", Font.PLAIN, 18));
		lblSumKr.setBounds(430, 224, 187, 17);
		productsPanel.add(lblSumKr);
		
		productsTable = new JTable();
		productsTable.setModel(new DefaultTableModel(
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
		productsTable.getColumnModel().getColumn(0).setPreferredWidth(400);
		productsTable.getColumnModel().getColumn(1).setPreferredWidth(15);
		productsTable.getColumnModel().getColumn(2).setPreferredWidth(15);
		productsTable.setRowSelectionAllowed(false);
		productsTable.setFont(new Font("HelvLight", Font.PLAIN, 16));
		productsTable.setBorder(new LineBorder(new Color(0, 0, 0)));
		productsTable.setBackground(Color.LIGHT_GRAY);
		productsTable.setBounds(12, 12, 605, 200);
		productsPanel.add(productsTable);
		
		JButton backButton = new JButton("Back to check out");
		backButton.setToolTipText("Return to check out");
		backButton.setForeground(Color.DARK_GRAY);
		backButton.setFont(new Font("HelvLight", Font.PLAIN, 14));
		backButton.setBackground(SystemColor.window);
		backButton.setBounds(12, 260, 149, 27);
		productsPanel.add(backButton);
		
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

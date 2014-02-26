import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import javax.swing.UIManager;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CustomerTabView extends JPanel {
	private JTextField txtFrnamn;
	private JTextField txtEfternamn;
	private JTextField txtLngagatan;
	private JTextField txtSderkping;
	private JTextField emailTextField;
	private JTextField textField;
	private JPasswordField pwdLsenord;
	private JPasswordField passwordField;
	private JTable receiptTable;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public CustomerTabView() {
		setPreferredSize(new Dimension(635, 550));
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabPanel = new JTabbedPane(JTabbedPane.TOP);
		tabPanel.setFont(new Font("HelvLight", Font.PLAIN, 15));
		tabPanel.setBackground(Color.LIGHT_GRAY);
		add(tabPanel);
		
		JPanel customerTab = new JPanel();
		customerTab.setBackground(Color.LIGHT_GRAY);
		tabPanel.addTab("Personal info", null, customerTab, null);
		customerTab.setLayout(new CardLayout(0, 0));
		
		JPanel infoPanel = new JPanel();
		infoPanel.setBackground(Color.LIGHT_GRAY);
		customerTab.add(infoPanel, "name_18669439395135");
		
		JLabel emailLabel = new JLabel("youemail@email.com");
		emailLabel.setForeground(Color.DARK_GRAY);
		emailLabel.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel firstnameLabel = new JLabel("Firstname");
		firstnameLabel.setForeground(Color.DARK_GRAY);
		firstnameLabel.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel lastnameLabel = new JLabel("Lastname");
		lastnameLabel.setForeground(Color.DARK_GRAY);
		lastnameLabel.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel streetLabel = new JLabel("Streetname 99");
		streetLabel.setForeground(Color.DARK_GRAY);
		streetLabel.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel zipLabel = new JLabel("682 58");
		zipLabel.setForeground(Color.DARK_GRAY);
		zipLabel.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel cityLabel = new JLabel("Cityname");
		cityLabel.setForeground(Color.DARK_GRAY);
		cityLabel.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JButton changeButton = new JButton("Edit");
		changeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		changeButton.setBackground(SystemColor.window);
		changeButton.setForeground(Color.DARK_GRAY);
		changeButton.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		
		JLabel lblPersonalInformation = new JLabel("Personal Information");
		lblPersonalInformation.setForeground(Color.DARK_GRAY);
		lblPersonalInformation.setFont(new Font("HelvLight", Font.PLAIN, 14));
		lblPersonalInformation.setBounds(12, 0, 185, 20);
		panel_3.add(lblPersonalInformation);
		GroupLayout gl_infoPanel = new GroupLayout(infoPanel);
		gl_infoPanel.setHorizontalGroup(
			gl_infoPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_infoPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_infoPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_infoPanel.createSequentialGroup()
							.addGroup(gl_infoPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(emailLabel, GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
								.addGroup(gl_infoPanel.createSequentialGroup()
									.addComponent(firstnameLabel, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lastnameLabel, GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
								.addComponent(streetLabel, GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
								.addGroup(gl_infoPanel.createSequentialGroup()
									.addComponent(zipLabel)
									.addGap(18)
									.addComponent(cityLabel, GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)))
							.addGap(101))
						.addGroup(gl_infoPanel.createSequentialGroup()
							.addComponent(changeButton, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(535, Short.MAX_VALUE))))
				.addComponent(panel_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
		);
		gl_infoPanel.setVerticalGroup(
			gl_infoPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_infoPanel.createSequentialGroup()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_infoPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(firstnameLabel)
						.addComponent(lastnameLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(streetLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_infoPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(zipLabel)
						.addComponent(cityLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(emailLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(changeButton, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(339, Short.MAX_VALUE))
		);
		infoPanel.setLayout(gl_infoPanel);
		
		JPanel settingsPanel = new JPanel();
		settingsPanel.setBackground(new Color(192, 192, 192));
		customerTab.add(settingsPanel, "name_18680627031416");
		settingsPanel.setLayout(null);
		
		JPanel labelPanel = new JPanel();
		labelPanel.setBorder(null);
		labelPanel.setBackground(Color.LIGHT_GRAY);
		labelPanel.setBounds(12, 43, 151, 251);
		settingsPanel.add(labelPanel);
		labelPanel.setLayout(null);
		
		JLabel lastnameLabel2 = new JLabel("Lastname:");
		lastnameLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
		lastnameLabel2.setBounds(12, 26, 127, 20);
		labelPanel.add(lastnameLabel2);
		lastnameLabel2.setForeground(Color.DARK_GRAY);
		lastnameLabel2.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JLabel fornameLabel2 = new JLabel("Firstname:");
		fornameLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
		fornameLabel2.setBounds(12, 0, 127, 20);
		labelPanel.add(fornameLabel2);
		fornameLabel2.setForeground(Color.DARK_GRAY);
		fornameLabel2.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JLabel streetLabel2 = new JLabel("Street:");
		streetLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
		streetLabel2.setBounds(12, 58, 127, 20);
		labelPanel.add(streetLabel2);
		streetLabel2.setForeground(Color.DARK_GRAY);
		streetLabel2.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JLabel zipAndCityLabel2 = new JLabel("Zip-code and city:");
		zipAndCityLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
		zipAndCityLabel2.setBounds(12, 90, 127, 20);
		labelPanel.add(zipAndCityLabel2);
		zipAndCityLabel2.setForeground(Color.DARK_GRAY);
		zipAndCityLabel2.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JLabel emailLabel2 = new JLabel("Email:");
		emailLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
		emailLabel2.setBounds(12, 122, 127, 20);
		labelPanel.add(emailLabel2);
		emailLabel2.setForeground(Color.DARK_GRAY);
		emailLabel2.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JLabel lblLsenord = new JLabel("Password:");
		lblLsenord.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLsenord.setForeground(Color.DARK_GRAY);
		lblLsenord.setFont(new Font("HelvLight", Font.PLAIN, 14));
		lblLsenord.setBounds(12, 170, 127, 20);
		labelPanel.add(lblLsenord);
		
		JLabel lblBekrftaLsenord = new JLabel("Verify password:");
		lblBekrftaLsenord.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBekrftaLsenord.setForeground(Color.DARK_GRAY);
		lblBekrftaLsenord.setFont(new Font("HelvLight", Font.PLAIN, 14));
		lblBekrftaLsenord.setBounds(12, 197, 127, 20);
		labelPanel.add(lblBekrftaLsenord);
		
		JPanel textPanel = new JPanel();
		textPanel.setBorder(null);
		textPanel.setBackground(Color.LIGHT_GRAY);
		textPanel.setBounds(165, 43, 453, 251);
		settingsPanel.add(textPanel);
		textPanel.setLayout(null);
		
		txtFrnamn = new JTextField();
		txtFrnamn.setFont(new Font("HelvLight", Font.PLAIN, 14));
		txtFrnamn.setBounds(12, 0, 171, 19);
		textPanel.add(txtFrnamn);
		txtFrnamn.setText("Firstname");
		txtFrnamn.setColumns(10);
		
		txtEfternamn = new JTextField();
		txtEfternamn.setFont(new Font("HelvLight", Font.PLAIN, 14));
		txtEfternamn.setText("Lastname");
		txtEfternamn.setColumns(10);
		txtEfternamn.setBounds(12, 31, 171, 19);
		textPanel.add(txtEfternamn);
		
		txtLngagatan = new JTextField();
		txtLngagatan.setFont(new Font("HelvLight", Font.PLAIN, 14));
		txtLngagatan.setText("Streetname 99");
		txtLngagatan.setColumns(10);
		txtLngagatan.setBounds(12, 62, 171, 19);
		textPanel.add(txtLngagatan);
		
		txtSderkping = new JTextField();
		txtSderkping.setFont(new Font("HelvLight", Font.PLAIN, 14));
		txtSderkping.setText("Cityname");
		txtSderkping.setColumns(10);
		txtSderkping.setBounds(78, 93, 105, 19);
		textPanel.add(txtSderkping);
		
		emailTextField = new JTextField();
		emailTextField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		emailTextField.setText("youemail@gmail.com");
		emailTextField.setColumns(10);
		emailTextField.setBounds(12, 124, 171, 19);
		textPanel.add(emailTextField);
		
		textField = new JTextField();
		textField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		textField.setToolTipText("Postnummer");
		textField.setText("682 92");
		textField.setColumns(10);
		textField.setBounds(12, 93, 54, 19);
		textPanel.add(textField);
		
		pwdLsenord = new JPasswordField();
		pwdLsenord.setFont(new Font("HelvLight", Font.PLAIN, 14));
		pwdLsenord.setText("lösenord");
		pwdLsenord.setBounds(12, 173, 171, 19);
		textPanel.add(pwdLsenord);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		passwordField.setText("lösenord");
		passwordField.setBounds(12, 196, 171, 19);
		textPanel.add(passwordField);
		
		JLabel lblPasswordNeedsTo = new JLabel("Password needs to be at least 8 characters");
		lblPasswordNeedsTo.setHorizontalAlignment(SwingConstants.LEFT);
		lblPasswordNeedsTo.setForeground(Color.DARK_GRAY);
		lblPasswordNeedsTo.setFont(new Font("HelvLight", Font.ITALIC, 12));
		lblPasswordNeedsTo.setBounds(12, 214, 262, 20);
		textPanel.add(lblPasswordNeedsTo);
		
		JLabel lblReceiptsWillBe = new JLabel("Receipts will be sent to this email");
		lblReceiptsWillBe.setHorizontalAlignment(SwingConstants.LEFT);
		lblReceiptsWillBe.setForeground(Color.DARK_GRAY);
		lblReceiptsWillBe.setFont(new Font("HelvLight", Font.ITALIC, 12));
		lblReceiptsWillBe.setBounds(12, 144, 195, 17);
		textPanel.add(lblReceiptsWillBe);
		
		JButton saveButton = new JButton("Save");
		saveButton.setBounds(545, 474, 73, 27);
		settingsPanel.add(saveButton);
		saveButton.setForeground(Color.DARK_GRAY);
		saveButton.setFont(new Font("HelvLight", Font.PLAIN, 14));
		saveButton.setBackground(SystemColor.window);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setForeground(Color.DARK_GRAY);
		cancelButton.setFont(new Font("HelvLight", Font.PLAIN, 14));
		cancelButton.setBackground(SystemColor.window);
		cancelButton.setBounds(445, 474, 88, 27);
		settingsPanel.add(cancelButton);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		panel_4.setBounds(0, 0, 624, 32);
		settingsPanel.add(panel_4);
		
		JLabel label = new JLabel("Personal Information");
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("HelvLight", Font.PLAIN, 14));
		label.setBounds(12, 0, 185, 20);
		panel_4.add(label);
		
		JPanel favouriteTab = new JPanel();
		favouriteTab.setBackground(Color.LIGHT_GRAY);
		tabPanel.addTab("Favourites", null, favouriteTab, null);
		favouriteTab.setLayout(null);
		
		JPanel favouriteContentPanel = new JPanel();
		favouriteContentPanel.setBackground(Color.LIGHT_GRAY);
		favouriteContentPanel.setBounds(0, 36, 624, 477);
		favouriteTab.add(favouriteContentPanel);
		favouriteContentPanel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		panel_2.setBounds(0, 0, 624, 32);
		favouriteTab.add(panel_2);
		
		JLabel lblFavouriteProducts = new JLabel("Favourite Products");
		lblFavouriteProducts.setForeground(Color.DARK_GRAY);
		lblFavouriteProducts.setFont(new Font("HelvLight", Font.PLAIN, 14));
		lblFavouriteProducts.setBounds(12, 0, 185, 20);
		panel_2.add(lblFavouriteProducts);
		
		JPanel listTab = new JPanel();
		listTab.setLayout(null);
		listTab.setBackground(Color.LIGHT_GRAY);
		tabPanel.addTab("Shopping Lists", null, listTab, null);
		
		JPanel shoppingListsContentPanel = new JPanel();
		shoppingListsContentPanel.setBackground(Color.LIGHT_GRAY);
		shoppingListsContentPanel.setBounds(0, 36, 624, 477);
		listTab.add(shoppingListsContentPanel);
		shoppingListsContentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		panel.setBounds(0, 0, 624, 32);
		listTab.add(panel);
		
		JLabel lblShoppingLists = new JLabel("Shopping Lists");
		lblShoppingLists.setForeground(Color.DARK_GRAY);
		lblShoppingLists.setFont(new Font("HelvLight", Font.PLAIN, 14));
		lblShoppingLists.setBounds(12, 0, 185, 20);
		panel.add(lblShoppingLists);
		
		JPanel receiptTab = new JPanel();
		receiptTab.setBackground(Color.LIGHT_GRAY);
		tabPanel.addTab("Receipts", null, receiptTab, null);
		receiptTab.setLayout(null);
		
		JPanel receiptContentPanel = new JPanel();
		receiptContentPanel.setBackground(Color.LIGHT_GRAY);
		receiptContentPanel.setBounds(0, 36, 624, 477);
		receiptTab.add(receiptContentPanel);
		receiptContentPanel.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(12, 12, 248, 453);
		receiptContentPanel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		receiptTable = new JTable();
		receiptTable.setShowVerticalLines(false);
		receiptTable.setBorder(new LineBorder(new Color(0, 0, 0)));
		receiptTable.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		receiptTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"140217", "6 pcs", "502 kr"},
				{"140214", "2 pcs", "1337 kr"},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
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
				"Date", "Amount", "Sum"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		receiptTable.getColumnModel().getColumn(0).setResizable(false);
		receiptTable.getColumnModel().getColumn(0).setPreferredWidth(60);
		receiptTable.getColumnModel().getColumn(1).setResizable(false);
		receiptTable.getColumnModel().getColumn(2).setResizable(false);
		receiptTable.getColumnModel().getColumn(2).setPreferredWidth(50);
		receiptTable.setFont(new Font("HelvLight", Font.PLAIN, 14));
		panel_5.add(receiptTable);
		
		JPanel selectedReceiptPanel = new JPanel();
		selectedReceiptPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		selectedReceiptPanel.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		selectedReceiptPanel.setBounds(272, 12, 340, 453);
		receiptContentPanel.add(selectedReceiptPanel);
		selectedReceiptPanel.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setBackground(Color.LIGHT_GRAY);
		panel_7.setBounds(0, 0, 340, 38);
		selectedReceiptPanel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel dateLabel = new JLabel("140217");
		dateLabel.setForeground(Color.DARK_GRAY);
		dateLabel.setFont(new Font("HelvLight", Font.PLAIN, 16));
		panel_7.add(dateLabel);
		
		JLabel closeLabel = new JLabel("X");
		closeLabel.setToolTipText("Delete Receipt");
		closeLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		closeLabel.setForeground(Color.RED);
		closeLabel.setFont(new Font("Dialog", Font.BOLD, 24));
		panel_7.add(closeLabel, BorderLayout.EAST);
		
		table = new JTable();
		table.setRowSelectionAllowed(false);
		table.setShowVerticalLines(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Bananas - Dole", "44 pcs", "32 kr"},
				{"Apples - Granny Smith", "5 pcs", "25 kr"},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
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
				"Product", "Amount", "Sum"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(125);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(15);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(25);
		table.setFont(new Font("HelvLight", Font.PLAIN, 14));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		table.setBounds(0, 36, 340, 381);
		selectedReceiptPanel.add(table);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_6.setBounds(0, 415, 340, 38);
		selectedReceiptPanel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel label_2 = new JLabel("1/2");
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		label_2.setToolTipText("Page 1 av 2");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.GRAY);
		label_2.setFont(new Font("HelvLight", Font.BOLD, 16));
		panel_6.add(label_2, BorderLayout.CENTER);
		
		JLabel label_3 = new JLabel(">>");
		label_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_3.setVerticalAlignment(SwingConstants.BOTTOM);
		label_3.setToolTipText("Next");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setForeground(Color.DARK_GRAY);
		label_3.setFont(new Font("HelvLight", Font.BOLD, 16));
		panel_6.add(label_3, BorderLayout.EAST);
		
		JLabel label_4 = new JLabel("<<");
		label_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_4.setVerticalAlignment(SwingConstants.BOTTOM);
		label_4.setToolTipText("Previous");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setForeground(Color.GRAY);
		label_4.setFont(new Font("HelvLight", Font.BOLD, 16));
		panel_6.add(label_4, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		panel_1.setBounds(0, 0, 624, 32);
		receiptTab.add(panel_1);
		
		JLabel lblReceipts = new JLabel("Receipts");
		lblReceipts.setForeground(Color.DARK_GRAY);
		lblReceipts.setFont(new Font("HelvLight", Font.PLAIN, 14));
		lblReceipts.setBounds(12, 0, 185, 20);
		panel_1.add(lblReceipts);

	}
}

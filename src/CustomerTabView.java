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


public class CustomerTabView extends JPanel {
	private JTextField txtFrnamn;
	private JTextField txtEfternamn;
	private JTextField txtLngagatan;
	private JTextField txtSderkping;
	private JTextField emailTextField;
	private JTextField textField;
	private JPasswordField pwdLsenord;
	private JPasswordField passwordField;

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
		changeButton.setBackground(SystemColor.window);
		changeButton.setForeground(Color.DARK_GRAY);
		changeButton.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setLayout(new BorderLayout(0, 0));
		GroupLayout gl_infoPanel = new GroupLayout(infoPanel);
		gl_infoPanel.setHorizontalGroup(
			gl_infoPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
				.addGroup(gl_infoPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_infoPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(emailLabel, GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
						.addGroup(gl_infoPanel.createSequentialGroup()
							.addComponent(firstnameLabel, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lastnameLabel, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
						.addComponent(streetLabel, GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
						.addGroup(gl_infoPanel.createSequentialGroup()
							.addComponent(zipLabel)
							.addGap(18)
							.addComponent(cityLabel, GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)))
					.addGap(101))
				.addGroup(gl_infoPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(changeButton, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(535, Short.MAX_VALUE))
		);
		gl_infoPanel.setVerticalGroup(
			gl_infoPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_infoPanel.createSequentialGroup()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
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
		
		JLabel lblPersonalInformation = new JLabel(" Personal Information");
		lblPersonalInformation.setForeground(Color.DARK_GRAY);
		lblPersonalInformation.setFont(new Font("HelvLight", Font.PLAIN, 18));
		panel_3.add(lblPersonalInformation, BorderLayout.WEST);
		infoPanel.setLayout(gl_infoPanel);
		
		JPanel settingsPanel = new JPanel();
		settingsPanel.setBackground(new Color(192, 192, 192));
		customerTab.add(settingsPanel, "name_18680627031416");
		settingsPanel.setLayout(null);
		
		JPanel labelPanel = new JPanel();
		labelPanel.setBorder(null);
		labelPanel.setBackground(Color.LIGHT_GRAY);
		labelPanel.setBounds(12, 12, 151, 258);
		settingsPanel.add(labelPanel);
		labelPanel.setLayout(null);
		
		JLabel lastnameLabel2 = new JLabel("Lastname:");
		lastnameLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
		lastnameLabel2.setBounds(12, 38, 127, 20);
		labelPanel.add(lastnameLabel2);
		lastnameLabel2.setForeground(Color.DARK_GRAY);
		lastnameLabel2.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JLabel fornameLabel2 = new JLabel("Firstname:");
		fornameLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
		fornameLabel2.setBounds(12, 12, 127, 20);
		labelPanel.add(fornameLabel2);
		fornameLabel2.setForeground(Color.DARK_GRAY);
		fornameLabel2.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JLabel streetLabel2 = new JLabel("Street:");
		streetLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
		streetLabel2.setBounds(12, 70, 127, 20);
		labelPanel.add(streetLabel2);
		streetLabel2.setForeground(Color.DARK_GRAY);
		streetLabel2.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JLabel zipAndCityLabel2 = new JLabel("Zip-code and city:");
		zipAndCityLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
		zipAndCityLabel2.setBounds(12, 102, 127, 20);
		labelPanel.add(zipAndCityLabel2);
		zipAndCityLabel2.setForeground(Color.DARK_GRAY);
		zipAndCityLabel2.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JLabel emailLabel2 = new JLabel("Email:");
		emailLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
		emailLabel2.setBounds(12, 134, 127, 20);
		labelPanel.add(emailLabel2);
		emailLabel2.setForeground(Color.DARK_GRAY);
		emailLabel2.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JLabel lblLsenord = new JLabel("Password:");
		lblLsenord.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLsenord.setForeground(Color.DARK_GRAY);
		lblLsenord.setFont(new Font("HelvLight", Font.PLAIN, 14));
		lblLsenord.setBounds(12, 182, 127, 20);
		labelPanel.add(lblLsenord);
		
		JLabel lblBekrftaLsenord = new JLabel("Verify password:");
		lblBekrftaLsenord.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBekrftaLsenord.setForeground(Color.DARK_GRAY);
		lblBekrftaLsenord.setFont(new Font("HelvLight", Font.PLAIN, 14));
		lblBekrftaLsenord.setBounds(12, 209, 127, 20);
		labelPanel.add(lblBekrftaLsenord);
		
		JPanel textPanel = new JPanel();
		textPanel.setBorder(null);
		textPanel.setBackground(Color.LIGHT_GRAY);
		textPanel.setBounds(165, 12, 453, 258);
		settingsPanel.add(textPanel);
		textPanel.setLayout(null);
		
		txtFrnamn = new JTextField();
		txtFrnamn.setFont(new Font("HelvLight", Font.PLAIN, 14));
		txtFrnamn.setBounds(12, 12, 171, 19);
		textPanel.add(txtFrnamn);
		txtFrnamn.setText("Firstname");
		txtFrnamn.setColumns(10);
		
		txtEfternamn = new JTextField();
		txtEfternamn.setFont(new Font("HelvLight", Font.PLAIN, 14));
		txtEfternamn.setText("Lastname");
		txtEfternamn.setColumns(10);
		txtEfternamn.setBounds(12, 43, 171, 19);
		textPanel.add(txtEfternamn);
		
		txtLngagatan = new JTextField();
		txtLngagatan.setFont(new Font("HelvLight", Font.PLAIN, 14));
		txtLngagatan.setText("Streetname 99");
		txtLngagatan.setColumns(10);
		txtLngagatan.setBounds(12, 74, 171, 19);
		textPanel.add(txtLngagatan);
		
		txtSderkping = new JTextField();
		txtSderkping.setFont(new Font("HelvLight", Font.PLAIN, 14));
		txtSderkping.setText("Cityname");
		txtSderkping.setColumns(10);
		txtSderkping.setBounds(78, 105, 105, 19);
		textPanel.add(txtSderkping);
		
		emailTextField = new JTextField();
		emailTextField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		emailTextField.setText("youemail@gmail.com");
		emailTextField.setColumns(10);
		emailTextField.setBounds(12, 136, 171, 19);
		textPanel.add(emailTextField);
		
		textField = new JTextField();
		textField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		textField.setToolTipText("Postnummer");
		textField.setText("682 92");
		textField.setColumns(10);
		textField.setBounds(12, 105, 54, 19);
		textPanel.add(textField);
		
		pwdLsenord = new JPasswordField();
		pwdLsenord.setFont(new Font("HelvLight", Font.PLAIN, 14));
		pwdLsenord.setText("lösenord");
		pwdLsenord.setBounds(12, 185, 171, 19);
		textPanel.add(pwdLsenord);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		passwordField.setText("lösenord");
		passwordField.setBounds(12, 208, 171, 19);
		textPanel.add(passwordField);
		
		JLabel lblPasswordNeedsTo = new JLabel("Password needs to be at least 8 characters");
		lblPasswordNeedsTo.setHorizontalAlignment(SwingConstants.LEFT);
		lblPasswordNeedsTo.setForeground(Color.DARK_GRAY);
		lblPasswordNeedsTo.setFont(new Font("HelvLight", Font.ITALIC, 12));
		lblPasswordNeedsTo.setBounds(12, 226, 262, 20);
		textPanel.add(lblPasswordNeedsTo);
		
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
		
		JPanel favouriteTab = new JPanel();
		favouriteTab.setBackground(Color.LIGHT_GRAY);
		tabPanel.addTab("Favourites", null, favouriteTab, null);
		favouriteTab.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(0, 0, 624, 38);
		favouriteTab.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblFavourites = new JLabel(" Favourites");
		lblFavourites.setForeground(Color.DARK_GRAY);
		lblFavourites.setFont(new Font("HelvLight", Font.PLAIN, 18));
		panel_2.add(lblFavourites, BorderLayout.WEST);
		
		JPanel listTab = new JPanel();
		listTab.setLayout(null);
		listTab.setBackground(Color.LIGHT_GRAY);
		tabPanel.addTab("Shopping Lists", null, listTab, null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 624, 38);
		listTab.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblShoppingLists = new JLabel(" Shopping Lists");
		panel.add(lblShoppingLists);
		lblShoppingLists.setFont(new Font("HelvLight", Font.PLAIN, 18));
		lblShoppingLists.setForeground(Color.DARK_GRAY);
		
		JPanel receiptTab = new JPanel();
		receiptTab.setBackground(Color.LIGHT_GRAY);
		tabPanel.addTab("Receipts", null, receiptTab, null);
		receiptTab.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(0, 0, 624, 38);
		receiptTab.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblReceipts = new JLabel(" Receipts");
		lblReceipts.setForeground(Color.DARK_GRAY);
		lblReceipts.setFont(new Font("HelvLight", Font.PLAIN, 18));
		panel_1.add(lblReceipts, BorderLayout.WEST);

	}
}

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
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabPanel = new JTabbedPane(JTabbedPane.TOP);
		tabPanel.setFont(new Font("HelvLight", Font.PLAIN, 15));
		tabPanel.setBackground(Color.LIGHT_GRAY);
		add(tabPanel);
		
		JPanel customerTab = new JPanel();
		customerTab.setBackground(Color.LIGHT_GRAY);
		tabPanel.addTab("Kunduppgifter", null, customerTab, null);
		customerTab.setLayout(new CardLayout(0, 0));
		
		JPanel infoPanel = new JPanel();
		infoPanel.setBackground(Color.LIGHT_GRAY);
		customerTab.add(infoPanel, "name_18669439395135");
		
		JLabel emailLabel = new JLabel("emailadress@email.com");
		emailLabel.setForeground(Color.DARK_GRAY);
		emailLabel.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel forenameLabel = new JLabel("Förnamn");
		forenameLabel.setForeground(Color.DARK_GRAY);
		forenameLabel.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel lastnameLabel = new JLabel("Efternamn");
		lastnameLabel.setForeground(Color.DARK_GRAY);
		lastnameLabel.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel streetLabel = new JLabel("Gatunamn 9b");
		streetLabel.setForeground(Color.DARK_GRAY);
		streetLabel.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel zipLabel = new JLabel("682 58");
		zipLabel.setForeground(Color.DARK_GRAY);
		zipLabel.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel cityLabel = new JLabel("Ortnamn");
		cityLabel.setForeground(Color.DARK_GRAY);
		cityLabel.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JButton changeButton = new JButton("Ändra");
		changeButton.setBackground(SystemColor.window);
		changeButton.setForeground(Color.DARK_GRAY);
		changeButton.setFont(new Font("HelvLight", Font.PLAIN, 14));
		GroupLayout gl_infoPanel = new GroupLayout(infoPanel);
		gl_infoPanel.setHorizontalGroup(
			gl_infoPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_infoPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_infoPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(emailLabel, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
						.addGroup(gl_infoPanel.createSequentialGroup()
							.addComponent(forenameLabel, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lastnameLabel, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
						.addComponent(streetLabel, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
						.addGroup(gl_infoPanel.createSequentialGroup()
							.addComponent(zipLabel)
							.addGap(18)
							.addComponent(cityLabel, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
						.addComponent(changeButton, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_infoPanel.setVerticalGroup(
			gl_infoPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_infoPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_infoPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(forenameLabel)
						.addComponent(lastnameLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(streetLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_infoPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(zipLabel)
						.addComponent(cityLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(emailLabel)
					.addGap(18)
					.addComponent(changeButton, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(365, Short.MAX_VALUE))
		);
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
		
		JLabel lastnameLabel2 = new JLabel("Efternamn:");
		lastnameLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
		lastnameLabel2.setBounds(12, 38, 127, 20);
		labelPanel.add(lastnameLabel2);
		lastnameLabel2.setForeground(Color.DARK_GRAY);
		lastnameLabel2.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JLabel fornameLabel2 = new JLabel("Förnamn:");
		fornameLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
		fornameLabel2.setBounds(12, 12, 127, 20);
		labelPanel.add(fornameLabel2);
		fornameLabel2.setForeground(Color.DARK_GRAY);
		fornameLabel2.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JLabel streetLabel2 = new JLabel("Gatunamn:");
		streetLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
		streetLabel2.setBounds(12, 70, 127, 20);
		labelPanel.add(streetLabel2);
		streetLabel2.setForeground(Color.DARK_GRAY);
		streetLabel2.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JLabel zipAndCityLabel2 = new JLabel("Postnr och ort:");
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
		
		JLabel lblLsenord = new JLabel("Lösenord:");
		lblLsenord.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLsenord.setForeground(Color.DARK_GRAY);
		lblLsenord.setFont(new Font("HelvLight", Font.PLAIN, 14));
		lblLsenord.setBounds(12, 182, 127, 20);
		labelPanel.add(lblLsenord);
		
		JLabel lblBekrftaLsenord = new JLabel("Bekräfta lösenord:");
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
		txtFrnamn.setText("Förnamn");
		txtFrnamn.setColumns(10);
		
		txtEfternamn = new JTextField();
		txtEfternamn.setFont(new Font("HelvLight", Font.PLAIN, 14));
		txtEfternamn.setText("Efternamn");
		txtEfternamn.setColumns(10);
		txtEfternamn.setBounds(12, 43, 171, 19);
		textPanel.add(txtEfternamn);
		
		txtLngagatan = new JTextField();
		txtLngagatan.setFont(new Font("HelvLight", Font.PLAIN, 14));
		txtLngagatan.setText("Långagatan 98");
		txtLngagatan.setColumns(10);
		txtLngagatan.setBounds(12, 74, 171, 19);
		textPanel.add(txtLngagatan);
		
		txtSderkping = new JTextField();
		txtSderkping.setFont(new Font("HelvLight", Font.PLAIN, 14));
		txtSderkping.setText("Söderköping");
		txtSderkping.setColumns(10);
		txtSderkping.setBounds(78, 105, 105, 19);
		textPanel.add(txtSderkping);
		
		emailTextField = new JTextField();
		emailTextField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		emailTextField.setText("emaillångsomfan@gmail.com");
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
		
		JLabel label = new JLabel("Postnr och ort:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("HelvLight", Font.PLAIN, 14));
		label.setBounds(12, 226, 171, 20);
		textPanel.add(label);
		
		JButton saveButton = new JButton("Spara");
		saveButton.setBounds(545, 474, 73, 27);
		settingsPanel.add(saveButton);
		saveButton.setForeground(Color.DARK_GRAY);
		saveButton.setFont(new Font("HelvLight", Font.PLAIN, 14));
		saveButton.setBackground(SystemColor.window);
		
		JButton cancelButton = new JButton("Avbryt");
		cancelButton.setForeground(Color.DARK_GRAY);
		cancelButton.setFont(new Font("HelvLight", Font.PLAIN, 14));
		cancelButton.setBackground(SystemColor.window);
		cancelButton.setBounds(445, 474, 88, 27);
		settingsPanel.add(cancelButton);
		
		JPanel favouriteTab = new JPanel();
		favouriteTab.setBackground(Color.LIGHT_GRAY);
		tabPanel.addTab("Favoriter", null, favouriteTab, null);
		
		JPanel listTab = new JPanel();
		listTab.setLayout(null);
		listTab.setBackground(Color.LIGHT_GRAY);
		tabPanel.addTab("Inköpslistor", null, listTab, null);
		
		JPanel reciteTab = new JPanel();
		reciteTab.setBackground(Color.LIGHT_GRAY);
		tabPanel.addTab("Kvitton", null, reciteTab, null);

	}
}

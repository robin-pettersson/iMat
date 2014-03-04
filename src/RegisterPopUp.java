import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;


public class RegisterPopUp extends JPanel {
	private JTextField fNameTextField;
	private JTextField lNameTextField;
	private JTextField addressTextField;
	private JTextField zipTextField;
	private JTextField cityTextField;
	private JTextField emailTextField;
	private JPasswordField passwordTextField;
	private JPasswordField verifyPasswordTextField;
	
	public JDialog dialog;

	private RegisterController reg = RegisterController.getInstance();
	
	/**
	 * Create the panel.
	 */
	public RegisterPopUp(String fName, String lName, String address, String zip, String city, String email) {
		
		dialog = new JDialog();
		dialog.setPreferredSize(new Dimension(408, 374));
		dialog.setBackground(Color.LIGHT_GRAY);
		dialog.setSize(new Dimension(408, 374));
		dialog.setName("dialog");
		dialog.getContentPane().setLayout(null);
		dialog.setVisible(true);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(12, 39, 122, 251);
		dialog.getContentPane().add(panel);
		
		JLabel label = new JLabel("Firstname:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("HelvLight", Font.PLAIN, 14));
		label.setBounds(31, 0, 91, 17);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Lastname:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setForeground(Color.DARK_GRAY);
		label_1.setFont(new Font("HelvLight", Font.PLAIN, 14));
		label_1.setBounds(31, 29, 91, 17);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Street:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setForeground(Color.DARK_GRAY);
		label_2.setFont(new Font("HelvLight", Font.PLAIN, 14));
		label_2.setBounds(0, 58, 122, 20);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Zip and city:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setForeground(Color.DARK_GRAY);
		label_3.setFont(new Font("HelvLight", Font.PLAIN, 14));
		label_3.setBounds(0, 90, 122, 20);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Email:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setForeground(Color.DARK_GRAY);
		label_4.setFont(new Font("HelvLight", Font.PLAIN, 14));
		label_4.setBounds(31, 122, 91, 17);
		panel.add(label_4);
		
		JLabel label_11 = new JLabel("Password:");
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setForeground(Color.DARK_GRAY);
		label_11.setFont(new Font("HelvLight", Font.PLAIN, 14));
		label_11.setBounds(0, 163, 122, 20);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("Verify password:");
		label_12.setHorizontalAlignment(SwingConstants.RIGHT);
		label_12.setForeground(Color.DARK_GRAY);
		label_12.setFont(new Font("HelvLight", Font.PLAIN, 14));
		label_12.setBounds(0, 190, 122, 20);
		panel.add(label_12);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(null);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(146, 39, 250, 251);
		dialog.getContentPane().add(panel_1);
		
		fNameTextField = new JTextField();
		fNameTextField.addFocusListener(reg);
		fNameTextField.setName("fNameTextField");
		fNameTextField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		fNameTextField.setColumns(10);
		fNameTextField.setBounds(0, 0, 195, 19);
		fNameTextField.setText(fName);
		panel_1.add(fNameTextField);
		
		lNameTextField = new JTextField();
		lNameTextField.addFocusListener(reg);
		lNameTextField.setName("lNameTextField");
		lNameTextField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		lNameTextField.setColumns(10);
		lNameTextField.setBounds(0, 31, 195, 19);
		lNameTextField.setText(lName);
		panel_1.add(lNameTextField);
		
		addressTextField = new JTextField();
		addressTextField.addFocusListener(reg);
		addressTextField.setName("addressTextField");
		addressTextField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		addressTextField.setColumns(10);
		addressTextField.setBounds(0, 62, 195, 19);
		addressTextField.setText(address);
		panel_1.add(addressTextField);
		
		zipTextField = new JTextField();
		zipTextField.addFocusListener(reg);
		zipTextField.setName("zipTextField");
		zipTextField.setToolTipText("Postnummer");
		zipTextField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		zipTextField.setColumns(10);
		zipTextField.setBounds(0, 93, 54, 19);
		zipTextField.setText(zip);
		panel_1.add(zipTextField);
		
		cityTextField = new JTextField();
		cityTextField.addFocusListener(reg);
		cityTextField.setName("cityTextField");
		cityTextField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		cityTextField.setColumns(10);
		cityTextField.setBounds(66, 93, 129, 19);
		cityTextField.setText(city);
		panel_1.add(cityTextField);
		
		emailTextField = new JTextField();
		emailTextField.addFocusListener(reg);
		emailTextField.setName("emailTextField");
		emailTextField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		emailTextField.setColumns(10);
		emailTextField.setBounds(0, 124, 195, 19);
		emailTextField.setText(email);
		panel_1.add(emailTextField);
		
		JLabel label_5 = new JLabel("Receipt will be sent to this email");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setForeground(Color.DARK_GRAY);
		label_5.setFont(new Font("HelvLight", Font.ITALIC, 12));
		label_5.setBounds(0, 140, 195, 17);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("*");
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setForeground(Color.DARK_GRAY);
		label_6.setFont(new Font("HelvLight", Font.PLAIN, 16));
		label_6.setBounds(200, 3, 12, 17);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("*");
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setForeground(Color.DARK_GRAY);
		label_7.setFont(new Font("HelvLight", Font.PLAIN, 16));
		label_7.setBounds(200, 34, 12, 17);
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel("*");
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		label_8.setForeground(Color.DARK_GRAY);
		label_8.setFont(new Font("HelvLight", Font.PLAIN, 16));
		label_8.setBounds(200, 65, 12, 17);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("*");
		label_9.setHorizontalAlignment(SwingConstants.LEFT);
		label_9.setForeground(Color.DARK_GRAY);
		label_9.setFont(new Font("HelvLight", Font.PLAIN, 16));
		label_9.setBounds(200, 93, 12, 17);
		panel_1.add(label_9);
		
		passwordTextField = new JPasswordField();
		passwordTextField.addFocusListener(reg);
		passwordTextField.setName("passwordTextField");
		passwordTextField.setText("lösenord");
		passwordTextField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		passwordTextField.setBounds(0, 165, 195, 19);
		panel_1.add(passwordTextField);
		
		verifyPasswordTextField = new JPasswordField();
		verifyPasswordTextField.addFocusListener(reg);
		verifyPasswordTextField.setName("verifyPasswordTextField");
		verifyPasswordTextField.setText("lösenord");
		verifyPasswordTextField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		verifyPasswordTextField.setBounds(0, 188, 195, 19);
		panel_1.add(verifyPasswordTextField);
		
		JLabel label_10 = new JLabel("Password needs to be at least 8 characters");
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setForeground(Color.DARK_GRAY);
		label_10.setFont(new Font("HelvLight", Font.ITALIC, 12));
		label_10.setBounds(0, 206, 262, 20);
		panel_1.add(label_10);
		
		JLabel label_13 = new JLabel("*");
		label_13.setHorizontalAlignment(SwingConstants.LEFT);
		label_13.setForeground(Color.DARK_GRAY);
		label_13.setFont(new Font("HelvLight", Font.PLAIN, 16));
		label_13.setBounds(200, 168, 12, 17);
		panel_1.add(label_13);
		
		JLabel label_14 = new JLabel("*");
		label_14.setHorizontalAlignment(SwingConstants.LEFT);
		label_14.setForeground(Color.DARK_GRAY);
		label_14.setFont(new Font("HelvLight", Font.PLAIN, 16));
		label_14.setBounds(200, 191, 12, 17);
		panel_1.add(label_14);
		
		JButton registerButton = new JButton("Register");
		registerButton.addMouseListener(reg);
		registerButton.setName("registerButton");
		registerButton.setForeground(Color.DARK_GRAY);
		registerButton.setFont(new Font("HelvLight", Font.PLAIN, 14));
		registerButton.setBackground(SystemColor.window);
		registerButton.setBounds(271, 301, 106, 27);
		dialog.getContentPane().add(registerButton);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addMouseListener(reg);
		cancelButton.setName("cancelButton");
		cancelButton.setForeground(Color.DARK_GRAY);
		cancelButton.setFont(new Font("HelvLight", Font.PLAIN, 14));
		cancelButton.setBackground(SystemColor.window);
		cancelButton.setBounds(177, 301, 84, 27);
		dialog.getContentPane().add(cancelButton);
		
		JLabel lblAccountInformation = new JLabel("Account Information");
		lblAccountInformation.setForeground(Color.DARK_GRAY);
		lblAccountInformation.setFont(new Font("HelvLight", Font.PLAIN, 18));
		lblAccountInformation.setBounds(12, 12, 281, 20);
		dialog.getContentPane().add(lblAccountInformation);
		dialog.pack();

	}
	
	public void close(RegisterPopUp regPop){
		regPop.dialog.dispose();
	}

}

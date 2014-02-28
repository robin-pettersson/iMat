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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;


public class CheckOut extends JPanel {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField fNameTextField;
	private JTextField lNameTextField;
	private JTextField addressTextField;
	private JTextField zipTextField;
	private JTextField cityTextField;
	private JTextField emailTextField;
	private JPasswordField passwordField;
	private JTextField signEmailTextField;
	
	private RegisterController reg = RegisterController.getInstance();

	/**
	 * Create the panel.
	 */
	public CheckOut() {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setPreferredSize(new Dimension(635, 550));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		add(panel);
		panel.setLayout(null);
		
		JPanel payMethodPanel = new JPanel();
		payMethodPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		payMethodPanel.setBackground(Color.LIGHT_GRAY);
		payMethodPanel.setBounds(0, 90, 629, 212);
		panel.add(payMethodPanel);
		payMethodPanel.setLayout(null);
		
		JRadioButton rdbtnCreditCard = new JRadioButton("Credit Card");
		buttonGroup.add(rdbtnCreditCard);
		rdbtnCreditCard.setBackground(Color.LIGHT_GRAY);
		rdbtnCreditCard.setFont(new Font("HelvLight", Font.PLAIN, 14));
		rdbtnCreditCard.setBounds(22, 8, 105, 23);
		payMethodPanel.add(rdbtnCreditCard);
		
		JRadioButton rdbtnInvoice = new JRadioButton("Invoice");
		buttonGroup.add(rdbtnInvoice);
		rdbtnInvoice.setBackground(Color.LIGHT_GRAY);
		rdbtnInvoice.setFont(new Font("HelvLight", Font.PLAIN, 14));
		rdbtnInvoice.setBounds(22, 35, 105, 23);
		payMethodPanel.add(rdbtnInvoice);
		
		JRadioButton rdbtnPayAtThe = new JRadioButton("At the door");
		buttonGroup.add(rdbtnPayAtThe);
		rdbtnPayAtThe.setBackground(Color.LIGHT_GRAY);
		rdbtnPayAtThe.setFont(new Font("HelvLight", Font.PLAIN, 14));
		rdbtnPayAtThe.setBounds(22, 62, 105, 23);
		payMethodPanel.add(rdbtnPayAtThe);
		
		JPanel cardInfoPanel = new JPanel();
		cardInfoPanel.setBackground(Color.LIGHT_GRAY);
		cardInfoPanel.setBounds(158, 8, 459, 186);
		payMethodPanel.add(cardInfoPanel);
		cardInfoPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(0, 0, 629, 37);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCheckOut = new JLabel("Check Out");
		lblCheckOut.setForeground(Color.DARK_GRAY);
		lblCheckOut.setFont(new Font("HelvLight", Font.PLAIN, 18));
		lblCheckOut.setBounds(12, 0, 230, 37);
		panel_2.add(lblCheckOut);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		panel_3.setBounds(0, 61, 629, 28);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblPayingMethod = new JLabel("Pay Method");
		lblPayingMethod.setBounds(12, 0, 108, 20);
		panel_3.add(lblPayingMethod);
		lblPayingMethod.setForeground(Color.DARK_GRAY);
		lblPayingMethod.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		panel_1.setBounds(0, 303, 629, 28);
		panel.add(panel_1);
		
		JLabel lblDeliveryInformaiton = new JLabel("Delivery Address");
		lblDeliveryInformaiton.setForeground(Color.DARK_GRAY);
		lblDeliveryInformaiton.setFont(new Font("HelvLight", Font.PLAIN, 14));
		lblDeliveryInformaiton.setBounds(12, 0, 171, 20);
		panel_1.add(lblDeliveryInformaiton);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBounds(0, 332, 629, 212);
		panel.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(null);
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(12, 12, 110, 145);
		panel_4.add(panel_5);
		
		JLabel label = new JLabel("Firstname:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("HelvLight", Font.PLAIN, 12));
		label.setBounds(12, 0, 91, 17);
		panel_5.add(label);
		
		JLabel label_1 = new JLabel("Lastname:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setForeground(Color.DARK_GRAY);
		label_1.setFont(new Font("HelvLight", Font.PLAIN, 12));
		label_1.setBounds(12, 24, 91, 17);
		panel_5.add(label_1);
		
		JLabel label_2 = new JLabel("Street:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setForeground(Color.DARK_GRAY);
		label_2.setFont(new Font("HelvLight", Font.PLAIN, 12));
		label_2.setBounds(11, 46, 91, 20);
		panel_5.add(label_2);
		
		JLabel label_3 = new JLabel("Zip and city:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setForeground(Color.DARK_GRAY);
		label_3.setFont(new Font("HelvLight", Font.PLAIN, 12));
		label_3.setBounds(12, 73, 91, 20);
		panel_5.add(label_3);
		
		JLabel label_4 = new JLabel("Email:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setForeground(Color.DARK_GRAY);
		label_4.setFont(new Font("HelvLight", Font.PLAIN, 12));
		label_4.setBounds(12, 122, 91, 17);
		panel_5.add(label_4);
		
		JLabel lblDeliveryDate = new JLabel("Delivery date:");
		lblDeliveryDate.setToolTipText("Enter date for delivery ");
		lblDeliveryDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDeliveryDate.setForeground(Color.DARK_GRAY);
		lblDeliveryDate.setFont(new Font("HelvLight", Font.PLAIN, 12));
		lblDeliveryDate.setBounds(9, 96, 91, 20);
		panel_5.add(lblDeliveryDate);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(null);
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_6.setBounds(120, 12, 221, 188);
		panel_4.add(panel_6);
		
		fNameTextField = new JTextField();
		fNameTextField.addFocusListener(reg);
		fNameTextField.setName("fNameTextField");
		fNameTextField.setFont(new Font("HelvLight", Font.PLAIN, 12));
		fNameTextField.setColumns(10);
		fNameTextField.setBounds(0, 0, 195, 19);
		panel_6.add(fNameTextField);
		
		lNameTextField = new JTextField();
		lNameTextField.addFocusListener(reg);
		lNameTextField.setName("lNameTextField");
		lNameTextField.setFont(new Font("HelvLight", Font.PLAIN, 12));
		lNameTextField.setColumns(10);
		lNameTextField.setBounds(0, 26, 195, 19);
		panel_6.add(lNameTextField);
		
		addressTextField = new JTextField();
		addressTextField.addFocusListener(reg);
		addressTextField.setName("addressTextField");
		addressTextField.setFont(new Font("HelvLight", Font.PLAIN, 12));
		addressTextField.setColumns(10);
		addressTextField.setBounds(0, 50, 195, 19);
		panel_6.add(addressTextField);
		
		zipTextField = new JTextField();
		zipTextField.addFocusListener(reg);
		zipTextField.setName("zipTextField");
		zipTextField.setToolTipText("Postnummer");
		zipTextField.setFont(new Font("HelvLight", Font.PLAIN, 12));
		zipTextField.setColumns(10);
		zipTextField.setBounds(0, 75, 54, 19);
		panel_6.add(zipTextField);
		
		cityTextField = new JTextField();
		cityTextField.addFocusListener(reg);
		cityTextField.setName("cityTextField");
		cityTextField.setFont(new Font("HelvLight", Font.PLAIN, 12));
		cityTextField.setColumns(10);
		cityTextField.setBounds(66, 75, 129, 19);
		panel_6.add(cityTextField);
		
		emailTextField = new JTextField();
		emailTextField.addFocusListener(reg);
		emailTextField.setName("emailTextField");
		emailTextField.setFont(new Font("HelvLight", Font.PLAIN, 12));
		emailTextField.setColumns(10);
		emailTextField.setBounds(2, 123, 195, 19);
		panel_6.add(emailTextField);
		
		JLabel label_7 = new JLabel("Receipt will be sent to this email");
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setForeground(Color.DARK_GRAY);
		label_7.setFont(new Font("HelvLight", Font.ITALIC, 12));
		label_7.setBounds(3, 142, 195, 17);
		panel_6.add(label_7);
		
		JLabel label_8 = new JLabel("*");
		label_8.setToolTipText("Mandatory field");
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		label_8.setForeground(Color.DARK_GRAY);
		label_8.setFont(new Font("HelvLight", Font.PLAIN, 16));
		label_8.setBounds(200, 0, 12, 17);
		panel_6.add(label_8);
		
		JLabel label_9 = new JLabel("*");
		label_9.setToolTipText("Mandatory field");
		label_9.setHorizontalAlignment(SwingConstants.LEFT);
		label_9.setForeground(Color.DARK_GRAY);
		label_9.setFont(new Font("HelvLight", Font.PLAIN, 16));
		label_9.setBounds(200, 26, 12, 17);
		panel_6.add(label_9);
		
		JLabel label_10 = new JLabel("*");
		label_10.setToolTipText("Mandatory field");
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setForeground(Color.DARK_GRAY);
		label_10.setFont(new Font("HelvLight", Font.PLAIN, 16));
		label_10.setBounds(200, 50, 12, 17);
		panel_6.add(label_10);
		
		JLabel label_11 = new JLabel("*");
		label_11.setToolTipText("Mandatory field");
		label_11.setHorizontalAlignment(SwingConstants.LEFT);
		label_11.setForeground(Color.DARK_GRAY);
		label_11.setFont(new Font("HelvLight", Font.PLAIN, 16));
		label_11.setBounds(200, 75, 12, 17);
		panel_6.add(label_11);
		
		
		JLabel lblYouAreNot = new JLabel("You are not signed in!");
		lblYouAreNot.setHorizontalTextPosition(SwingConstants.LEFT);
		lblYouAreNot.setHorizontalAlignment(SwingConstants.RIGHT);
		lblYouAreNot.setForeground(Color.DARK_GRAY);
		lblYouAreNot.setFont(new Font("HelvLight", Font.PLAIN, 14));
		lblYouAreNot.setBounds(359, 12, 148, 22);
		panel_4.add(lblYouAreNot);
		
		final JPanel panel_7 = new JPanel();
		panel_7.setVisible(false);
		panel_7.setBackground(Color.LIGHT_GRAY);
		panel_7.setBorder(null);
		panel_7.setBounds(383, 41, 234, 102);
		panel_4.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel registerLabel = new JLabel("Register Account");
		registerLabel.addMouseListener(reg);
		registerLabel.setName("registerLabel");
		registerLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		registerLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		registerLabel.setForeground(Color.WHITE);
		registerLabel.setFont(new Font("HelvLight", Font.BOLD, 18));
		registerLabel.setBounds(0, 157, 195, 31);
		panel_6.add(registerLabel);
		
		JComboBox dayComboBox = new JComboBox();
		dayComboBox.setFont(new Font("HelvLight", Font.PLAIN, 12));
		dayComboBox.setBounds(0, 98, 54, 20);
		panel_6.add(dayComboBox);
		
		JComboBox monthComboBox = new JComboBox();
		monthComboBox.setFont(new Font("HelvLight", Font.PLAIN, 12));
		monthComboBox.setBounds(66, 98, 54, 20);
		panel_6.add(monthComboBox);
		
		JComboBox yearComboBox = new JComboBox();
		yearComboBox.setFont(new Font("HelvLight", Font.PLAIN, 12));
		yearComboBox.setBounds(132, 98, 63, 20);
		panel_6.add(yearComboBox);
		
		JLabel lblSignIn = new JLabel("Sign in");
		lblSignIn.setName("lblSignIn");
		lblSignIn.addMouseListener(reg);
		/*lblSignIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(panel_7.isVisible()){
					panel_7.setVisible(false);
				}
				else {
					panel_7.setVisible(true);
				}
			}
		});*/
		
		lblSignIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSignIn.setHorizontalTextPosition(SwingConstants.LEFT);
		lblSignIn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSignIn.setForeground(Color.WHITE);
		lblSignIn.setFont(new Font("HelvLight", Font.BOLD, 18));
		lblSignIn.setBounds(553, 12, 64, 31);
		panel_4.add(lblSignIn);
		
		
		JLabel label_6 = new JLabel("Email:");
		label_6.setHorizontalTextPosition(SwingConstants.RIGHT);
		label_6.setBounds(12, 12, 65, 17);
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setForeground(Color.DARK_GRAY);
		label_6.setFont(new Font("HelvLight", Font.PLAIN, 14));
		panel_7.add(label_6);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setForeground(Color.DARK_GRAY);
		lblPassword.setFont(new Font("HelvLight", Font.PLAIN, 14));
		lblPassword.setBounds(12, 41, 67, 17);
		panel_7.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.addFocusListener(reg);
		passwordField.setName("passwordField");
		passwordField.setText("lösenord");
		passwordField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		passwordField.setBounds(84, 40, 138, 19);
		panel_7.add(passwordField);
		
		signEmailTextField = new JTextField();
		signEmailTextField.addFocusListener(reg);
		signEmailTextField.setName("signEmailTextField");
		signEmailTextField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		signEmailTextField.setColumns(10);
		signEmailTextField.setBounds(84, 12, 138, 19);
		panel_7.add(signEmailTextField);
		
		JButton btnLogIn = new JButton("Sign in");
		btnLogIn.addMouseListener(reg);
		btnLogIn.setName("btnLogIn");
		btnLogIn.setForeground(Color.DARK_GRAY);
		btnLogIn.setFont(new Font("HelvLight", Font.PLAIN, 14));
		btnLogIn.setBackground(SystemColor.window);
		btnLogIn.setBounds(144, 71, 78, 27);
		panel_7.add(btnLogIn);
		
		JButton btnPreview = new JButton("Preview");
		btnPreview.setToolTipText("Preview purchase");
		btnPreview.setForeground(Color.DARK_GRAY);
		btnPreview.setFont(new Font("HelvLight", Font.PLAIN, 14));
		btnPreview.setBackground(SystemColor.window);
		btnPreview.setBounds(526, 169, 91, 27);
		panel_4.add(btnPreview);
		
		JButton button = new JButton("Cancel");
		button.setToolTipText("Cancel purchase");
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font("HelvLight", Font.PLAIN, 14));
		button.setBackground(SystemColor.window);
		button.setBounds(430, 169, 84, 27);
		panel_4.add(button);
		
		JButton button_1 = new JButton("Back");
		button_1.setToolTipText("Return to shopping cart");
		button_1.setForeground(Color.DARK_GRAY);
		button_1.setFont(new Font("HelvLight", Font.PLAIN, 14));
		button_1.setBackground(SystemColor.window);
		button_1.setBounds(12, 169, 84, 27);
		panel_4.add(button_1);
		
		JLabel lblCart = new JLabel("Cart");
		lblCart.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblCart.setToolTipText("Return to shopping cart");
		lblCart.setForeground(Color.WHITE);
		lblCart.setFont(new Font("HelvLight", Font.BOLD, 14));
		lblCart.setBounds(10, 38, 35, 20);
		panel.add(lblCart);
		
		JLabel lblCheckOut_1 = new JLabel("> Check out");
		lblCheckOut_1.setBackground(Color.DARK_GRAY);
		lblCheckOut_1.setToolTipText("You are here!");
		lblCheckOut_1.setForeground(Color.DARK_GRAY);
		lblCheckOut_1.setFont(new Font("HelvLight", Font.BOLD, 14));
		lblCheckOut_1.setBounds(47, 38, 96, 20);
		panel.add(lblCheckOut_1);

	}
}

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


public class CheckOut extends JPanel {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		payMethodPanel.setBounds(0, 64, 629, 212);
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
		panel_3.setBounds(0, 35, 629, 28);
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
		panel_1.setBounds(0, 276, 629, 28);
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
		panel_4.setBounds(0, 305, 629, 239);
		panel.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(null);
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(0, 0, 122, 167);
		panel_4.add(panel_5);
		
		JLabel label = new JLabel("Firstname:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("HelvLight", Font.PLAIN, 14));
		label.setBounds(31, 0, 91, 17);
		panel_5.add(label);
		
		JLabel label_1 = new JLabel("Lastname:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setForeground(Color.DARK_GRAY);
		label_1.setFont(new Font("HelvLight", Font.PLAIN, 14));
		label_1.setBounds(31, 29, 91, 17);
		panel_5.add(label_1);
		
		JLabel label_2 = new JLabel("Street:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setForeground(Color.DARK_GRAY);
		label_2.setFont(new Font("HelvLight", Font.PLAIN, 14));
		label_2.setBounds(0, 58, 122, 20);
		panel_5.add(label_2);
		
		JLabel label_3 = new JLabel("Zip and city:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setForeground(Color.DARK_GRAY);
		label_3.setFont(new Font("HelvLight", Font.PLAIN, 14));
		label_3.setBounds(0, 90, 122, 20);
		panel_5.add(label_3);
		
		JLabel label_4 = new JLabel("Email:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setForeground(Color.DARK_GRAY);
		label_4.setFont(new Font("HelvLight", Font.PLAIN, 14));
		label_4.setBounds(31, 122, 91, 17);
		panel_5.add(label_4);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(null);
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_6.setBounds(134, 0, 221, 167);
		panel_4.add(panel_6);
		
		textField = new JTextField();
		textField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(0, 0, 195, 19);
		panel_6.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("HelvLight", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(0, 31, 195, 19);
		panel_6.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("HelvLight", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(0, 62, 195, 19);
		panel_6.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("Postnummer");
		textField_3.setFont(new Font("HelvLight", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(0, 93, 54, 19);
		panel_6.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("HelvLight", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(66, 93, 129, 19);
		panel_6.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("HelvLight", Font.PLAIN, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(0, 124, 195, 19);
		panel_6.add(textField_5);
		
		JLabel label_7 = new JLabel("Receipt will be sent to this email");
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setForeground(Color.DARK_GRAY);
		label_7.setFont(new Font("HelvLight", Font.ITALIC, 12));
		label_7.setBounds(0, 140, 195, 17);
		panel_6.add(label_7);
		
		JLabel label_8 = new JLabel("*");
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		label_8.setForeground(Color.DARK_GRAY);
		label_8.setFont(new Font("HelvLight", Font.PLAIN, 16));
		label_8.setBounds(200, 3, 12, 17);
		panel_6.add(label_8);
		
		JLabel label_9 = new JLabel("*");
		label_9.setHorizontalAlignment(SwingConstants.LEFT);
		label_9.setForeground(Color.DARK_GRAY);
		label_9.setFont(new Font("HelvLight", Font.PLAIN, 16));
		label_9.setBounds(200, 34, 12, 17);
		panel_6.add(label_9);
		
		JLabel label_10 = new JLabel("*");
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setForeground(Color.DARK_GRAY);
		label_10.setFont(new Font("HelvLight", Font.PLAIN, 16));
		label_10.setBounds(200, 65, 12, 17);
		panel_6.add(label_10);
		
		JLabel label_11 = new JLabel("*");
		label_11.setHorizontalAlignment(SwingConstants.LEFT);
		label_11.setForeground(Color.DARK_GRAY);
		label_11.setFont(new Font("HelvLight", Font.PLAIN, 16));
		label_11.setBounds(200, 93, 12, 17);
		panel_6.add(label_11);

	}
}

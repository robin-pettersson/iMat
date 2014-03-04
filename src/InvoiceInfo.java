import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class InvoiceInfo extends JPanel {
	private JTextField firstnameTextField;
	private JTextField lastnameTextField;
	private JTextField streetTextField;
	private JTextField zipTextField;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public InvoiceInfo() {
		setSize(new Dimension(459, 186));
		setBorder(null);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 459, 186);
		add(panel);
		panel.setLayout(null);
		
		JPanel labelPanel = new JPanel();
		labelPanel.setBackground(Color.LIGHT_GRAY);
		labelPanel.setBounds(4, 30, 114, 136);
		panel.add(labelPanel);
		labelPanel.setLayout(null);
		
		JLabel lblCardNumber = new JLabel("Firstname:");
		lblCardNumber.setBounds(12, 12, 100, 17);
		lblCardNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCardNumber.setForeground(Color.DARK_GRAY);
		lblCardNumber.setFont(new Font("HelvLight", Font.PLAIN, 14));
		labelPanel.add(lblCardNumber);
		
		JLabel lblC = new JLabel("Lastname:");
		lblC.setBounds(12, 41, 100, 17);
		lblC.setHorizontalAlignment(SwingConstants.RIGHT);
		lblC.setForeground(Color.DARK_GRAY);
		lblC.setFont(new Font("HelvLight", Font.PLAIN, 14));
		labelPanel.add(lblC);
		
		JLabel label = new JLabel("Street:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("HelvLight", Font.PLAIN, 14));
		label.setBounds(-19, 70, 127, 20);
		labelPanel.add(label);
		
		JLabel lblZipAndCity = new JLabel("Zip and city:");
		lblZipAndCity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblZipAndCity.setForeground(Color.DARK_GRAY);
		lblZipAndCity.setFont(new Font("HelvLight", Font.PLAIN, 14));
		lblZipAndCity.setBounds(-19, 102, 127, 20);
		labelPanel.add(lblZipAndCity);
		
		JPanel textFieldPanel = new JPanel();
		textFieldPanel.setBackground(Color.LIGHT_GRAY);
		textFieldPanel.setBounds(119, 30, 326, 136);
		panel.add(textFieldPanel);
		textFieldPanel.setLayout(null);
		
		firstnameTextField = new JTextField();
		firstnameTextField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		firstnameTextField.setColumns(10);
		firstnameTextField.setBounds(0, 12, 195, 19);
		textFieldPanel.add(firstnameTextField);
		
		lastnameTextField = new JTextField();
		lastnameTextField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		lastnameTextField.setColumns(10);
		lastnameTextField.setBounds(0, 43, 195, 19);
		textFieldPanel.add(lastnameTextField);
		
		streetTextField = new JTextField();
		streetTextField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		streetTextField.setColumns(10);
		streetTextField.setBounds(0, 74, 195, 19);
		textFieldPanel.add(streetTextField);
		
		zipTextField = new JTextField();
		zipTextField.setToolTipText("Postnummer");
		zipTextField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		zipTextField.setColumns(10);
		zipTextField.setBounds(0, 105, 54, 19);
		textFieldPanel.add(zipTextField);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("HelvLight", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(66, 105, 129, 19);
		textFieldPanel.add(textField_3);
		
		JLabel lblInvoiceInformation = new JLabel("Invoice Information");
		lblInvoiceInformation.setForeground(Color.DARK_GRAY);
		lblInvoiceInformation.setFont(new Font("HelvLight", Font.PLAIN, 14));
		lblInvoiceInformation.setBounds(11, -2, 281, 20);
		panel.add(lblInvoiceInformation);

	}
}

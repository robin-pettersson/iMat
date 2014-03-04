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


public class CardInfo extends JPanel {
	private JTextField textField;
	private JTextField txtCardOwner;
	private JTextField txtCvv;

	/**
	 * Create the panel.
	 */
	public CardInfo() {
		setSize(new Dimension(459, 186));
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 459, 186);
		add(panel);
		panel.setLayout(null);
		
		JPanel labelPanel = new JPanel();
		labelPanel.setBackground(Color.LIGHT_GRAY);
		labelPanel.setBounds(8, 33, 113, 130);
		panel.add(labelPanel);
		labelPanel.setLayout(null);
		
		JLabel lblCardNumber = new JLabel("Card Number:");
		lblCardNumber.setBounds(12, 12, 100, 17);
		lblCardNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCardNumber.setForeground(Color.DARK_GRAY);
		lblCardNumber.setFont(new Font("HelvLight", Font.PLAIN, 14));
		labelPanel.add(lblCardNumber);
		
		JLabel lblC = new JLabel("Card Owner:");
		lblC.setBounds(12, 41, 100, 17);
		lblC.setHorizontalAlignment(SwingConstants.RIGHT);
		lblC.setForeground(Color.DARK_GRAY);
		lblC.setFont(new Font("HelvLight", Font.PLAIN, 14));
		labelPanel.add(lblC);
		
		JLabel lblCvvDate = new JLabel("CVV, Date");
		lblCvvDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCvvDate.setForeground(Color.DARK_GRAY);
		lblCvvDate.setFont(new Font("HelvLight", Font.PLAIN, 14));
		lblCvvDate.setBounds(12, 70, 100, 17);
		labelPanel.add(lblCvvDate);
		
		JPanel textFieldPanel = new JPanel();
		textFieldPanel.setBackground(Color.LIGHT_GRAY);
		textFieldPanel.setBounds(122, 33, 326, 130);
		panel.add(textFieldPanel);
		textFieldPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setText("987 987 987 987");
		textField.setFont(new Font("HelvLight", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(0, 12, 195, 19);
		textFieldPanel.add(textField);
		
		txtCardOwner = new JTextField();
		txtCardOwner.setText("Card Owner");
		txtCardOwner.setFont(new Font("HelvLight", Font.PLAIN, 14));
		txtCardOwner.setColumns(10);
		txtCardOwner.setBounds(0, 43, 195, 19);
		textFieldPanel.add(txtCardOwner);
		
		txtCvv = new JTextField();
		txtCvv.setBounds(0, 74, 41, 21);
		textFieldPanel.add(txtCvv);
		txtCvv.setText("CVV");
		txtCvv.setFont(new Font("HelvLight", Font.PLAIN, 14));
		txtCvv.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("HelvLight", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBox.setBounds(53, 74, 59, 21);
		textFieldPanel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"14", "15", "16", "17", "18", "19", "20"}));
		comboBox_1.setFont(new Font("HelvLight", Font.PLAIN, 12));
		comboBox_1.setBounds(124, 74, 71, 22);
		textFieldPanel.add(comboBox_1);
		
		JLabel lblEnterDateAs = new JLabel("Enter date as mm/yy");
		lblEnterDateAs.setHorizontalAlignment(SwingConstants.LEFT);
		lblEnterDateAs.setForeground(Color.DARK_GRAY);
		lblEnterDateAs.setFont(new Font("HelvLight", Font.ITALIC, 12));
		lblEnterDateAs.setBounds(53, 95, 118, 17);
		textFieldPanel.add(lblEnterDateAs);
		
		JLabel lblCreditCardInformation = new JLabel("Credit Card Information");
		lblCreditCardInformation.setForeground(Color.DARK_GRAY);
		lblCreditCardInformation.setFont(new Font("HelvLight", Font.PLAIN, 14));
		lblCreditCardInformation.setBounds(13, 1, 281, 20);
		panel.add(lblCreditCardInformation);

	}
}

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


public class CheckOut extends JPanel {
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		payMethodPanel.setBounds(0, 64, 629, 128);
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
		cardInfoPanel.setBounds(158, 8, 459, 108);
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

	}
}

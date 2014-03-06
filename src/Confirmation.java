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


public class Confirmation extends JPanel {
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public Confirmation() {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setPreferredSize(new Dimension(635, 550));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		add(panel);
		panel.setLayout(null);
		
		JPanel deliveryAddressPanel = new JPanel();
		deliveryAddressPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		deliveryAddressPanel.setBackground(Color.LIGHT_GRAY);
		deliveryAddressPanel.setBounds(0, 90, 629, 454);
		panel.add(deliveryAddressPanel);
		deliveryAddressPanel.setLayout(null);
		
		JLabel lblThankYouFor = new JLabel("Thank you for your purchase! \nYour receipt will be sent to you by email!");
		lblThankYouFor.setBorder(null);
		lblThankYouFor.setVerticalAlignment(SwingConstants.TOP);
		lblThankYouFor.setHorizontalAlignment(SwingConstants.LEFT);
		lblThankYouFor.setForeground(Color.DARK_GRAY);
		lblThankYouFor.setFont(new Font("HelvLight", Font.PLAIN, 16));
		lblThankYouFor.setBounds(12, 12, 510, 46);
		deliveryAddressPanel.add(lblThankYouFor);
		
		JButton btnBack = new JButton("Back to start");
		btnBack.setForeground(Color.DARK_GRAY);
		btnBack.setFont(new Font("HelvLight", Font.PLAIN, 14));
		btnBack.setBackground(SystemColor.window);
		btnBack.setBounds(408, 67, 114, 27);
		deliveryAddressPanel.add(btnBack);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(0, 0, 629, 37);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCheckOut = new JLabel("Success!");
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
		
		JLabel lblPayingMethod = new JLabel("Purchase Confirmed!");
		lblPayingMethod.setBounds(12, 0, 310, 20);
		panel_3.add(lblPayingMethod);
		lblPayingMethod.setForeground(Color.DARK_GRAY);
		lblPayingMethod.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JLabel label = new JLabel("> Preview");
		label.setToolTipText("Can't back to preview");
		label.setForeground(Color.GRAY);
		label.setFont(new Font("HelvLight", Font.BOLD, 14));
		label.setBounds(142, 36, 81, 20);
		panel.add(label);
		
		JLabel label_1 = new JLabel("> Check out");
		label_1.setToolTipText("Can't back to check out");
		label_1.setForeground(Color.GRAY);
		label_1.setFont(new Font("HelvLight", Font.BOLD, 14));
		label_1.setBounds(47, 36, 96, 20);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Cart");
		label_2.setToolTipText("Can't back to cart");
		label_2.setForeground(Color.GRAY);
		label_2.setFont(new Font("HelvLight", Font.BOLD, 14));
		label_2.setBounds(10, 36, 35, 20);
		panel.add(label_2);
		
		JLabel lblConfirmation = new JLabel("> Confirmation");
		lblConfirmation.setToolTipText("You are here");
		lblConfirmation.setForeground(Color.DARK_GRAY);
		lblConfirmation.setFont(new Font("HelvLight", Font.BOLD, 14));
		lblConfirmation.setBounds(223, 36, 136, 20);
		panel.add(lblConfirmation);

	}
}

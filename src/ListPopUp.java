import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import java.awt.SystemColor;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;


public class ListPopUp extends JPanel {

	/**
	 * Create the panel.
	 */
	public ListPopUp() {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(0, 35, 461, 307);
		panel.add(panel_1);
		
		JPanel topPanel = new JPanel();
		topPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		topPanel.setBackground(Color.LIGHT_GRAY);
		topPanel.setBounds(0, 0, 461, 33);
		panel.add(topPanel);
		topPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblListname = new JLabel("Listname (4 Products)");
		lblListname.setForeground(Color.DARK_GRAY);
		topPanel.add(lblListname);
		lblListname.setFont(new Font("HelvLight", Font.PLAIN, 20));
		
		JLabel lblAddToCart = new JLabel("Add to cart");
		lblAddToCart.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblAddToCart.setForeground(Color.WHITE);
		lblAddToCart.setFont(new Font("HelvLight", Font.BOLD, 14));
		topPanel.add(lblAddToCart, BorderLayout.EAST);
		
		JPanel pyramidePanel = new JPanel();
		pyramidePanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		pyramidePanel.setPreferredSize(new Dimension(635, 35));
		pyramidePanel.setBackground(Color.LIGHT_GRAY);
		pyramidePanel.setBounds(0, 346, 461, 29);
		panel.add(pyramidePanel);
		GridBagLayout gbl_pyramidePanel = new GridBagLayout();
		gbl_pyramidePanel.columnWidths = new int[]{28, 28, 31, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pyramidePanel.rowHeights = new int[]{26, 0};
		gbl_pyramidePanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pyramidePanel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pyramidePanel.setLayout(gbl_pyramidePanel);
		
		JLabel label = new JLabel("<<");
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setToolTipText("Back");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(Color.GRAY);
		label.setFont(new Font("HelvLight", Font.BOLD, 20));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 0, 5);
		gbc_label.gridx = 4;
		gbc_label.gridy = 0;
		pyramidePanel.add(label, gbc_label);
		
		JLabel label_1 = new JLabel("1/2");
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		label_1.setToolTipText("Sida 1 av 2");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.GRAY);
		label_1.setFont(new Font("HelvLight", Font.BOLD, 20));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.WEST;
		gbc_label_1.insets = new Insets(0, 0, 0, 5);
		gbc_label_1.gridx = 11;
		gbc_label_1.gridy = 0;
		pyramidePanel.add(label_1, gbc_label_1);
		
		JLabel label_2 = new JLabel(">>");
		label_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		label_2.setToolTipText("Next");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setForeground(Color.DARK_GRAY);
		label_2.setFont(new Font("HelvLight", Font.BOLD, 20));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 0, 5);
		gbc_label_2.gridx = 18;
		gbc_label_2.gridy = 0;
		pyramidePanel.add(label_2, gbc_label_2);

	}
}

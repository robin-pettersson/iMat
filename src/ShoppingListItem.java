import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Cursor;
import javax.swing.DebugGraphics;


public class ShoppingListItem extends JPanel {

	/**
	 * Create the panel.
	 */
	public ShoppingListItem() {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(new BorderLayout(0, 0));
		
		JPanel itemPanel = new JPanel();
		itemPanel.setLayout(null);
		itemPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		itemPanel.setBackground(Color.LIGHT_GRAY);
		add(itemPanel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(12, 13, 440, 94);
		itemPanel.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{112, 85, 0};
		gbl_panel_1.rowHeights = new int[]{26, 19, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel listNameLabel = new JLabel("Name of List");
		listNameLabel.setVerticalAlignment(SwingConstants.TOP);
		listNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		listNameLabel.setForeground(Color.DARK_GRAY);
		listNameLabel.setFont(new Font("HelvLight", Font.BOLD, 20));
		GridBagConstraints gbc_listNameLabel = new GridBagConstraints();
		gbc_listNameLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_listNameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_listNameLabel.gridx = 0;
		gbc_listNameLabel.gridy = 0;
		panel_1.add(listNameLabel, gbc_listNameLabel);
		
		JLabel numberOfWaresLabel = new JLabel("- 3 products");
		numberOfWaresLabel.setHorizontalAlignment(SwingConstants.LEFT);
		numberOfWaresLabel.setForeground(Color.DARK_GRAY);
		numberOfWaresLabel.setFont(new Font("HelvLight", Font.BOLD, 20));
		GridBagConstraints gbc_numberOfWaresLabel = new GridBagConstraints();
		gbc_numberOfWaresLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_numberOfWaresLabel.insets = new Insets(0, 0, 5, 0);
		gbc_numberOfWaresLabel.gridx = 1;
		gbc_numberOfWaresLabel.gridy = 0;
		panel_1.add(numberOfWaresLabel, gbc_numberOfWaresLabel);
		
		JLabel editListLabel = new JLabel("Show/Edit");
		editListLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		editListLabel.setForeground(Color.GRAY);
		editListLabel.setFont(new Font("HelvLight", Font.BOLD, 15));
		GridBagConstraints gbc_editListLabel = new GridBagConstraints();
		gbc_editListLabel.anchor = GridBagConstraints.NORTHEAST;
		gbc_editListLabel.gridx = 1;
		gbc_editListLabel.gridy = 1;
		panel_1.add(editListLabel, gbc_editListLabel);
		
		JLabel closeLabel = new JLabel("X");
		closeLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		closeLabel.setForeground(Color.RED);
		closeLabel.setFont(new Font("gargi", Font.BOLD, 24));
		closeLabel.setBounds(593, 13, 24, 26);
		itemPanel.add(closeLabel);
		
		JLabel addToCartLabel = new JLabel("Lägg i kundkorgen");
		addToCartLabel.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		addToCartLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addToCartLabel.setForeground(Color.GRAY);
		addToCartLabel.setFont(new Font("HelvLight", Font.BOLD, 15));
		addToCartLabel.setBounds(470, 80, 147, 36);
		itemPanel.add(addToCartLabel);

	}

}

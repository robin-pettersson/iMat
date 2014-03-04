
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.border.LineBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class CartView extends JPanel {

	public CartView() {
		setPreferredSize(new Dimension(635, 550));
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JLabel cartBreadcrumb = new JLabel("Cart");
		cartBreadcrumb.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		cartBreadcrumb.setBounds(10, 38, 35, 20);
		cartBreadcrumb.setToolTipText("You are here!");
		cartBreadcrumb.setForeground(Color.DARK_GRAY);
		cartBreadcrumb.setFont(new Font("HelvLight", Font.BOLD, 14));
		add(cartBreadcrumb);
		
		JPanel headerPanel = new JPanel();
		headerPanel.setLayout(null);
		headerPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		headerPanel.setBackground(Color.LIGHT_GRAY);
		headerPanel.setBounds(0, 0, 635, 37);
		add(headerPanel);
		
		JLabel cartLabel = new JLabel("Cart");
		cartLabel.setForeground(Color.DARK_GRAY);
		cartLabel.setFont(new Font("HelvLight", Font.PLAIN, 18));
		cartLabel.setBounds(12, 0, 230, 37);
		headerPanel.add(cartLabel);
		
		JPanel container = new JPanel();
		container.setLayout(null);
		container.setBorder(new LineBorder(new Color(0, 0, 0)));
		container.setBackground(Color.LIGHT_GRAY);
		container.setBounds(0, 61, 635, 429);
		add(container);
		
		JPanel pyramidPanel = new JPanel();
		pyramidPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		pyramidPanel.setBounds(0, 491, 635, 29);
		add(pyramidPanel);
		pyramidPanel.setPreferredSize(new Dimension(635, 35));
		pyramidPanel.setBackground(Color.LIGHT_GRAY);
		GridBagLayout gbl_pyramidPanel = new GridBagLayout();
		gbl_pyramidPanel.columnWidths = new int[]{28, 28, 31, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pyramidPanel.rowHeights = new int[]{26, 0};
		gbl_pyramidPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pyramidPanel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pyramidPanel.setLayout(gbl_pyramidPanel);
		
		JLabel label = new JLabel("<<");
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setToolTipText("Previous");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(Color.GRAY);
		label.setFont(new Font("HelvLight", Font.BOLD, 20));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 0, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 0;
		pyramidPanel.add(label, gbc_label);
		
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
		pyramidPanel.add(label_1, gbc_label_1);
		
		JLabel label_2 = new JLabel(">>");
		label_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		label_2.setToolTipText("Next");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setForeground(Color.DARK_GRAY);
		label_2.setFont(new Font("HelvLight", Font.BOLD, 20));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.WEST;
		gbc_label_2.insets = new Insets(0, 0, 0, 5);
		gbc_label_2.gridx = 20;
		gbc_label_2.gridy = 0;
		pyramidPanel.add(label_2, gbc_label_2);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		buttonPanel.setBackground(Color.LIGHT_GRAY);
		buttonPanel.setBounds(0, 521, 635, 29);
		add(buttonPanel);
		buttonPanel.setLayout(null);
		
		JButton btnCheckOut = new JButton("Check out");
		btnCheckOut.setFont(new Font("HelvLight", Font.PLAIN, 12));
		btnCheckOut.setBounds(510, 3, 115, 23);
		buttonPanel.add(btnCheckOut);
		
		JButton btnKeepShopping = new JButton("Keep shopping");
		btnKeepShopping.setFont(new Font("HelvLight", Font.PLAIN, 12));
		btnKeepShopping.setBounds(10, 3, 115, 23);
		buttonPanel.add(btnKeepShopping);
		// TODO Auto-generated constructor stub
	}
}

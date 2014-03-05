
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.border.LineBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.List;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.FlowLayout;

public class CartView extends JPanel {
	
	//private static CartView cartView = null;

	public CartView(List<CartListView> view) {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setPreferredSize(new Dimension(635, 550));
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JLabel cartBreadcrumb = new JLabel("Cart");
		cartBreadcrumb.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		cartBreadcrumb.setBounds(10, 40, 35, 20);
		cartBreadcrumb.setToolTipText("You are here!");
		cartBreadcrumb.setForeground(Color.DARK_GRAY);
		cartBreadcrumb.setFont(new Font("HelvLight", Font.BOLD, 14));
		add(cartBreadcrumb);
		
		JPanel headerPanel = new JPanel();
		headerPanel.setLayout(null);
		headerPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		headerPanel.setBackground(Color.LIGHT_GRAY);
		headerPanel.setBounds(3, 3, 629, 37);
		add(headerPanel);
		
		JLabel cartLabel = new JLabel("Cart");
		cartLabel.setForeground(Color.DARK_GRAY);
		cartLabel.setFont(new Font("HelvLight", Font.PLAIN, 18));
		cartLabel.setBounds(12, 0, 230, 37);
		headerPanel.add(cartLabel);
		
		//CartListView view = new CartListView("hej", "hopp", 2);
		
		JPanel container = new JPanel();
		container.setName("container");
		container.setBorder(new LineBorder(new Color(0, 0, 0)));
		container.setBackground(Color.LIGHT_GRAY);
		container.setBounds(3, 61, 629, 408);
		
		if(view != null){
			for (CartListView clw : view) {
				container.add(clw);
			}
		}
		
		add(container);
		container.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel pyramidPanel = new JPanel();
		pyramidPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		pyramidPanel.setBounds(3, 471, 629, 29);
		add(pyramidPanel);
		pyramidPanel.setPreferredSize(new Dimension(635, 35));
		pyramidPanel.setBackground(Color.LIGHT_GRAY);
		pyramidPanel.setLayout(null);
		
		JLabel label = new JLabel("<<");
		label.setBounds(11, 1, 28, 25);
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setToolTipText("Previous");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(Color.GRAY);
		label.setFont(new Font("HelvLight", Font.BOLD, 20));
		pyramidPanel.add(label);
		
		JLabel label_1 = new JLabel("1/2");
		label_1.setBounds(315, 1, 31, 25);
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		label_1.setToolTipText("Sida 1 av 2");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.GRAY);
		label_1.setFont(new Font("HelvLight", Font.BOLD, 20));
		pyramidPanel.add(label_1);
		
		JLabel label_2 = new JLabel(">>");
		label_2.setBounds(591, 1, 28, 25);
		label_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		label_2.setToolTipText("Next");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setForeground(Color.DARK_GRAY);
		label_2.setFont(new Font("HelvLight", Font.BOLD, 20));
		pyramidPanel.add(label_2);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		buttonPanel.setBackground(Color.LIGHT_GRAY);
		buttonPanel.setBounds(3, 502, 629, 34);
		add(buttonPanel);
		buttonPanel.setLayout(null);
		
		JButton btnKeepShopping = new JButton("Keep shopping");
		btnKeepShopping.setToolTipText("Cancel purchase");
		btnKeepShopping.setForeground(Color.DARK_GRAY);
		btnKeepShopping.setFont(new Font("HelvLight", Font.PLAIN, 14));
		btnKeepShopping.setBackground(Color.WHITE);
		btnKeepShopping.setBounds(10, 4, 142, 27);
		buttonPanel.add(btnKeepShopping);
		
		JButton btnCheckOut = new JButton("Check out");
		btnCheckOut.setToolTipText("Cancel purchase");
		btnCheckOut.setForeground(Color.DARK_GRAY);
		btnCheckOut.setFont(new Font("HelvLight", Font.PLAIN, 14));
		btnCheckOut.setBackground(Color.WHITE);
		btnCheckOut.setBounds(513, 4, 106, 27);
		buttonPanel.add(btnCheckOut);
		// TODO Auto-generated constructor stub
	}
	
	/*public static CartView getInstance(){
		if(cartView == null){
			cartView = new CartView();
		}
		return cartView;
	}*/
}


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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CartView extends JPanel {
	
	//private static CartView cartView = null;
	private int pages = 0;
	private int index = 0;
	private CartListView view;

	public CartView(final List<CartListView> views) {
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
		
		final JPanel container = new JPanel();
		container.setName("container");
		container.setBorder(new LineBorder(new Color(0, 0, 0)));
		container.setBackground(Color.LIGHT_GRAY);
		container.setBounds(3, 61, 629, 408);
		
		if(views != null && index < 8){
			for (int i = 0; i < 8 && i < views.size(); i++) {
				view = views.get(i);
				container.add(view);
				index++;
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
		
		JLabel backLabel = new JLabel("<<");
		backLabel.setEnabled(false);
		if(pages > 0){
			backLabel.setEnabled(true);
			pyramidPanel.revalidate();
		}
		
		backLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(pages > 0){
					
					remove(container);
					container.removeAll();
					
					int stop = index;
					index = index - 8;
					for(int i = index; i < stop; i++){
						view = views.get(index);
						container.add(view);
						index++;
					}
					add(container);
					repaint();
					pages--;
				}
			}
		});
		backLabel.setBounds(11, 1, 28, 25);
		backLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		backLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		backLabel.setToolTipText("Previous");
		backLabel.setHorizontalAlignment(SwingConstants.LEFT);
		backLabel.setForeground(Color.GRAY);
		backLabel.setFont(new Font("HelvLight", Font.BOLD, 20));
		pyramidPanel.add(backLabel);
		
		JLabel label_1 = new JLabel("1/2");
		label_1.setBounds(315, 1, 31, 25);
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		label_1.setToolTipText("Sida 1 av 2");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.GRAY);
		label_1.setFont(new Font("HelvLight", Font.BOLD, 20));
		pyramidPanel.add(label_1);
		
		JLabel forwardLabel = new JLabel(">>");
		
		forwardLabel.setEnabled(false);
		if(index >= 8){
			forwardLabel.setEnabled(true);
			pyramidPanel.revalidate();
		}
		forwardLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(index >= 8 && index < views.size()){
					
					remove(container);
					container.removeAll();
					System.out.println("cartLoop");
					
					int stop = index + 8;
					for(int i = index; i < views.size() && i < stop; i++ ){
						view = views.get(index);
						container.add(view);
						index++;
					}
					pages++;
					add(container);
					revalidate();
					repaint();
					
				}
			}
		});
		forwardLabel.setBounds(591, 1, 28, 25);
		forwardLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		forwardLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		forwardLabel.setToolTipText("Next");
		forwardLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		forwardLabel.setForeground(Color.DARK_GRAY);
		forwardLabel.setFont(new Font("HelvLight", Font.BOLD, 20));
		pyramidPanel.add(forwardLabel);
		
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

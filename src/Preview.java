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

import java.awt.FlowLayout;

import javax.swing.BoxLayout;

import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Order;
import se.chalmers.ait.dat215.project.ShoppingItem;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;


public class Preview extends JPanel {
	IMatDataHandler iMat = IMatDataHandler.getInstance();
	private JPanel thisPanel = this;
	private JTable previewTable;
	
	private JLabel pageLabel;
	
	private List<ShoppingItem> items;
	private List<JTable> tablesList = new ArrayList<JTable>();
	
	private int index = 0;
	private int currentPage = 0;
	
	public Preview(String fName, String lName, String address, String zip, String city, String email, String date, String total) {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setPreferredSize(new Dimension(635, 550));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(0, 0, 629, 37);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCheckOut = new JLabel("Preview Purchase");
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
		
		JLabel lblPayingMethod = new JLabel("Delivery Address");
		lblPayingMethod.setBounds(12, 0, 129, 20);
		panel_3.add(lblPayingMethod);
		lblPayingMethod.setForeground(Color.DARK_GRAY);
		lblPayingMethod.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		panel_1.setBounds(0, 215, 629, 28);
		panel.add(panel_1);
		
		JLabel lblDeliveryInformaiton = new JLabel("Products");
		lblDeliveryInformaiton.setForeground(Color.DARK_GRAY);
		lblDeliveryInformaiton.setFont(new Font("HelvLight", Font.PLAIN, 14));
		lblDeliveryInformaiton.setBounds(12, 0, 171, 20);
		panel_1.add(lblDeliveryInformaiton);
		
		final JPanel productsPanel = new JPanel();
		productsPanel.setLayout(null);
		productsPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		productsPanel.setBackground(Color.LIGHT_GRAY);
		productsPanel.setBounds(0, 245, 629, 299);
		panel.add(productsPanel);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout layout = (CardLayout) thisPanel.getParent().getParent().getParent().getLayout();
				layout.first(thisPanel.getParent().getParent().getParent());
			}
		});
		cancelButton.setForeground(Color.DARK_GRAY);
		cancelButton.setFont(new Font("HelvLight", Font.PLAIN, 14));
		cancelButton.setBackground(SystemColor.window);
		cancelButton.setBounds(430, 258, 84, 27);
		productsPanel.add(cancelButton);
		
		JButton confirmButton = new JButton("Confirm");
		confirmButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout layout = (CardLayout) thisPanel.getParent().getParent().getLayout();
				layout.next(thisPanel.getParent().getParent());
				iMat.placeOrder();
				iMat.shutDown();
			}
		});
		confirmButton.setForeground(Color.DARK_GRAY);
		confirmButton.setFont(new Font("HelvLight", Font.PLAIN, 14));
		confirmButton.setBackground(SystemColor.window);
		confirmButton.setBounds(526, 258, 91, 27);
		productsPanel.add(confirmButton);
		
		JLabel lblSumKr = new JLabel(total + " sek");
		lblSumKr.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSumKr.setForeground(Color.DARK_GRAY);
		lblSumKr.setFont(new Font("HelvLight", Font.PLAIN, 18));
		lblSumKr.setBounds(430, 237, 187, 17);
		productsPanel.add(lblSumKr);
		
		
		
		JButton backButton = new JButton("Back to check out");
		backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout layout = (CardLayout) thisPanel.getParent().getParent().getLayout();
				layout.previous(thisPanel.getParent().getParent());
			}
		});
		backButton.setToolTipText("Return to check out");
		backButton.setForeground(Color.DARK_GRAY);
		backButton.setFont(new Font("HelvLight", Font.PLAIN, 14));
		backButton.setBackground(SystemColor.window);
		backButton.setBounds(12, 260, 149, 27);
		productsPanel.add(backButton);
		
		JPanel panel_6 = new JPanel();
		panel_6.setPreferredSize(new Dimension(635, 35));
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_6.setBounds(12, 208, 605, 24);
		productsPanel.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel backLabel = new JLabel("<<");
		backLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(currentPage > 0){
					currentPage--;
					
					
					System.out.println("in back loop");
					JTable newTable = tablesList.get(currentPage);
					
					productsPanel.remove(previewTable);
					previewTable = newTable;
					productsPanel.add(previewTable);
					productsPanel.revalidate();
					productsPanel.repaint();
					

				}
			}
		});
		backLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		backLabel.setBounds(6, 4, 20, 18);
		backLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		backLabel.setToolTipText("Back");
		backLabel.setHorizontalAlignment(SwingConstants.LEFT);
		backLabel.setForeground(Color.GRAY);
		backLabel.setFont(new Font("HelvLight", Font.BOLD, 14));
		panel_6.add(backLabel);
		
		pageLabel = new JLabel(currentPage + "/" + tablesList.size());
		pageLabel.setBounds(279, 4, 23, 18);
		pageLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		pageLabel.setToolTipText("Current page");
		pageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pageLabel.setForeground(Color.GRAY);
		pageLabel.setFont(new Font("HelvLight", Font.BOLD, 14));
		panel_6.add(pageLabel);
		
		JLabel forwardLabel = new JLabel(">>");

		
		forwardLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(tablesList.size() > 1 && (currentPage + 1) < tablesList.size()){
					currentPage++;
					
					
					System.out.println("in table loop");
					JTable newTable = tablesList.get(currentPage);
					
					productsPanel.remove(previewTable);
					previewTable = newTable;
					productsPanel.add(previewTable);
					productsPanel.revalidate();
					productsPanel.repaint();
					
					
				}
			}
		});
		forwardLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		forwardLabel.setBounds(575, 4, 20, 18);
		forwardLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		forwardLabel.setToolTipText("Next");
		forwardLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		forwardLabel.setForeground(Color.DARK_GRAY);
		forwardLabel.setFont(new Font("HelvLight", Font.BOLD, 14));
		panel_6.add(forwardLabel);
		
		JLabel label_3 = new JLabel("> Check out");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout layout = (CardLayout) thisPanel.getParent().getParent().getLayout();
				layout.previous(thisPanel.getParent().getParent());
			}
		});
		label_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_3.setToolTipText("Back to check out");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("HelvLight", Font.BOLD, 14));
		label_3.setBounds(47, 36, 96, 20);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Cart");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout layout = (CardLayout) thisPanel.getParent().getParent().getLayout();
				layout.previous(thisPanel.getParent().getParent());
				layout.previous(thisPanel.getParent().getParent());
			}
		});
		label_4.setToolTipText("Return to shopping cart");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("HelvLight", Font.BOLD, 14));
		label_4.setBounds(10, 36, 35, 20);
		panel.add(label_4);
		
		JLabel lblPreview = new JLabel("> Preview");
		lblPreview.setCursor(Cursor.getPredefinedCursor(Cursor.SW_RESIZE_CURSOR));
		lblPreview.setToolTipText("You are here");
		lblPreview.setForeground(Color.DARK_GRAY);
		lblPreview.setFont(new Font("HelvLight", Font.BOLD, 14));
		lblPreview.setBounds(142, 36, 96, 20);
		panel.add(lblPreview);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(0, 90, 629, 123);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(12, 12, 605, 99);
		panel_5.setBorder(null);
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_4.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel label = new JLabel(fName + " " + lName);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("HelvLight", Font.PLAIN, 14));
		panel_5.add(label);
		
		JLabel label_1 = new JLabel(address);
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setForeground(Color.DARK_GRAY);
		label_1.setFont(new Font("HelvLight", Font.PLAIN, 14));
		panel_5.add(label_1);
		
		JLabel label_2 = new JLabel(zip + "" + city);
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setForeground(Color.DARK_GRAY);
		label_2.setFont(new Font("HelvLight", Font.PLAIN, 14));
		panel_5.add(label_2);
		
		JLabel label_5 = new JLabel(email);
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setForeground(Color.DARK_GRAY);
		label_5.setFont(new Font("HelvLight", Font.PLAIN, 14));
		panel_5.add(label_5);
		
		JLabel label_6 = new JLabel("Delivery: " + date );
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setForeground(Color.DARK_GRAY);
		label_6.setFont(new Font("HelvLight", Font.PLAIN, 14));
		panel_5.add(label_6);

		previewTable = makeTable();
		fillFirstTable(previewTable);
		productsPanel.add(previewTable);
		fillTable(previewTable);
	}
	
	public void fillFirstTable(JTable table){
		items = iMat.getShoppingCart().getItems();
		int currentRow = 0;
		for (int i = 0; i < 12 && index < items.size(); i++) {

			ShoppingItem item = items.get(index);
			table.getModel().setValueAt(item.getProduct().getName(), currentRow, 0);
			table.getModel().setValueAt(item.getAmount() + " pcs", currentRow, 1);
			table.getModel().setValueAt(item.getProduct().getPrice() + " sek", currentRow, 2);

			index++;
			currentRow++;
		}

		currentRow = 0;
		tablesList.add(table);

	}
	
	public void fillTable(JTable table){
		
		items = iMat.getShoppingCart().getItems();
		int currentRow = 0;
		while(items.size() > index){

			for (int i = 0; i < 12 && index < items.size(); i++) {

					ShoppingItem item = items.get(index);
					table.getModel().setValueAt(item.getProduct().getName(), currentRow, 0);
					table.getModel().setValueAt(item.getAmount() + " pcs", currentRow, 1);
					table.getModel().setValueAt(item.getProduct().getPrice() + " sek", currentRow, 2);

					index++;
					currentRow++;
			}
			currentRow = 0;
			tablesList.add(table);

		}
		index = 0;
	}
	
	public JTable makeTable(){
		
		
		previewTable = new JTable();
		previewTable.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null},
					{null, null, null},
					{null, null, null},
					{null, null, null},
					{null, null, null},
					{null, null, null},
					{null, null, null},
					{null, null, null},
					{null, null, null},
					{null, null, null},
					{null, null, null},
					{null, null, null},
				},
				new String[] {
					"New column", "New column", "New column"
				}
			));
		
		
		previewTable.getColumnModel().getColumn(0).setPreferredWidth(400);
		previewTable.getColumnModel().getColumn(1).setPreferredWidth(15);
		previewTable.getColumnModel().getColumn(2).setPreferredWidth(15);
		previewTable.setRowSelectionAllowed(false);
		previewTable.setFont(new Font("HelvLight", Font.PLAIN, 16));
		previewTable.setBorder(new LineBorder(new Color(0, 0, 0)));
		previewTable.setBackground(Color.LIGHT_GRAY);
		previewTable.setBounds(12, 12, 605, 192);
		
		return previewTable;
	}
}

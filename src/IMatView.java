import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;


public class IMatView extends JFrame {

	private JPanel contentPane;
	private JTextField searchFld;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IMatView frame = new IMatView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IMatView() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 670);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel toolBar = new JPanel();
		toolBar.setBackground(Color.LIGHT_GRAY);
		toolBar.setBorder(new LineBorder(new Color(0, 0, 0)));
		toolBar.setBounds(0, 0, 826, 100);
		contentPane.add(toolBar);
		
		JLabel iMatLbl = new JLabel("iMat");
		iMatLbl.setBounds(12, 0, 216, 88);
		iMatLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		toolBar.setLayout(null);
		iMatLbl.setToolTipText("iMat");
		iMatLbl.setForeground(Color.WHITE);
		iMatLbl.setFont(new Font("HelvLight", Font.PLAIN, 85));
		toolBar.add(iMatLbl);
		
		searchFld = new JTextField();
		searchFld.setToolTipText("Sök Produkt");
		searchFld.setBounds(188, 34, 264, 32);
		searchFld.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				searchFld.selectAll();
				
			}
		});
		searchFld.setForeground(Color.GRAY);
		searchFld.setFont(new Font("HelvLight", Font.PLAIN, 16));
		searchFld.setText("Sök produkt..");
		toolBar.add(searchFld);
		searchFld.setColumns(10);
		
		JButton searchBtn = new JButton("Sök");
		searchBtn.setBackground(SystemColor.window);
		searchBtn.setToolTipText("Sök Produkt");
		searchBtn.setBounds(464, 35, 117, 30);
		searchBtn.setForeground(Color.DARK_GRAY);
		searchBtn.setFont(new Font("HelvLight", Font.PLAIN, 16));
		toolBar.add(searchBtn);
		
		JLabel logInLbl = new JLabel("Logga in");
		logInLbl.setFont(new Font("HelvLight", Font.PLAIN, 16));
		logInLbl.setBounds(731, 7, 74, 27);
		toolBar.add(logInLbl);
		
		JLabel registerLbl = new JLabel("Registrera");
		registerLbl.setFont(new Font("HelvLight", Font.PLAIN, 16));
		registerLbl.setBounds(640, 7, 79, 27);
		toolBar.add(registerLbl);
		
		JLabel seperatorLbl = new JLabel("|");
		seperatorLbl.setFont(new Font("HelvLight", Font.PLAIN, 16));
		seperatorLbl.setBounds(722, 14, 16, 14);
		toolBar.add(seperatorLbl);
		
		JLabel checkOutLbl = new JLabel("Kassa");
		checkOutLbl.setFont(new Font("HelvLight", Font.PLAIN, 16));
		checkOutLbl.setBounds(731, 74, 74, 14);
		toolBar.add(checkOutLbl);
		
		JLabel cartLbl = new JLabel("Kundkorg");
		cartLbl.setFont(new Font("HelvLight", Font.PLAIN, 16));
		cartLbl.setBounds(731, 46, 74, 32);
		toolBar.add(cartLbl);
		
		JPanel sidePanel = new JPanel();
		sidePanel.setBackground(Color.LIGHT_GRAY);
		sidePanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		sidePanel.setBounds(0, 100, 192, 541);
		contentPane.add(sidePanel);
		sidePanel.setLayout(null);
		
		JTree navigationList = new JTree();
		navigationList.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("JTree") {
				{
					DefaultMutableTreeNode node_1;
					DefaultMutableTreeNode node_2;
					getContentPane().add(new DefaultMutableTreeNode("Favoriter"));
					getContentPane().add(new DefaultMutableTreeNode("Dairies"));
					node_1 = new DefaultMutableTreeNode("Fruits and vegetables");
						node_2 = new DefaultMutableTreeNode("Fruits");
							node_2.add(new DefaultMutableTreeNode("Berry"));
							node_2.add(new DefaultMutableTreeNode("Citrus fruits"));
							node_2.add(new DefaultMutableTreeNode("Exotic fruits"));
							node_2.add(new DefaultMutableTreeNode("Melons"));
							node_2.add(new DefaultMutableTreeNode("Other fruits"));
						node_1.add(node_2);
						node_2 = new DefaultMutableTreeNode("Vegetables");
							node_2.add(new DefaultMutableTreeNode("Vegetable fruits"));
							node_2.add(new DefaultMutableTreeNode("Cabbage"));
							node_2.add(new DefaultMutableTreeNode("Root vegetables"));
						node_1.add(node_2);
					getContentPane().add(node_1);
					node_1 = new DefaultMutableTreeNode("Meat and fish");
						node_1.add(new DefaultMutableTreeNode("Meat"));
						node_1.add(new DefaultMutableTreeNode("Fish"));
					getContentPane().add(node_1);
					node_1 = new DefaultMutableTreeNode("Drinks");
						node_1.add(new DefaultMutableTreeNode("Hot drinks"));
						node_1.add(new DefaultMutableTreeNode("Cold drinks"));
					getContentPane().add(node_1);
					node_1 = new DefaultMutableTreeNode("Carbs");
						node_1.add(new DefaultMutableTreeNode("Potatoe/Rice/Pasta"));
					getContentPane().add(node_1);
					getContentPane().add(new DefaultMutableTreeNode("Bread"));
					getContentPane().add(new DefaultMutableTreeNode("Sweets"));
					node_1 = new DefaultMutableTreeNode("Plants");
						node_1.add(new DefaultMutableTreeNode("Pods"));
						node_1.add(new DefaultMutableTreeNode("Nuts and seeds"));
						node_1.add(new DefaultMutableTreeNode("Herbs"));
					getContentPane().add(node_1);
					node_1 = new DefaultMutableTreeNode("Spices (?)");
						node_1.add(new DefaultMutableTreeNode("Sugar/Salt/Flour"));
					getContentPane().add(node_1);
				}
			}
		));
		navigationList.setFont(new Font("HelvLight", Font.PLAIN, 14));
		navigationList.setRootVisible(false);
		navigationList.setBackground(Color.LIGHT_GRAY);
		navigationList.setBounds(10, 35, 172, 459);
		sidePanel.add(navigationList);
		
		JLabel favoriteLbl = new JLabel("Favoriter");
		favoriteLbl.setFont(new Font("HelvLight", Font.PLAIN, 14));
		favoriteLbl.setBounds(10, 11, 164, 20);
		sidePanel.add(favoriteLbl);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		mainPanel.setBounds(190, 100, 636, 541);
		contentPane.add(mainPanel);
		mainPanel.setLayout(new CardLayout(0, 0));
		
		JPanel startPanel = new JPanel();
		startPanel.setBackground(Color.LIGHT_GRAY);
		mainPanel.add(startPanel, "name_1276016334013");
		startPanel.setLayout(null);
		
		JLabel lblBannerHr = new JLabel("");
		lblBannerHr.setIcon(new ImageIcon("/home/micke/Documents/LP3/Grafiska Gränssnitt/banner.png"));
		lblBannerHr.setBounds(12, 12, 610, 127);
		startPanel.add(lblBannerHr);
		
		JTextArea txtrVlkommen = new JTextArea();
		txtrVlkommen.setLineWrap(true);
		txtrVlkommen.setFont(new Font("HelvLight", Font.PLAIN, 16));
		txtrVlkommen.setColumns(1);
		txtrVlkommen.setBackground(Color.LIGHT_GRAY);
		txtrVlkommen.setText("Välkommen till iMat!\nDet här är en applikation för dig som inte hinner handla din mat i affären, utan vill \ngöra det i bekvämligheten av ditt eget hem. \n\nDu beställer, vi levererar!");
		txtrVlkommen.setBounds(22, 151, 587, 165);
		startPanel.add(txtrVlkommen);
		
		JPanel wareListPanel = new JPanel();
		wareListPanel.setBackground(Color.LIGHT_GRAY);
		mainPanel.add(wareListPanel, "name_1570938026365695");
		wareListPanel.setLayout(null);
		
		JPanel breadcrumPanel = new JPanel();
		breadcrumPanel.setBounds(0, 0, 624, 25);
		wareListPanel.add(breadcrumPanel);
		breadcrumPanel.setLayout(null);
		
		JLabel gridViewLbl = new JLabel("");
		gridViewLbl.setIcon(new ImageIcon(IMatView.class.getResource("/lib/GridIcon21.png")));
		gridViewLbl.setBounds(561, 2, 21, 21);
		breadcrumPanel.add(gridViewLbl);
		
		JLabel listViewLbl = new JLabel("");
		listViewLbl.setIcon(new ImageIcon(IMatView.class.getResource("/lib/listIcon21.png")));
		listViewLbl.setBounds(596, 2, 21, 21);
		breadcrumPanel.add(listViewLbl);
		

		searchFld.selectAll();
	}
}

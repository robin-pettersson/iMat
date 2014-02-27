import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

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
import javax.swing.tree.TreeSelectionModel;

import java.awt.Dimension;
import javax.swing.JScrollPane;


public class IMatView extends JFrame {

	private JPanel contentPane;
	private JTextField searchFld;
	private iMatNavController navController = iMatNavController.getInstance();
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
		
		JPanel searchPanel = new JPanel();
		searchPanel.setBackground(Color.LIGHT_GRAY);
		searchPanel.setBounds(188, 34, 393, 32);
		toolBar.add(searchPanel);
		searchPanel.setLayout(null);
		
		searchFld = new JTextField();
		searchFld.setBounds(0, 0, 264, 32);
		searchPanel.add(searchFld);
		searchFld.setToolTipText("Sök Produkt");
		searchFld.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				searchFld.selectAll();
				
			}
		});
		searchFld.setForeground(Color.GRAY);
		searchFld.setFont(new Font("HelvLight", Font.PLAIN, 16));
		searchFld.setText("Sök produkt..");
		searchFld.setColumns(10);
		
		JButton searchBtn = new JButton("Sök");
		searchBtn.setBounds(276, 1, 117, 30);
		searchPanel.add(searchBtn);
		searchBtn.setBackground(SystemColor.window);
		searchBtn.setToolTipText("Sök Produkt");
		searchBtn.setForeground(Color.DARK_GRAY);
		searchBtn.setFont(new Font("HelvLight", Font.PLAIN, 16));
		

		searchFld.selectAll();
		
		JPanel accountPanel = new JPanel();
		accountPanel.setBackground(Color.LIGHT_GRAY);
		accountPanel.setBounds(640, 7, 165, 27);
		toolBar.add(accountPanel);
		accountPanel.setLayout(null);
		
		JLabel logInLbl = new JLabel("Logga in");
		logInLbl.setBounds(91, 0, 74, 27);
		accountPanel.add(logInLbl);
		logInLbl.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel registerLbl = new JLabel("Registrera");
		registerLbl.setBounds(0, 0, 79, 27);
		accountPanel.add(registerLbl);
		registerLbl.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel seperatorLbl = new JLabel("|");
		seperatorLbl.setBounds(82, 7, 16, 14);
		accountPanel.add(seperatorLbl);
		seperatorLbl.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JPanel cashierPanel = new JPanel();
		cashierPanel.setBackground(Color.LIGHT_GRAY);
		cashierPanel.setBounds(731, 46, 74, 42);
		toolBar.add(cashierPanel);
		cashierPanel.setLayout(null);
		
		JLabel checkOutLbl = new JLabel("Kassa");
		checkOutLbl.setBounds(0, 28, 74, 14);
		cashierPanel.add(checkOutLbl);
		checkOutLbl.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel cartLbl = new JLabel("Kundkorg");
		cartLbl.setBounds(0, 0, 74, 32);
		cashierPanel.add(cartLbl);
		cartLbl.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
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
		wareListPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel breadcrumPanel = new JPanel();
		breadcrumPanel.setBackground(new Color(200, 200, 200));
		breadcrumPanel.setPreferredSize(new Dimension(10, 25));
		breadcrumPanel.setSize(new Dimension(0, 25));
		breadcrumPanel.setMinimumSize(new Dimension(10, 25));
		wareListPanel.add(breadcrumPanel, BorderLayout.NORTH);
		breadcrumPanel.setLayout(null);
		
		JLabel gridViewLbl = new JLabel("");
		gridViewLbl.setBounds(603, 2, 21, 21);
		gridViewLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		breadcrumPanel.add(gridViewLbl);
		
		JLabel listViewLbl = new JLabel("");
		listViewLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		listViewLbl.setBounds(572, 2, 21, 21);
		breadcrumPanel.add(listViewLbl);
		
		JScrollPane wareContainerScroll = new JScrollPane();
		wareContainerScroll.setBackground(Color.LIGHT_GRAY);
		wareListPanel.add(wareContainerScroll, BorderLayout.CENTER);
		
		JPanel shoppingListPanel = new JPanel();
		shoppingListPanel.setBackground(Color.LIGHT_GRAY);
		mainPanel.add(shoppingListPanel, "name_176541927032183");
		
		//Code for creating the the layout of the navigationTree which is created later
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
		DefaultMutableTreeNode node_1;
		DefaultMutableTreeNode node_2;
		root.add(new DefaultMutableTreeNode("Favourites"));
		root.add(new DefaultMutableTreeNode("Dairies"));
		node_1 = new DefaultMutableTreeNode("Meat and Fish");
		node_1.add(new DefaultMutableTreeNode("Meat"));
		node_1.add(new DefaultMutableTreeNode("Fish"));
		root.add(node_1);
		node_1 = new DefaultMutableTreeNode("Fruits and Vegetables");
		node_2 = new DefaultMutableTreeNode("Fruits");
		node_2.add(new DefaultMutableTreeNode("Berry"));
		node_2.add(new DefaultMutableTreeNode("Citrus Fruit"));
		node_2.add(new DefaultMutableTreeNode("Exotic Fruit"));
		node_2.add(new DefaultMutableTreeNode("Melons"));
		node_2.add(new DefaultMutableTreeNode("Fruit"));
		node_1.add(node_2);
		node_2 = new DefaultMutableTreeNode("Vegetables");
		node_2.add(new DefaultMutableTreeNode("Root Vegetable"));
		node_2.add(new DefaultMutableTreeNode("Vegetable Fruit"));
		node_2.add(new DefaultMutableTreeNode("Cabbage"));
		node_1.add(node_2);
		root.add(node_1);
		root.add(new DefaultMutableTreeNode("Bread"));
		node_1 = new DefaultMutableTreeNode("Drinks");
		node_1.add(new DefaultMutableTreeNode("Hot Drinks"));
		node_1.add(new DefaultMutableTreeNode("Cold Drinks"));
		root.add(node_1);
		node_1 = new DefaultMutableTreeNode("Carbs");
		node_1.add(new DefaultMutableTreeNode("Pasta"));
		node_1.add(new DefaultMutableTreeNode("Potato Rice"));
		root.add(node_1);
		root.add(new DefaultMutableTreeNode("Sweet"));
		node_1 = new DefaultMutableTreeNode("Plants");
		node_1.add(new DefaultMutableTreeNode("Pod"));
		node_1.add(new DefaultMutableTreeNode("Nuts and Seeds"));
		root.add(node_1);
		root.add(new DefaultMutableTreeNode("Herb"));
		root.add(new DefaultMutableTreeNode("Fluor Sugar Salt"));
		
		JPanel sidePanel = new JPanel();
		sidePanel.setBackground(Color.LIGHT_GRAY);
		sidePanel.setBounds(0, 100, 191, 535);
		contentPane.add(sidePanel);
		sidePanel.setLayout(null);
		
				//Navigation tree created using the root system established above
				final JTree navigationTree = new JTree(root);
				navigationTree.setBounds(10, 11, 170, 266);
				sidePanel.add(navigationTree);
				navigationTree.setRootVisible(false);
				navigationTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
				navigationTree.addTreeSelectionListener(navController); 
	}
}

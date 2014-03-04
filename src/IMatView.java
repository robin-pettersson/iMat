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
import java.awt.Window.Type;
import java.awt.Component;
import java.awt.Cursor;


public class IMatView extends JFrame {

	private JPanel contentPane;
	private JTextField searchFld;
	private iMatNavController     navController      = iMatNavController.getInstance();
	private iMatToolbarController toolBarController  = iMatToolbarController.getInstance();
	private iMatMainController    mainController     = iMatMainController.getInstance();
	private CheckOutController    checkOutController = CheckOutController.getInstance();
	private CardLayout cardLayout;

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
		setTitle("iMat");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 670);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		final JPanel toolBar = new JPanel();
		toolBar.setBackground(Color.LIGHT_GRAY);
		toolBar.setBorder(new LineBorder(new Color(0, 0, 0)));
		toolBar.setBounds(0, 0, 826, 100);
		contentPane.add(toolBar);

		JLabel iMatLbl = new JLabel("iMat");
		iMatLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		iMatLbl.setBounds(12, 0, 176, 88);
		iMatLbl.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.first((JPanel)toolBar.getParent().getComponent(1));
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
		searchFld.setToolTipText("Search product...");
		searchFld.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				searchFld.selectAll();

			}
		});
		searchFld.setForeground(Color.GRAY);
		searchFld.setFont(new Font("HelvLight", Font.PLAIN, 16));
		searchFld.setText("Search product...");
		searchFld.setColumns(10);

		JButton searchBtn = new JButton("Search");
		searchBtn.setBounds(276, 1, 117, 30);
		searchPanel.add(searchBtn);
		searchBtn.setBackground(SystemColor.window);
		searchBtn.setToolTipText("Search product");
		searchBtn.setForeground(Color.DARK_GRAY);
		searchBtn.setFont(new Font("HelvLight", Font.PLAIN, 16));


		searchFld.selectAll();

		JPanel accountPanel = new JPanel();
		accountPanel.setBackground(Color.LIGHT_GRAY);
		accountPanel.setBounds(640, 7, 165, 27);
		toolBar.add(accountPanel);
		accountPanel.setLayout(null);

		JLabel logInLbl = new JLabel("Log in");
		logInLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logInLbl.setForeground(Color.WHITE);
		logInLbl.setBounds(91, 0, 74, 27);
		accountPanel.add(logInLbl);
		logInLbl.setFont(new Font("HelvLight", Font.BOLD, 16));

		JLabel registerLbl = new JLabel("Sign up");
		registerLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		registerLbl.setForeground(Color.WHITE);
		registerLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		registerLbl.setBounds(0, 0, 79, 27);
		accountPanel.add(registerLbl);
		registerLbl.setFont(new Font("HelvLight", Font.BOLD, 16));

		JLabel seperatorLbl = new JLabel("|");
		seperatorLbl.setForeground(Color.WHITE);
		seperatorLbl.setBounds(82, 7, 16, 14);
		accountPanel.add(seperatorLbl);
		seperatorLbl.setFont(new Font("HelvLight", Font.PLAIN, 16));

		JPanel cashierPanel = new JPanel();
		cashierPanel.setBackground(Color.LIGHT_GRAY);
		cashierPanel.setBounds(721, 46, 84, 42);
		toolBar.add(cashierPanel);
		cashierPanel.setLayout(null);

		JLabel checkOutLbl = new JLabel("Check-out");
		checkOutLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		checkOutLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel p = (JPanel) toolBar.getParent().getComponent(1);
				mainController.gotoCard(p , "checkOutPanel");
				checkOutController.gotoCheckOut(p);
			}
		});
		checkOutLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		checkOutLbl.setForeground(Color.WHITE);
		checkOutLbl.setBounds(0, 28, 84, 14);
		cashierPanel.add(checkOutLbl);
		checkOutLbl.setFont(new Font("HelvLight", Font.BOLD, 16));

		JLabel cartLbl = new JLabel("Cart");
		cartLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cartLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel p = (JPanel) toolBar.getParent().getComponent(1);
				checkOutController.gotoCart(p);
			}
		});
		cartLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		cartLbl.setForeground(Color.WHITE);
		cartLbl.setBounds(0, 0, 84, 32);
		cashierPanel.add(cartLbl);
		cartLbl.setFont(new Font("HelvLight", Font.BOLD, 16));

		JPanel mainPanel = new JPanel();
		mainPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		mainPanel.setBounds(190, 100, 636, 541);
		contentPane.add(mainPanel);
		mainPanel.setLayout(new CardLayout(0, 0));
		cardLayout =(CardLayout) mainPanel.getLayout();

		JPanel startPanel = new JPanel();
		startPanel.setBackground(Color.LIGHT_GRAY);
		mainPanel.add(startPanel, "startPanel");
		startPanel.setLayout(null);

		JTextArea welcomeTxt = new JTextArea();
		welcomeTxt.setEditable(false);
		welcomeTxt.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		welcomeTxt.setWrapStyleWord(true);
		welcomeTxt.setLineWrap(true);
		welcomeTxt.setFont(new Font("HelvLight", Font.PLAIN, 16));
		welcomeTxt.setColumns(1);
		welcomeTxt.setBackground(Color.LIGHT_GRAY);
		welcomeTxt.setText("Welcome to iMat!" + "\n" +
				"This is an application for you who doesnt have time to go to the shopping mall, " +
				"who want to do the shopping comfortably from home." + "\n"
				+  "You order, we deliver!");
		welcomeTxt.setBounds(21, 11, 587, 93);
		startPanel.add(welcomeTxt);

		JPanel startShoppingPanel = new JPanel();
		startShoppingPanel.setBackground(Color.LIGHT_GRAY);
		startShoppingPanel.setBounds(21, 113, 587, 415);
		startPanel.add(startShoppingPanel);

		JPanel wareListPanel = new JPanel();
		wareListPanel.setBackground(Color.LIGHT_GRAY);
		mainPanel.add(wareListPanel, "wareListPanel");
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

		JPanel wareContainerScroll = new JPanel();
		wareContainerScroll.setBackground(Color.LIGHT_GRAY);
		wareListPanel.add(wareContainerScroll, BorderLayout.CENTER);

		JPanel shoppingListPanel = new JPanel();
		shoppingListPanel.setBackground(Color.LIGHT_GRAY);
		mainPanel.add(shoppingListPanel, "shoppingListPanel");

		JPanel customerPanel = new JPanel();
		customerPanel.setBackground(Color.LIGHT_GRAY);
		mainPanel.add(customerPanel, "customerPanel");

		CheckOutView checkOutPanel = new CheckOutView();
		checkOutPanel.setBackground(Color.LIGHT_GRAY);
		mainPanel.add(checkOutPanel, "checkOutPanel");

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
		navigationTree.setBackground(Color.LIGHT_GRAY);
		navigationTree.setBounds(10, 11, 170, 513);
		sidePanel.add(navigationTree);
		navigationTree.setRootVisible(false);
		navigationTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		navigationTree.addTreeSelectionListener(navController);
	}
}

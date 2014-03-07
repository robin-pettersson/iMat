import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.imageio.spi.ImageReaderSpi;
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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;
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

import se.chalmers.ait.dat215.project.IMatDataHandler;

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
	private UserDataController    dataController     = UserDataController.getInstance();
	private CardLayout cardLayout;

	private IMatDataHandler iMat = IMatDataHandler.getInstance();


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
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("shutdown");
				iMat.getShoppingCart().clear();
				iMat.shutDown();
				JFrame frame = (JFrame) e.getWindow();
				frame.dispose();
			}
		});
		
		setBackground(Color.LIGHT_GRAY);
		setTitle("iMat");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1026, 691);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		final JPanel toolBar = new JPanel();
		toolBar.setBackground(Color.LIGHT_GRAY);
		toolBar.setBorder(new LineBorder(new Color(0, 0, 0)));
		toolBar.setBounds(0, 0, 1025, 100);
		contentPane.add(toolBar);

		JLabel iMatLbl = new JLabel("iMat");
		iMatLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		iMatLbl.setBounds(12, 0, 176, 88);
		iMatLbl.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.first((JPanel)toolBar.getParent().getComponent(1));
			}
		});
		toolBar.setLayout(null);
		iMatLbl.setToolTipText("Back to startpage");
		iMatLbl.setForeground(Color.WHITE);
		iMatLbl.setFont(new Font("HelvLight", Font.PLAIN, 85));
		toolBar.add(iMatLbl);

		JPanel searchPanel = new JPanel();
		searchPanel.setBackground(Color.LIGHT_GRAY);
		searchPanel.setBounds(188, 50, 636, 32);
		toolBar.add(searchPanel);
		searchPanel.setLayout(null);

		searchFld = new JTextField();
		searchFld.setBounds(0, 0, 507, 32);
		searchPanel.add(searchFld);
		searchFld.setToolTipText("");
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
		searchBtn.setBounds(519, 1, 117, 30);
		searchPanel.add(searchBtn);
		searchBtn.setBackground(SystemColor.window);
		searchBtn.setToolTipText("");
		searchBtn.setForeground(Color.DARK_GRAY);
		searchBtn.setFont(new Font("HelvLight", Font.PLAIN, 16));


		searchFld.selectAll();

		JPanel accountPanel = new JPanel();
		accountPanel.setBackground(Color.LIGHT_GRAY);
		accountPanel.setBounds(848, 7, 177, 32);
		toolBar.add(accountPanel);
		accountPanel.setLayout(null);

		final JLabel logInLbl = new JLabel("Sign in");
		logInLbl.setToolTipText("");
		logInLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JLabel l = (JLabel) ((JPanel) toolBar.getComponents()[2]).getComponent(1);
				JPanel p = (JPanel)toolBar.getParent().getComponent(1);
				CardLayout layout = (CardLayout) p.getLayout();
				if(logInLbl.getText() == "Sign in"){
					logInLbl.setText("Sign out");
					l.setText("Stefan");
				}
				else{
					logInLbl.setText("Sign in");
					l.setText("Sign up");
					layout.first(p);
				}
			}
		});
		logInLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logInLbl.setForeground(Color.WHITE);
		logInLbl.setBounds(100, 5, 73, 19);
		accountPanel.add(logInLbl);
		logInLbl.setFont(new Font("HelvLight", Font.BOLD, 16));

		final JLabel registerLbl = new JLabel("Sign up");
		registerLbl.setToolTipText("");
		registerLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel p = (JPanel)toolBar.getParent().getComponent(1);
				CardLayout layout = (CardLayout) p.getLayout();
				if(registerLbl.getText() == "Stefan"){
					layout.show(p, "customerPanel");
					((JTabbedPane) ((JPanel)p.getComponent(3)).getComponent(0)).setSelectedIndex(0);
				} else {

					RegisterPopUp regPop = new RegisterPopUp("","","","","","");
				}

			}
		});
		registerLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		registerLbl.setForeground(Color.WHITE);
		registerLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		registerLbl.setBounds(13, 4, 75, 20);
		accountPanel.add(registerLbl);
		registerLbl.setFont(new Font("HelvLight", Font.BOLD, 16));

		JLabel seperatorLbl = new JLabel("|");
		seperatorLbl.setForeground(Color.WHITE);
		seperatorLbl.setBounds(91, 7, 16, 14);
		accountPanel.add(seperatorLbl);
		seperatorLbl.setFont(new Font("HelvLight", Font.PLAIN, 16));

		JPanel cashierPanel = new JPanel();
		cashierPanel.setBackground(Color.LIGHT_GRAY);
		cashierPanel.setBounds(906, 46, 119, 42);
		toolBar.add(cashierPanel);
		cashierPanel.setLayout(null);

		JLabel checkOutLbl = new JLabel("Check-out");
		checkOutLbl.setToolTipText("Go to check out");
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
		checkOutLbl.setBounds(12, 25, 84, 14);
		cashierPanel.add(checkOutLbl);
		checkOutLbl.setFont(new Font("HelvLight", Font.BOLD, 16));

		JLabel cartLbl = new JLabel("Cart");
		cartLbl.setToolTipText("Go to shopping cart");
		cartLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cartLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel p = (JPanel) toolBar.getParent().getComponent(1);
				checkOutController.gotoCart(p);
				mainController.gotoCard(p , "checkOutPanel");
			}
		});
		cartLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		cartLbl.setForeground(Color.WHITE);
		cartLbl.setBounds(62, 0, 34, 15);
		cashierPanel.add(cartLbl);
		cartLbl.setFont(new Font("HelvLight", Font.BOLD, 16));

		JPanel butconPanel = new JPanel();
		butconPanel.setBorder(null);
		butconPanel.setBackground(Color.LIGHT_GRAY);
		butconPanel.setBounds(752, 7, 95, 32);
		toolBar.add(butconPanel);
		butconPanel.setLayout(null);

		JLabel shoppingListButcon = new JLabel("");
		shoppingListButcon.addMouseListener(new MouseAdapter() {

			/**
			 * List butcon clicked
			 */
			@Override
			public void mouseClicked(MouseEvent e) {
				if(registerLbl.getText() == "Stefan"){
					JPanel p = (JPanel)toolBar.getParent().getComponent(1);
					CardLayout layout = (CardLayout) p.getLayout();
					layout.show(p, "customerPanel");
					((JTabbedPane) ((JPanel)p.getComponent(3)).getComponent(0)).setSelectedIndex(0);
				} else {
					JOptionPane.showMessageDialog(null, "You need to be signed in for this feature!", "iMat", EXIT_ON_CLOSE);
				}
			}
		});
		shoppingListButcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		shoppingListButcon.setToolTipText("Shopping Lists");
		shoppingListButcon.setBounds(0, 0, 32, 32);
		butconPanel.add(shoppingListButcon);
		shoppingListButcon.setIcon(new ImageIcon(IMatView.class.getResource("/iconz/list-icon2.png")));
		
		JLabel favouriteButcon = new JLabel("");
		favouriteButcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(registerLbl.getText() == "Stefan"){
					JPanel p = (JPanel)toolBar.getParent().getComponent(1);
					CardLayout layout = (CardLayout) p.getLayout();
					layout.show(p, "customerPanel");
					((JTabbedPane) ((JPanel)p.getComponent(3)).getComponent(0)).setSelectedIndex(0);
				} else {
					JOptionPane.showMessageDialog(null, "You need to be signed in for this feature!", "iMat", EXIT_ON_CLOSE);
				}
			}
		});
		favouriteButcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		favouriteButcon.setIcon(new ImageIcon(IMatView.class.getResource("/iconz/star-icon.png")));
		favouriteButcon.setToolTipText("Favourite items");
		favouriteButcon.setBounds(42, 0, 32, 32);
		butconPanel.add(favouriteButcon);

		JLabel lblDesignedByDat = new JLabel("Designed by dat215 in Gothenburg.");
		lblDesignedByDat.setToolTipText("");
		lblDesignedByDat.setHorizontalAlignment(SwingConstants.LEFT);
		lblDesignedByDat.setForeground(Color.WHITE);
		lblDesignedByDat.setFont(new Font("HelvLight", Font.PLAIN, 12));
		lblDesignedByDat.setBounds(188, 24, 215, 14);
		toolBar.add(lblDesignedByDat);

		JPanel mainPanel = new JPanel();
		mainPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		mainPanel.setBounds(190, 100, 636, 563);
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

		JLabel label = new JLabel("");
		label.setBackground(Color.BLACK);
		label.setBorder(new LineBorder(new Color(0, 0, 0)));
		label.setIcon(new ImageIcon(IMatView.class.getResource("/Pics/banner-smaller.png")));
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("HelvLight", Font.PLAIN, 14));
		label.setBounds(21, 116, 537, 400);
		startPanel.add(label);

		JPanel wareListPanel = new JPanel();
		wareListPanel.setBackground(Color.LIGHT_GRAY);
		mainPanel.add(wareListPanel, "wareListPanel");
		wareListPanel.setLayout(null);

		JPanel breadcrumPanel = new JPanel();
		breadcrumPanel.setLocation(0, 0);
		breadcrumPanel.setBackground(new Color(200, 200, 200));
		breadcrumPanel.setPreferredSize(new Dimension(10, 33));
		breadcrumPanel.setSize(new Dimension(634, 33));
		breadcrumPanel.setMinimumSize(new Dimension(10, 25));
		wareListPanel.add(breadcrumPanel);
		breadcrumPanel.setLayout(null);

		JLabel gridViewLbl = new JLabel("");
		gridViewLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				navController.gridView = true;
				navController.currentPage = 0;
				navController.listItems();
				navController.updatePageLabel();
			}
		});
		gridViewLbl.setToolTipText("Change to grid-view");
		gridViewLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		gridViewLbl.setIcon(new ImageIcon(IMatView.class.getResource("/iconz/thumbnail-view.png")));
		gridViewLbl.setBounds(603, 2, 31, 31);
		gridViewLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		breadcrumPanel.add(gridViewLbl);

		JLabel listViewLbl = new JLabel("");
		listViewLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				navController.gridView = false;
				navController.currentPage = 0;
				navController.listItems();
				navController.updatePageLabel();
			}
		});
		listViewLbl.setToolTipText("Change to list-view");
		listViewLbl.setIcon(new ImageIcon(IMatView.class.getResource("/iconz/list-view-icon.png")));
		listViewLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		listViewLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		listViewLbl.setBounds(570, 2, 31, 31);
		breadcrumPanel.add(listViewLbl);

		JPanel wareContainerScroll = new JPanel();
		wareContainerScroll.setBounds(0, 33, 634, 482);
		wareContainerScroll.setBackground(Color.LIGHT_GRAY);
		wareListPanel.add(wareContainerScroll);

		JPanel pyramidePanel = new JPanel();
		pyramidePanel.setPreferredSize(new Dimension(635, 35));
		pyramidePanel.setBackground(Color.LIGHT_GRAY);
		pyramidePanel.setBounds(-1, 514, 635, 35);
		wareListPanel.add(pyramidePanel);
		pyramidePanel.setLayout(null);

		JLabel warePrevPageLabel = new JLabel("<<");
		warePrevPageLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(navController.currentPage > 0){
					navController.currentPage--;
					navController.listItems();
					navController.updatePageLabel();
				}
			}
		});
		warePrevPageLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		warePrevPageLabel.setBounds(11, 0, 28, 26);
		warePrevPageLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		warePrevPageLabel.setToolTipText("Back");
		warePrevPageLabel.setHorizontalAlignment(SwingConstants.LEFT);
		warePrevPageLabel.setForeground(Color.GRAY);
		warePrevPageLabel.setFont(new Font("HelvLight", Font.BOLD, 20));
		pyramidePanel.add(warePrevPageLabel);

		JLabel warePyramidLabel = new JLabel("1/1");
		warePyramidLabel.setBounds(315, 0, 31, 26);
		warePyramidLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		warePyramidLabel.setToolTipText("Current page");
		warePyramidLabel.setHorizontalAlignment(SwingConstants.CENTER);
		warePyramidLabel.setForeground(Color.GRAY);
		warePyramidLabel.setFont(new Font("HelvLight", Font.BOLD, 20));
		pyramidePanel.add(warePyramidLabel);

		JLabel wareNextPageLabel = new JLabel(">>");
		wareNextPageLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(navController.currentPage < navController.maxPage){
					navController.currentPage++;
					navController.listItems();
					navController.updatePageLabel();
				}
			}
		});
		wareNextPageLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		wareNextPageLabel.setBounds(591, 0, 28, 26);
		wareNextPageLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		wareNextPageLabel.setToolTipText("Next");
		wareNextPageLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		wareNextPageLabel.setForeground(Color.DARK_GRAY);
		wareNextPageLabel.setFont(new Font("HelvLight", Font.BOLD, 20));
		pyramidePanel.add(wareNextPageLabel);

		JPanel shoppingListPanel = new JPanel();
		shoppingListPanel.setBackground(Color.LIGHT_GRAY);
		mainPanel.add(shoppingListPanel, "shoppingListPanel");

		CustomerTabView customerPanel = new CustomerTabView();
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
		root.add(new DefaultMutableTreeNode("Flour Sugar Salt"));

		JPanel sidePanel = new JPanel();
		sidePanel.setBackground(Color.LIGHT_GRAY);
		sidePanel.setBounds(0, 100, 191, 563);
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

		RightShoppingCart rCart = RightShoppingCart.getInstance();
		JPanel rCartPanel = rCart.panel;

		JPanel cartPanel = new JPanel();
		cartPanel.setName("cartPanel");
		cartPanel.setLayout(null);
		cartPanel.setBackground(Color.LIGHT_GRAY);
		cartPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		cartPanel.setBounds(825, 100, 200, 563);
		cartPanel.add(new RightShoppingCart());
		cartPanel.add(rCartPanel);
		contentPane.add(cartPanel);
	}
}

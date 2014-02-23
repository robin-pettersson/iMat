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
		navigationList.setFont(new Font("HelvLight", Font.PLAIN, 14));
		navigationList.setRootVisible(false);
		navigationList.setBackground(Color.LIGHT_GRAY);
		navigationList.setBounds(10, 11, 172, 266);
		sidePanel.add(navigationList);
		
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
		
		JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP);
		tabs.setBackground(Color.LIGHT_GRAY);
		tabs.setFont(new Font("HelvLight", Font.PLAIN, 15));
		mainPanel.add(tabs, "name_4291341636438");
		
		JPanel customerTab = new JPanel();
		customerTab.setBackground(Color.LIGHT_GRAY);
		tabs.addTab("Kunduppgifter", null, customerTab, null);
		customerTab.setLayout(null);
		
		JPanel infoPanel = new JPanel();
		infoPanel.setBackground(Color.LIGHT_GRAY);
		infoPanel.setBounds(12, 12, 344, 174);
		customerTab.add(infoPanel);
		
		JLabel lblFrnamn = new JLabel("Förnamn");
		lblFrnamn.setForeground(Color.DARK_GRAY);
		lblFrnamn.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel lblEfternamn = new JLabel("Efternamn");
		lblEfternamn.setForeground(Color.DARK_GRAY);
		lblEfternamn.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel lblGatunamnb = new JLabel("Gatunamn 9b");
		lblGatunamnb.setForeground(Color.DARK_GRAY);
		lblGatunamnb.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel lblOrtnamn = new JLabel("Ortnamn");
		lblOrtnamn.setForeground(Color.DARK_GRAY);
		lblOrtnamn.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel label = new JLabel("682 58");
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel lblEmailadressemailcom = new JLabel("emailadress@email.com");
		lblEmailadressemailcom.setForeground(Color.DARK_GRAY);
		lblEmailadressemailcom.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JButton btnndra = new JButton("Ändra");
		btnndra.setForeground(Color.DARK_GRAY);
		btnndra.setFont(new Font("HelvLight", Font.PLAIN, 14));
		GroupLayout gl_infoPanel = new GroupLayout(infoPanel);
		gl_infoPanel.setHorizontalGroup(
			gl_infoPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_infoPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_infoPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEmailadressemailcom, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
						.addGroup(gl_infoPanel.createSequentialGroup()
							.addComponent(lblFrnamn, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblEfternamn, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
						.addComponent(lblGatunamnb, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
						.addGroup(gl_infoPanel.createSequentialGroup()
							.addComponent(label)
							.addGap(18)
							.addComponent(lblOrtnamn, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
						.addComponent(btnndra, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_infoPanel.setVerticalGroup(
			gl_infoPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_infoPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_infoPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFrnamn)
						.addComponent(lblEfternamn))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblGatunamnb)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_infoPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(label)
						.addComponent(lblOrtnamn))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblEmailadressemailcom)
					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
					.addComponent(btnndra, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		infoPanel.setLayout(gl_infoPanel);
		
		JPanel favouriteTab = new JPanel();
		favouriteTab.setBackground(Color.LIGHT_GRAY);
		tabs.addTab("Favoriter", null, favouriteTab, null);
		
		JPanel listTab = new JPanel();
		listTab.setBackground(Color.LIGHT_GRAY);
		tabs.addTab("Inköpslistor", null, listTab, null);
		listTab.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 121, 629, 119);
		listTab.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.LIGHT_GRAY);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(12, 13, 230, 94);
		panel_2.add(panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{112, 85, 0};
		gbl_panel_3.rowHeights = new int[]{26, 19, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel label_6 = new JLabel("Lunchlistan");
		label_6.setForeground(Color.DARK_GRAY);
		label_6.setFont(new Font("HelvLight", Font.BOLD, 20));
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 0;
		gbc_label_6.gridy = 0;
		panel_3.add(label_6, gbc_label_6);
		
		JLabel label_7 = new JLabel("- 3 varor");
		label_7.setForeground(Color.DARK_GRAY);
		label_7.setFont(new Font("HelvLight", Font.BOLD, 20));
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_7.insets = new Insets(0, 0, 5, 0);
		gbc_label_7.gridx = 1;
		gbc_label_7.gridy = 0;
		panel_3.add(label_7, gbc_label_7);
		
		JLabel label_8 = new JLabel("Visa/Ändra");
		label_8.setForeground(Color.GRAY);
		label_8.setFont(new Font("HelvLight", Font.BOLD, 15));
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.anchor = GridBagConstraints.NORTHEAST;
		gbc_label_8.gridx = 1;
		gbc_label_8.gridy = 1;
		panel_3.add(label_8, gbc_label_8);
		
		JLabel label_9 = new JLabel("X");
		label_9.setForeground(Color.RED);
		label_9.setFont(new Font("gargi", Font.BOLD, 24));
		label_9.setBounds(593, 13, 24, 26);
		panel_2.add(label_9);
		
		JLabel label_10 = new JLabel("Lägg i kundkorgen");
		label_10.setForeground(Color.GRAY);
		label_10.setFont(new Font("HelvLight", Font.BOLD, 15));
		label_10.setBounds(470, 80, 147, 36);
		panel_2.add(label_10);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 241, 629, 119);
		listTab.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(12, 13, 230, 94);
		panel.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{112, 85, 0};
		gbl_panel_1.rowHeights = new int[]{26, 19, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel label_1 = new JLabel("Lunchlistan");
		label_1.setForeground(Color.DARK_GRAY);
		label_1.setFont(new Font("HelvLight", Font.BOLD, 20));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 0;
		panel_1.add(label_1, gbc_label_1);
		
		JLabel label_2 = new JLabel("- 3 varor");
		label_2.setForeground(Color.DARK_GRAY);
		label_2.setFont(new Font("HelvLight", Font.BOLD, 20));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_2.insets = new Insets(0, 0, 5, 0);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 0;
		panel_1.add(label_2, gbc_label_2);
		
		JLabel label_3 = new JLabel("Visa/Ändra");
		label_3.setForeground(Color.GRAY);
		label_3.setFont(new Font("HelvLight", Font.BOLD, 15));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.NORTHEAST;
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 1;
		panel_1.add(label_3, gbc_label_3);
		
		JLabel label_4 = new JLabel("X");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("gargi", Font.BOLD, 24));
		label_4.setBounds(593, 13, 24, 26);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Lägg i kundkorgen");
		label_5.setForeground(Color.GRAY);
		label_5.setFont(new Font("HelvLight", Font.BOLD, 15));
		label_5.setBounds(470, 80, 147, 36);
		panel.add(label_5);
		
		JPanel listCard1 = new JPanel();
		listCard1.setBackground(Color.LIGHT_GRAY);
		listCard1.setBorder(new LineBorder(new Color(0, 0, 0)));
		listCard1.setBounds(0, 362, 629, 119);
		listTab.add(listCard1);
		listCard1.setLayout(null);
		
		JPanel listCardPanel1 = new JPanel();
		listCardPanel1.setBackground(Color.LIGHT_GRAY);
		listCardPanel1.setBounds(12, 13, 230, 94);
		listCard1.add(listCardPanel1);
		GridBagLayout gbl_listCardPanel1 = new GridBagLayout();
		gbl_listCardPanel1.columnWidths = new int[]{112, 85, 0};
		gbl_listCardPanel1.rowHeights = new int[]{26, 19, 0};
		gbl_listCardPanel1.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_listCardPanel1.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		listCardPanel1.setLayout(gbl_listCardPanel1);
		
		JLabel lblListnamn = new JLabel("Lunchlistan");
		GridBagConstraints gbc_lblListnamn = new GridBagConstraints();
		gbc_lblListnamn.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblListnamn.insets = new Insets(0, 0, 5, 5);
		gbc_lblListnamn.gridx = 0;
		gbc_lblListnamn.gridy = 0;
		listCardPanel1.add(lblListnamn, gbc_lblListnamn);
		lblListnamn.setForeground(Color.DARK_GRAY);
		lblListnamn.setFont(new Font("HelvLight", Font.BOLD, 20));
		
		JLabel lblVaror = new JLabel("- 3 varor");
		lblVaror.setForeground(Color.DARK_GRAY);
		lblVaror.setFont(new Font("HelvLight", Font.BOLD, 20));
		GridBagConstraints gbc_lblVaror = new GridBagConstraints();
		gbc_lblVaror.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblVaror.insets = new Insets(0, 0, 5, 0);
		gbc_lblVaror.gridx = 1;
		gbc_lblVaror.gridy = 0;
		listCardPanel1.add(lblVaror, gbc_lblVaror);
		
		JLabel lblVisandra = new JLabel("Visa/Ändra");
		GridBagConstraints gbc_lblVisandra = new GridBagConstraints();
		gbc_lblVisandra.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblVisandra.gridx = 1;
		gbc_lblVisandra.gridy = 1;
		listCardPanel1.add(lblVisandra, gbc_lblVisandra);
		lblVisandra.setForeground(Color.GRAY);
		lblVisandra.setFont(new Font("HelvLight", Font.BOLD, 15));
		
		JLabel lblX = new JLabel("X");
		lblX.setForeground(Color.RED);
		lblX.setIcon(null);
		lblX.setFont(new Font("gargi", Font.BOLD, 24));
		lblX.setBounds(593, 13, 24, 26);
		listCard1.add(lblX);
		
		JLabel lblLggTillListan = new JLabel("Lägg i kundkorgen");
		lblLggTillListan.setForeground(Color.GRAY);
		lblLggTillListan.setFont(new Font("HelvLight", Font.BOLD, 15));
		lblLggTillListan.setBounds(470, 80, 147, 36);
		listCard1.add(lblLggTillListan);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBounds(0, 0, 629, 119);
		listTab.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(12, 13, 230, 94);
		panel_4.add(panel_5);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{112, 85, 0};
		gbl_panel_5.rowHeights = new int[]{26, 19, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		JLabel label_11 = new JLabel("Lunchlistan");
		label_11.setVerticalAlignment(SwingConstants.TOP);
		label_11.setHorizontalAlignment(SwingConstants.LEFT);
		label_11.setForeground(Color.DARK_GRAY);
		label_11.setFont(new Font("HelvLight", Font.BOLD, 20));
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 0;
		gbc_label_11.gridy = 0;
		panel_5.add(label_11, gbc_label_11);
		
		JLabel label_12 = new JLabel("- 3 varor");
		label_12.setHorizontalAlignment(SwingConstants.LEFT);
		label_12.setForeground(Color.DARK_GRAY);
		label_12.setFont(new Font("HelvLight", Font.BOLD, 20));
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_12.insets = new Insets(0, 0, 5, 0);
		gbc_label_12.gridx = 1;
		gbc_label_12.gridy = 0;
		panel_5.add(label_12, gbc_label_12);
		
		JLabel label_13 = new JLabel("Visa/Ändra");
		label_13.setForeground(Color.GRAY);
		label_13.setFont(new Font("HelvLight", Font.BOLD, 15));
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.anchor = GridBagConstraints.NORTHEAST;
		gbc_label_13.gridx = 1;
		gbc_label_13.gridy = 1;
		panel_5.add(label_13, gbc_label_13);
		
		JLabel label_14 = new JLabel("X");
		label_14.setForeground(Color.RED);
		label_14.setFont(new Font("gargi", Font.BOLD, 24));
		label_14.setBounds(593, 13, 24, 26);
		panel_4.add(label_14);
		
		JLabel label_15 = new JLabel("Lägg i kundkorgen");
		label_15.setForeground(Color.GRAY);
		label_15.setFont(new Font("HelvLight", Font.BOLD, 15));
		label_15.setBounds(470, 80, 147, 36);
		panel_4.add(label_15);
		
		JPanel navigationPanel = new JPanel();
		navigationPanel.setBackground(Color.LIGHT_GRAY);
		navigationPanel.setBounds(0, 481, 629, 27);
		listTab.add(navigationPanel);
		GridBagLayout gbl_navigationPanel = new GridBagLayout();
		gbl_navigationPanel.columnWidths = new int[]{28, 28, 31, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_navigationPanel.rowHeights = new int[]{26, 0};
		gbl_navigationPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_navigationPanel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		navigationPanel.setLayout(gbl_navigationPanel);
		
		JLabel label_16 = new JLabel("<<");
		label_16.setToolTipText("Föregående");
		GridBagConstraints gbc_label_16 = new GridBagConstraints();
		gbc_label_16.anchor = GridBagConstraints.WEST;
		gbc_label_16.insets = new Insets(0, 0, 0, 5);
		gbc_label_16.gridx = 1;
		gbc_label_16.gridy = 0;
		navigationPanel.add(label_16, gbc_label_16);
		label_16.setForeground(Color.GRAY);
		label_16.setVerticalAlignment(SwingConstants.BOTTOM);
		label_16.setHorizontalAlignment(SwingConstants.LEFT);
		label_16.setFont(new Font("HelvLight", Font.BOLD, 20));
		
		JLabel label_18 = new JLabel("1/2");
		label_18.setToolTipText("Sida 1 av 2");
		label_18.setVerticalAlignment(SwingConstants.BOTTOM);
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setForeground(Color.GRAY);
		label_18.setFont(new Font("HelvLight", Font.BOLD, 20));
		GridBagConstraints gbc_label_18 = new GridBagConstraints();
		gbc_label_18.insets = new Insets(0, 0, 0, 5);
		gbc_label_18.anchor = GridBagConstraints.WEST;
		gbc_label_18.gridx = 11;
		gbc_label_18.gridy = 0;
		navigationPanel.add(label_18, gbc_label_18);
		
		JLabel label_17 = new JLabel(">>");
		label_17.setToolTipText("Nästa");
		GridBagConstraints gbc_label_17 = new GridBagConstraints();
		gbc_label_17.insets = new Insets(0, 0, 0, 5);
		gbc_label_17.anchor = GridBagConstraints.WEST;
		gbc_label_17.gridx = 20;
		gbc_label_17.gridy = 0;
		navigationPanel.add(label_17, gbc_label_17);
		label_17.setVerticalAlignment(SwingConstants.BOTTOM);
		label_17.setHorizontalAlignment(SwingConstants.RIGHT);
		label_17.setForeground(Color.DARK_GRAY);
		label_17.setFont(new Font("HelvLight", Font.BOLD, 20));
		
		JPanel reciteTab = new JPanel();
		reciteTab.setBackground(Color.LIGHT_GRAY);
		tabs.addTab("Kvitton", null, reciteTab, null);
		

		searchFld.selectAll();
	}
}

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
		setBounds(100, 100, 828, 643);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel toolBar = new JPanel();
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
		iMatLbl.setForeground(Color.GRAY);
		iMatLbl.setFont(new Font("HelvLight", Font.PLAIN, 85));
		toolBar.add(iMatLbl);
		
		searchFld = new JTextField();
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
		sidePanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		sidePanel.setBounds(0, 100, 192, 514);
		contentPane.add(sidePanel);
		sidePanel.setLayout(null);
		
		JTree navigationList = new JTree();
		navigationList.setFont(new Font("HelvLight", Font.PLAIN, 14));
		navigationList.setRootVisible(false);
		navigationList.setBackground(new Color(240,240,240));
		navigationList.setBounds(10, 11, 172, 266);
		sidePanel.add(navigationList);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		mainPanel.setBounds(190, 100, 636, 514);
		contentPane.add(mainPanel);
		mainPanel.setLayout(new CardLayout(0, 0));
		
		JPanel startPanel = new JPanel();
		mainPanel.add(startPanel, "name_1276016334013");
		startPanel.setLayout(null);
		
		JLabel lblBannerHr = new JLabel("");
		lblBannerHr.setIcon(new ImageIcon("/home/micke/Documents/iMat-dret/banner.png"));
		lblBannerHr.setBounds(12, 12, 610, 127);
		startPanel.add(lblBannerHr);
		
		JLabel lblVlkommenTillImat = new JLabel("Välkommen till iMat!\niMat är en applikation för dig som inte hinner handla din mat i affären, utan vill göra det bekvämt hemma, framför datorn. Du beställer, vi levererar!");
		lblVlkommenTillImat.setHorizontalAlignment(SwingConstants.LEFT);
		lblVlkommenTillImat.setVerticalAlignment(SwingConstants.TOP);
		lblVlkommenTillImat.setFont(new Font("HelvLight", Font.PLAIN, 23));
		lblVlkommenTillImat.setBounds(12, 141, 600, 206);
		startPanel.add(lblVlkommenTillImat);
		
		JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP);
		tabs.setFont(new Font("HelvLight", Font.PLAIN, 15));
		mainPanel.add(tabs, "name_4291341636438");
		
		JPanel customerTab = new JPanel();
		tabs.addTab("Kunduppgifter", null, customerTab, null);
		customerTab.setLayout(null);
		
		JLabel lblFrnamn = new JLabel("Förnamn");
		lblFrnamn.setForeground(Color.DARK_GRAY);
		lblFrnamn.setBounds(22, 12, 63, 20);
		lblFrnamn.setFont(new Font("HelvLight", Font.PLAIN, 16));
		customerTab.add(lblFrnamn);
		
		JLabel lblEfternamn = new JLabel("Efternamn");
		lblEfternamn.setForeground(Color.DARK_GRAY);
		lblEfternamn.setFont(new Font("HelvLight", Font.PLAIN, 16));
		lblEfternamn.setBounds(97, 12, 130, 20);
		customerTab.add(lblEfternamn);
		
		JLabel lblGatunamnb = new JLabel("Gatunamn 9b");
		lblGatunamnb.setForeground(Color.DARK_GRAY);
		lblGatunamnb.setFont(new Font("HelvLight", Font.PLAIN, 16));
		lblGatunamnb.setBounds(22, 44, 206, 20);
		customerTab.add(lblGatunamnb);
		
		JLabel label = new JLabel("682 58");
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("HelvLight", Font.PLAIN, 16));
		label.setBounds(22, 76, 63, 20);
		customerTab.add(label);
		
		JLabel lblOrtnamn = new JLabel("Ortnamn");
		lblOrtnamn.setForeground(Color.DARK_GRAY);
		lblOrtnamn.setFont(new Font("HelvLight", Font.PLAIN, 16));
		lblOrtnamn.setBounds(83, 76, 63, 20);
		customerTab.add(lblOrtnamn);
		
		JLabel lblEmailadressemailcom = new JLabel("emailadress@email.com");
		lblEmailadressemailcom.setForeground(Color.DARK_GRAY);
		lblEmailadressemailcom.setFont(new Font("HelvLight", Font.PLAIN, 16));
		lblEmailadressemailcom.setBounds(22, 108, 205, 20);
		customerTab.add(lblEmailadressemailcom);
		
		JButton btnndra = new JButton("Ändra");
		btnndra.setForeground(Color.DARK_GRAY);
		btnndra.setFont(new Font("HelvLight", Font.PLAIN, 14));
		btnndra.setBounds(150, 149, 77, 20);
		customerTab.add(btnndra);
		
		JPanel favouriteTab = new JPanel();
		tabs.addTab("Favoriter", null, favouriteTab, null);
		
		JPanel listTab = new JPanel();
		tabs.addTab("Inköpslistor", null, listTab, null);
		listTab.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 121, 629, 119);
		listTab.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(SystemColor.controlHighlight);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.controlHighlight);
		panel_3.setBounds(12, 13, 230, 94);
		panel_2.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 0));
		
		JLabel label_6 = new JLabel("Lunchlistan");
		label_6.setForeground(Color.DARK_GRAY);
		label_6.setFont(new Font("HelvLight", Font.BOLD, 20));
		panel_3.add(label_6);
		
		JLabel label_7 = new JLabel("- 3 varor");
		label_7.setForeground(Color.DARK_GRAY);
		label_7.setFont(new Font("HelvLight", Font.BOLD, 20));
		panel_3.add(label_7);
		
		JLabel label_8 = new JLabel("Visa/Ändra");
		label_8.setForeground(Color.GRAY);
		label_8.setFont(new Font("HelvLight", Font.BOLD, 15));
		panel_3.add(label_8);
		
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
		panel.setBackground(SystemColor.controlHighlight);
		panel.setBounds(0, 241, 629, 119);
		listTab.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.controlHighlight);
		panel_1.setBounds(12, 13, 230, 94);
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 0));
		
		JLabel label_1 = new JLabel("Lunchlistan");
		label_1.setForeground(Color.DARK_GRAY);
		label_1.setFont(new Font("HelvLight", Font.BOLD, 20));
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("- 3 varor");
		label_2.setForeground(Color.DARK_GRAY);
		label_2.setFont(new Font("HelvLight", Font.BOLD, 20));
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Visa/Ändra");
		label_3.setForeground(Color.GRAY);
		label_3.setFont(new Font("HelvLight", Font.BOLD, 15));
		panel_1.add(label_3);
		
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
		listCard1.setBackground(SystemColor.controlHighlight);
		listCard1.setBorder(new LineBorder(new Color(0, 0, 0)));
		listCard1.setBounds(0, 362, 629, 119);
		listTab.add(listCard1);
		listCard1.setLayout(null);
		
		JPanel listCardPanel1 = new JPanel();
		listCardPanel1.setBackground(SystemColor.controlHighlight);
		listCardPanel1.setBounds(12, 13, 230, 94);
		listCard1.add(listCardPanel1);
		listCardPanel1.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 0));
		
		JLabel lblListnamn = new JLabel("Lunchlistan");
		listCardPanel1.add(lblListnamn);
		lblListnamn.setForeground(Color.DARK_GRAY);
		lblListnamn.setFont(new Font("HelvLight", Font.BOLD, 20));
		
		JLabel lblVaror = new JLabel("- 3 varor");
		lblVaror.setForeground(Color.DARK_GRAY);
		lblVaror.setFont(new Font("HelvLight", Font.BOLD, 20));
		listCardPanel1.add(lblVaror);
		
		JLabel lblVisandra = new JLabel("Visa/Ändra");
		listCardPanel1.add(lblVisandra);
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
		panel_4.setBackground(SystemColor.controlHighlight);
		panel_4.setBounds(0, 0, 629, 119);
		listTab.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.controlHighlight);
		panel_5.setBounds(12, 13, 230, 94);
		panel_4.add(panel_5);
		panel_5.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 0));
		
		JLabel label_11 = new JLabel("Lunchlistan");
		label_11.setForeground(Color.DARK_GRAY);
		label_11.setFont(new Font("HelvLight", Font.BOLD, 20));
		panel_5.add(label_11);
		
		JLabel label_12 = new JLabel("- 3 varor");
		label_12.setForeground(Color.DARK_GRAY);
		label_12.setFont(new Font("HelvLight", Font.BOLD, 20));
		panel_5.add(label_12);
		
		JLabel label_13 = new JLabel("Visa/Ändra");
		label_13.setForeground(Color.GRAY);
		label_13.setFont(new Font("HelvLight", Font.BOLD, 15));
		panel_5.add(label_13);
		
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
		
		JPanel reciteTab = new JPanel();
		tabs.addTab("Kvitton", null, reciteTab, null);
		

		searchFld.selectAll();
	}
}

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
		searchFld.setBounds(188, 34, 335, 32);
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
		searchBtn.setBounds(535, 35, 117, 30);
		searchBtn.setForeground(Color.DARK_GRAY);
		searchBtn.setFont(new Font("HelvLight", Font.PLAIN, 16));
		toolBar.add(searchBtn);
		
		JLabel logInLbl = new JLabel("Logga in");
		logInLbl.setBounds(759, 7, 46, 14);
		toolBar.add(logInLbl);
		
		JLabel registerLbl = new JLabel("Registrera");
		registerLbl.setBounds(699, 7, 50, 14);
		toolBar.add(registerLbl);
		
		JLabel seperatorLbl = new JLabel("|");
		seperatorLbl.setBounds(753, 7, 16, 14);
		toolBar.add(seperatorLbl);
		
		JLabel checkOutLbl = new JLabel("Kassa");
		checkOutLbl.setBounds(772, 77, 34, 14);
		toolBar.add(checkOutLbl);
		
		JLabel cartLbl = new JLabel("Kundkorg");
		cartLbl.setBounds(755, 60, 46, 14);
		toolBar.add(cartLbl);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		mainPanel.setBounds(187, 100, 639, 514);
		contentPane.add(mainPanel);
		mainPanel.setLayout(new CardLayout(0, 0));
		
		JPanel sidePanel = new JPanel();
		sidePanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		sidePanel.setBounds(0, 100, 192, 514);
		contentPane.add(sidePanel);
		sidePanel.setLayout(null);
		
		JTree navigationList = new JTree();
		navigationList.setRootVisible(false);
		navigationList.setBackground(new Color(240,240,240));
		navigationList.setBounds(10, 11, 172, 266);
		sidePanel.add(navigationList);
		

		searchFld.selectAll();
	}
}

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


public class IMatView extends JFrame {

	private JPanel contentPane;
	private JTextField searchTextField;

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
		toolBar.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("iMat");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		lblNewLabel.setToolTipText("iMat");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("HelvLight", Font.PLAIN, 85));
		lblNewLabel.setBounds(12, 0, 216, 88);
		toolBar.add(lblNewLabel);
		
		searchTextField = new JTextField();
		searchTextField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				searchTextField.selectAll();
				
			}
		});
		searchTextField.setForeground(Color.GRAY);
		searchTextField.setFont(new Font("HelvLight", Font.PLAIN, 16));
		searchTextField.setText("Sök produkt..");
		searchTextField.setBounds(188, 34, 335, 32);
		toolBar.add(searchTextField);
		searchTextField.setColumns(10);
		
		JButton btnSk = new JButton("Sök");
		btnSk.setForeground(Color.DARK_GRAY);
		btnSk.setFont(new Font("HelvLight", Font.PLAIN, 16));
		btnSk.setBounds(535, 35, 117, 30);
		toolBar.add(btnSk);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		mainPanel.setBounds(187, 100, 639, 514);
		contentPane.add(mainPanel);
		mainPanel.setLayout(new CardLayout(0, 0));
		
		JPanel sidePanel = new JPanel();
		sidePanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		sidePanel.setBounds(0, 100, 192, 514);
		contentPane.add(sidePanel);

		searchTextField.selectAll();
	}
}

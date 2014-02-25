import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;


public class TabView extends JPanel {

	/**
	 * Create the panel.
	 */
	public TabView() {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabPanel = new JTabbedPane(JTabbedPane.TOP);
		tabPanel.setFont(new Font("HelvLight", Font.PLAIN, 15));
		tabPanel.setBackground(Color.LIGHT_GRAY);
		add(tabPanel);
		
		JPanel favouriteTab = new JPanel();
		favouriteTab.setBackground(Color.LIGHT_GRAY);
		tabPanel.addTab("Favoriter", null, favouriteTab, null);
		
		JPanel reciteTab = new JPanel();
		reciteTab.setBackground(Color.LIGHT_GRAY);
		tabPanel.addTab("Kvitton", null, reciteTab, null);
		
		JPanel listTab = new JPanel();
		listTab.setLayout(null);
		listTab.setBackground(Color.LIGHT_GRAY);
		tabPanel.addTab("Inköpslistor", null, listTab, null);
		
		JPanel customerTab = new JPanel();
		customerTab.setLayout(null);
		customerTab.setBackground(Color.LIGHT_GRAY);
		tabPanel.addTab("Kunduppgifter", null, customerTab, null);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.LIGHT_GRAY);
		panel_13.setBounds(12, 12, 344, 174);
		customerTab.add(panel_13);
		
		JLabel label_23 = new JLabel("emailadress@email.com");
		label_23.setForeground(Color.DARK_GRAY);
		label_23.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel label_24 = new JLabel("Förnamn");
		label_24.setForeground(Color.DARK_GRAY);
		label_24.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel label_25 = new JLabel("Efternamn");
		label_25.setForeground(Color.DARK_GRAY);
		label_25.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel label_26 = new JLabel("Gatunamn 9b");
		label_26.setForeground(Color.DARK_GRAY);
		label_26.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel label_27 = new JLabel("682 58");
		label_27.setForeground(Color.DARK_GRAY);
		label_27.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JLabel label_28 = new JLabel("Ortnamn");
		label_28.setForeground(Color.DARK_GRAY);
		label_28.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JButton button = new JButton("Ändra");
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font("HelvLight", Font.PLAIN, 14));
		GroupLayout gl_panel_13 = new GroupLayout(panel_13);
		gl_panel_13.setHorizontalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGap(0, 344, Short.MAX_VALUE)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_13.createParallelGroup(Alignment.LEADING)
						.addComponent(label_23, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
						.addGroup(gl_panel_13.createSequentialGroup()
							.addComponent(label_24, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_25, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
						.addComponent(label_26, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
						.addGroup(gl_panel_13.createSequentialGroup()
							.addComponent(label_27)
							.addGap(18)
							.addComponent(label_28, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_13.setVerticalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGap(0, 174, Short.MAX_VALUE)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_13.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_24)
						.addComponent(label_25))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_26)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_13.createParallelGroup(Alignment.LEADING)
						.addComponent(label_27)
						.addComponent(label_28))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_23)
					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_13.setLayout(gl_panel_13);

	}

}

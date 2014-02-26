import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Cursor;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;


public class ListPopUpItem extends JPanel {

	/**
	 * Create the panel.
	 */
	public ListPopUpItem() {
		setBackground(new Color(238, 238, 238));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(223, 223, 223));
		panel.setBounds(0, 0, 461, 69);
		add(panel);
		
		JLabel lblProduct = new JLabel("Product");
		lblProduct.setForeground(Color.DARK_GRAY);
		lblProduct.setFont(new Font("HelvLight", Font.PLAIN, 20));
		
		JLabel lblKr = new JLabel("á 89 kr");
		lblKr.setForeground(Color.DARK_GRAY);
		lblKr.setFont(new Font("HelvLight", Font.PLAIN, 16));
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("HelvLight", Font.PLAIN, 14));
		
		JLabel label = new JLabel("X");
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.setForeground(Color.RED);
		label.setFont(new Font("Dialog", Font.BOLD, 24));
		
		JLabel lblTotKr = new JLabel("Tot: 982 kr");
		lblTotKr.setForeground(Color.DARK_GRAY);
		lblTotKr.setFont(new Font("HelvLight", Font.PLAIN, 16));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblProduct, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblKr, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
					.addGap(258)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblTotKr))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblProduct, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblKr, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(18))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblTotKr, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(43, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);

	}

}

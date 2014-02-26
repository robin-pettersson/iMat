import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Dimension;


public class pyramidPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public pyramidPanel() {
		setPreferredSize(new Dimension(635, 35));
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(635, 35));
		panel.setBackground(Color.LIGHT_GRAY);
		add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{28, 28, 31, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{26, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel backLabel = new JLabel("<<");
		backLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		backLabel.setToolTipText("Föregående");
		backLabel.setHorizontalAlignment(SwingConstants.LEFT);
		backLabel.setForeground(Color.GRAY);
		backLabel.setFont(new Font("HelvLight", Font.BOLD, 20));
		GridBagConstraints gbc_backLabel = new GridBagConstraints();
		gbc_backLabel.anchor = GridBagConstraints.WEST;
		gbc_backLabel.insets = new Insets(0, 0, 0, 5);
		gbc_backLabel.gridx = 1;
		gbc_backLabel.gridy = 0;
		panel.add(backLabel, gbc_backLabel);
		
		JLabel pagesLabel = new JLabel("1/2");
		pagesLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		pagesLabel.setToolTipText("Sida 1 av 2");
		pagesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pagesLabel.setForeground(Color.GRAY);
		pagesLabel.setFont(new Font("HelvLight", Font.BOLD, 20));
		GridBagConstraints gbc_pagesLabel = new GridBagConstraints();
		gbc_pagesLabel.anchor = GridBagConstraints.WEST;
		gbc_pagesLabel.insets = new Insets(0, 0, 0, 5);
		gbc_pagesLabel.gridx = 11;
		gbc_pagesLabel.gridy = 0;
		panel.add(pagesLabel, gbc_pagesLabel);
		
		JLabel nextLabel = new JLabel(">>");
		nextLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		nextLabel.setToolTipText("Nästa");
		nextLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		nextLabel.setForeground(Color.DARK_GRAY);
		nextLabel.setFont(new Font("HelvLight", Font.BOLD, 20));
		GridBagConstraints gbc_nextLabel = new GridBagConstraints();
		gbc_nextLabel.anchor = GridBagConstraints.WEST;
		gbc_nextLabel.insets = new Insets(0, 0, 0, 5);
		gbc_nextLabel.gridx = 20;
		gbc_nextLabel.gridy = 0;
		panel.add(nextLabel, gbc_nextLabel);

	}

}

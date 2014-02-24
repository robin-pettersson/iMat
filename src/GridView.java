
import javax.swing.*;
import java.awt.Font;


public class GridView extends JPanel {

	public GridView() {
		setLayout(null);
		
		JLabel lblWarename = new JLabel("warename");
		lblWarename.setFont(new Font("HelvLight", Font.PLAIN, 16));
		lblWarename.setHorizontalAlignment(SwingConstants.CENTER);
		lblWarename.setBounds(4, 90, 113, 22);
		add(lblWarename);
		
		JLabel lblPic = new JLabel("pic");
		lblPic.setBounds(5, 5, 110, 110);
		add(lblPic);
		// TODO Auto-generated constructor stub
	}

}

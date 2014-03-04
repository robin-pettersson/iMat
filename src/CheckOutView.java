import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.CardLayout;


public class CheckOutView extends JPanel {
	
	private CheckOutController checkOutController = CheckOutController.getInstance();
	public static JPanel previewPanel;
	
	
	
	 //Create the panel.
	public CheckOutView() {
		setPreferredSize(new Dimension(635, 550));
		setLayout(new CardLayout(0, 0));
		
		CartView cartPanel = new CartView();
		cartPanel.setBackground(Color.LIGHT_GRAY);
		add(cartPanel, "cartPanel");
		
		CheckOut checkOutPanel = new CheckOut();
		add(checkOutPanel, "checkOutPanel");
		
		previewPanel = new JPanel();
		add(previewPanel, "previewPanel");
		
		Confirmation confirmationPanel = new Confirmation();
		add(confirmationPanel, "confirmationPanel");

	}
	
	
	
}

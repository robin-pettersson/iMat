import java.awt.CardLayout;

import javax.swing.JPanel;


public class CheckOutController {

	private static CheckOutController checkOutController = null;

	
	
	public static CheckOutController getInstance() {
		if(checkOutController != null)
			return checkOutController;
		else{
			checkOutController = new CheckOutController();
			return checkOutController;
		}
	}
	
	public void gotoCard(JPanel p, String s){
		CardLayout layout = (CardLayout) p.getLayout();
		layout.show(p, s);
	}
	
	
	public void gotoCheckOut(JPanel p){
		p = (JPanel) p.getComponent(4);
		CardLayout layout = (CardLayout) p.getLayout();
		layout.first(p);
		layout.next(p);
	}

	public void gotoCart(JPanel p) {
		p = (JPanel) p.getComponent(4);
		CardLayout layout = (CardLayout) p.getLayout();
		layout.first(p);
	}

	
}

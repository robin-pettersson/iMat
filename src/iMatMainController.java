import java.awt.CardLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class iMatMainController {

	private static iMatMainController iController = null;

	public iMatMainController(){

	}

	public static iMatMainController getInstance(){
		if(iController != null)
			return iController;
		else{
			iController = new iMatMainController();
			return iController;
		}
	}

	public void listItems(JScrollPane scroll){
		//scroll.add(new GridView());

	}
	
	public void gotoCard(JPanel p, String s){
		CardLayout layout = (CardLayout) p.getLayout();
		layout.show(p, s);
	}

}

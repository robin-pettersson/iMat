import java.awt.CardLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;

public class iMatToolbarController {
	
	private IMatDataHandler iMat;
	private static iMatToolbarController toolBarController = null;
	
	public iMatToolbarController(){
		iMat = IMatDataHandler.getInstance();
	}

	
	public static iMatToolbarController getInstance() {
		if(toolBarController != null)
			return toolBarController;
		else{
			toolBarController = new iMatToolbarController();
			return toolBarController;
		}
	}
	
	
	
}

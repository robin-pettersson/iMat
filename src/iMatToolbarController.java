import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;

public class iMatToolbarController {
	
	IMatDataHandler iMat;
	
	public iMatToolbarController(){
		iMat = IMatDataHandler.getInstance();
		
		
	}
	
	public List<Product> search(String s, JTable t)
	{
		return iMat.findProducts(s);
		
		
	}
	
	
	
}

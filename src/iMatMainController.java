import javax.swing.JScrollPane;


public class iMatMainController {
	
	private static iMatMainController iController = null;
	
	public iMatMainController(){
		
	}
	
	public static iMatMainController getInstance(){
		if(iController != null)
			return iController;
		return new iMatMainController();
	}
	
	public void listItems(JScrollPane scroll){
		//scroll.add(new GridView());
		
	}
	
}

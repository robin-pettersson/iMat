import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class CartController implements MouseListener {
	
	private static CartController cartController = null;
	
	public CartController(){
		
	}

	public static CartController getInstance(){
		if(cartController == null){
			cartController = new CartController();
		}
		return cartController;
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		
		if(me.getComponent().getName() == "btnCheckOut"){
			
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}

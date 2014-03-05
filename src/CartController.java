
public class CartController {
	
	private static CartController cartController = null;
	
	public CartController(){
		
	}

	public static CartController getInstance(){
		if(cartController == null){
			cartController = new CartController();
		}
		return cartController;
	}
	
}

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;


public class UserDataController {
	private IMatDataHandler iMat = IMatDataHandler.getInstance();
	private static UserDataController dataController = null;
	private List<ShoppingList> shoppingLists;
	private int size = 0;
	public JPanel warePanel;
	
	public UserDataController(){
		shoppingLists = new ArrayList<ShoppingList>();
		ArrayList<Product> list1 = new ArrayList<Product>();
		ArrayList<Product> list2 = new ArrayList<Product>();
		list1.add(iMat.getProduct(3));
		list1.add(iMat.getProduct(1));
		list1.add(iMat.getProduct(13));
		list1.add(iMat.getProduct(7));
		list2.add(iMat.getProduct(18));
		list2.add(iMat.getProduct(15));
		list2.add(iMat.getProduct(4));
		list2.add(iMat.getProduct(6));
		list2.add(iMat.getProduct(2));
		ShoppingList sList1 = new ShoppingList("Picnic", list1);
		ShoppingList sList2 = new ShoppingList("Random", list2);
		//dataController.addList(sList1);
		//dataController.addList(sList2);
	}
	
	public static UserDataController getInstance(){
		if(dataController != null)
			return dataController;
		else{
			dataController = new UserDataController();
			return dataController;
		}
	}
	
	public ShoppingList getShoppingList(int index){
		return shoppingLists.get(index);
	}
	
	public void addList(ShoppingList shoppingList){
		size++;
		shoppingLists.add(shoppingList);
	}
	
	public int size(){
		return size;
	}

	public void listFavorites() {
		
	}
}

import java.util.ArrayList;

import se.chalmers.ait.dat215.project.Product;


public class ShoppingList {
	private ArrayList<Product> productList;
	private String name;
	
	public ShoppingList(String s, ArrayList<Product> list){
		name = s;
		productList = list;
	}
	
	public ArrayList<Product> getList(){
		return productList; 
	}
	
	public void add(Product p){
		productList.add(p);
	}
	
	public String getName(){
		return name;
	}
}

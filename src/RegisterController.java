import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;

import se.chalmers.ait.dat215.project.Customer;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingItem;
import se.chalmers.ait.dat215.project.User;


public class RegisterController implements FocusListener, MouseListener {

	private static RegisterController regController = null;
	private String fName = "";
	private String lName = "";
	private String address = "";
	private String zip = "";
	private String city = "";
	private String email = "";
	private String signEmail = "";
	private String password = "";
	private String verifyPassword = "";
	
	private Customer customer;
	
	private int row = 0;
	private int currentItem = 0;
	
	List<ShoppingItem> items;

	IMatDataHandler iMat = IMatDataHandler.getInstance();
	RightShoppingCart rCart = RightShoppingCart.getInstance();
	RegisterPopUp regPop = null;
	
	protected RegisterController(){
		
		
	}
	
	public static RegisterController getInstance(){
		if(regController == null) {
			regController = new RegisterController();
		}
		
		return regController;
	}

	@Override
	public void focusGained(FocusEvent fe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent fe) {
		
		switch(fe.getComponent().getName()){
		
			case "fNameTextField": fName = fe.getComponent().getInputContext().toString();
				customer.setFirstName(fName);
				break;
			case "lNameTextField": lName = fe.getComponent().getInputContext().toString();
				customer.setLastName(lName);
				break;
			case "addressTextField": address = fe.getComponent().getInputContext().toString();
				customer.setAddress(address);
				break;
			case "zipTextField": zip = fe.getComponent().getInputContext().toString();
				customer.setPostCode(zip);
				break;
			case "cityTextField": city = fe.getComponent().getInputContext().toString();
				customer.setPostAddress(city);
				break;
			case "emailTextField": email = fe.getComponent().getInputContext().toString();
				customer.setEmail(email);
				break;
			case "passwordTextField": password = fe.getComponent().getInputContext().toString();
				break;
			case "verifyPasswordTextField": verifyPassword = fe.getComponent().getInputContext().toString();
				break;
			case "signEmailTextField": signEmail = fe.getComponent().getInputContext().toString();
				break;
			case "passwordField": password = fe.getComponent().getInputContext().toString();
				break;
				
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		
		if(me.getComponent().getName() == "registerLabel"){
			regPop = new RegisterPopUp(fName,lName,address,city,zip,email);
			regPop.validate();
		}
		
		if(me.getComponent().getName() == "registerButton"){
			User user = new User();
			
			if(password != verifyPassword){
				//Todo Load a passwords dont match window
			}
			else {
				user.setPassword(password);
				user.setUserName(email);
				regPop.invalidate();
			}
		}
		
		if(me.getComponent().getName() == "cancelButton"){
			regPop.invalidate();
		}
		
		if(me.getComponent().getName() == "btnLogIn"){
			//Databas stödjer inte detta
		}
		if(me.getComponent().getName() == "lblSignIn"){
			//Todo hide/show function here instead of in view class
		}
		if(me.getComponent().getName() == "buyBtn"){
			Component[] comp = me.getComponent().getParent().getComponents();
			addToCart(comp);
		}
		
	}
	
	public void addToCart(Component[] comp){
		
		String prod = "";
		int amount = 0;
		double price = 0;
		
		JTable table;
		
		List<Product> products = iMat.getProducts();

		
		for(int i = 0; i < comp.length; i++ ){
			String temp = comp[i].getName();
			if(temp == "productNameLbl"){
				JLabel lbl = (JLabel) comp[i];
				prod = lbl.getText();
			}
			if(temp == "amountSpinner"){
				JSpinner spinner = (JSpinner) comp[i];
				amount = (int) spinner.getValue();
				
			}
		}
		for(int i = 0; i < products.size(); i++){
			String temp = products.get(i).getName();
			Product product = products.get(i);
			if(temp.equals(prod)){
				price = products.get(i).getPrice();	
				itemToAdd(product, amount);
				
			}
		}
		table = rCart.table;
		items = iMat.getShoppingCart().getItems();
		addToTable(table, items, price);
		
	}
	
	private void itemToAdd(Product product, double amount){
		ShoppingItem item = new ShoppingItem(product, amount);
		items = iMat.getShoppingCart().getItems();
		//loop for making sure the same product isnt added twice or more
		/*for (ShoppingItem itm : items) {
			if(item.getProduct() == itm.getProduct()){
				double x = item.getAmount();
				double y = itm.getAmount();
				double newAmount = x + y;
				itm.setAmount(newAmount);
			}
			else{
				iMat.getShoppingCart().addItem(item);
			}
		}*/
		iMat.getShoppingCart().addItem(item);
	}
	
	private void addToTable(JTable table , List<ShoppingItem> items, double price){
		
		table.getModel().setValueAt(items.get(currentItem).getProduct().getName(), row, 0);
		table.getModel().setValueAt("", row, 1);
		row++;
		table.getModel().setValueAt(items.get(currentItem).getAmount() + "pcs", row, 0);
		table.getModel().setValueAt(price + "sek", row, 1);
		row++;
		table.getModel().setValueAt("", row, 0);
		table.getModel().setValueAt("", row, 1);
		row++;
		System.out.println(items.get(currentItem).getProduct().getName());
		currentItem++;
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

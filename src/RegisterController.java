import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
	private int day;
	private int month;
	private int year;
	
	JTable table;
	JTable previewTable;
	List<ShoppingItem> items;
	List<CartListView> cartItems = new ArrayList<CartListView>();
	public static List<JTable> tablesList = new ArrayList<JTable>();

	CartView cart;

	CheckOutController checkOutController = CheckOutController.getInstance();
	IMatDataHandler iMat = IMatDataHandler.getInstance();
	RightShoppingCart rCart = RightShoppingCart.getInstance();
	//CartView cartView = CartView.getInstance();
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
		
			case "fNameTextField": JTextField text1 = (JTextField) fe.getComponent();
				fName = text1.getText();
				System.out.println(fName);
				//customer.setFirstName(fName);
				break;
			case "lNameTextField": JTextField text2 = (JTextField) fe.getComponent();
				lName = text2.getText();
				//customer.setLastName(lName);
				break;
			case "addressTextField": JTextField text3 = (JTextField) fe.getComponent();
				address = text3.getText();
				//customer.setAddress(address);
				break;
			case "zipTextField": JTextField text4 = (JTextField) fe.getComponent();
				zip = text4.getText();
				//customer.setPostCode(zip);
				break;
			case "cityTextField": JTextField text5 = (JTextField) fe.getComponent();
				city = text5.getText();
				//customer.setPostAddress(city);
				break;
			case "emailTextField": JTextField text6 = (JTextField) fe.getComponent();
				email = text6.getText();
				//customer.setEmail(email);
				break;
			case "passwordTextField": JTextField text7 = (JTextField) fe.getComponent();
				password = text7.getText();
				break;
			case "verifyPasswordTextField": JTextField text8 = (JTextField) fe.getComponent();
				verifyPassword = text8.getText();
				break;
			case "signEmailTextField": JTextField text9 = (JTextField) fe.getComponent();
				signEmail = text9.getText();
				break;
			case "passwordField": JTextField text10 = (JTextField) fe.getComponent();
				password = text10.getText();
				break;
			case "day": JComboBox<Integer> box1 = (JComboBox<Integer>) fe.getComponent();
				day = (int) box1.getSelectedItem();
				break;
			case "month": JComboBox<Integer> box2 = (JComboBox<Integer>) fe.getComponent();
				month = (int) box2.getSelectedItem();
				break;
			case "year": JComboBox<Integer> box3 = (JComboBox<Integer>) fe.getComponent();
				year = (int) box3.getSelectedItem();
				break;
							
				
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		
		if(me.getComponent().getName() == "registerLabel"){
			System.out.println("hej");
			regPop = new RegisterPopUp(fName,lName,address,city,zip,email);
		}
		
		if(me.getComponent().getName() == "registerButton"){
			User user = new User();
			customer = iMat.getCustomer();
			
			customer.setAddress(address);
			customer.setEmail(email);
			customer.setFirstName(fName);
			customer.setLastName(lName);
			customer.setPostAddress(city);
			customer.setPostCode(zip);
			
			if(password != verifyPassword){
				//Todo Load a passwords dont match window
			}
			else {
				user.setPassword(password);
				user.setUserName(email);
			}
			
			regPop.close(regPop);
		}
		
		if(me.getComponent().getName() == "cancelButton"){
			regPop.close(regPop);
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
		if(me.getComponent().getName() == "btnPreview"){
			previewPrep();
		}
		
	}
	
	public void previewPrep(){
		
		Preview preview;
		String date = day + "/" + month + "-" + year;
		
		previewTable = new JTable();
		previewTable.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null},
					{null, null, null},
					{null, null, null},
					{null, null, null},
					{null, null, null},
					{null, null, null},
					{null, null, null},
					{null, null, null},
					{null, null, null},
					{null, null, null},
					{null, null, null},
					{null, null, null},
				},
				new String[] {
					"New column", "New column", "New column"
				}
			));
		reformTable(previewTable);
		String total = iMat.getShoppingCart().getTotal() + "";
		preview = new Preview(fName, lName, address, zip, city, email, date, total, previewTable);
		if (CheckOutView.previewPanel.getComponentCount() > 0){
			CheckOutView.previewPanel.remove(0);
		}
		CheckOutView.previewPanel.add(preview);
		
		JPanel p = (JPanel) CheckOutView.previewPanel.getParent();
		CardLayout card = (CardLayout) p.getLayout();
		checkOutController.gotoCard(p, "previewPanel");
	}
	
	public void addToCart(Component[] comp){
		
		String prod = "";
		int amount = 0;
		double price = 0;
		
		
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
		
		
		if(row == 0) {
			table = rCart.table;
			tablesList.add(table);
			
		}else if(row == 24){
			table = rCart.makeTable();
			tablesList.add(table);
			System.out.println("hej");
			rCart.pageLabel.setText("1" + "/" + tablesList.size());
			row = 0;
		}
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
		String cost = product.getPrice() * amount + "";
		
		CartListView view = new CartListView(product.getName(), cost, amount);
		cartItems.add(view);
		
		if(CheckOutView.cartPanel.getComponentCount() > 0){
			CheckOutView.cartPanel.removeAll();
		}
		cart = new CartView(cartItems);
		CheckOutView.cartPanel.add(cart);
		cart = null;
		
	}
	
	private void addToTable(JTable table , List<ShoppingItem> items, double price){
		
		
		table.getModel().setValueAt(items.get(currentItem).getProduct().getName(), row, 0);
		table.getModel().setValueAt("", row, 1);
		row++;
		table.getModel().setValueAt(items.get(currentItem).getAmount() + " pcs", row, 0);
		price = price * items.get(currentItem).getAmount();
		table.getModel().setValueAt(price + " sek", row, 1);
		row++;
		table.getModel().setValueAt("", row, 0);
		table.getModel().setValueAt("", row, 1);
		row++;
		System.out.println(items.get(currentItem).getProduct().getName());
		currentItem++;
		rCart.lblTotaly.setText(iMat.getShoppingCart().getTotal()+ " sek");
		
	}
	
	private void reformTable(JTable previewTable){
		items = iMat.getShoppingCart().getItems();
		int currentRow = 0;
		for (ShoppingItem item : items) {
				previewTable.getModel().setValueAt(item.getProduct().getName(), currentRow, 0);
				previewTable.getModel().setValueAt(item.getAmount() + " pcs", currentRow, 1);
				previewTable.getModel().setValueAt(item.getProduct().getPrice() + " sek", currentRow, 2);
				currentRow++;
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

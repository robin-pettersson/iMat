import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import se.chalmers.ait.dat215.project.Customer;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.User;


public class RegisterController implements FocusListener, MouseListener {

	private static RegisterController regController = null;
	IMatDataHandler iMat = IMatDataHandler.getInstance();
	
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
	
	private RegisterPopUp regPop = null;
	
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

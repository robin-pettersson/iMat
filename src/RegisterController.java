import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import se.chalmers.ait.dat215.project.Customer;
import se.chalmers.ait.dat215.project.IMatDataHandler;


public class RegisterController implements FocusListener, MouseListener {

	private static RegisterController regController = null;
	IMatDataHandler iMat = IMatDataHandler.getInstance();
	
	private String fName = "";
	private String lName = "";
	private String address = "";
	private String zip = "";
	private String city = "";
	private String email = "";
	
	private Customer customer;
	
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
		
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		
		if(me.getComponent().getName() == "registerLabel"){
			RegisterPopUp regPop = new RegisterPopUp(fName,lName,address,city,zip,email);
			regPop.validate();
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

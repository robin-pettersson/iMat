import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

import se.chalmers.ait.dat215.project.IMatDataHandler;


public class iMatNavController implements TreeSelectionListener {
	
	IMatDataHandler iMat = IMatDataHandler.getInstance();
	private static iMatNavController navController = null;
	
	
	public iMatNavController(){

		
	}
	
	public static iMatNavController getInstance(){
		if(navController != null)
			return navController;
		return new iMatNavController();
	}
	
	public void navigate (String productType) {
		
		
	}
	
	public void valueChanged(TreeSelectionEvent e) {
		JTree navigationTree = (JTree) e.getSource();
		DefaultMutableTreeNode node = (DefaultMutableTreeNode)
				navigationTree.getLastSelectedPathComponent();

		if (node == null) return;

		Object nodeInfo = node.getUserObject();
		String type = nodeInfo.toString().replace(' ', '_');
		type = type.toUpperCase();
		System.out.print(type);

	}
	
}
 

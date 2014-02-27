import java.awt.CardLayout;
import java.awt.Component;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;





import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ProductCategory;


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
	
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		JTree navigationTree = (JTree) e.getSource();
		DefaultMutableTreeNode node = (DefaultMutableTreeNode)
				navigationTree.getLastSelectedPathComponent();

		if (node == null) return;
		
		Object nodeInfo = node.getUserObject();
		String type = nodeInfo.toString().replace(' ', '_');
		type = type.toUpperCase();
		System.out.print(type);
		JPanel comp = (JPanel) navigationTree.getParent().getParent().getComponent(1);
		CardLayout layout = (CardLayout) comp.getLayout();
		System.out.println(comp);
		layout.first(comp);
		layout.next(comp);
		
		JPanel p = (JPanel) comp.getComponent(1);
		JPanel panel = (JPanel) p.getComponent(1);

		listItems(type, panel);
	}
	
	public void listItems(String type, JPanel panel){
		panel.removeAll();
		ProductCategory category = null;
		for (ProductCategory cat : ProductCategory.values()) {
			String name = cat.name();
			if(name.equals(type)){
				category = cat;
				break;
			}
		}
		
		List<Product> productList = iMat.getProducts(category);
		for (int i = 0; i < 9 || i < iMat.getProducts(category).size() ; i++) {
			Product pro = productList.get(i);
			GridView card = new GridView(pro.getName(), pro.getPrice());
			panel.add(card);
			panel.revalidate();
		}
		
	}

}
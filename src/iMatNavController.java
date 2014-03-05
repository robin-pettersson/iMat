import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;






import javax.swing.tree.MutableTreeNode;

import com.sun.org.apache.xalan.internal.lib.NodeInfo;

import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ProductCategory;


public class iMatNavController implements TreeSelectionListener {

	IMatDataHandler iMat = IMatDataHandler.getInstance();
	private DefaultMutableTreeNode node;
	private static iMatNavController navController = null;

	private int currentPage = 0;
	private int currentIndex = 0;
	private ProductCategory[] categorys;
	private JPanel wareContainer;
	private List<Product> products;

	public iMatNavController(){
		products = new ArrayList<>();
	}

	public static iMatNavController getInstance(){
		if(navController != null)
			return navController;
		return new iMatNavController();
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {

		JTree navigationTree = (JTree) e.getSource();
		node = (DefaultMutableTreeNode)navigationTree.getLastSelectedPathComponent();
		Object nodeInfo = node.getUserObject();

		String type = toCategoryString(nodeInfo.toString());
		System.out.print(type);

		JPanel parent = (JPanel) navigationTree.getParent().getParent().getComponent(1);
		CardLayout layout = (CardLayout) parent.getLayout();
		wareContainer = (JPanel) ((JPanel) parent.getComponent(1)).getComponent(1);
		layout.first(parent);
		layout.next(parent);

		setCategorys(type);
		listItems();
	}


	public void listItems(){
		wareContainer.removeAll();
		for (int i = (12*currentPage) ; i < (12*currentPage + 12) && i < products.size() ; i++) {
			Product pro = products.get(i);
			GridView card = new GridView(pro.getName(), pro.getPrice());
			wareContainer.add(card);
			wareContainer.revalidate();
		}
	}

	private  void setCategorys(String type) {
		ProductCategory[] cats = new ProductCategory[20];
		DefaultMutableTreeNode currentNode = node;
		DefaultMutableTreeNode lastNode = null;
		boolean done = true;
		int lastIndex = 0;
		int size = 0;

		if(node.isLeaf()){
			cats[0] = getCategory(type);
			size++;
			combineList(cats);
		}


		for(int i = 0; i < currentNode.getChildCount(); i++){
			DefaultMutableTreeNode subNode = (DefaultMutableTreeNode) currentNode.getChildAt(i);

			System.out.println(subNode.isLeaf());
			if(subNode.isLeaf()){
				System.out.println("Adding Category: " + getCategory(subNode.toString()));
				cats[size] = getCategory(subNode.toString());
				size++;
			}
			else{
				System.out.println("has a subtree");
				lastIndex = i;
				lastNode = currentNode;
				i = -1;
				currentNode = subNode;
				done = false;
			}
			if(!done && i + 1 == currentNode.getChildCount()){
				System.out.println("back to parent");
				i = lastIndex;
				currentNode = lastNode;
				done = true;
			}
		}
		combineList(cats);
	}

	private ProductCategory getCategory(String type){
		ProductCategory category = null;
		type = toCategoryString(type);
		for (ProductCategory cat : ProductCategory.values()) {
			String name = cat.name();
			if(name.equals(type)){
				category = cat;
				break;
			}
		}
		return category;
	}

	private void combineList(ProductCategory[] cats) {
		for(ProductCategory cat : cats){
			for(Product prod : iMat.getProducts(cat)){
				products.add(prod);
			}
		}
	}

	private String toCategoryString(String s) {
		return s.replace(' ', '_').toUpperCase();
	}

}
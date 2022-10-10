/**
 * @author Nathan Johnson, Bellarmine University
 *
 */
import java.util.Queue; // import the Queue class
import java.util.LinkedList;
public class Tree {
	
	private int height;
	private Node root;
	
	public Tree()
	{
			setRoot(new Node(1));
	}
	
	/**
	 * @return the root
	 */
	
	public Node getRoot() {
		return root;
	}
	/**
	 * @param root the root to set
	 */
	public void setRoot(Node root) {
		this.root = root;
	}

	//returns the root node
	public Node generatePracticeTree(int height)
	{
	   this.height=height;
	   int level=1;
	   //Creating tree breadth-first so
	   //Put the child nodes in a queue
	   Queue <Node> childQ=new LinkedList<Node>();
	   Node pn=root;
	   //Create the children of the root and put some data
	   //Put them in the child queue
	   //int value=pn.getData();
		
	   	childQ.add(pn);
	   	System.out.println ("Root Node value: "+pn.getData());
		int value=pn.getData();
	   		   	
		//Remove the front of the queue
		//Create its children
		//Put them in the queue
		//Data is just parent data+1 or 2 depending on which child
	   while (level<(height) && !childQ.isEmpty())
			 {
				 System.out.println("Level is: "+level);
				 for(int i=1;i<=Math.pow(2,(level-1));i++)
				 {
					 pn=childQ.remove();
					 System.out.println("Parent Node value: "+pn.getData());
					 value++;
					 System.out.println("Adding Left Child: "+(value));
					 pn.setlChild(new Node(value));
					 childQ.add(pn.getlChild());
					 value++;
					 System.out.println("Adding Right Child: "+(value));
					 pn.setrChild(new Node(value));
					 childQ.add(pn.getrChild());
				 }
					 
				 level++;System.out.println("Level: "+level);
			 }
			 
		
		return root;
		
	}
	/**
	 * Calls the private method getTreeHeight inside a print line statement for the root node in the tree
	 * 
	 * @return
	 */
	public void getHeight() {
		
		System.out.println("The height of the tree is: "+ getTreeHeight(root));
		
	}//end getHeight
	/**
	 * private method for attaining the height of the tree
	 * checks if the node is empty first, if not, the height is determined as 1 + max (leftChildHeight, rightChildHeight)
	 * @param node
	 * @return
	 */
	public int getTreeHeight(Node node) {
		
		int height = 0;
		
		if (node != null)
			height = 1 + Math.max(getTreeHeight(node.getlChild()), getTreeHeight(node.getrChild()));
		
		return height;
		
		}//end getTreeHeight
	
	public void setHeight(int height) {
		this.height = height;
		
	}// end setHeight
}//end class

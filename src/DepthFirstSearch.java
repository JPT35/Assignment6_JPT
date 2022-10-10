/**
 * 
 * @author johnpaulthomas
 * 
 */
public class DepthFirstSearch {
	
	Node root;
	int count;
	
	public DepthFirstSearch() {
		
		System.out.println("Call DFS with root node to do a Depth First Search."); 
		
		}//end DepthFirstSearch
	/**
	 * DFS method 
	 * if statement checks if the selected node is empty, starting with the root 
	 * if node != null, the DFS method is recursively called in the order of selected node, left child, right child
	 * the count variable is incremented until the selected node is null, and recursion is complete 
	 * @param node
	 */
	public void DFS(Node node) {
		
		if(node != null) {  
			
			System.out.println(node.getData()); 
			
			DFS(node.getlChild()); 
			
			DFS(node.getrChild()); 
			
			count++; 
		}//end if statement
	}//end DFS method
	
	/**
	 * nodeCount method prints the number of nodes traversed using the incremented count variable
	 * 
	 */
	public void nodeCount() {
		System.out.println("Number of nodes traversed is: "+count);
	}//end nodeCount method
}//end class DepthFirstSearch

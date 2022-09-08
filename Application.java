/**
 * A class that implements a linked list 
 * @author Jonathan Moreira Alsina
 * @version 9/7/2022
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Creates a linked list of type integers
		 */
		LinkedList <Integer> myList = new LinkedList <Integer> ();
		
		/**
		 * Creates a node of type integers
		 */
		Node <Integer> aNode = new Node<Integer>();
		
		/**
		 * Sets a given value to aNode
		 */
		aNode.setData( 1 );
		
		/**
		 * Adds the created node to the linked list
		 */
		myList.addNode( aNode );
		
		/**
		 * Creates a new node of type integers
		 */
		aNode = new Node <Integer> ();
		
		/**
		 * Sets a given value to aNode
		 */
		aNode.setData( 2 );
		
		/**
		 * Adds the created node to the linked list
		 */
		myList.addNode( aNode );
		
		/**
		 * Creates a temporary node of type integers 
		 */
		Node<Integer> tempnode = myList.getList();
		
		/**
		 * Uses a do-while loop to print the values in the nodes 
		 */
		do{
			System.out.println(tempnode.data);
			tempnode = tempnode.nextNode;
		} while (tempnode != null);

	}
}

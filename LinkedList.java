/**
 * A class that describes the operations of a linked list 
 *@author Jonathan Moreira Alsina
 *@version 9/7/2022
 */
public class LinkedList <T> {
	
	private Node <T> head; //node to represent the head of the list
	private Node <T> tail; //node to represent the tail (end) of the list
	private int length;//variable to keep track of the number of elements in the list
	
	/**
	 * Contains the properties of a linked list
	 */
	public LinkedList() {
		
		head=null;
		length=0;
		tail=head;
		
	}//end empty-argument constructor
	
	/**
	 * Checks if the linked list is empty
	 * @return true if it's empty
	 */
	public boolean isEmpty(){
		
		if ( head == null ) { return true;}
		else return false;

	}//end isEmpty
	
	/**
	 * Gets the first element in the linked list
	 * @return head of the linked list
	 */
	public Node <T> getList(){
		
		return head;
		
	}//end getList
	
	/**
	 * Adds a node to the linked list after a given node
	 * @param specific aNode to be added after
	 */
	public void addNode( Node <T> aNode){
		
		if (isEmpty() ) {
			head = aNode;
			tail = head;
			return;
		}
		tail.nextNode=aNode;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
	}//end addNode
	
}
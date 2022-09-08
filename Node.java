/**
 * A class that describes the operations of a node
 *@author Jonathan Moreira Alsina
 *@version 9/7/2022
 */
public class Node <T> {
	
	T data;
	Node <T> nextNode;
	
	/**
	 * Contains the properties of a Node
	 */
	public Node(){
		
		nextNode = null;
		data = null;
	}
	
	/**
	 * Sets a data value 
	 * @param data value to be assigned 
	 */
	public void setData(T data) {
		
		this.data = data;
	}
	
	/**
	 * Gets the values inside the last node
	 * @return data inside the last node
	 */
	public T getData() {  
		
		return this.data;
	}
	
	/**
	 * Returns the last node in the linked list
	 * @return the last node 
	 */
	public Node <T> getNode() {
		
		return this;
	}
	
	/**
	 * Sets a node after a specific node given by the user
	 * @param prefered Node from the linked list
	 */
	public void setNextNode(Node <T> nextNode){
		
		this.nextNode=nextNode;
	}

}

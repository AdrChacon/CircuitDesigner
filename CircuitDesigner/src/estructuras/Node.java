package estructuras;

/*
 * 
 */
public class Node<T> {
	private T data;
	private Node<T> next;
	
	/*
	 * 
	 */
	public Node(T dato) {
		this.data = dato;
		this.next = null;
	}
	
	/*
	 * 
	 */
	public Node<T> getNext(){
		return this.next;
	}
	
	/*
	 * 
	 */
	public void setNext(Node<T> node) {
		this.next = node;
	}
	
	/*
	 * 
	 */
	public T getData() {
		return this.data;
	}
}

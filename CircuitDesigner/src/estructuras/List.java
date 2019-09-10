package estructuras;

/*
 * 
 */
public class List<T> {
	private Node<T> head;
	private int size;
	
	/*
	 * 
	 */
	public List(){
		this.head = null;
		this.size = 0;
	}
	
	public Node<T> getHead(){
		return this.head;
	}
	
	/*
	 * 
	 */
	public void addNode(Node<T> node) {
		if (head.equals(null)) {
			this.head = node;
		} else {
			Node<T> current = this.head;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(node);
		}
		this.size++;
	}
	
	/*
	 * 
	 */
	public void deleteNode(T data) {
		Node<T> current = this.head;
		if (current.getData() == data) {
			this.head = this.head.getNext();
		} else {
			while(current.getNext().getData() != data) {
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
		}
		this.size--;
	}
	
	/*
	 * 
	 */
	public Node<T> getNode(T node){
		if (this.head.getData() == node) {
			return this.head;
		} else {
			Node<T> current = this.head;
			while(current.getData() != node) {
				current = current.getNext();
			}
			return current;
		}
	}
}

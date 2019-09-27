package estructuras;

import logica.Compuerta;

/**
 * @author Chacón Campos
 * Clase nodo
 */
public class Node {
	private Compuerta data;
	private Node next;
	private Node prev;
	
	public Node(Compuerta dato) {
		this.data = dato;
		this.next = null;
		this.prev = null;
	}
	
	/**
	 *  Retorna el siguiente nodo
	 *  @return
	 */
	public Node getNext(){
		return this.next;
	}
	
	/**
	 * Retorna el nodo anterior
	 * @return
	 */
	public Node getPrev() {
		return this.prev;
	}
	
	/**
	 * Establece el nodo anterior
	 * @param node
	 */
	public void setPrev(Node node) {
		this.prev = node;
	}
	/**
	 * Establece el siguiente nodo
	 */
	public void setNext(Node node) {
		this.next = node;
	}
	
	/**
	 * Retorna el dato contenido en el nodo
	 */
	public Compuerta getData() {
		return this.data;
	}
}

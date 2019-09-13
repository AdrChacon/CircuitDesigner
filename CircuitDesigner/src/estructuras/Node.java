package estructuras;

import logica.Compuerta;

/**
 * @author Chacón Campos
 * Clase nodo
 */
public class Node {
	private Compuerta data;
	private Node next;
	
	public Node(Compuerta dato) {
		this.data = dato;
		this.next = null;
	}
	
	/**
	 *  Retorna el siguiente nodo
	 */
	public Node getNext(){
		return this.next;
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

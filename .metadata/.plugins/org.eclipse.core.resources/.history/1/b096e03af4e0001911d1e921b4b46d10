package estructuras;

import logica.Compuerta;

/**
 * @author Chacón Campos
 * Clase de listas enlazadas
 */
public class List{
	private Node head;
	private int size;
	
	public List(){
		this.head = null;
		this.size = 0;
	}
	
	/**
	 * Retornar primer elemento
	 */
	public Node getHead(){
		return this.head;
	}
	
	/**
	 * Añadir nodo
	 */
	public void addNode(Compuerta data) {
		if (head == null) {
			this.head = new Node(data);
		} else {
			Node current = this.head;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(new Node(data));
		}
		this.size++;
	}
	
	/**
	 * Eliminar nodo
	 */
	public void deleteNode(Compuerta data) {
		Node current = this.head;
		if (current.getData() == data) {
			this.head = this.head.getNext();
			this.size--;
			return;
		} else {
			while (current != null) {
				if (current.getNext() != null) {
						if(current.getNext().getData() != data) {
								current = current.getNext();
						} else {
							current.setNext(current.getNext().getNext());
							this.size--;
							return;
						}
				} else {
					current = current.getNext();
				}
			}
			return;
		}
	}
	
	public void deleteAllNodesOfType(String type) {
		Node current = this.head;
		while (current != null) {
			if (current.getData().getType().equals(type)) {
				if (current == this.head) {
					current.getData().deleteSelf();
					this.head = this.head.getNext();
					this.size--;
				} else {
					if (current.getNext().getData().getType().equals(type)) {
						current.getNext().getData().deleteSelf();
						current.setNext(current.getNext().getNext());
					}
				}
				current = current.getNext();
			}
		}
		return;
	}
	
	/**
	 * Retornar elemento con dato T
	 */
	public Node getNode(Compuerta data){
		if (this.head.getData() == data) {
			return this.head;
		} else {
			Node current = this.head;
			while(current.getData() != data) {
				current = current.getNext();
			}
			return current;
		}
	}
	
	/**
	 * Regresa cantidad de nodos "activos"
	 */
	public int getActive() {
		int active = 0;
		Node current = this.getHead();
		while(current != null) {
			if (current.getData().getState() == true) {
				active++;
			}
			current = current.getNext();
		}
		return active;
	}
	
	/**
	 * Regresa tamaño de la lista
	 */
	public int getSize() {
		return this.size;
	}
	
	/**
	 * Regresa elemento en posición X
	 */
	public Node getNodeInPosition(int X) {
		if (X > this.size) {
			return null;
		} else {
			Node current = this.head;
			int currentPos = 1;
			while (currentPos != X) {
				currentPos++;
				current = current.getNext();
			}
			return current;
		}
	}
	
	
	public List findInputGates() {
		List gates = new List();
		for(int i = 1; i <= this.getSize(); i++) {
			if (this.getNodeInPosition(i).getData().getInputListSize() == 0) {
				gates.addNode(this.getNodeInPosition(i).getData());
			}
		}
		return gates;
	}
	
	public List findOutputGates() {
		List gates = new List();
		for(int i = 1; i <= this.getSize(); i++) {
			if (this.getNodeInPosition(i).getData().getOutputListSize() == 0) {
				gates.addNode(this.getNodeInPosition(i).getData());
			}
		}
		return gates;
	}
}

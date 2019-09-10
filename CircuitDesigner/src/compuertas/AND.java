package compuertas;

import estructuras.Node;

public class AND extends Compuerta{

	@Override
	public void verifyState() {
		// TODO Auto-generated method stub
		Node<Compuerta> inputs = this.inputList.getHead();
	}

}

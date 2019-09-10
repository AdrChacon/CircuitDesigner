package compuertas;

import estructuras.List;
import estructuras.Node;

/*
 * 
 */
public abstract class Compuerta {
 protected Compuerta output;
 protected boolean status;
 protected List<Node<Compuerta>> inputList;
 
 /*
  * 
  */
 public Compuerta() {
	 status = false;
	 inputList = new List<Node<Compuerta>>();
	 output = null;
 }
 
 /*
  * 
  */
 public Compuerta(Compuerta gate) {
	 status = false;
	 inputList = new List();
	 output = gate;
 }
 
 /*
  * 
  */
 public void connectGate(Node<Node<Compuerta>> gate) {
	 inputList.addNode(gate);
 }
 
 /*
  * 
  */
 public abstract void verifyState();
 
}

package logica;

import estructuras.List;

/**
 * @author Chacón Campos
 * Clase abstracta de las compuertas lógicas
 */
public abstract class Compuerta {
 protected boolean status;
 protected List inputList;
 protected List outputList;

 public Compuerta() {
	 status = false;
	 inputList = new List();
	 outputList = new List();
 }
 
 private void connectFromGate(Compuerta gate) {
	 inputList.addNode(gate);
 }
 
 private void connectToGate(Compuerta gate) {
	 outputList.addNode(gate);
 }
 
 /**
  * Cuando se conecta una nueva salida a una compuerta
  */
 public void connectOutput(Compuerta newOutput) {
	 this.connectToGate(newOutput);
	 newOutput.connectFromGate(this);
	 this.notifyAllGates();
	 newOutput.notifyAllGates();
 }
 /**
  * Cuando se conecta una nueva entrada a una compuerta
  */
 public void connectInput(Compuerta newInput) {
	 this.connectFromGate(newInput);
	 newInput.connectToGate(this);
	 this.notifyAllGates();
	 newInput.notifyAllGates();
 }
 /**
  * Función para notificar a todas las salidas (Observer, subject.notifyObservers())
  */
 public void notifyAllGates() {
	 if (outputList.getSize() != 0) {
		 for (int Pos = 1; Pos <= outputList.getSize(); Pos++) {
			 outputList.getNodeInPosition(Pos).getData().verifyState();
		 }
	 }
 }

 /**
  * Método de prueba 
  */
 public void activateGate() {
	 this.status = true;
	 this.notifyAllGates();
 }
 
 /**
  * Método de prueba
  */
 public void deactivateGate() {
	 this.status = false;
	 this.notifyAllGates();
 }
 
 /**
  * Función para "actualizar" las compuertas (Observer, observer.update())
  */
 public abstract void verifyState();
 
 public abstract boolean getState();
}

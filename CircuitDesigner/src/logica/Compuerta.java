package logica;

import estructuras.List;
import javafx.scene.image.ImageView;

/**
 * @author Chac�n Campos
 * Clase abstracta de las compuertas l�gicas
 */
public abstract class Compuerta extends ImageView{
 protected boolean status;
 protected List inputList;
 protected List outputList;
 protected String ID;
 protected String type;
 protected String active;

 public Compuerta(String gateId) {
	 ID = gateId;
	 active = "0";
	 status = false;
	 inputList = new List();
	 outputList = new List();
 }
 
 /**
  * Regresa el ID de la compuerta
  * @return ID
  */
 public String getID() {
	 return this.ID;
 }
 
 /**
  * Regresa el estado actual de la compuerta como un String
  * @return Estado actual de la compuerta (1 o 0)
  */
 public String getActive() {
	 return this.active;
 }
 
 /**
  * Regresa el tipo de la compuerta
  * @return Tipo de la compuerta (AND, OR, LED, ...)
  */
 public String getType() {
	 return type;
 }
 
 /**
  * Conecta una compuerta a la lista de inputs de esta compuerta 
  * @param gate Compuerta a conectar
  */
 private void connectFromGate(Compuerta gate) {
	 inputList.addNode(gate);
 }
 
 /**
  * Conecta una compuerta a la lista de outputs de esta compuerta
  * @param gate Compuerta a conectar
  */
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
  * Funci�n para notificar a todas las salidas (Observer, subject.notifyObservers())
  */
 public void notifyAllGates() {
	 if (outputList.getSize() != 0) {
		 for (int Pos = 1; Pos <= outputList.getSize(); Pos++) {
			 outputList.getNodeInPosition(Pos).getData().verifyState();
		 }
	 }
 }

 /**
  * M�todo "activa" la compuerta
  */
 public void activateGate() {
	 this.status = true;
	 this.active = "1";
	 this.notifyAllGates();
 }
 
 /**
  * M�todo "desactiva" la compuerta
  */
 public void deactivateGate() {
	 this.status = false;
	 this.active = "0";
	 this.notifyAllGates();
 }
 
 /**
  * Funci�n para "actualizar" las compuertas (Observer, observer.update())
  */
 public abstract void verifyState();
 
 
 /**
  * Esta funci�n debe devolver el estado actual de la compuerta
  * @return Estado
  */
 public abstract boolean getState();
 
 /**
  * Retorna el tama�o de la lista de inputs de la compuerta
  * @return Int
  */
 public int getInputListSize() {
	 return this.inputList.getSize();
 }
 
 /**
  * Retorna la lista de inputs de la compuerta
  * @return List
  */
 public List getInputList() {
	 return this.inputList;
 }
 
 /**
  * Retorna el tama�o de la lista de inputs de la compuerta
  * @return
  */
 public int getOutputListSize() {
	 return outputList.getSize();
 }
 
 /**
  * Retorna la lista de los outputs de la compuerta
  * @return
  */
 public List getOutputList() {
	 return this.outputList;
 }
 
 /**
  * Elimina todas las referencias a s� mismo de las compuertas que
  * la est�n observando
  */
 public void deleteSelf() {
 	for (int i = 1; i <= outputList.getSize(); i++) {
 		if (outputList.getNodeInPosition(i).getData().getOutputList().getHead() != null) {
 			outputList.getNodeInPosition(i).getData().getInputList().deleteNode(this);	
 		}
 		
 	}
 	for (int i = 1; i <= inputList.getSize(); i++) {
 		if (inputList.getNodeInPosition(i).getData().getOutputList().getHead() != null)
 		inputList.getNodeInPosition(i).getData().getOutputList().deleteNode(this);
 		}
 	}
 
	
 }

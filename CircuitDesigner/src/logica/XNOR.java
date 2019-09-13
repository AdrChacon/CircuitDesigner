package logica;

/**
 * 
 * @author Chacón Campos
 * Compuerta XNOR - NOR exclusivo - Inactiva a menos que reciba una cantidad par de inputs verdaderos.
 */
public class XNOR extends Compuerta{

	@Override
	public void verifyState() {
		if(inputList.getActive()%2 == 0) {
			this.status = true;
		} else {
			this.status = false;
		}
		this.notifyAllGates();
	}

	@Override
	public boolean getState() {
		return status;
	}

}

package logica;

/**
 * 
 * @author Chacón Campos
 * Compuerta XOR - OR exclusivo - Inactiva a menos que reciba una cantidad impar de inputs verdaderos.
 */
public class XOR extends Compuerta{

	@Override
	public void verifyState() {
		if (inputList.getActive()%2 == 1) {
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

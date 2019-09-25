package logica;


/**
 * @author Chacón Campos
 * Compuerta AND - Inactiva a menos que reciba una cantidad de inputs verdaderos igual a la cantidad de inputs que tiene.
 */
public class AND extends Compuerta{

	public AND(String gateId) {
		super(gateId);
	}

	@Override
	public void verifyState() {
		if (inputList.getActive() != inputList.getSize()) {
			this.status = false;
		} else {
			this.status = true;
		}
		this.notifyAllGates();
	}

	@Override
	public boolean getState() {
		return status;
	}

}

package logica;


/**
 * @author Chacón Campos
 * Compuerta AND - Inactiva a menos que reciba una cantidad de inputs verdaderos igual a la cantidad de inputs que tiene.
 */
public class AND extends Compuerta{

	public AND(String gateId) {
		super(gateId);
		type = "AND";
	}

	@Override
	public void verifyState() {
		if (inputList.getActive() != inputList.getSize()) {
			this.status = false;
			active = 0;
		} else {
			this.status = true;
			active = 1;
		}
		this.notifyAllGates();
	}

	@Override
	public boolean getState() {
		return status;
	}

}

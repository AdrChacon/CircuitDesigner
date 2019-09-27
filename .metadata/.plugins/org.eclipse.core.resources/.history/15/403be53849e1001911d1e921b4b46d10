package logica;

/**
 * 
 * @author Chacón Campos
 * Compuerta NOR - Inactiva a menos que no reciba ningún input verdadero.
 */
public class NOR extends Compuerta{

	public NOR(String gateId) {
		super(gateId);
		type = "NOR";
	}

	@Override
	public void verifyState() {
		if (inputList.getActive() != 0) {
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

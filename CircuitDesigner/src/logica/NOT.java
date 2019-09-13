package logica;

/**
 * 
 * @author Chacón Campos
 * Compuerta NOT - Invierte el input (i.e False a True, True a False).
 */
public class NOT extends Compuerta{
	
	public NOT() {
		this.status = true;
	}

	@Override
	public void verifyState() {
		if(inputList.getActive() >= 1) {
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

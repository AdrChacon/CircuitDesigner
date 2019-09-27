package logica;

/**
 * 
 * @author Chacón Campos
 * Compuerta NOT - Invierte el input (i.e False a True, True a False).
 */
public class NOT extends Compuerta{
	
	public NOT(String gateId) {
		super(gateId);
		active = 1;
		type = "NOT";
		this.status = true;
	}

	@Override
	public void verifyState() {
		if(inputList.getActive() >= 1) {
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

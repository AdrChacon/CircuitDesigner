package logica;

/**
 * 
 * @author Chacón Campos
 * Compuerta OR - Activa si recibe un input verdadero de cualquiera de sus inputs.
 */
public class OR extends Compuerta{

	public OR(String gateId) {
		super(gateId);
		type = "OR";
	}

	@Override
	public void verifyState() {
		if (inputList.getActive() == 0){
			this.status = false;
			active = "0";
		} else {
			this.status = true;
			active = "1";
		}
		this.notifyAllGates();
	}

	@Override
	public boolean getState() {
		return status;
	}

}

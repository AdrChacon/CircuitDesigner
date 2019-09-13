package logica;

/**
 * 
 * @author Chacón Campos
 * Compuerta OR - Activa si recibe un input verdadero de cualquiera de sus inputs.
 */
public class OR extends Compuerta{

	@Override
	public void verifyState() {
		if (inputList.getActive() == 0){
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

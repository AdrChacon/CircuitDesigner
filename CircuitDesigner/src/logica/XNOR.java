package logica;

/**
 * 
 * @author Chacón Campos
 * Compuerta XNOR - NOR exclusivo - Inactiva a menos que reciba una cantidad par de inputs verdaderos.
 */
public class XNOR extends Compuerta{

	public XNOR(String gateId) {
		super(gateId);
		type = "XNOR";
	}

	@Override
	public void verifyState() {
		if(inputList.getActive()%2 == 0) {
			this.status = true;
			active = "1";
		} else {
			this.status = false;
			active = "0";
		}
		this.notifyAllGates();
	}

	@Override
	public boolean getState() {
		return status;
	}

}

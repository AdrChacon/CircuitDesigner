package logica;

/**
 * 
 * @author Chacón Campos
 * Compuerta XOR - OR exclusivo - Inactiva a menos que reciba una cantidad impar de inputs verdaderos.
 */
public class XOR extends Compuerta{

	public XOR(String gateId) {
		super(gateId);
		type = "XOR";
	}

	@Override
	public void verifyState() {
		if (inputList.getActive()%2 == 1) {
			this.status = true;
			active = 1;
		} else {
			this.status = false;
			active = 0;
		}
		this.notifyAllGates();
	}

	@Override
	public boolean getState() {
		return status;
	}

}

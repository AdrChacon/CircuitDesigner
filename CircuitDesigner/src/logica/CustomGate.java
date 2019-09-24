package logica;

import estructuras.List;
/**
 * Compuerta personalizada - Es una compuerta compuesta por varias compuertas previamente definidas por el usuario
 * @author Chacón Campos
 *
 */
public class CustomGate extends Compuerta{
	protected List circuitry;
	
	public CustomGate(List circuit) {
		super();
		this.circuitry = circuit;
	}

	@Override
	public void verifyState() {
		
	}

	@Override
	public boolean getState() {
		return false;
	}
	

}

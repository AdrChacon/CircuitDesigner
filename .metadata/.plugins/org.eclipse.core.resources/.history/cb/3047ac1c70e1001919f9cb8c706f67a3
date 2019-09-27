package logica;

import estructuras.List;
import javafx.scene.image.Image;
/**
 * Compuerta personalizada - Es una compuerta compuesta por varias compuertas previamente definidas por el usuario
 * @author Chacón Campos
 *
 */
public class CustomGate extends Compuerta{
	protected List circuitry;
	protected List inputGates;
	protected List outputGates;
	private Image customGateImage = new Image("resources/CustomGate.png");
	
	public CustomGate(String gateId, List circuit) {
		super(gateId);
		this.setImage(customGateImage);
		this.circuitry = circuit;
		type = "Custom";
		//inputGates = findInputGates();
		//outputGates = findOutputGates();
	}

	@Override
	public void verifyState() {
		
	}

	@Override
	public boolean getState() {
		return false;
	}
	
	public List getCircuitry() {
		return circuitry;
	}
	
	public List getInputGates() {
		return inputGates;
	}
	
	public List getOutputGates() {
		return outputGates;
	}


}

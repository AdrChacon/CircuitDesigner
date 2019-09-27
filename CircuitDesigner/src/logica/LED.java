package logica;

import javafx.scene.image.Image;

/**
 * Compuerta que representa un LED; encendido cuando esta activa, apagado cuando no lo esta, solo tiene inputs.
 * @author Chacón Campos
 *
 */
public class LED extends Compuerta{
	private Image offLED = new Image("resources/LEDoff.png");
	private Image onLED = new Image("resources/LEDon.png");

	public LED(String gateId) {
		super(gateId);
		type = "LED";
		this.setImage(offLED);;
	}

	@Override
	public void verifyState() {
		if (inputList.getActive() == 0){
			this.status = false;
			active = "0";
			this.setImage(offLED);
		} else {
			this.status = true;
			active = "1";
			this.setImage(this.onLED);
		}
		
	}

	@Override
	public boolean getState() {
		return this.status;
	}

}

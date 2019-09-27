package logica;

import javafx.scene.image.Image;

public class LED extends Compuerta{
	private Image offLED = new Image("resources/LEDoff.png");
	private Image onLED = new Image("resources/LEDon.png");

	public LED(String gateId) {
		super(gateId);
		this.setImage(offLED);;
	}

	@Override
	public void verifyState() {
		if (inputList.getActive() == 0){
			this.status = false;
			this.setImage(offLED);
		} else {
			this.status = true;
			this.setImage(this.onLED);
		}
		
	}

	@Override
	public boolean getState() {
		return this.status;
	}

}

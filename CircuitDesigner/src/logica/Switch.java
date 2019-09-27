package logica;

import javafx.scene.image.Image;

public class Switch extends Compuerta{
	private Image offSwitch = new Image("resources/inputOFF.png");
	private Image onSwitch = new Image("resources/inputON.png");
	
	public Switch(String gateId) {
		super(gateId);
		type = "switch";
		this.setImage(offSwitch);
	}

	@Override
	public void verifyState() {
		
	}

	@Override
	public boolean getState() {
		// TODO Auto-generated method stub
		return this.status;
	}
	
	public void activateGate() {
		 this.status = true;
		 this.active = "1";
		 this.setImage(onSwitch);
		 this.notifyAllGates();
	}
	
	public void deactivateGate() {
		 this.status = false;
		 this.active = "0";
		 this.setImage(offSwitch);
		 this.notifyAllGates();		 
	}

}

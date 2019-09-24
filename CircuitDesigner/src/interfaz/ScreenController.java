package interfaz;

import estructuras.List;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import logica.*;

public class ScreenController{
	
	public Pane circuitPane;
	public MenuItem menuClear, menuExit;
	public Button circuitSave, circuitTruthTable;
	public Label selectedGate, selectedNewGate;
	public String gateSelected = "", newGate = "";
	public List currentCircuit;
	
	public void menuClearScreenClicked() {
		currentCircuit = null;
		circuitPane.getChildren().clear();		
	}
	
	public void circuitPaneClicked() {
		if (newGate.equals("AND")) {
			Image gate = new Image("resources/AND.png");
			Compuerta ANDgate = new AND();
			ANDgate.setImage(gate);
			circuitPane.getChildren().addAll(ANDgate);
			newGate = "";
		} else {
			System.out.println("No action selected");
		}
	}
	
	public void chooseGateAND() {
		newGate = "AND";
		selectedNewGate.setText(newGate);
	}
	
	public void testMethod() {
		System.out.println("*autistic screeching*");
	}

}

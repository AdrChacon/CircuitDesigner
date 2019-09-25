package interfaz;

import estructuras.List;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import logica.*;

public class ScreenController{
	
	public Pane circuitPane;
	public MenuItem menuClear, menuExit;
	public Button circuitSave, circuitTruthTable;
	public Label selectedGate, selectedNewGate;
	public String gateSelected = "", actionTaken = "";
	public List currentCircuit;
	public Compuerta currentGate;
	
	public void menuClearScreenClicked() {
		currentCircuit = null;
		circuitPane.getChildren().clear();		
	}
	
	public void circuitPaneClicked() {
		System.out.println(gateSelected);
	}
	
	public void createGateAND() {
		Image gate = new Image("resources/AND.png");
		Compuerta ANDgate = new AND("TestGate");
		ANDgate.setImage(gate);
		ANDgate.setOnMouseClicked(e -> {
			System.out.println(e.getX());
			System.out.println(e.getY());
			gateSelected = ANDgate.getID();});
		ANDgate.setOnMouseDragged(e ->{
			ANDgate.setTranslateX(e.getX());
			ANDgate.setTranslateY(e.getY());
			System.out.println("GateX:" + ANDgate.getX() + ", GateY:" + ANDgate.getY() + ", MouseX:" + e.getX() + "MouseY:"+ e.getY() + "ImageX:" + ANDgate.getLayoutX() + "ImageY:" + ANDgate.getLayoutY());
		});
		circuitPane.getChildren().addAll(ANDgate);
		actionTaken = "AND gate created";
	}
 
}

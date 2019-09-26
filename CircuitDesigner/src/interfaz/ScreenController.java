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
	public List currentCircuit = new List();
	public Compuerta currentGate;
	public Compuerta savedGate;
	
	public void menuClearScreenClicked() {
		currentCircuit = new List();
		circuitPane.getChildren().clear();	
		actionTaken = "Screen cleared";
		gateSelected = "No gate selected";
		selectedNewGate.setText(actionTaken);
		selectedGate.setText(gateSelected);
		
	}
	
	public void circuitPaneClicked() {
		
	}
	
	public void createGateAND() {
		Image gate = new Image("resources/AND.png");
		Compuerta ANDgate = new AND("ANDGate" + (currentCircuit.getSize()));
		ANDgate.setImage(gate);
		ANDgate.setOnMouseClicked(e -> {
			System.out.println(e.getX());
			System.out.println(e.getY());
			currentGate = ANDgate;
			gateSelected = ANDgate.getID();
			selectedGate.setText(gateSelected);});
		ANDgate.setOnMouseDragged(e ->{
			ANDgate.setTranslateX(e.getX());
			ANDgate.setTranslateY(e.getY());
			System.out.println("GateX:" + ANDgate.getX() + ", GateY:" + ANDgate.getY() + ", MouseX:" + e.getX() + "MouseY:"+ e.getY() + "ImageX:" + ANDgate.getLayoutX() + "ImageY:" + ANDgate.getLayoutY());
		});
		circuitPane.getChildren().addAll(ANDgate);
		currentCircuit.addNode(ANDgate);
		actionTaken = "AND gate created";
		selectedNewGate.setText(actionTaken);
	}
	
	public void createGateOR() {
		Image gate = new Image("resources/OR.png");
		Compuerta ORgate = new OR("ORGate" + (currentCircuit.getSize()));
		ORgate.setImage(gate);
		ORgate.setOnMouseClicked(e -> {
			System.out.println(e.getX());
			System.out.println(e.getY());
			currentGate = ORgate;
			gateSelected = ORgate.getID();
			selectedGate.setText(gateSelected);});
		ORgate.setOnMouseDragged(e ->{
			ORgate.setTranslateX(e.getX());
			ORgate.setTranslateY(e.getY());
			System.out.println("GateX:" + ORgate.getX() + ", GateY:" + ORgate.getY() + ", MouseX:" + e.getX() + "MouseY:"+ e.getY() + "ImageX:" + ORgate.getLayoutX() + "ImageY:" + ORgate.getLayoutY());
		});
		circuitPane.getChildren().addAll(ORgate);
		currentCircuit.addNode(ORgate);
		actionTaken = "OR gate created";
		selectedNewGate.setText(actionTaken);
	}
	
	public void createGateNOT() {
		Image gate = new Image("resources/NOT.png");
		Compuerta NOTgate = new NOT("NOTGate" + (currentCircuit.getSize()));
		NOTgate.setImage(gate);
		NOTgate.setOnMouseClicked(e -> {
			System.out.println(e.getX());
			System.out.println(e.getY());
			currentGate = NOTgate;
			gateSelected = NOTgate.getID();
			selectedGate.setText(gateSelected);});
		NOTgate.setOnMouseDragged(e ->{
			NOTgate.setTranslateX(e.getX());
			NOTgate.setTranslateY(e.getY());
			System.out.println("GateX:" + NOTgate.getX() + ", GateY:" + NOTgate.getY() + ", MouseX:" + e.getX() + "MouseY:"+ e.getY() + "ImageX:" + NOTgate.getLayoutX() + "ImageY:" + NOTgate.getLayoutY());
		});
		circuitPane.getChildren().addAll(NOTgate);
		currentCircuit.addNode(NOTgate);
		actionTaken = "NOT gate created";
		selectedNewGate.setText(actionTaken);
	}
	
	public void createGateNAND() {
		Image gate = new Image("resources/NAND.png");
		Compuerta NANDgate = new NAND("NANDGate" + (currentCircuit.getSize()));
		NANDgate.setImage(gate);
		NANDgate.setOnMouseClicked(e -> {
			System.out.println(e.getX());
			System.out.println(e.getY());
			currentGate = NANDgate;
			gateSelected = NANDgate.getID();
			selectedGate.setText(gateSelected);});
		NANDgate.setOnMouseDragged(e ->{
			NANDgate.setTranslateX(e.getX());
			NANDgate.setTranslateY(e.getY());
			System.out.println("GateX:" + NANDgate.getX() + ", GateY:" + NANDgate.getY() + ", MouseX:" + e.getX() + "MouseY:"+ e.getY() + "ImageX:" + NANDgate.getLayoutX() + "ImageY:" + NANDgate.getLayoutY());
		});
		circuitPane.getChildren().addAll(NANDgate);
		currentCircuit.addNode(NANDgate);
		actionTaken = "NAND gate created";
		selectedNewGate.setText(actionTaken);
	}
	
	public void createGateNOR() {
		Image gate = new Image("resources/NOR.png");
		Compuerta NORgate = new NOR("NORGate" + (currentCircuit.getSize()));
		NORgate.setImage(gate);
		NORgate.setOnMouseClicked(e -> {
			System.out.println(e.getX());
			System.out.println(e.getY());
			currentGate = NORgate;
			gateSelected = NORgate.getID();
			selectedGate.setText(gateSelected);});
		NORgate.setOnMouseDragged(e ->{
			NORgate.setTranslateX(e.getX());
			NORgate.setTranslateY(e.getY());
			System.out.println("GateX:" + NORgate.getX() + ", GateY:" + NORgate.getY() + ", MouseX:" + e.getX() + "MouseY:"+ e.getY() + "ImageX:" + NORgate.getLayoutX() + "ImageY:" + NORgate.getLayoutY());
		});
		circuitPane.getChildren().addAll(NORgate);
		currentCircuit.addNode(NORgate);
		actionTaken = "NOR gate created";
		selectedNewGate.setText(actionTaken);
	}
	
	public void createGateXNOR() {
		Image gate = new Image("resources/XNOR.png");
		Compuerta XNORgate = new XNOR("XNORGate" + (currentCircuit.getSize()));
		XNORgate.setImage(gate);
		XNORgate.setOnMouseClicked(e -> {
			System.out.println(e.getX());
			System.out.println(e.getY());
			currentGate = XNORgate;
			gateSelected = XNORgate.getID();
			selectedGate.setText(gateSelected);});
		XNORgate.setOnMouseDragged(e ->{
			XNORgate.setTranslateX(e.getX());
			XNORgate.setTranslateY(e.getY());
			System.out.println("GateX:" + XNORgate.getX() + ", GateY:" + XNORgate.getY() + ", MouseX:" + e.getX() + "MouseY:"+ e.getY() + "ImageX:" + XNORgate.getLayoutX() + "ImageY:" + XNORgate.getLayoutY());
		});
		circuitPane.getChildren().addAll(XNORgate);
		currentCircuit.addNode(XNORgate);
		actionTaken = "XNOR gate created";
		selectedNewGate.setText(actionTaken);
	}
	
	public void createGateXOR() {
		Image gate = new Image("resources/XOR.png");
		Compuerta XORgate = new XOR("XORGate" + (currentCircuit.getSize()));
		XORgate.setImage(gate);
		XORgate.setOnMouseClicked(e -> {
			System.out.println(e.getX());
			System.out.println(e.getY());
			currentGate = XORgate;
			gateSelected = XORgate.getID();
			selectedGate.setText(gateSelected);});
		XORgate.setOnMouseDragged(e ->{
			XORgate.setTranslateX(e.getX());
			XORgate.setTranslateY(e.getY());
			System.out.println("GateX:" + XORgate.getX() + ", GateY:" + XORgate.getY() + ", MouseX:" + e.getX() + "MouseY:"+ e.getY() + "ImageX:" + XORgate.getLayoutX() + "ImageY:" + XORgate.getLayoutY());
		});
		circuitPane.getChildren().addAll(XORgate);
		currentCircuit.addNode(XORgate);
		actionTaken = "XOR gate created";
		selectedNewGate.setText(actionTaken);
	}
	
	public void createGateCustom() {
		actionTaken = "Gate not implemented yet";
		selectedNewGate.setText(actionTaken);
	}
	
	public void createLED() {
		Compuerta LEDgate = new LED("LED" + currentCircuit.getSize());
		LEDgate.setOnMouseDragged(e -> {
			LEDgate.setTranslateX(e.getX());
			LEDgate.setTranslateY(e.getY());
		});
		circuitPane.getChildren().addAll(LEDgate);
		currentCircuit.addNode(LEDgate);
		actionTaken = "LED created";
		selectedNewGate.setText(actionTaken);
	}
	
	public void createSwitch() {
		Compuerta Switchgate = new Switch("Switch" + currentCircuit.getSize());
		Switchgate.setOnMouseDragged(e -> {
			Switchgate.setTranslateX(e.getX());
			Switchgate.setTranslateY(e.getY());
		});
		Switchgate.setOnMouseClicked(e -> {
			if (Switchgate.getState()) {
				Switchgate.deactivateGate();
			} else {
				Switchgate.activateGate();
			}
			System.out.println(e.getX());
			System.out.println(e.getY());
			currentGate = Switchgate;
			gateSelected = Switchgate.getID();
			selectedGate.setText(gateSelected);});
		circuitPane.getChildren().addAll(Switchgate);
		currentCircuit.addNode(Switchgate);
		actionTaken = "Switch created";
		selectedNewGate.setText(actionTaken);
	}
	
	public void testingMethod() {
		for(int Pos = 1; Pos <= currentCircuit.getSize(); Pos++) {
			System.out.println(currentCircuit.getNodeInPosition(Pos).getData().getID());
		}
	}
 
}

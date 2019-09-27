package logica;

import estructuras.List;

public class MainForTests {

	public static void main(String[] args) {
		List CircuitoTest = new List();
		
		Compuerta AND1 = new AND("Gate" + CircuitoTest.getSize());
		Compuerta OR1 = new OR("Gate" + CircuitoTest.getSize());
		Compuerta AND2 = new AND("Gate" + CircuitoTest.getSize());
		Compuerta NOT1 = new NOT("Gate" + CircuitoTest.getSize());
		Compuerta NOT2 = new NOT("Gate" + CircuitoTest.getSize());
		Compuerta NOT3 = new NOT("Gate" + CircuitoTest.getSize());
		Compuerta XOR1 = new XOR("Gate" + CircuitoTest.getSize());
		Compuerta NAND1 = new NAND("Gate" + CircuitoTest.getSize());
		
		
		CircuitoTest.addNode(AND1);
		CircuitoTest.addNode(OR1);
		CircuitoTest.addNode(AND2);
		CircuitoTest.addNode(NOT1);
		CircuitoTest.addNode(NOT2);
		CircuitoTest.addNode(NOT3);
		CircuitoTest.addNode(XOR1);
		CircuitoTest.addNode(NAND1);
		
		AND1.connectOutput(XOR1);
		XOR1.connectInput(NOT1);
		OR1.connectOutput(NAND1);
		OR1.connectOutput(NOT2);
		NAND1.connectInput(XOR1);
		NOT3.connectInput(NOT2);
		NAND1.connectOutput(AND2);
		AND2.connectInput(NOT3);
		
		
		System.out.println("Start: "+"AND1 = " + AND1.getState() + ", OR1 = " + OR1.getState() + ", NOT1 = " + NOT1.getState() + ", XOR1 = " + XOR1.getState() + ", NOT2 = " + NOT2.getState() + ", NAND1 = " + NAND1.getState() + ", NOT3 = " + NOT3.getState() + ", AND2 = " + AND2.getState());
		AND1.activateGate();
		System.out.println("AND1 Active: "+"AND1 = " + AND1.getState() + ", OR1 = " + OR1.getState() + ", NOT1 = " + NOT1.getState() + ", XOR1 = " + XOR1.getState() + ", NOT2 = " + NOT2.getState() + ", NAND1 = " + NAND1.getState() + ", NOT3 = " + NOT3.getState() + ", AND2 = " + AND2.getState());
		OR1.activateGate();
		System.out.println("OR1 Active: "+"AND1 = " + AND1.getState() + ", OR1 = " + OR1.getState() + ", NOT1 = " + NOT1.getState() + ", XOR1 = " + XOR1.getState() + ", NOT2 = " + NOT2.getState() + ", NAND1 = " + NAND1.getState() + ", NOT3 = " + NOT3.getState() + ", AND2 = " + AND2.getState());
		AND1.deactivateGate();
		System.out.println("AND1 Inactive: "+"AND1 = " + AND1.getState() + ", OR1 = " + OR1.getState() + ", NOT1 = " + NOT1.getState() + ", XOR1 = " + XOR1.getState() + ", NOT2 = " + NOT2.getState() + ", NAND1 = " + NAND1.getState() + ", NOT3 = " + NOT3.getState() + ", AND2 = " + AND2.getState());
		OR1.deactivateGate();
		System.out.println("OR1 Inactive: "+"AND1 = " + AND1.getState() + ", OR1 = " + OR1.getState() + ", NOT1 = " + NOT1.getState() + ", XOR1 = " + XOR1.getState() + ", NOT2 = " + NOT2.getState() + ", NAND1 = " + NAND1.getState() + ", NOT3 = " + NOT3.getState() + ", AND2 = " + AND2.getState());
		
	}
}

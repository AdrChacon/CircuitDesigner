package logica;

import estructuras.List;

public class MainForTests {

	public static void main(String[] args) {
		List CircuitoTest = new List();
		
		Compuerta AND1 = new AND("Gate" + CircuitoTest.getSize());
		Compuerta OR1 = new OR("Gate" + CircuitoTest.getSize());
		Compuerta XOR1 = new XOR("Gate" + CircuitoTest.getSize());
		Compuerta OR2 = new OR("Gate" + CircuitoTest.getSize());
		
		CircuitoTest.addNode(AND1);
		CircuitoTest.addNode(OR1);
		CircuitoTest.addNode(XOR1);
		CircuitoTest.addNode(OR2);
		
		
		int iterations = (int) Math.pow(2, CircuitoTest.getSize());
		
		for(int i = 1; i <= iterations; i++) {
			System.out.println("Iteracion: " + i + " : " + "AND1: " + AND1.getActive() + ", OR1: " + OR1.getActive() + ", XOR1: " + XOR1.getActive() + ", OR2: " + OR2.getActive());
			CircuitoTest.pseudoBinaryCounter();
		}
		
		CircuitoTest.resetBinaryCounter();
		System.out.println("Reset test: " + "AND1: " + AND1.getActive() + ", OR1: " + OR1.getActive() + ", XOR1: " + XOR1.getActive() + ", OR2: " + OR2.getActive());
//		System.out.println("Start: "+"AND1 = " + AND1.getState() + ", OR1 = " + OR1.getState() + ", NOT1 = " + NOT1.getState() + ", XOR1 = " + XOR1.getState() + ", NOT2 = " + NOT2.getState() + ", NAND1 = " + NAND1.getState() + ", NOT3 = " + NOT3.getState() + ", AND2 = " + AND2.getState());
//		AND1.activateGate();
//		System.out.println("AND1 Active: "+"AND1 = " + AND1.getState() + ", OR1 = " + OR1.getState() + ", NOT1 = " + NOT1.getState() + ", XOR1 = " + XOR1.getState() + ", NOT2 = " + NOT2.getState() + ", NAND1 = " + NAND1.getState() + ", NOT3 = " + NOT3.getState() + ", AND2 = " + AND2.getState());
//		OR1.activateGate();
//		System.out.println("OR1 Active: "+"AND1 = " + AND1.getState() + ", OR1 = " + OR1.getState() + ", NOT1 = " + NOT1.getState() + ", XOR1 = " + XOR1.getState() + ", NOT2 = " + NOT2.getState() + ", NAND1 = " + NAND1.getState() + ", NOT3 = " + NOT3.getState() + ", AND2 = " + AND2.getState());
//		AND1.deactivateGate();
//		System.out.println("AND1 Inactive: "+"AND1 = " + AND1.getState() + ", OR1 = " + OR1.getState() + ", NOT1 = " + NOT1.getState() + ", XOR1 = " + XOR1.getState() + ", NOT2 = " + NOT2.getState() + ", NAND1 = " + NAND1.getState() + ", NOT3 = " + NOT3.getState() + ", AND2 = " + AND2.getState());
//		OR1.deactivateGate();
//		System.out.println("OR1 Inactive: "+"AND1 = " + AND1.getState() + ", OR1 = " + OR1.getState() + ", NOT1 = " + NOT1.getState() + ", XOR1 = " + XOR1.getState() + ", NOT2 = " + NOT2.getState() + ", NAND1 = " + NAND1.getState() + ", NOT3 = " + NOT3.getState() + ", AND2 = " + AND2.getState());
//		
	}
}

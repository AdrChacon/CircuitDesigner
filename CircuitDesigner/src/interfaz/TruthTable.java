package interfaz;

import estructuras.List;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TruthTable {
	private List circuitry;
	private List inputsList;
	private int rows;
	private int columns;
	
	public TruthTable(List circuit) {
		this.circuitry = circuit;
		this.circuitry.deleteAllNodesOfType("LED");
		this.inputsList = circuit.findInputGates();
		this.rows = (int) Math.pow(2, inputsList.getSize());
		this.columns = circuitry.getSize();
		TableView table = new TableView();
	}
	
	public void launch() {
	}

}

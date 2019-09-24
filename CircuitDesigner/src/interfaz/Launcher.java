package interfaz;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;

public class Launcher extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Screen.fxml"));
		
		primaryStage.setTitle("Circuit Designer");
		primaryStage.setScene(new Scene(root, 800, 600));
		primaryStage.show();
	}
	


}

package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Calculator.fxml")); //pulling in the scenebuilder file
		stage.setMaximized(true);
		stage.setTitle("Calculator"); //creating a title for output
		stage.setScene(new Scene(root));    
		stage.show();  
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

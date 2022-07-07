package EventHandlerAnonymeKlasseBeispiel;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
			//Button erstellt 
			Button btn = new Button("Sag Hello FX!");
			//Event Handling
			btn.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent r) {
					System.out.println("Hallo FX!");
				}
			});
			BorderPane root = new BorderPane();
			root.setCenter(btn);
			Scene scene = new Scene(root,200,100);
			primaryStage.setTitle("EventHandling");
			primaryStage.setScene(scene);
			primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

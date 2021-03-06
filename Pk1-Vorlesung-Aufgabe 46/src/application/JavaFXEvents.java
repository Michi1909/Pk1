package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JavaFXEvents extends Application {
	public void start(Stage primaryStage) {
		Button btn = new Button("Sag 'Hallo FX!'");
//		btn.setOnAction(new EventHandler<ActionEvent>() {
//			public void handle(ActionEvent event) {
//				System.out.println("Hallo FX!");
//			}
//		});
		
		btn.setOnAction(e->{
			System.out.println("Hallo FX!");
		});
		
		BorderPane root = new BorderPane();
		root.setCenter(btn);
		Scene scene = new Scene(root, 200, 100);
		primaryStage.setTitle("EventHandling");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch();
	}
}
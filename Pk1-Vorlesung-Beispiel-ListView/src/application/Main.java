package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		BorderPane bp = new BorderPane();
		
//		ListView<String> lv = new ListView<>();
//		lv.getItems().addAll("Fühling","Sommer","Herbst","Winter");
		
		ObservableList<String> liste = FXCollections.<String>observableArrayList("Fühling","Sommer","Herbst","Winter");
		ListView<String> lv = new ListView<String>(liste);
		
		bp.setCenter(lv);
		
		Scene scene = new Scene(bp);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Jahreszeiten");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

package application;
import Fachlogik.Audio;
import Fachlogik.Bild;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application{
	@Override
	public void start(Stage primaryStage){
		
		Pane root = new Pane();
		Scene sc = new Scene(root,400,200);
		
		MediumVerwaltungsView mediumVerwalt = new MediumVerwaltungsView(primaryStage);
		mediumVerwalt.setTitle("Mediumverwaltung");
		mediumVerwalt.showView();
		
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}

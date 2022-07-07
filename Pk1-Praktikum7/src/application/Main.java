package application;
	
import JavaCode.Audio;
import JavaCode.Bild;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Bild b1 = null;
        Audio a1 = null;

        Pane root = new Pane();
        Scene sc = new Scene(root,400,200);
        primaryStage.setScene(sc);
        primaryStage.setTitle("Hauptfenster");
        primaryStage.show();

        BildErfassungView bev = new BildErfassungView(b1,primaryStage);
        bev.setTitle("Bilderfassung");
        bev.showView();

        AudioErfassungView aev = new AudioErfassungView(a1,primaryStage);
        aev.setTitle("Audioerfassung");
        aev.showView();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

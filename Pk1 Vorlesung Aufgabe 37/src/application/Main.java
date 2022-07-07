package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		GridPane gp = new GridPane();
		gp.setPadding(new Insets(10));
		Label l1 = new Label("Label1");
		Label l2 = new Label("Label2");
		
		Button b1 = new Button("Start");
		TextField t0 = new TextField("Textfield 1");
		TextField t1 = new TextField("Textfield 2");
		TextField t2 = new TextField("Textfield 3");
		
		ListView lv = new ListView();
		for(int i=0;i<100;i++) {
			lv.getItems().add("This is Item:"+i);
		}
		
		gp.add(lv, 0, 0,2,4);
		gp.add(l1, 2, 0,1,1);
		gp.add(t0, 3, 0,3,1);
		gp.add(l2, 2, 1,1,1);
		gp.add(t1, 3, 1,3,1);
		gp.add(t2, 3, 2,3,1);
		gp.add(b1, 5, 4,1,1);
		
		gp.setHgap(10);
		gp.setVgap(10);
		
		Scene scene =new Scene(gp);
		primaryStage.setTitle("Aufgabe37");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

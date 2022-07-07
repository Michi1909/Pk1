package Example3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application{
	
	static Rectangle rec = new Rectangle(150.0,50.0,100.0,100.0);
	
	public void start(Stage primaryStage) {

		rec.setFill(Color.GREEN);
		
		Button btn = new Button("Change Color here");
		btn.setOnAction(new MyOwnEventHandler());
		HBox bpt = new HBox();
		bpt.getChildren().addAll(btn);
		bpt.setPadding(new Insets(20));
		bpt.setAlignment(Pos.CENTER);
		
		
		BorderPane bp = new BorderPane();
		bp.setCenter(rec);
		bp.setBottom(bpt);
		
		
		Scene scene = new Scene(bp,400.0,200.0);
		
		primaryStage.setTitle("Color-Test");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

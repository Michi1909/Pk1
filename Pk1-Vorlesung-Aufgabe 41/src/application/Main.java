package application;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		
			Pane root = new Pane();
			Scene scene = new Scene(root,500,500);
			Rectangle rec = new Rectangle(25.0,25.0,50.0,50.0);
			rec.setFill(Color.BLUE);
			root.getChildren().add(rec);
			root.setOnMouseClicked(new EventHandler<MouseEvent>() {
				public void handle(MouseEvent o) {
					rec.setX(o.getX());
					rec.setY(o.getY());
					
				}
			});
			
			primaryStage.setScene(scene);
			primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

package Example3;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;

public class MyOwnEventHandler implements EventHandler<ActionEvent> {

	public void handle(ActionEvent event) {
		int r = (int) (255 * Math.random());
		int g = (int) (255 * Math.random());
		int b = (int) (255 * Math.random());
		Main.rec.setFill(Color.rgb(r, g, b));
	}
	}

package Aufgabe38c;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MyButtonHandler implements EventHandler<ActionEvent> {
	public void handle(ActionEvent o) {
		System.out.println("Hallo FX!");
	}
}

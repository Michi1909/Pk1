module Pk1VorlesungEventHandling {
	requires javafx.controls;
	requires javafx.graphics;
	
	opens EventHandlerAnonymeKlasseBeispiel to javafx.graphics, javafx.fxml;
	opens Aufgabe38a to javafx.graphics, javafx.fxml;
	opens Aufgabe38b to javafx.graphics, javafx.fxml;
	opens Aufgabe38c to javafx.graphics, javafx.fxml;
}

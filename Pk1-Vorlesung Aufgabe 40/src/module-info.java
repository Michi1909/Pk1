module Pk1VorlesungAufgabe40 {
	requires javafx.controls;
	requires javafx.graphics;
	
	opens Example1 to javafx.graphics, javafx.fxml;
	opens Example2 to javafx.graphics, javafx.fxml;
	opens Example3 to javafx.graphics, javafx.fxml;
}

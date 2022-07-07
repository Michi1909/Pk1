module Pk1Praktikum10 {
	requires javafx.controls;
	requires javafx.graphics;
	
	opens GUI to javafx.graphics, javafx.fxml;
}

module Pk1 {
	requires javafx.graphics;
	requires javafx.controls; 
	
	opens application to javafx.graphics, javafx.fxml;
}

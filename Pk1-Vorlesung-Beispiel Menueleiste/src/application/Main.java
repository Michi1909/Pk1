package application;


import javafx.application.Application;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		BorderPane borderpane = new BorderPane();
		// 1) MenuBar erzeugen
		MenuBar mb = new MenuBar();
		// 2) Menu erzeugen
		Menu datei = new Menu("Datei");
		// 3) Eintrag erzeugen
		MenuItem item = new MenuItem("Laden");
		// 4) Eintrag einem Menu zuordnen
		datei.getItems().add(item);
		// 5) Separator zuordnen (optional)
		datei.getItems().add(new SeparatorMenuItem());
		// 6) Menu der MenuBar zuordnen
		mb.getMenus().add(datei);
		// 7) MenuBar einem Pane (hier BorderPane) zuordnen
		borderpane.setTop(mb);
		
		
		//Untermenue erzeugt werden
		//Menu datei = new Menu("Datei");
		Menu neu = new Menu("Neu");
		MenuItem itemText = new MenuItem("Text");
		MenuItem itemGrafik = new MenuItem("Grafik");
		neu.getItems().addAll(itemText, itemGrafik);
		datei.getItems().add(neu);
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}

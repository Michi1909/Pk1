package application;

import Fachlogik.Audio;
import Fachlogik.Bild;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MediumVerwaltungsView extends Stage{
		Stage primaryStage;
	public MediumVerwaltungsView(Stage primaryStage) {
		this.primaryStage=primaryStage;
	}
	
	public void showView() {
		this.initOwner(primaryStage);
		this.initModality(Modality.WINDOW_MODAL);
		
		BorderPane bp = new BorderPane();
		
		//1) MenuBar erzeugen
		MenuBar mb = new MenuBar();
		
		//2) Menu erzeugen
		Menu datei = new Menu("Datei");
		Menu medium = new Menu("Medium");
		Menu anzeige = new Menu("Anzeige");
		
		//3) Eintrag erzeugen
		MenuItem item1= new MenuItem("Laden");
		MenuItem item2= new MenuItem("Speichern");
		MenuItem item3= new MenuItem("Medienliste in Datei");
		MenuItem item4= new MenuItem("Beenden");
		
		MenuItem item5= new MenuItem("Audio Neu");
		MenuItem item6= new MenuItem("Bild Neu");
		
		MenuItem item7= new MenuItem("Erscheinungsjahr");
		MenuItem item8= new MenuItem("Neustes Medium");
		
		//4) Eintrag einem Menu zuordnen
		datei.getItems().add(item1);
		datei.getItems().add(item2);
		datei.getItems().add(item3);
		datei.getItems().add(item4);
		
		medium.getItems().add(item5);
		medium.getItems().add(item6);
		
		anzeige.getItems().add(item7);
		anzeige.getItems().add(item8);
		
		//5) Separator zuordnen (optional)
		datei.getItems().add(new SeparatorMenuItem());
		medium.getItems().add(new SeparatorMenuItem());
		anzeige.getItems().add(new SeparatorMenuItem());
		
		//6) Menu der MenuBar zuordnen
		mb.getMenus().add(datei);
		mb.getMenus().add(medium);
		mb.getMenus().add(anzeige);
		
		//7) MenuBar einem Pane (hier BorderPane) zuordnen
		bp.setTop(mb);
		
		
		item5.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent o) {
				AudioErfassungView audioerfassungView = new AudioErfassungView(new Audio(),primaryStage);
				audioerfassungView.setTitle("Audioerfassung");
				audioerfassungView.showView();
			}
		});
		
		item6.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent o) {
				BildErfassungView bildErfassungView = new BildErfassungView(new Bild(), primaryStage);
				bildErfassungView.setTitle("Bilderfassung");
				bildErfassungView.showView();
			}
		});
		
		Scene szene = new Scene(bp);
		this.setScene(szene);
		this.show();
		
	}
}

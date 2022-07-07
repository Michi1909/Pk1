package GUI;

import Datenhaltung.DAO;
import Exceptions.PersistenzException;
import Fachlogik.Mediumverwaltung;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MediumHauptprogrammView extends Application {
	private Controller controller;
	private Stage primaryStage;
	private DAO dao;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Mediumverwaltung mv = new Mediumverwaltung(dao);
		controller = new Controller(primaryStage, mv);
		BorderPane bp = new BorderPane();

		// Menubar erzeugen
		MenuBar mb = showMenue();
		bp.setTop(mb);
		
		ListView<String> list1=controller.listView();
		bp.setCenter(list1);
		
		Scene scene = new Scene(bp, 400, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Medienverwaltung");
		primaryStage.show();
	}

	public MenuBar showMenue() {

		// 1) MenuBar erzeugen
		MenuBar mb = new MenuBar();

		// 2) Menu erzeugen
		Menu datei = new Menu("Datei");
		Menu medium = new Menu("Medium");
		Menu anzeige = new Menu("Anzeige");

		// 3) Eintrag erzeugen
		MenuItem item1 = new MenuItem("Laden");
		MenuItem item2 = new MenuItem("Speichern");
		MenuItem item3 = new MenuItem("Medienliste in Datei");
		MenuItem item4 = new MenuItem("Beenden");

		MenuItem item5 = new MenuItem("Audio Neu");
		MenuItem item6 = new MenuItem("Bild Neu");

		MenuItem item7 = new MenuItem("Erscheinungsjahr");
		MenuItem item8 = new MenuItem("Neustes Medium");

		// 4) Eintrag einem Menu zuordnen
		datei.getItems().add(item1);
		datei.getItems().add(item2);
		datei.getItems().add(item3);
		datei.getItems().add(item4);

		medium.getItems().add(item5);
		medium.getItems().add(item6);

		anzeige.getItems().add(item7);
		anzeige.getItems().add(item8);

		// 5) Separator zuordnen (optional)
		datei.getItems().add(new SeparatorMenuItem());
		medium.getItems().add(new SeparatorMenuItem());
		anzeige.getItems().add(new SeparatorMenuItem());

		// 6) Menu der MenuBar zuordnen
		mb.getMenus().add(datei);
		mb.getMenus().add(medium);
		mb.getMenus().add(anzeige);

		item1.setOnAction(e -> {
			try {
				controller.laden();
			} catch (PersistenzException e1) {
				e1.printStackTrace();
			}
		});
		item2.setOnAction(e -> {
			try {
				controller.speichern();
			} catch (PersistenzException e1) {
				e1.printStackTrace();
			}
		});
		item3.setOnAction(e -> {
			controller.mediumInDateiSchreiben();
		});
		item4.setOnAction(e -> {
			primaryStage.close();
		});
		
		item5.setOnAction(e -> {
			controller.audioNeuClick();

		});
		item6.setOnAction(e -> {
			controller.bildNeuClick();

		});
		item7.setOnAction(e -> {
			controller.berechneDurchschnittlichesErscheinungsJahr();
		});
		item8.setOnAction(e -> {
			controller.zeigeNeuesMedium();
		});

		return mb;
	}
}

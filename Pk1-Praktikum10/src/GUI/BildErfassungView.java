package GUI;

import Fachlogik.Bild;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class BildErfassungView extends Stage {
	private Bild b;
	private Controller cont;

	public BildErfassungView(Bild b, Stage st, Controller cont) {
		super();
		this.b = b;
		this.cont = cont;
		this.initOwner(st);
		this.initModality(Modality.WINDOW_MODAL);

	}

	public void showView() {

		GridPane gp = new GridPane();

		// label
		Label label1 = new Label("Titel:");
		Label label2 = new Label("Ort:");
		Label label3 = new Label("Aufnahmejahr:");

		// Button
		Button b1 = new Button("Neu");
		Button b2 = new Button("Abbrechen");

		// Textfields
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		TextField tf3 = new TextField();

		// Labels zum Grid Layout hinzufügen add(Label,spalte,zeile)
		// add(Control,spalte,zeile,spaltenweite,zeilenweite) wichtig!!
		gp.add(label1, 0, 0);
		gp.add(label2, 0, 1);
		gp.add(label3, 0, 2);
		gp.add(tf1, 1, 0, 4, 1);
		gp.add(tf2, 1, 1, 4, 1);
		gp.add(tf3, 1, 2, 4, 1);
		gp.add(b1, 2, 3);
		gp.add(b2, 3, 3);

		// Abstand zwischen Zeilen und Spalten
		gp.setVgap(10);
		gp.setHgap(10);
		gp.setPadding(new Insets(10, 10, 10, 10));
		GridPane.setHalignment(label1, HPos.RIGHT);
		GridPane.setHalignment(label2, HPos.RIGHT);
		GridPane.setHalignment(label3, HPos.RIGHT);
		GridPane.setMargin(b1, new Insets(20, 20, 0, 20));
		GridPane.setMargin(b2, new Insets(20, 0, 0, 0));

		b1.setOnAction(e -> {
			String title = tf1.getText();
			String ort = tf2.getText();
			int aufnahmejahr = Integer.parseInt(tf3.getText());
			b.setTitel(title);
			b.setOrt(ort);
			b.setJahr(aufnahmejahr);
			cont.aufnehmeMedium(b);
			close();

		});

		b2.setOnAction(e -> {
			close();
		});

		Scene scene = new Scene(gp);
		this.setScene(scene);
		this.show();
	}
}

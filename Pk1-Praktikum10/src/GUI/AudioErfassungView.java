package GUI;

import Fachlogik.Audio;
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

public class AudioErfassungView extends Stage {
	private Audio a;
	private Controller cont;

	public AudioErfassungView(Audio a, Stage st, Controller cont) {
		super();
		this.a = a;
		this.cont=cont;
		this.initOwner(st);
		this.initModality(Modality.WINDOW_MODAL);

	}

	public void showView() {

		GridPane pan = new GridPane();

		// Labels
		Label label1 = new Label("Titel:");
		Label label2 = new Label("Erscheinungsjahr:");
		Label label3 = new Label("Interpret:");
		Label label4 = new Label("Spieldauer:");

		// Textfelder
		TextField t1 = new TextField();
		TextField t2 = new TextField();
		TextField t3 = new TextField();
		TextField t4 = new TextField();

		// Button
		Button b1 = new Button("Neu");
		Button b2 = new Button("Abbrechen");

		// Labels zum Grid Layout hinzufuergen
		pan.add(label1, 0, 0);
		pan.add(label2, 0, 1);
		pan.add(label3, 0, 2);
		pan.add(label4, 0, 3);
		pan.add(t1, 1, 0, 4, 1);
		pan.add(t2, 1, 1, 4, 1);
		pan.add(t3, 1, 2, 4, 1);
		pan.add(t4, 1, 3, 4, 1);
		pan.add(b1, 3, 4);
		pan.add(b2, 4, 4);

		// Abstand zwischen Zeile und Spalten
		pan.setVgap(10);
		pan.setHgap(10);
		pan.setPadding(new Insets(10, 10, 10, 10));
		GridPane.setHalignment(label1, HPos.RIGHT);
		GridPane.setHalignment(label2, HPos.RIGHT);
		GridPane.setHalignment(label3, HPos.RIGHT);
		GridPane.setHalignment(label4, HPos.RIGHT);
		GridPane.setMargin(b1, new Insets(20, 20, 0, 20));
		GridPane.setMargin(b2, new Insets(20, 0, 0, 0));

		b1.setOnAction(e -> {
			String title = t1.getText();
			int erscheinungsjahr = Integer.parseInt(t2.getText());
			String interpret = t3.getText();
			int spieldauer = Integer.parseInt(t4.getText());
			a.setTitel(title);
			a.setJahr(erscheinungsjahr);
			a.setInterpret(interpret);
			a.setDauer(spieldauer);
			cont.aufnehmeMedium(a);
			close();

		});

		b2.setOnAction(e -> {
			close();
		});

		Scene szene = new Scene(pan);
		this.setScene(szene);
		this.show();

	}
}

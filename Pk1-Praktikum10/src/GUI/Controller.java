package GUI;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import Exceptions.EmptyFileException;
import Exceptions.PersistenzException;
import Fachlogik.Audio;
import Fachlogik.Bild;
import Fachlogik.Medium;
import Fachlogik.Mediumverwaltung;
import Util.InputView;
import Util.MessageView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class Controller {
	private Mediumverwaltung mv;
	private Stage stage;
	private ObservableList<String> output1;

	public Controller(Stage stage, Mediumverwaltung mv) {
		this.stage = stage;
		this.mv = mv;
		this.output1 = FXCollections.<String>observableArrayList();
	}

	public void laden() throws PersistenzException {
		mv.laden();
		zeigeMedium();
	}

	public void speichern() throws PersistenzException {
		mv.speichern();
	}

	public void aufnehmeMedium(Medium medium) {
		mv.aufnehmen(medium);
		output1.add(medium.toString());
	}

	public void audioNeuClick() {
		AudioErfassungView a1 = new AudioErfassungView(new Audio(), stage,this);
		a1.showView();
	}

	public void bildNeuClick() {
		BildErfassungView b1 = new BildErfassungView(new Bild(), stage, this);
		b1.showView();
	}

	public void zeigeMedium() {
		Iterator<Medium> it = mv.iterator();
		output1.clear();
		while (it.hasNext()) {
			output1.add(it.next().toString());
		}
	}

	public void mediumInDateiSchreiben() {
		boolean value = false;
		String filename;
		File file = null;
		String path = "C:\\Users\\Kaise\\Desktop\\PK1\\";

		while (!value) {

			filename = InputView.create(stage, "Eingabe", "Dateiname", null).showView();

			try {
				if (filename.isEmpty()) {

					throw new EmptyFileException();
				}

				file = new File(path + filename + ".txt");
				value = true;
			} catch (EmptyFileException e) {
				MessageView.create(stage, "Fehlermeldung", "Datei nicht gefunden").showView();
			}
			try (FileOutputStream outStream = new FileOutputStream(file)) {
				mv.zeigeMedien(outStream);
				System.out.printf("Datei %s geschrieben.\n", path + filename);
			} catch (FileNotFoundException e) {
				MessageView.create(stage, "Fehler!", "Nicht vorhandene Datei! ").showView();
			} catch (IOException e) {
				MessageView.create(stage, "Fehler!", "Falscher Dateipfad").showView();
			}
		}

	}

	public void berechneDurchschnittlichesErscheinungsJahr() {
		String str = String.valueOf(mv.berechneErscheinungsjahr());
		MessageView.create(stage, "Erscheinungsjahr:", str).showView();
	}

	public void zeigeNeuesMedium() {
		Medium m1 = mv.sucheNeuesMedium();
		MessageView.create(stage, "Neustes Medium:", m1.toString()).showView();
	}
	
	public ListView<String> listView(){
		ListView<String> newList;
		return newList= new ListView<String>(output1);
	}

}

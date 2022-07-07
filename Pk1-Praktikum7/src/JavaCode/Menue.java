package JavaCode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class Menue {

	Mediumverwaltung m;

	public Menue(Mediumverwaltung m) {
		this.m = m;
	}

	public static void serialisieren(File file, Mediumverwaltung medium) {
		try {
			FileOutputStream stream = new FileOutputStream(file);
			medium.zeigeMedien(stream);
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

	public void menu_Ausgabe() {
		boolean finish = false;
		while (finish == false) {
			try {
				String eingabe = JOptionPane.showInputDialog(null,
						"1. Audio aufnehmen\n2. Bild aufnehmen\n3. Zeige alle Medien\n4. Medienliste in Datei schreiben\n5. Zeige neues Medium\n6. Berechne durchschnittliches Erscheinungsjahr\n7. Liste wird gespeicher\n8. Liste wird ausgegeben.\n9. Beenden\n\n Bitte Menuepunkt waehlen: ");
				int auswahl = Integer.parseInt(eingabe);

				switch (auswahl) {
				case 1:
					audioAufnehmen();
					break;
				case 2:
					bildAufnehmen();
					break;
				case 3:
					zeigeAlleMedien();
					break;
				case 4:
					mediumInDateiSchreiben();
					break;
				case 5:
					zeigeNeuesMedium();
					break;
				case 6:
					berechneDurchschnittlichesErscheinungsJahr();
					break;
				case 7:
					speichernListe();
					break;
				case 8:
					ausgebenListe();
					break;
				case 9:
					finish = true;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Ungueltige Eingabe!");
					continue;
				}

			} catch (NumberFormatException e) {
				String s = "Es muss eine Zahl eingegeben werden zwischen 1 - 9 !";
				JOptionPane.showMessageDialog(null, s);

			}
		}
	}

	private void audioAufnehmen() {
		JOptionPane.showMessageDialog(null, "Geben Sie den Audiodaten an in die Konsole ein:");
		String audiotitel = JOptionPane.showInputDialog(null, "Audiotitel: ");
		String jahr = JOptionPane.showInputDialog(null, "Erscheinungsjahr: ");
		String interpred = JOptionPane.showInputDialog(null, "Interpred: ");
		String audiodauer = JOptionPane.showInputDialog(null, "Audiodauer: ");
		int year = Integer.parseInt(jahr);
		int time = Integer.parseInt(audiodauer);
		Medium medium = new Audio(audiotitel, year, m, interpred, time);
		m.aufnehmen(medium);
	}

	private void bildAufnehmen() {
		JOptionPane.showMessageDialog(null, "Geben Sie die Daten des Bildes ein:");
		String bildtitel = JOptionPane.showInputDialog(null, "Bildbeschreibung: ");
		String jahrBild = JOptionPane.showInputDialog(null, "Geschossen im Jahr: ");
		String ort = JOptionPane.showInputDialog(null, "Ort: ");
		int yearofBild = Integer.parseInt(jahrBild);
		Medium medium1 = new Bild(bildtitel, yearofBild, m, ort);
		m.aufnehmen(medium1);
	}

	private void zeigeAlleMedien() {
		if (this.m.count == 0) {
			String s = "Die Mediumliste ist leer!";
			JOptionPane.showMessageDialog(null, s);
		}
		m.zeigeMedien(System.out);

	}

	private void mediumInDateiSchreiben() {
		try {
			File filename = filenameCheck();
			if (filename.isFile()) {
				serialisieren(filename, m);
			} else
				JOptionPane.showMessageDialog(null, "Angabe war kein korrekter Dateiname!");

		}

		catch (EmptyFilenameException e) {
			JOptionPane.showMessageDialog(null, "Bitte geben Sie einen gültigen Dateinamen ein.");
		}

	}

	private void zeigeNeuesMedium() {
		m.sucheNeuesMedium();
	}

	private void berechneDurchschnittlichesErscheinungsJahr() {
		m.berechneErscheinungsjahr();
	}

	private File filenameCheck() throws EmptyFilenameException {

		String dateiname;
		File file;
		if ((dateiname = JOptionPane.showInputDialog(null, "Bitte geben Sie den Dateinamen ein")) != null) {
			file = new File("C:\\Users\\Kaise\\Desktop\\Japan\\" + dateiname + ".txt");
			return file;
		}

		else
			throw new EmptyFilenameException();
	}

	private void speichernListe() {
		File speicherort = new File("C:\\Users\\Kaise\\Desktop\\Japan\\cherryblossoms.txt");
		ObjectOutputStream speicherStream = null;
		FileOutputStream dateiStream = null;

		try {
			dateiStream = new FileOutputStream(speicherort);
			speicherStream = new ObjectOutputStream(dateiStream);

			speicherStream.writeObject(m);
			speicherStream.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	private void ausgebenListe() {

		File ladeerort = new File("C:\\Users\\Kaise\\Desktop\\Japan\\cherryblossoms.txt");
		ObjectInputStream ladeStream = null;
		FileInputStream dateiStream = null;

		try {
			dateiStream = new FileInputStream(ladeerort);
			ladeStream = new ObjectInputStream(dateiStream);
			m = (Mediumverwaltung) ladeStream.readObject();
			ladeStream.close();
		}

		catch (ClassNotFoundException e) {

			System.out.println("Problem with your class");
		} catch (FileNotFoundException e) {

			System.out.println("Problem with File");
		} catch (IOException e) {

			System.out.println("IOException");
		}

	}

}
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menue {

	Mediumverwaltung m;

	public Menue(Mediumverwaltung m) {
		this.m = m;
	}

	public void menu_Ausgabe() {

		while (true) {
			try {
				JOptionPane.showMessageDialog(null,
						"1. Audio aufnehmen\n2. Bild aufnehmen\n3. Zeige alle Medien\n4. Zeige neues Medium\n5. Berechne durchschnittliches Erscheinungsjahr\n6. Beenden\n\n");
				String eingabe = JOptionPane.showInputDialog(null, "Bitte Menuepunkt wählen: ");
				int auswahl = Integer.parseInt(eingabe);

				switch (auswahl) {
				case 1:
//					try {
						JOptionPane.showMessageDialog(null, "Geben Sie den Audiodaten an in die Konsole ein:");
						String audiotitel = JOptionPane.showInputDialog(null, "Audiotitel: ");
						String jahr = JOptionPane.showInputDialog(null, "Erscheinungsjahr: ");
						String interpred = JOptionPane.showInputDialog(null, "Interpred: ");
						String audiodauer = JOptionPane.showInputDialog(null, "Audiodauer: ");
						int year = Integer.parseInt(jahr);
						int time = Integer.parseInt(audiodauer);
						Medium medium = new Audio(audiotitel, year, m, interpred, time);
						m.aufnehmen(medium);
						Formatter f = new Formatter();
						f.format("Sie haben sich für die Auswahl: %d entschieden. Es wurde nun ein Audio aufgenommen.",
								auswahl);
						JOptionPane.showMessageDialog(null, f.toString());
						break;
//					} catch (NumberFormatException e) {
//						String s = "Geben Sie eine Zahl für das Erscheinungsjahr und der Audiodauer ein!";
//						JOptionPane.showMessageDialog(null, s);
//					}
				case 2:
					//try {
						JOptionPane.showMessageDialog(null, "Geben Sie die Daten des Bildes ein:");
						String bildtitel = JOptionPane.showInputDialog(null, "Bildbeschreibung: ");
						String jahrBild = JOptionPane.showInputDialog(null, "Geschossen im Jahr: ");
						String ort = JOptionPane.showInputDialog(null, "Ort: ");
						int yearofBild = Integer.parseInt(jahrBild);
						Medium medium1 = new Bild(bildtitel, yearofBild, m, ort);
						m.aufnehmen(medium1);
						Formatter ft = new Formatter();
						ft.format("Sie haben sich für die Auswahl: %d entschieden. Es wurde nun ein Bild aufgenommen. ",
								auswahl);
						JOptionPane.showMessageDialog(null, ft.toString());
						break;
//					} catch (NumberFormatException e) {
//						String s = "Geben Sie eine Zahl für das Jahr ein!";
//						JOptionPane.showMessageDialog(null, s);
//					}
				case 3:
					if (this.m.count == 0) {
						String s = "Die Mediumliste ist leer!";
						JOptionPane.showMessageDialog(null, s);
					}
					m.zeigeMedien();
					Formatter fz = new Formatter();
					fz.format(
							"Sie haben sich für die Auswahl: %d entschieden, es wurden alle Medium Elemente auf der Konsole ausgegeben.",
							auswahl);
					JOptionPane.showMessageDialog(null, fz.toString());
					break;
				case 4:
					m.sucheNeuesMedium();
					Formatter fs = new Formatter();
					fs.format("Sie haben sich für die Auswahl: %d es wurden nun das neuste Medium ausgegeben.",
							auswahl);
					JOptionPane.showMessageDialog(null, fs.toString());
					break;
				case 5:
					m.berechneErscheinungsjahr();
					Formatter fl = new Formatter();
					fl.format(
							"Sie haben sich für die Auswahl: %d es wurden nun das durchschnittliche Erscheinungsjahr auf der Konsole ausgegeben.",
							auswahl);
					JOptionPane.showMessageDialog(null, fl.toString());
					break;
				case 6:
					Formatter fr = new Formatter();
					fr.format("Auswahl: %d \n Bis dann!", auswahl);
					JOptionPane.showMessageDialog(null, fr.toString());
					break;
				default:
					JOptionPane.showMessageDialog(null, "Ungültige Eingabe!");
					continue;
				}
			} catch (NumberFormatException e) {
				String s = "Es muss eine Zahl eingegeben werden!";
				JOptionPane.showMessageDialog(null, s);

			}
		}
	}
}
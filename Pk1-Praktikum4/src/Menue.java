import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Menue {

    Mediumverwaltung m;

    public Menue(Mediumverwaltung m)
    {
        this.m = m;
    }

    public void menu_Ausgabe() {
        
        while (true) {
            JOptionPane.showMessageDialog(null, "1. Audio aufnehmen\n2. Bild aufnehmen\n3. Zeige alle Medien\n4. Zeige neues Medium\n5. Berechne durchschnittliches Erscheinungsjahr\n6. Beenden\n\n");
            String eingabe = JOptionPane.showInputDialog(null,"Bitte Menuepunkt waehlen: ");
           int auswahl = Integer.parseInt(eingabe);

            switch (auswahl) {
                case 1:
                	Formatter f = new Formatter();
                	f.format("Auswahl: %d ",auswahl);
                	JOptionPane.showMessageDialog(null, f.toString());
                	break;
                case 2:
                	Formatter ft = new Formatter();
                	ft.format("Auswahl: %d ",auswahl);
                	JOptionPane.showMessageDialog(null, ft.toString());
                    break;
                case 3:
                	Formatter fz = new Formatter();
                	fz.format("Auswahl: %d ",auswahl);
                	JOptionPane.showMessageDialog(null, fz.toString());
                	this.m.zeigeMedien();
                    break;
                case 4:
                	Formatter fs= new Formatter();
                	fs.format("Auswahl: %d ",auswahl);
                	JOptionPane.showMessageDialog(null, fs.toString());
                    break;
                case 5:
                	Formatter fl = new Formatter();
                	fl.format("Auswahl: %d ",auswahl);
                	JOptionPane.showMessageDialog(null, fl.toString());
                    break;
                case 6:
                	Formatter fr = new Formatter();
                	fr.format("Auswahl: %d \n Bis dann!" ,auswahl);
                	JOptionPane.showMessageDialog(null, fr.toString());
                   break;
                default:
                	JOptionPane.showMessageDialog(null, "Ungueltige Eingabe!");
                    continue;
            }


        }
    }
}
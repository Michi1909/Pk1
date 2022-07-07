import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class TestMedienverwaltung {
	public static void sortierteAusgabe(List<Medium> liste) {
		Collections.sort(liste, new ErscheinungsJahrVergleicher());
		for(Medium a :liste) {
			System.out.println(a.getTitel()+" aus dem Jahr "+ a.getJahr());
		}
	}

	public static void main(String[] args) {
		Mediumverwaltung mediumVer = new Mediumverwaltung();
		
		Medium medium = new Audio("It means nothing", 2007,mediumVer, "Stereophonics", 229); //kann man den mVer Parameter irgendwie eleganter einbauen?
		Medium medium1 = new Bild("Gebauude FB Informatik", 2009,mediumVer, "Dortmund");
		Medium medium2 = new Audio ("Test for Me", 2022,mediumVer, "From Me", 222);
		//List<Medium> test = new LinkedList<Medium>();
//		test.add(medium);
//		test.add(medium1);
//		test.add(medium2);
		
//		sortierteAusgabe(test);


//		mediumVer.aufnehmen(medium);
//		mediumVer.aufnehmen(medium1);
//		mediumVer.aufnehmen(medium2);
//		Menue menue = new Menue(mediumVer);
//		menue.menu_Ausgabe();
		
		
	}

}

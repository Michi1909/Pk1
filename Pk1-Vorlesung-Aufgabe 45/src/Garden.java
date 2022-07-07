
public class Garden {

	public static void main(String[] args) {
		Counter c = new Counter();
		
		Thread west = new Thread(new Turnstile(c, 100));
		Thread east = new Thread(new Turnstile(c, 100));
		
		west.start();
		east.start();
		
		System.out.println("Ende Main");
	}

}
/*
 *Aufgabe 45: Gibt die obige Ausgabe die Zunahme der Besucherzahl
 *korrekt wieder? Welche Besonderheiten sind zu beobachten? Wie lässt
 *sich die Ausgabe erklären?
 *
*/

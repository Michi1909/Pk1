public class TestMedienverwaltung {

	public static void main(String[] args) {
		Mediumverwaltung mediumVer = new Mediumverwaltung();
		mediumVer.aufnehmen(new Audio("It means nothing", 2007,mediumVer, "Stereophonics", 229)); //kann man den mVer Parameter irgendwie eleganter einbauen?
		mediumVer.aufnehmen(new Bild("Gebauude FB Informatik", 2009,mediumVer, "Dortmund"));
		mediumVer.aufnehmen(new Audio ("Test for Me", 2022,mediumVer, "From Me", 222));
		System.out.println(mediumVer.berechneErscheinungsjahr());
		mediumVer.sucheNeuesMedium();
		mediumVer.zeigeMedien();
	}

}

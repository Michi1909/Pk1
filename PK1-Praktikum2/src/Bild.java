
public class Bild extends Medium {
	private String ort;

	public Bild(String titel, int jahr, Mediumverwaltung medium, String ort) {
		super(titel, jahr,medium);
		this.ort = ort;
	}
	public String getOrt() {
		return this.ort;
	}
	public void druckeDaten() {
		System.out.println("ID = "+super.getId()+" "+super.getTitel()+" "+super.getJahr()+" in "+ this.ort);
	}

}

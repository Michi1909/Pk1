
public class Bild extends Medium {
	private String ort;

	public Bild(String titel, int jahr, String ort) {
		super(titel, jahr);
		this.ort = ort;
	}
	public String getOrt() {
		return this.ort;
	}
	public void druckeDaten() {
		System.out.println("ID = "+super.getId()+" "+super.getTitel()+" "+super.getJahr()+" in "+ this.ort);
	}

}

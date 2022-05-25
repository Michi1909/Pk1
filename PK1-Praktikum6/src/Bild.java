import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Serializable;

public class Bild extends Medium implements Serializable{
	private String ort;
	private static final long serialVersionUID = 123;

	public Bild(String titel, int jahr, Mediumverwaltung medium, String ort) {
		super(titel, jahr, medium);
		this.ort = ort;
	}

	public String getOrt() {
		return this.ort;
	}

//	public void druckeDaten() {
//		System.out.println("ID = "+super.getId()+" "+super.getTitel()+" "+super.getJahr()+" in "+ this.ort);
//	}

	public void druckeDaten(OutputStream os) {

		String t = "ID = " + super.getId() + " " + super.getTitel() + " " + super.getJahr() + " in " + this.ort;

		PrintStream pw = new PrintStream(os);
		pw.printf(t);
	}
}

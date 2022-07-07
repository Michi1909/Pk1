package Fachlogik;

import java.io.OutputStream;
import java.io.PrintStream;

public class Bild extends Medium {
	private String ort;
	private static final long serialVersionUID = 123;

	public Bild(String titel, int jahr,String ort) {
		super(titel, jahr);
		this.ort = ort;
	}
	public Bild() {
		super();
		this.ort = "";
	}

	public String getOrt() {
		return this.ort;
	}
	
	public void setOrt(String ort) {
		this.ort=ort;
	}

	public void druckeDaten(OutputStream os) {

		String t = "ID = " + super.getId() + " " + super.getTitel() + " " + super.getJahr() + " in " + this.ort;

		PrintStream pw = new PrintStream(os);
		pw.printf(t);
	}
	
	@Override
	public String toString(){
		String daten = "ID = " + getId() + " " + getTitel() + " aufgenommen im Jahr " + getJahr() + " in " + ort + "\n";
		return daten;
	}
}

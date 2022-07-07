package Fachlogik;

import java.io.OutputStream;
import java.io.PrintStream;


public class Audio extends Medium{
	
	private String interpret;
	private int dauer;
	private static final long serialVersionUID = 123;
	
	public Audio(String titel, int jahr, String interpret, int dauer) {
		super(titel,jahr);
		this.interpret = interpret;
		this.dauer = dauer;
	}
	
	public Audio() {
		super();
		this.interpret = "";
		this.dauer=0;
	}

	public int getDauer() {
		return this.dauer;
	}
	
	public void setDauer(int dauer) {
		this.dauer=dauer;
	}
	
	public String getInterpret() {
		return this.interpret;
	}
	
	public void setInterpret(String interpret) {
		this.interpret=interpret;
	}
	
	public void druckeDaten(OutputStream os) {

		String t = "ID = "+ super.getId()+" "+super.getTitel()+" "+this.getInterpret()+ " aus " + super.getJahr()+" Spieldauer: "+ this.getDauer()+" sek.";

		PrintStream pw = new PrintStream(os);
		pw.printf(t);
	}
	
	@Override
	public String toString(){
		String daten = "ID = " + getId() + " " + getTitel() + " von: " + interpret + " aus " + getJahr() + " Spieldauer: " + dauer + " sek. .\n";
		return daten;
	}

}

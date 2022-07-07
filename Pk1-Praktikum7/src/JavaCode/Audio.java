package JavaCode;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Serializable;

public class Audio extends Medium implements Serializable {
	private String interpret;
	private int dauer;
	private static final long serialVersionUID = 123;
	
	public Audio(String titel, int jahr, Mediumverwaltung medium, String interpret, int dauer) {
		super(titel,jahr,medium);
		this.interpret = interpret;
		this.dauer = dauer;
	}

	public int getDauer() {
		return this.dauer;
	}
	
	public String getInterpret() {
		return this.interpret;
	}
	
//	public void druckeDaten() {
//		System.out.println("ID = "+ super.getId()+" "+super.getTitel()+" "+this.getInterpret()+ " aus " + super.getJahr()+" Spieldauer: "+ this.getDauer()+" sek.");
//	}
	
	public void druckeDaten(OutputStream os) {

		String t = "ID = "+ super.getId()+" "+super.getTitel()+" "+this.getInterpret()+ " aus " + super.getJahr()+" Spieldauer: "+ this.getDauer()+" sek.";

		PrintStream pw = new PrintStream(os);
		pw.printf(t);
	}

}

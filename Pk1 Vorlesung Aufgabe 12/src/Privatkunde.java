import java.util.Date;

public class Privatkunde {
	private String nachname;
	private String geb_datum;
	private Konto konto;
	
	public Privatkunde(String nachname, String geb_datum,Konto konto) {
		this.nachname=nachname;
		this.geb_datum = geb_datum;
		this.konto=konto;
	}
	
	public Privatkunde(Konto konto) {
		this.konto=konto;
	}
	public void setNachname(String nachname) {
		this.nachname=nachname;
	}
	public void setGeburtstag(String geburtsdatum) {
		this.geb_datum=geburtsdatum;
	}
	public String getNachname() {
		return this.nachname;
	}
	
	public String getGeburtsdatum() {
		return this.geb_datum;
	}
	public String toString() {
		return "Name des Kunden ist: "+ this.getNachname()+"\n"+"Der Kunde hat geburtstag am: "+ this.getGeburtsdatum()+"\nund ist Besitzer des Konto: "+konto.getKontonr();
	}
	
}

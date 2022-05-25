import java.io.Serializable;

public class Kunde implements Serializable {
	private String nachname;
	private String geb_datum;
	private Konto konto;
	
	public Kunde(String nachname, String geb_datum,Konto konto) {
		this.nachname=nachname;
		this.geb_datum = geb_datum;
		this.konto=konto;
	}
	
	public Kunde(Konto konto) {
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
	
	public void druckeDaten() {
		System.out.printf("Name des Kunden ist: %s%n Der Kunde hat geburtstag am: %s%n und ist Besitzer des Konto: %s%n",getNachname(),getGeburtsdatum(),konto.getKontonr());
	}


}

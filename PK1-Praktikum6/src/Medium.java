import java.io.OutputStream;
import java.io.Serializable;
import java.time.LocalDate;

public abstract class Medium implements Serializable {
	private static int id = 0;
	private String titel;
	private int jahr;
	private int counter;
	Mediumverwaltung mediumverwalt;
	
	private static final long serialVersionUID = 123;

	public Medium(String titel, int jahr,Mediumverwaltung mediumverwalt) {
		this.titel = titel;
		this.jahr = jahr;
		this.counter = id;
		id++;
		this.mediumverwalt=mediumverwalt;
	}

	public int getId() {
		return this.counter;
	}

	public int getJahr() {
		return this.jahr;
	}
	public String getTitel() {
		return this.titel;
	}

	public int alter() {
		LocalDate currentYear = LocalDate.now();
		return currentYear.getYear() - jahr;
	}

	public abstract void druckeDaten(OutputStream stream);
	public int compareTo(Medium other) {
		return Double.compare(this.alter(),other.alter());
	}
	
}

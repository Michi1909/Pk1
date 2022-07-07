package Fachlogik;

import java.io.OutputStream;
import java.io.Serializable;
import java.time.LocalDate;

public abstract class Medium implements Comparable<Medium>, Serializable {
	private static int id = 0;
	private String titel;
	private int jahr;
	private int counter;
	
	private static final long serialVersionUID = 123;

	public Medium(String titel, int jahr) {
		this.titel = titel;
		this.jahr = jahr;
		this.counter = id;
		id++;
	}
	public Medium() {
		this.id = counter;
		counter++;
		this.titel="";
		this.jahr=0;
	}

	public int getId() {
		return this.counter;
	}
	public void setID(int id) {
		this.id=id;
	}
	public int getJahr() {
		return this.jahr;
	}
	public void setJahr(int jahr) {
		this.jahr=jahr;
	}
	public String getTitel() {
		return this.titel;
	}
	public void setTitel(String title) {
		this.titel=title;
	}

	public int alter() {
		LocalDate currentYear = LocalDate.now();
		return currentYear.getYear() - jahr;
	}

	public abstract void druckeDaten(OutputStream stream);
	
	@Override
	public int compareTo(Medium r) {
		if(this.getJahr() > r.getJahr()) return 1;
		if(this.getJahr() < r.getJahr()) return -1;
		return 0;
	}
	
}

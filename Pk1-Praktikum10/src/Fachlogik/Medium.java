package Fachlogik;

import java.io.OutputStream;
import java.io.Serializable;
import java.time.LocalDate;

public abstract class Medium implements Comparable<Medium>, Serializable {
	private static int count = 0;
	private String titel;
	private int jahr;
	private int id;
	
	private static final long serialVersionUcount = 123;

	public Medium(String titel, int jahr) {
		this.titel = titel;
		this.jahr = jahr;
		this.id = count;
		count++;
	}
	public Medium() {
		this.id = count;
		count++;
		this.titel="";
		this.jahr=0;
	}
	public static void update(int size) {
		count=size;
	}
	public int getId() {
		return this.id;
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

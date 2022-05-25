import java.time.LocalDate;

public abstract class Medium {
	private static int id = 0;
	private String titel;
	private int jahr;
	private int counter;

	public Medium(String titel, int jahr) {
		this.titel = titel;
		this.jahr = jahr;
		this.counter = id;
		id++;
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

	public abstract void druckeDaten();
}

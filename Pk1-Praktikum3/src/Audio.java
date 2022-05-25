
public class Audio extends Medium {
	private String interpret;
	private int dauer;

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
	public void druckeDaten() {
		System.out.println("ID = "+ super.getId()+" "+super.getTitel()+" "+this.getInterpret()+ " aus " + super.getJahr()+" Spieldauer: "+ this.getDauer()+" sek.");
	}

}

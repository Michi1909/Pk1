
public class Auto {
	private String hersteller;
	private int baujahr;
	private int jahr = 2022;

	public Auto(String hersteller, int baujahr) {
		this.hersteller = hersteller;
		this.baujahr = baujahr;
	}
	public Auto(int baujahr) {
		this.baujahr=baujahr;
	}
	public int alter() {
		return this.jahr-this.baujahr;
	}
	public String getHersteller() {
		return this.hersteller;
	}
	
}

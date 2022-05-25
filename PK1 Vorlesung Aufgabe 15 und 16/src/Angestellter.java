
public class Angestellter {
	private String name;
	private double monatsgehalt;
	
	public Angestellter(String name, double monatsgehalt) {
		this.name=name;
		this.monatsgehalt=monatsgehalt;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setGehalt(double gehalt) {
		this.monatsgehalt=gehalt;
	}
	public String getName() {
		return this.name;
	}
	public double getGehalt() {
		return this.monatsgehalt;
	}
	public double berechneJahresgehalt() {
		return monatsgehalt*12;
	}

}

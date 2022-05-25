import java.io.Serializable;

public class Konto implements Serializable{
	private String blz;
	private String kontonr;
	private Kunde kunde;

	public Konto(String blz, String kontonr) {
		this.blz = blz;
		this.kontonr = kontonr;
		
	}
	
	public void setPrivatkunde(Kunde kunde) {
		this.kunde=kunde;
	}
	public Kunde getKunde() {
		return this.kunde;
	}
	
	public void setKontonr(String kontonr) {
		this.kontonr=kontonr;
	}
	public String getKontonr() {
		return this.kontonr;
	}

}

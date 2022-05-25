
public class Konto {
	private String blz;
	private String kontonr;
	private Privatkunde privatkunde;

	public Konto(String blz, String kontonr) {
		this.blz = blz;
		this.kontonr = kontonr;
		
	}
	
	public void setPrivatkunde(Privatkunde privatkunde) {
		this.privatkunde=privatkunde;
	}
	public Privatkunde getPrivatkunde() {
		return this.privatkunde;
	}
	
	public void setKontonr(String kontonr) {
		this.kontonr=kontonr;
	}
	public String getKontonr() {
		return this.kontonr;
	}
	
}

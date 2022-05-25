import java.util.ArrayList;

public class Mediumverwaltung {
	private ArrayList<Medium> media = new ArrayList<Medium>();
	
	public Mediumverwaltung() {
		
	}
	
	public void aufnehmen(Medium m) {
		media.add(m);
	}
	
	public void zeigeMedien() {
//		Iterator<Medium> it = media.iterator();
//		while(it.hasNext()) {
//			Medium m = it.next();
//			m.druckeDaten();
//		}
		for(Medium m:this.media) {
			m.druckeDaten();
		}
	}
	public void sucheNeuesMedium() {
		if(media.isEmpty()) {
			System.out.println("The Medium Array is Empty!");
		}
		Medium mini = media.get(0);
		for(Medium m:this.media) {
			if(m.getJahr()<mini.getJahr()) {
				mini=m;
			}
		}
		System.out.println("the youngest Medium is:");
		mini.druckeDaten();
		System.out.println("\n");
		
	}
	
	public double berechneErscheinungsjahr() {
		double temp = 0.0;
		int count =0; // count the elements of media
		for(Medium m: this.media) {
			if(m!=null) {
				temp+=m.getJahr();
				count++;
			}
		}
		return temp/count;
	}
	
	
}

package Fachlogik;

import java.io.*;
import java.util.*;

public class Mediumverwaltung implements Serializable{
	
	private List<Medium> media; 
	
	public Mediumverwaltung() {
		media = new LinkedList<Medium>();
	}
	
	public void aufnehmen(Medium m) {
		media.add(m);
	}
	
	public void zeigeMedien(OutputStream stream) {
		Iterator<Medium> it = media.iterator();
		while(it.hasNext()) {
			Medium m = it.next();
			m.druckeDaten(stream);
		}
//		for(Medium m:this.media) {
//			m.druckeDaten();
//		}
	}
	public Medium sucheNeuesMedium() {
		if (media.size() != 0){
			Collections.sort(media);

			return media.get(media.size() - 1);

		}
		else
			return null;
		
	}
	
	public double berechneErscheinungsjahr() {
		if(media.size() == 0)
			return 0;
	
		double durchschnitt = 0;
	
		for(Medium i : media){
			durchschnitt += i.getJahr();
			
		}
		
		return durchschnitt / media.size();
	}
	
	public Iterator<Medium> iterator(){
		return media.iterator();
		
	}
	
}

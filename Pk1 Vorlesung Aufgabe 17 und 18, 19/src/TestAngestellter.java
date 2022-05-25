import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestAngestellter {
	public static void sortierteAusgabe(List<Angestellter> liste) {
			Collections.sort(liste, new NamenVergleicher());
			for(Angestellter a :liste) {
				System.out.println(a.getName()+" erhält "+ a.berechneJahresgehalt());
			}
	}

	public static void main(String[] args) {
		Angestellter angest = new Angestellter("Silke",2000.00);
		Angestellter anges1 = new Angestellter("Melanie",2990.00);
		
		System.out.println(angest.berechneJahresgehalt());
		System.out.println(angest.getGehalt());
		System.out.println(angest.getName());
		
		System.out.println(angest.berechneJahresgehalt());
		System.out.println(anges1.getGehalt());
		System.out.println(anges1.getName());
		
		System.out.println(anges1.compareTo(angest));
		List<Angestellter> test = new LinkedList<Angestellter>();
		test.add(anges1);
		test.add(angest);
		
		sortierteAusgabe(test);
		
	}

}

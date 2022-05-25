
public class TestAngestellter {
	//Aufgabe7
	public static void main(String[] args) {
		Angestellter a = new Angestellter("James Gosling", 5000.00);
		Angestellter m = new Manager("Bill Gates", 6000.00, 50000.00);
		//Aufgabe 9; Nicht Möglich, da der Angestellte eine Oberklasse von Manager ist und Manager nicht : Manager m = new Angestellter("James Gosling", 60000.00);
		// von der Oberklasse ein Object erstellen kann. Andersrum ist es aber möglich.
		System.out.println(a.getName() + " erhält " + a.berechneJahresgehalt());
		System.out.println(m.getName() + " erhält " + m.berechneJahresgehalt());
	}

}

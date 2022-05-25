
public class TestAngestellter {
	public static void main(String[] args) {
		//Object a = new Manager("Bill Gates", 100000.00, 50000.00);
		//Aufgabe:15 Die Zuweisung ist möglich, es können nur Object Methoden augerufen werden.
		
		//Aufgabe:16 true, false, false
		Angestellter a = new Angestellter("Meier", 5000.00);
		Angestellter b = a;
		Angestellter c = new Angestellter("Meier", 5000.00);
		System.out.println("1. " + (a == b));
		System.out.println("2. " + (a == c));
		System.out.println("3. " + (a.equals(c)));
	}
}

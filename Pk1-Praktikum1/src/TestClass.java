
public class TestClass {

	public static void main(String[] args) {
		Medium bild1 = new Bild("Gebaeude FB Informatik",2019,"Dortmund");
		Medium audio1 = new Audio("It Means Nothing",2007,"Stereophonics",229);
		bild1.druckeDaten();
		audio1.druckeDaten();
		System.out.println(audio1.getTitel()+" ist "+ audio1.alter()+" Jahre alt.");
	}

}

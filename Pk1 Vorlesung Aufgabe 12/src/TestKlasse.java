import java.util.Date;
public class TestKlasse {

	public static void main(String[] args) {
		Konto konto1 = new Konto("0123400","23456000333");
		Privatkunde privatkunde= new Privatkunde("Gates", "12.11.1970",konto1);
		System.out.println(privatkunde.toString());
	}

}

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Testklasse {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Kaise\\Desktop\\Japan\\Test.txt");
		Konto konto1 = new Konto("0123400", "23456000333");
		Kunde kunde = new Kunde("Gates", "12.11.1970", konto1);

		serialisieren(file, kunde);
		Kunde k = deserialisieren(file);

		k.druckeDaten();
	}

	public static void serialisieren(File file, Kunde kunde) {
		try (FileOutputStream fis = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fis)) {
			oos.writeObject(kunde);
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

	public static Kunde deserialisieren(File file) {
		Kunde kunde = null;
		try (FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			kunde = (Kunde) ois.readObject();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		return kunde;
	}

}

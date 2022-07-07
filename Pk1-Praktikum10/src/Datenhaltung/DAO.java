package Datenhaltung;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

import Exceptions.PersistenzException;
import Fachlogik.Medium;

public class DAO implements IDao {

	@Override
	public void speichern(List<Medium> liste) throws PersistenzException {
		File speicherort = new File("C:\\Users\\Kaise\\Desktop\\PK1\\Test.txt");
		ObjectOutputStream speicherStream = null;
		FileOutputStream dateiStream = null;

		try {
			dateiStream = new FileOutputStream(speicherort);
			speicherStream = new ObjectOutputStream(dateiStream);

			speicherStream.writeObject(liste);
			speicherStream.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Override
	public List<Medium> laden() throws PersistenzException {
		File f1 = new File("C:\\Users\\Kaise\\Desktop\\PK1\\Test.txt");
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(f1);
			ois = new ObjectInputStream(fis);
			
			List<Medium> newList = (LinkedList<Medium>) ois.readObject();
			Medium.update(newList.size());
			return newList;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new PersistenzException("Fehler beim Laden der Daten");
		} catch (IOException e) {
			e.printStackTrace();
			throw new PersistenzException("Fehler beim Laden der Daten");
		}
	}

}

package Datenhaltung;

import java.util.List;

import Exceptions.PersistenzException;
import Fachlogik.Medium;

public interface IDao {
	void speichern(List<Medium> liste) throws PersistenzException;

	List<Medium> laden() throws PersistenzException;
}
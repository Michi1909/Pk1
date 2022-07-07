package Fachlogik;

import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import Datenhaltung.DAO;
import Datenhaltung.IDao;
import Exceptions.PersistenzException;

public class Mediumverwaltung {

	private List<Medium> media;
	private IDao dao;

	public Mediumverwaltung(IDao dao) {
		media = new LinkedList<Medium>();
		this.dao = dao;
	}

	public void aufnehmen(Medium m) {
		media.add(m);
	}

	public void laden() throws PersistenzException {
		media = dao.laden();
	}

	public void speichern() throws PersistenzException {
		dao.speichern(media);
	}

	public void zeigeMedien(OutputStream stream) {
//		Iterator<Medium> it = media.iterator();
//		while(it.hasNext()) {
//			Medium m = it.next();
//			m.druckeDaten(stream);
		if (media.isEmpty())
			return;
//		Collections.sort(media, (Medium m1, Medium m2) -> Integer.compare(m1.getJahr(), m2.getJahr()));
		media.sort((m1, m2) -> -1 * Integer.compare(m1.getJahr(), m2.getJahr()));

		media.forEach(m -> System.out.println(m.getTitel()));

	}

	public Medium sucheNeuesMedium() {
		if (media.size() != 0) {
			Collections.sort(media);

			return media.get(media.size() - 1);

		} else
			return null;

	}

	public double berechneErscheinungsjahr() {
		if (media.size() == 0)
			return 0;

		double durchschnitt = 0;

		for (Medium i : media) {
			durchschnitt += i.getJahr();

		}

		return durchschnitt / media.size();
	}

	public Iterator<Medium> iterator() {
		return media.iterator();

	}

}

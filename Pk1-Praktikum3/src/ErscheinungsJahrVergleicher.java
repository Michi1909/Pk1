import java.util.Comparator;

public class ErscheinungsJahrVergleicher implements Comparator<Medium> {
	public int compare(Medium l, Medium r) {
		return Integer.compare(l.getJahr(),r.getJahr());
	}

}
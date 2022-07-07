
import java.util.Comparator;

public class NamenVergleicher implements Comparator<Angestellter> {
	public int compare(Angestellter l, Angestellter r) {
		return -1*Integer.compare(l.getName().length(),r.getName().length());
	}

}

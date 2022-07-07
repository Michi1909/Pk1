
public class Counter {
	private int c;

	public synchronized void printNextInt() {
		c++;
		System.out.println(c);
	}

}


public class Counter {
	private int counter;

	public Counter() {
		counter = 0;
	}

	public synchronized void inc() {
		counter = counter + 1;
		System.out.println(counter);
	}
}


public class Worker implements Runnable {
	private Counter c;

	public Worker(Counter c) {
		this.c = c;
	}

	public void run() {

		try {
			c.printNextInt();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupt");
		}

		System.out.println("Ende Thread");

	}
}


public class Turnstile implements Runnable {

	private Counter c;
	private int delay;

	public Turnstile(Counter c, int delay) {
		this.c = c;
		this.delay = delay;
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				// TODO

			}
			synchronized (c) {
				c.inc();
			}
		}
	}

}

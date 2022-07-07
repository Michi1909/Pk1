package application;

public class BottlingPlant implements Runnable {
	private Conveyor c;
	private int time;
	
	public BottlingPlant(Conveyor c, int time) {
		this.c=c;
		this.time=time;
	}
	
	@Override
	public void run() {
		while(!Thread.currentThread().interrupted()) {
			try {
				synchronized (c) {
					while(c.isOverloaded()) {
						System.out.println("Abfuellanlage: Band voll, warten!");
						c.wait();
					}
					c.load(new Bottle());
					System.out.println("Abfuellanlage: Neue Flasch abgefuellt");
					c.notifyAll();
				}
				Thread.sleep(time);
			} catch(InterruptedException e) {
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}
	}
}

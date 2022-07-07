package application;

public class LabelingMachine implements Runnable {

	private Conveyor c;
	private int time;

	
	public LabelingMachine(Conveyor c, int time) {
		this.c=c;
		this.time=time;
		
	}
	
	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			try {
				synchronized (c) {
					// notify kann von anderen thread zufaellig kommen, deswegen while damit es
					// wieder uberprueft wird
					while (c.isEmpty()) {
						System.out.println("Etikettiermaschine: Warten, da Foerderband leer");
						c.wait();
					}
					System.out.println("Etikettiermaschine: Neue flasche vorhanden!");
					Bottle a = c.withdraw();
					a.printLable();
					System.out.printf("Etikettiermaschine: %s%n",a.printLable());
					c.notifyAll();
				}
				Thread.sleep(time);
			} catch (Exception e) {
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}
	}
}

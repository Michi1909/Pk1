package application;

public class Timer implements Runnable {
	TimerListener t;
	public Timer(TimerListener t) {
		this.t=t;
	}
	public void run() {
		while(!Thread.interrupted()) {
			try {
				Thread.sleep(1000);
				t.signalPerformed();
			} catch(InterruptedException e) {
				break;
			} 
		}
	}
}

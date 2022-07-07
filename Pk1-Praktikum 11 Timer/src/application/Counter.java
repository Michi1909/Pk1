package application;

public class Counter implements TimerListener{
	private int c;
	
	public Counter() {
		this.c=0;
	}
	@Override
	public void signalPerformed() {
		c++;
		System.out.println(c+"Sekunde seit Start");
	}

}

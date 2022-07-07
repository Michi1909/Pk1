
public class Main {

	public static void main(String[] args) {
		Thread a = new Thread(new PingPong("Ping",500));
		Thread b = new Thread(new PingPong("Pong",500));
		
		a.start();
		b.start();
		System.out.println("Ende Main");
		throw new RuntimeException();
	}

}

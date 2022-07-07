import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Counter c = new Counter();
		Thread t = new Thread(new Worker(c));
		JOptionPane.showMessageDialog(null, "Interrupt");
		t.interrupt();
		System.out.println("Ende Main");
	}

}

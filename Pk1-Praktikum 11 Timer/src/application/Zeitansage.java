package application;
import javafx.application.Application;
import javafx.stage.Stage;

public class Zeitansage extends Application{
	
	private int time;
	
	@Override
	public void start(Stage stage) throws Exception {
		Thread timer = new Thread(new Timer(new Counter()));
		timer.start();
		MessageView.create(stage, "Timer", "Timer stoppen").showView();
		timer.interrupt();
	}
	
	public static void main(String[] args) {

		launch();
	}
}


public class AutoTest {

	public static void main(String[] args) {
		Auto car1 = new Auto("Mercedes",2016);
		Auto car2 = new Auto("Hyundai",2019);
		System.out.println("Car1 is from "+car1.getHersteller()+" is "+car1.alter()+" years old.");
		System.out.println("Car2 is from "+car2.getHersteller()+" is "+car2.alter()+" years old.");
	}

}

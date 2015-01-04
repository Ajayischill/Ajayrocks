package inner_classes;

public class App {

	public static void main(String[] args) {
	 Robot myrobot = new Robot(8);
	 myrobot.start();

	 
	 Robot.Battery myBattery = new Robot.Battery();
	 myBattery.charge();
	}

}

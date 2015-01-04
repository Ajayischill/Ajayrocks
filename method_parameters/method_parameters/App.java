package method_parameters;

public class App {

	public static void main(String[] args) {

		SoundMachine mySoundMachine = new SoundMachine();
		
		// here's a standard, simple way to pass parameters to a method.
		mySoundMachine.playNote("high", 5);
		
		// here's a more sophisticated way to pass parameters to a method. You can set a variable and then pass that 
		// variable as the parameter. Everything is great at being able to set itself equal to something else. 
		
		String someValue = "low";
		int time = 30;
		
		mySoundMachine.playNote(someValue, time);
	
		

	}

}

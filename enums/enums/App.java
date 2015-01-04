package enums;

/*
 * Shows how enums work. In order to use the enum, we create a new enum and use dot notation to select the type of enum
 * that we want. when you type the dot, Eclipse shows you the possible enum values.
 * 
 * For a shortcut, type switch(myMic){} and then click the warning indicator and select Add missing case statements.
 *
 */
public class App {

	public static void main(String[] args) {
		Microphone myMic = Microphone.DYNAMIC;
		
		switch(myMic) {
		case CARDIOD:
			System.out.println("Cardiod");
			break;
		case DYNAMIC:
			System.out.println("Dynamic");
			break;
		case POLAR:
			System.out.println("Polar");
			break;
			
		default:
			System.out.println("no mic selected.");
			break;
		
		}

	}

}

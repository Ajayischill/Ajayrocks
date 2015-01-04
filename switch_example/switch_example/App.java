package switch_example;

/**
 * This shows an example of the switch logic. You often use this logic when you're using enums. Here you can see that 
 * switch is followed by a conditional. The content inside the parentheses is a condition that is met by one of the cases.
 * If it's the case that myfaction is Candor, then run the logic in the case CANDOR. 
 * 
 * The full caps is a typographical convention with enums and constants. 
 * 
 * At the end of the switch logic, "default" is used as the else condition.
 * 
 * Break means that you get out of the logic there and continue after the switch. 
 * 
 * Eclipse will autofill some of the case logic. Just type switch(myfaction), and then click the little warning indicator and 
 * select Add missing case statements. 
 * 
 * Note that you can only switch on certain types of variables, such as int and string.
 * @author tjohnson
 *
 */
public class App {

	public static void main(String[] args) {
		Factions myfaction = Factions.ERUDITE;
	
		switch(myfaction) {
		case CANDOR:
			System.out.println("You belong to the " + myfaction + " faction.");
			break;
		
		case ERUDITE:
			System.out.println("You belong to the " + myfaction + " faction.");
			break;
			
		case ABNEGATION:
			System.out.println("You belong to the " + myfaction + " faction.");
			break;
			
		case DAUNTLESS:
			System.out.println("You belong to the " + myfaction + " faction.");
			break;
			
		case AMITY:
			System.out.println("You belong to the " + myfaction + " faction.");
			break;
			
			default: 
				System.out.println("You are factionless! It sucks to be you.");
		
		
		}
		


}
}

package final_fields_methods;

public class App {

	public static void main(String[] args) {
		EndOfDays myEndOfDays = new EndOfDays();
		
		// you can't change the value for this field because its modifier is "final"
		// myEndOfDays.apocalypse = "November 5";
		
		// However, you can modify the time field because it doesn't have a "final" modifier;
		myEndOfDays.time = "now";
		
		NearFinals myNearFinals = new NearFinals();
		
		// this subclass method overrides the method of its superclass
		myNearFinals.windClock();
		
		
		
	}
	
	

}

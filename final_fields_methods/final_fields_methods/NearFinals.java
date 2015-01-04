package final_fields_methods;

public class NearFinals extends EndOfDays {
	
	// let's override a method from EndOfDays
	
	void windClock() {
		System.out.println("Start Near Finals clock.");
	}
	
	// we can't override this method, however, because its superclass has a final modifier
//	 void beginApocalypseNow(){
//		System.out.println("[scream!!!] Aggghhh! Zombies!");
//	}
//	

}

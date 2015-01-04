//import warehouse.Facility; // imports a specific class
import warehouse.Facility;  // imports all classes
import warehouse.location.Kansas;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Facility myFacility = new Facility();
myFacility.facilityMessage();
	
	
	Kansas myKansas = new Kansas();
	myKansas.kansasMessage();
	
	}

}

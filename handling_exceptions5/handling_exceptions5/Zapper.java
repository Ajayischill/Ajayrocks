package handling_exceptions5;

/**
 * just a test of creating my own exception...
 * @author tjohnson
 *
 */
public class Zapper  {
	int volts;
	Exception yowzerError;
	
	void startZap(int volts) throws Exception {
	this.volts = volts;
	
	if (volts > 3) {
		throw yowzerError;
	}
	
	if (volts < 3 ) {
		System.out.println("you're all good!");
	}
		
	
}
}

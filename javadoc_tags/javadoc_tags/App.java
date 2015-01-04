package javadoc_tags;

import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		
		// First initialize your smartphone using the model number and license key.
		ACME_Smartphone myACME_Smartphone = new ACME_Smartphone(2.0, "398978fdskj");
		
		// Locate the roadrunner.
		myACME_Smartphone.findRoadRunner("Santa Clara","California");
		
		// Zap the roadrunner with the amount of voltage you want.
		myACME_Smartphone.zapRoadRunner(20);

	}

}

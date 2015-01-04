package big_decimal;


/**
 * You have to convert big decimals to strings first if you want to maintain the precision of the decimal place. This example is from 
 * Java Essential Training with David Gassner.
 */
import java.math.BigDecimal;

public class App {
	
	public static void main(String[] args) {
		
		double d = 1115.37;
		String ds = Double.toString(d);
		BigDecimal bd = new BigDecimal(ds);
		System.out.println("The value is " + bd.toString());

	}
	

}

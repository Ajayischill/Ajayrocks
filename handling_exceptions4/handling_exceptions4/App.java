package handling_exceptions4;

public class App {
	/* This example comes from Beginning Java 8 Fundamentals, by Kishori Sharan
	* We're demonstrating how to catch an error. You can't divide by 0 because it results in an undefined value, so 
	* an Arithmetic error will be thrown. 
	*/
	 
	 //DivideByZeroWithTryCatch.java
	 
	public static class DivideByZeroWithTryCatch {
		
		public static void main(String[] args) {
		
	                int x = 10, y = 0, z;
	                try {
	                        z = x / y;
	                        System.out.println("z = " + z);
	                }
	                catch(ArithmeticException e) {
	                        // Get the description of the exception
	                        String msg = e.getMessage();
	       
	                        // Print a custom error message
	                        System.out.println("An error has occurred. The error is: " + msg);
	                }
	     
	                System.out.println("At the end of the program.");
	        }
	}

}

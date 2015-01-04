package constructor;

public class App {

		
		public static void main(String[] args) {
			
			Constructor constructor1 = new Constructor("john", "tahiti");
			
			// but with a constructor, you can just instantiate like this:
			//new Constructor("john", "tahiti");
			
			constructor1.sampleConstructorMethod();
			
			// this runs the constructor directly.

			
		}


}

package final_class;

public class App {

	public static void main(String[] args) {
		
		// Even though FinalClass is marked as final, you can still create objects from it like this:
		FinalClass finalito = new FinalClass();
		System.out.println(finalito.puppy);
		
		FinalClass finalito1 = new FinalClass();
		System.out.println(finalito1.puppy);
		
		//You just can't create subclasses from it, like this:
		
//		public class FinalClassLite extends FinalClass {

	}
	
	// Because the parent class is final, it's like giving that parent class a vasectomy: it can no longer be extended to child classes.

}

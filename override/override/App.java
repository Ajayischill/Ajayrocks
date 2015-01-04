package override;

/*
 * This gives an example of how to use an override. When you add this @Override annotation, it overrides whatever 
 * method was in the class. When you use this Override, you actually are creating a child class here. Hence it's called 
 * an anonymous class because this class doesn't have a particular name. 
 * 
 * Instead of using an anonymous class here like this (overriding an existing class), the more formal way to go about this
 * would be to use an interface, which forces users to define their own methods from existing templates, or to use the keyword extends and create a child class, and then in that child class, create a method with a different
 * value here. or
 *
 *
 */

public class App {

	public static void main(String[] args) {
		Computer myComputer = new Computer() {
			@Override
			public void switchOn() {
				System.out
						.println("plugging in the computer to the power source");
			}
		};
		myComputer.switchOn();
		
		Plant myPlant = new Plant() {
			@Override
			 public void grow() {
				System.out.println("plant growing");
			}
		};
		myPlant.grow();
		
		/* here we create a new class that implements the plant interface. because our class implements an interface, we have to 
		 * add the unimplemented methods and essentially override them, although the @Override keyword is actually unnecessary. 
		 * 
		 * 
		 */
		
		class Herb implements Plant {

			// @Override  // this @override keyword is unnecessary.
			public void grow() {
				System.out.println("Herb growing");
				
			}
		
		}
		
		Herb myHerb = new Herb();
		myHerb.grow();
		
		

	}

}

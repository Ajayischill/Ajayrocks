/**
 * This is an example of an inner class. We have the class Brain defined inside of the class Robot. The inner classes has 
 * access to the enclosing class's instance variables and methods. Likewise, the enclosing class can create
 * a new object using the inner class and then run those methods in the inner class.
 * 
 * However, in order to access the inner class in your App, you have to package things up in a method in the public class.
 * 
 */


package inner_classes;

public class Robot {
	private int id;

	public Robot(int id) {
		this.id = id;
	}

	public void start() {
		System.out.println("Starting robot " + id);
		Brain brain = new Brain();
		brain.think();
	}

	class Brain {
		public void think() {
			System.out.println("Robot " + id + "is thinking.");
		}
	}
	 static class Battery {
		public void charge(){
		System.out.println("Charging ");
	}
	}
}

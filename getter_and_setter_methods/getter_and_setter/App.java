package getter_and_setter;

public class App {

	public static void main(String[] args) {
		
		// create a new object.
		Language lang1 = new Language();
		
		// here we set the values.
		lang1.setDifficulty(8);
		lang1.setLevel("really hard");
		lang1.setType("PHP");
				
		// now we use the getter methods to get the values we set. each of these methods returns the value, so we can 
		// just use it almost like a variable in itself. 
		lang1.getDifficulty();
		lang1.getLevel();
		lang1.getType();
		
	System.out.println("value retrieval: " + lang1.getDifficulty() + ", " + lang1.getLevel() + ", " + lang1.getType() );
	}

}

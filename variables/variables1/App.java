package variables1;

public class App {

	public static void main(String[] args) {
		Bed myBed = new Bed();
		System.out.println(myBed.ID);
        // myBed.covers = "satin"; // Because "covers" is private, this class can't see or use it.
		Furniture newStuff = new Furniture();
		newStuff.myFurniture();
		newStuff.whatCovers();
	}

}

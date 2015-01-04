/**
 * Just demonstrating an array here. To declare an array, you use something like
 * int[]. This means that we're holding integers in the array, or that it's an
 * integer array. Its name is coolArray. Once you declare the array, you have to
 * specify how many spaces it holds. In this case, it will hold 3. Then you set
 * the value for each position in the array using the bracket notation shown
 * here (coolArray[2] = 30) and so on.
 * 
 * After this, we print out the array using a for loop that will cycle through
 * each position in the array until it's finished.
 * 
 */
public class coolArray {

	public static void main(String[] args) {

		// This is an array.
		int[] coolArray;
		coolArray = new int[3];
		coolArray[0] = 10;
		coolArray[1] = 20;
		coolArray[2] = 30;

		for (int i = 0; i < coolArray.length; i++) {
			System.out.println(coolArray[i]);

		}

	}

}

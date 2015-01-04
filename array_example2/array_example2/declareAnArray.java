package array_example2;
	
	/**
	 * This is another way of declaring an array. Here we basically say that we're
	 * creating a new integer array named awesomeArray. There are 3 spots in that
	 * array, and at the 0 position we have 0, at the 1 position we have 1, and at
	 * at the 2 position we have 2.
	 * 
	 * Then we use a {@link}forloop to cycle through the array, starting at 0 and iterating 
	 * the length of the array. It will print out 0, 1, 2.
	 *
	 */

	public class declareAnArray {

		public static void main(String[] args) {
			int[] awesomeArray = { 0, 1, 2 };
			for (int i = 0; i < awesomeArray.length; i++) {
				System.out.println(awesomeArray[i]);
			}

		}

	}

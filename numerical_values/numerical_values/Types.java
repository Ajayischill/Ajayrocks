package numerical_values;

public class Types {
	
	public static void main(String[] args) {
		
		byte myByte = 20; // max is 27
		short myShort = 67;
		int myInt = 899;
		long myLong = 89999998;
		float myFloat = 235.5f;
		double myDouble = 8000.7;
		
		// Handy way of seeing the max values for each:
//		System.out.println(Byte.MAX_VALUE);
//		System.out.println(Short.MAX_VALUE);
//		System.out.println(Long.MAX_VALUE);
//		System.out.println(Float.MAX_VALUE);
//		System.out.println(Double.MAX_VALUE);
		
		// This works because the byte fits into the int.
myInt = (int)myLong;
System.out.println(myInt);

//myLong = myDouble;
//System.out.println(myLong);
		
myDouble = (double)myLong;
System.out.println(myDouble);

		// This doesn't work because the int doesn't fit into the byte.
//		myByte = myInt;
//		System.out.println(myByte);
		
	}

}

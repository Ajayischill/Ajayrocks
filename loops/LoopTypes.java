public class LoopTypes {

	public static void main(String[] args) {

		// here's a simple "for" loop. for takes three arguments. The first
		// argument (i = 0) sets the initial value, the second sets the
		// condition under which the loop runs, and the third sets the action to
		// happen at the end of each loop. In this case, i gets incremented by
		// 1.

		for (int i = 0; i < 8; i++) {
			System.out.println("loop");

		}

		// here's a while loop. while the condition in parentheses (i < 10) is
		// met, the block statement runs. with each loop, i gets incremented by
		// 1. when i equals 3, a break statements stops the routine and moves
		// to the next block statement ("we're done"); break statements are
		// fairly common in while loops.

		int i = 0;
		while (i < 10) {
			System.out.println("'round we go");
			i++;
			if (i == 3) {
				break;
			}
		}
		
		// break moves me to the next statement outside its block.
		System.out.println("we're done.");
		
		
		// here's a do statement. it's the same as while but in a flipped order. We start out by setting x's value to 0. The do statement runs. It increments x by 1 and prints out the value
		// to the console. after the statement, the while condition evaluates whether to run the do statement again. In this case, the loop will run 7 times, until x is greater than 7.
		int x= 0;
		do
		{
			x++;
		  System.out.println(x);
		  
		}
		while(x < 7);
		
		// this demonstrates the use of the continue statement. continue merely continues processing the loop, whereas 
		// break actually breaks out of the loop and goes to the next logic in the routine.
		// in this example, there are 10 iterations. if y does not equal 3, when the logic gets to "continue," it starts 
		// back at the loop's beginning and repeats. however, when y == 3, the continue block gets skipped and we see the printout 
		// "just pass the point of continue". once we finish the loop and y is 10, then the next statement is run: "break out of the loop."
		int y = 0;
		while (y < 10) {
			System.out.println("y: " + y);
			y++;
			if (y != 3) {
				continue;
				
			}
			System.out.println("just past the point of continue");
			
		
		}
		System.out.println("break out of the loop.");
		
		
	}
}

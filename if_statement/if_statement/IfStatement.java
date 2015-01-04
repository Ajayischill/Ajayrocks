package if_statement;

/**
 * This code shows if-else logic. If a certain condition is true, then run the
 * code in the brackets. Otherwise, if that first code is false, evaluate the
 * second condition. Is myInt < 11? If so, run the code in the brackets here. If
 * neither of these conditions are true, then run the code in the else
 * statement.
 * 
 */

public class IfStatement {

	int myInt = 20;

	void iffy() {
		if (myInt < 10) {
			System.out.println("Yes, it's true!");
		}

		else if (myInt < 11) {
			System.out.println("No, it's true!");
		} else {
			System.out.println("No, it's false!");
		}
	}

	public static void main(String[] args) {
		IfStatement ifStatement1 = new IfStatement();
		ifStatement1.iffy();
	}

}

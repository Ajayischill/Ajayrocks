package getter_and_setter;

public class App {

	public static void main(String[] args) {
		Keyboard myKeyboard = new Keyboard();
		myKeyboard.setFunctionKeys("f11, f10, f9");
		myKeyboard.getFunctionKeys();
	}

}

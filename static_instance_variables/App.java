
public class App {

	public static void main(String[] args) {
		StaticStuff.description = "I am static, so I don't need to be instantiated in an object.";

		StaticStuff staticstuff1 = new StaticStuff();
		staticstuff1.name = "I'm not static, so I need to be instantiated in an object first.";

		staticstuff1.showName();
	}

}

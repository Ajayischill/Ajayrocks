package get_class;

import java.lang.reflect.Constructor;

public class App {

	public static void main(String[] args) {
		Olive o = new Olive();
		
		Class<?> c = o.getClass();
		System.out.println(c.getSimpleName());
		
		Constructor<?>[] constructors = c.getConstructors();
		System.out.println("Number of constructors: " + constructors.length);

	}

}

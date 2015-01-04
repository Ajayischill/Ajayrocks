/*
 * 
 * This shows an example of a constant. If you want to protect a variable from being overwritten or changed,
 * by the user, you use "public static final." This means that although others can access it, static means it cannot
 * be changed, and final means its final value.
 * 
 * If you want to make it so that only the class itself can access the variable, you use "private." 
 * With "private," it is only visible within the class. Another class can't see or use it. Even if you create a 
 * subclass, the subclass wont' be able to access private instance variables.
 * 
 * Basically, the access modifier determines the scope of the variable. If public, the scope is global. If private, the scope
 * is limited to within the brackets of the class it was declared in.
 * 
 * If you set a class as "protected," however, then child classes can access it. You can always access it within the class
 * as well of course. You can also access it within the same package.
 * 
 * If you don't use any access modifier, then it defaults to access only within the same package. Even if you create a subclass
 * if that subclass exists in a different package, you can't access the instance variable.
 * 
 * Summary:
 * public: access anywhere
 * protected: subclass and same package can access
 * private: only within the class
 * none: same package
 * 
 * These access modifiers only apply to the instance variables within a class. You don't declare classes themselves as 
 * private or protected. When you create a class, you can actually create as many classes as you want. But you can only have one
 * public class within the file, and the name of the file must match that public class contained within the file.
 * 
 */

package variables1;

public class Bed {
	public static final int ID = 8;
	private String covers;
	protected String bedspread = "full thread count";
	protected String springs;
}

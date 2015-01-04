
public class MyToString {
	
	String name;
	int age;
	
	
	
	
	public String stretchString(String name, int age){
		StringBuilder sb = new StringBuilder();
		sb.append(name).append(": ").append(age);
		return sb.toString();
		
	}

}

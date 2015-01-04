package hashmaps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(5, "five");
		map.put(6, "six");
		map.put(2, "two");
		map.put(1, "one");
		map.put(9, "nine");
		
		String gimmesomething = map.get(4);
		System.out.println(gimmesomething);
		
		// Here's how you iterate through the map.
		
		for (Map.Entry<Integer,String> entry:map.entrySet()) {
		int key = entry.getKey();
		String value = entry.getValue();
		System.out.println(key + ":"+ value);
		}

	}
	
	

}

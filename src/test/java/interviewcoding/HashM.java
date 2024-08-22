package interviewcoding;

import java.util.HashMap;
import java.util.Hashtable;

public class HashM {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("key1", 10);
		map.put("null", 20);

		System.out.println(map);
		System.out.println(map.get("key1"));
		map.remove("null");
		System.out.println(map);

	}

}

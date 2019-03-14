package ua.voytovych.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Start {

	public static void main(String[] args) {

		HashMap<String, Car> hashMap = new HashMap<String, Car>();

		hashMap.put("test", new Car("Toyota"));
		hashMap.put("key", new Car("BMW"));
		hashMap.put("opel", new Car("Opel"));
		hashMap.put("car", new Car("Lexus"));

		iterateMap(hashMap);

		TreeMap<String, Car> treeMap = new TreeMap<String, Car>();

		treeMap.put("test", new Car("Toyota"));
		treeMap.put("key", new Car("BMW"));
		treeMap.put("opel", new Car("Opel"));
		treeMap.put("car", new Car("Lexus"));
		treeMap.put("test", new Car("Audi"));

		iterateMap(treeMap);

		LinkedHashMap<String, Car> linkedHashMap = new LinkedHashMap<String, Car>();

		linkedHashMap.put("test", new Car("Toyota"));
		linkedHashMap.put("key", new Car("BMW"));
		linkedHashMap.put("opel", new Car("Opel"));
		linkedHashMap.put("car", new Car("Lexus"));

		iterateMap(linkedHashMap);
		System.out.println();
		System.out.println("higherKey = " + treeMap.higherKey("key"));
		System.out.println("higherEntry = " + treeMap.higherEntry("key"));

	}

	private static void iterateMap(Map map) {
		System.out.println();
		Iterator<Map.Entry<String, Car>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Car> carEntry = iterator.next();
			System.out.println(carEntry.getKey() + " - " + carEntry.getValue());
			// iterator.remove();
		}
	}

}

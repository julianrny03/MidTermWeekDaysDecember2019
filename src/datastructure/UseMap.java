package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		HashMap<Integer, String> map = new HashMap<>();

		map.put(33,"Julian");
		map.put(22,"student");
		map.put(27,"Java Selenium");

		String val = map.get(33);
		System.out.println(" the value at key 2is : " + val);
		String val2 = map.get(22);
		System.out.println("the value at key 1 is : " + val2);
		String val3 = map.get(27);
		System.out.println("the value at key 3 is : " + val3);

		Map<String, List<String>> list = new HashMap<>();
		List<String> City = new ArrayList<>();
		City.add("miami");
		City.add("florida");
		City.add("weston");
		list.put("cities", City);
		System.out.println(list);

		List<String> Country = new ArrayList<>();
		Country.add("USA");
		Country.add("Colombia");
		Country.add("England");
		list.put("Countries", Country);
		System.out.println(Country);

		for (Object str : list.keySet()){
			System.out.println("KEYSET:" + str);
			for(String str1 : list.get(str)){
				System.out.println("value : " + str1);
			}
		}
		Iterator itr = list.entrySet().iterator();
		System.out.println("while loops");
		Iterator iterator = list.keySet().iterator();
		while (iterator.hasNext()){
			Object kvalues = iterator.next();
			for(String str1 : list.get(kvalues)){
				System.out.println("Value: " + str1);
			}

		}


	}

}

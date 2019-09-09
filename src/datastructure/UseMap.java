package datastructure;
import java.util.*;


public class
UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> cityOfUSA = new ArrayList<String>();
		cityOfUSA.add("New York");
		cityOfUSA.add("New Jersey");
		cityOfUSA.add("Florida");

		List<String> cityOfAustralia = new ArrayList<String>();
		cityOfAustralia.add("Melborne");
		cityOfAustralia.add("Sydney");
		cityOfAustralia.add("Adelaide");

		List<String> cityOfMexico = new ArrayList<String>();
		cityOfMexico.add("Cancun");
		cityOfMexico.add("Puebla");
		cityOfMexico.add("Mexico City");


		Map<String, String> usastates = new HashMap<String, String>();
		usastates.put("NY", "New York");
		usastates.put("NJ", "New Jersey");
		usastates.put("FL", "Florida");

		System.out.println("USA states:" + usastates.get("NY"));

		for (Map.Entry entry : usastates.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		Map<String, List<String>> list = new LinkedHashMap<>();
		list.put("USA", cityOfUSA);
		list.put("Australia", cityOfAustralia);
		list.put("Mexico", cityOfMexico);
		for (Map.Entry entry : list.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("************************************");


		System.out.println("Retrieving data of US states using loops");
		for (Object str : list.keySet()) {
			System.out.println("KeySet:" + str);
			for (String str1 : list.get(str)) {
				System.out.println("Value: " + str1);
			}

			System.out.println("*************************************");

			// Iterating the data
			System.out.println("using while loop with Iterator to retrieve data");
			Iterator itr = list.entrySet().iterator();

			Iterator iterator = list.keySet().iterator();
			while (iterator.hasNext()) {
				Object values = iterator.next();
				for (String str1 : list.get(values)) {
					System.out.println("Value: " + str1);
				}

			}
		}
	}
}
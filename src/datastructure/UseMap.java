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


		Map<String, List<String>> listofCities = new HashMap<String, List<String>>();
		listofCities.put("Cities of USA", cityOfUSA);
		listofCities.put("Cities of Australia", cityOfAustralia);
		listofCities.put("Cities of Mexico", cityOfMexico);


		System.out.println("Iterating using while loop :\n");

		Iterator it = listofCities.entrySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("________________________________________________________");

		System.out.println("Iterating using for each loop :\n");


		for (Map.Entry<String, List<String>> cities : listofCities.entrySet()) {
			System.out.println(cities.getKey() + "--->" + cities.getValue());
		}
	}
}



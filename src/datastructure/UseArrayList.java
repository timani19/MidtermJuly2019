package datastructure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList<Integer> arraylist = new ArrayList<>();

		arraylist.add(101);
		arraylist.add(201);
		arraylist.add(301);
		arraylist.add(401);
		arraylist.add(501);
		arraylist.add(601);

		//Elements in arraylist
		System.out.println("Retrieving elements from ArrayList: " + arraylist);

		//peek the first element from the arraylist
		System.out.println("Peek Element: " + arraylist.get(0));

		//removing elements
		System.out.println("Removing index 3 element: " + arraylist.remove(3));

		//Retrieving elements
		System.out.println("Retrieving elements after remove from ArrayList: " + arraylist);

		// retrieving data from the arraylist by for each loop
		System.out.print("Using for each loop the elements of arraylist are: ");
		for (Integer in : arraylist) {
			System.out.print(" "+in);
		}
		System.out.println();

		// using iterator
		System.out.print("Re-retrieving elements from ArrayList: ");
		Iterator it = arraylist.iterator();
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			System.out.print(" "+i);
		}

		System.out.println();

	}

}

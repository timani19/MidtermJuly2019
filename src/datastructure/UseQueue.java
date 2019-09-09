package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> studentNames = new LinkedList<>();
		studentNames.add("Tashfia Imani");
		studentNames.add("Elisha Karki");
		studentNames.add("Mahim Naveed");
		studentNames.add("Shreemila Rajwant");
		studentNames.add("Tiffany Mo");
		studentNames.add("Courtney Pulley");


		System.out.println(studentNames.peek());// peek from queue- Tashfia
		System.out.println(studentNames.remove("Elisha Karki"));//remove "Elisha Karki" from queue
		System.out.println("List after removing" + " " + "Elisha Karki" + studentNames);
		System.out.println(studentNames.peek());
		System.out.println(studentNames.poll());// poll from queue
		System.out.println(studentNames.peek());

		System.out.println("*******_________________************");

		System.out.println("Using for loop to retrieve remaining list: ");
		for (String st : studentNames) {
			System.out.println(st);
		}

		System.out.println("********______________**********");
		System.out.println("Using while loop to retrieve remaining ");
		Iterator itr = studentNames.iterator();
		while (itr.hasNext()) {
			String i = (String) itr.next();
			System.out.println(i);
		}
	}

}



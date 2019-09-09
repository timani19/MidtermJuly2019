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


		System.out.println(studentNames.peek());// view head of queue- Tashfia
		System.out.println("_______________");
		System.out.println(studentNames.remove());// remove the head of queue, in this case "Tashfia"
		System.out.println("List after removing" + " " + "Head of Queue: " +"Tashfia Imani" + studentNames);
		System.out.println("Head of the Queue: " + studentNames.peek()); // view head of the queue- "Elisha Karki"
		System.out.println(studentNames.poll());// poll from queue [print Head and deletes the head]
		System.out.println(studentNames.peek()); // peek the head from the queue- "Mahim Naveed"
		System.out.println(studentNames.add("Jianbin Situ")); // adding new elements

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



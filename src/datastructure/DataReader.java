package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;


public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */
		FileReader fr1 = null;
		BufferedReader br1 = null;

		String textFile = "C:\\Users\\Tanim Imani\\IdeaProjects\\MidtermJuly2019\\src\\data\\self-driving-car";


		// String textFile = "C:\\Users\\adibi\\Desktop\\nayna\\MidtermNovember2018\\src\\data\\self-driving-car";

		try {
			fr1 = new FileReader(textFile);
			br1 = new BufferedReader(fr1);
			String data = " ";
			while ((data = br1.readLine()) != null) {
				System.out.println(data);
			}
		} catch (Exception ex) {
			System.out.println("File was not found");
		} finally { // to close the filereader and bufferreadaer instance, always use below code
			try {
				fr1.close();
				br1.close();
			} catch (Exception ex2) {
			}
		}
	}
}







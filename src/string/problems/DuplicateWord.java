package string.problems;
import java.util.*;

/*
 * Write a java program to find the duplicate words and their number of occurrences in the string.
 * Also Find the average length of the words.
 */

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {
    public static void main(String[] args) {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        //Implemented code
        Set<String> duplicates = findduplicateWords(st);

    }
    public static Set<String> findduplicateWords(String s) {

        if (s == null || s.isEmpty()) {
            return Collections.emptySet();
        }
        Set<String> dpwords = new HashSet<>();
        String[] array = s.split(" ");
        double avgLength = (double) s.length() / array.length;

        Set<String> set = new HashSet<>();
        ArrayList<String> arraylist = new ArrayList<String>();
        for (String word : array) {
            arraylist.add(word);
            if (!set.add(word)) {
                dpwords.add(word);
            }
        }
        for (String word : dpwords) {
            if (Collections.frequency(arraylist, word) > 1) {
                System.out.println(word + " : a duplicate word" + " " +"occurs " + Collections.frequency(arraylist, word) + " times.");
            }
        }
        System.out.println("Average length : " + (avgLength));
        return dpwords;
    }

}

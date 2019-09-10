package string.problems;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        String s = "ABC";

        System.out.println("All the permutations of the string are: " + findPermutation(s));

    }

    public static Set<String> findPermutation(String str) {
        Set<String> permutationResult = new HashSet<String>();
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            permutationResult.add("");
            return permutationResult;
        }

        char firstChar = str.charAt(0);
        String r = str.substring(1);
        Set<String> words = findPermutation(r);
        for (String newString : words) {
            for (int i = 0; i <= newString.length(); i++) {
                permutationResult.add(permutationCharAdd(newString, firstChar, i));
            }
        }
        return permutationResult;
    }

    public static String permutationCharAdd(String str, char c, int j) {
        String first = str.substring(0, j);
        String last = str.substring(j);
        return first + c + last;
    }

}

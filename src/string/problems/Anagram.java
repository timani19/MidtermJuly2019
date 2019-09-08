package string.problems;
import java.util.Arrays;


/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

            String str1="Forty Five";
            String str2= "Over Fifty";
            System.out.println(str1 + " and " + str2 + " are anagrams");

        }
        public static boolean isAnagram(String str1, String str2) {

            // checking the length of two strings. if length are equal- they can be anagram

            if (str1.length() != str2.length()){
                return false;
            }

            // Converting two strings to charArray and sort
            // .tolowercase will convert any uppercase character to lowercase

            char[] ArrayS1 = str1.toLowerCase().toCharArray();
            char[] ArrayS2 = str2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);

            // compare charArray's to see if they are equal
            return Arrays.equals(ArrayS1, ArrayS2);
        }

    }






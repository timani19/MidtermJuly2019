package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
            String str= "BOB";
            String rev = "";

            int length = str.length();

            for (int i = length - 1; i >= 0; i--)
                rev = rev + str.charAt(i);

            if (str.equals(rev)) {
                System.out.println(str + " is a palindrome");
            } else {
                System.out.println(str + " is not a palindrome");

            }
        }

    }





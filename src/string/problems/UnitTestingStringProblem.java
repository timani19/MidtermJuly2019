package string.problems;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.HashSet;
import java.util.Set;

public class UnitTestingStringProblem {
    public static void main(String[] args) {

        try {// Anagram test
            Assert.assertEquals(Anagram.isAnagram("Mary", "Army"), true);
            System.out.println("Anagram test Passed");
        } catch (AssertionError as) {
            System.out.println(" Anagram test Failed");
        }

        // //LargestWord test

        try {
            String a = "Java is a programming language";
            Assert.assertEquals(DetermineLargestWord.findTheLargestWord(a), "programming");
            System.out.println("Largest word unit test has Passed");
        } catch (AssertionError as) {
            System.out.println("Largest word unit test Failed");
        }

    }
}








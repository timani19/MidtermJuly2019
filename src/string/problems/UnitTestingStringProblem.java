package string.problems;

import junit.framework.AssertionFailedError;
import math.problems.Factorial;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class UnitTestingStringProblem {
    public static void main(String[] args) {

        try {// Anagram test
            Assert.assertEquals(Anagram.isAnagram("Mary", "Army"), true);
            System.out.println("Anagram test Passed");
        } catch (AssertionError as) {
            System.out.println(" Anagram test Failed");
        }

        // //LargestWord test
        Map<Integer, String> wordNLength = DetermineLargestWord.findTheLargestWord("Java is a programming language");
        String findTheLargestWord = wordNLength.keySet().iterator().next() +
                " " + wordNLength.entrySet().stream().findFirst().get().getValue();
        Assert.assertEquals(findTheLargestWord, "11 programming");
        System.out.println("LargestWord unit testing is passed");

        //Permutation Testing

        Set<String> actualResult = Permutation.findPermutation("ACD");
        Set<String> expectedResult = Permutation.findPermutation("ACD");
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println(actualResult);

        //Duplicate word Unit testing

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        Assert.assertEquals("is: 3, java: 3, : ",DuplicateWord.findduplicateWords(st));


    }

}













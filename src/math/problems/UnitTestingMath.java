package math.problems;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class UnitTestingMath {
    //Apply Unit testing into each classes and methods in this package.

    @Test

    public void testFactorial() {
        int n = 6;
        int expectedresult = 720;
        int actualresult = Factorial.recursivefactorial(6);
        Assert.assertEquals(expectedresult, actualresult);
    }
    @Test

    public void testmissingNumber() {
        int [] array = new int[]{1, 2, 3, 4, 5};
        int n = 6;
        Assert.assertEquals(6,FindMissingNumber.findMissingNo(array,n),6);

    }





}

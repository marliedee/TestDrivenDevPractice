package org.pursuit.arraytesting;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayMethodTestingTest {

    private ArrayMethodTesting arrayMethodTesting;

    @Before
    public void setUp() throws Exception {
        arrayMethodTesting = ArrayMethodTesting.getInstance();
    }

    @Test
    public void isLessThan10_True() {

        String[] arrayTest = new String[]{"one", "two", "three"};
        boolean ans = true;
        boolean value = arrayMethodTesting.isLessThan10(arrayTest);
        Assert.assertEquals(ans, value);

    }

    @Test
    public void isLessThan10_False() {

        String[] arrayTest = new String[]{"one", "two", "three", "4", "5", "6", "7", "8", "9", "10", "11"};
        boolean ans = false;
        boolean value = arrayMethodTesting.isLessThan10(arrayTest);
        Assert.assertEquals(ans, value);

    }

    @Test
    public void isLessThan10_non_String() {

        String[] arrayTest = new String[]{"1"};
        int ans = 1;
        boolean value = arrayMethodTesting.isLessThan10(arrayTest);
        Assert.assertNotEquals(ans, value);

    }

    @Test
    public void smallEvensOnly_isCorrect() {
        String[] arrayTest = new String[]{"one", "two", "three", "four"};
        String[] ans = {"three"};
        String[] value = arrayMethodTesting.smallEvensOnly(arrayTest);
        Assert.assertArrayEquals(ans, value);
    }

    @Test
    public void sortAlphabetically_isCorrect() {
        char[] arrayTest = new char[]{'d', 'c', 'a', 'b'};
        char[] ans = {'a', 'b', 'c', 'd'};
        char[] value = arrayMethodTesting.sortAlphabetically(arrayTest);
        Assert.assertArrayEquals(ans, value);
    }

    private static final double DELTA = 1e-15;

    @Test
    public void returnSum_isCorrect() {
        double ans = Math.abs(6.0);
        double[] arrayTest = new double[]{1.0, 2.0, 3.0};
        double value = arrayMethodTesting.returnSum(arrayTest);
        Assert.assertEquals(ans, value, DELTA);

    }

    @Test
    public void removeCaseSensitiveDuplicates_isCorrect() {
        String[] arrayTest = new String[]{"one", "two", "three", "four", "four"};
        Set ans = new HashSet(Arrays.asList("one", "two", "three", "four"));
        Set value = arrayMethodTesting.removeCaseSensitiveDuplicates(arrayTest);
        Assert.assertEquals(ans, value);

    }

    @Test
    public void mapDuplicates_isCorrect() {
        String[] arrayTest = new String[]{"one", "two", "three", "four", "four"};
        Map ans = new HashMap<>();
        ans.put("one",1);
        ans.put("two",1);
        ans.put("three",1);
        ans.put("four",2);
        Map value = arrayMethodTesting.mapDuplicates(arrayTest);
        Assert.assertEquals(ans, value);

    }

    @After
    public void tearDown() throws Exception {
        arrayMethodTesting = null;
    }
}

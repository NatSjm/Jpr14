package org.example;

import org.junit.Assert;
import org.junit.Test;


public class GoodPairsTest {
    @Test
    public void someMatchesTest() {
        int[] nums = {1, 2, 3, 1, 1, 3};
        Assert.assertEquals(4, GoodPairs.numIdenticalPairs(nums));
    }

    @Test
    public void allEqualsTest() {
        int[] nums = {1, 1, 1, 1};
        Assert.assertEquals(6, GoodPairs.numIdenticalPairs(nums));
    }

    @Test
    public void noMatchesTest() {
        int[] nums = {1, 2, 3};
        Assert.assertEquals(0, GoodPairs.numIdenticalPairs(nums));
    }
}
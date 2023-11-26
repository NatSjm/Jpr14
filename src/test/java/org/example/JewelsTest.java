package org.example;

import org.junit.Assert;
import org.junit.Test;

public class JewelsTest  {
    @Test
    public void matchesTest() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int result = Jewels.numJewelsInStones(jewels, stones);
        Assert.assertEquals(3, result);
    }

    @Test
    public void noMatchesTest() {
        String jewels = "z";
        String stones = "ZZ";
        int result = Jewels.numJewelsInStones(jewels, stones);
        Assert.assertEquals(0, result);
    }

    @Test
    public void emptyStringTest() {
        String jewels = "";
        String stones = "";
        int result = Jewels.numJewelsInStones(jewels, stones);
        Assert.assertEquals(0, result);
    }

    @Test
    public void nullJewelsTest() {
        String jewels = null;
        String stones = "abc";
        int result = Jewels.numJewelsInStones(jewels, stones);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testNullStones() {
        String jewels = "abc";
        String stones = null;
        int result = Jewels.numJewelsInStones(jewels, stones);
        Assert.assertEquals(0, result);
    }
}
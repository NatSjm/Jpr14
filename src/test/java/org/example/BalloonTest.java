package org.example;

import org.junit.Assert;
import org.junit.Test;


public class BalloonTest {

    @Test
    public void oneMatcheTest() {
        String testText = "nlaebolko";
        Assert.assertEquals(1, Balloon.maxNumberOfBalloons(testText));
    }

    @Test
    public void someMatchesTest() {
        String testText = "loonbalxballpoon";
        Assert.assertEquals(2, Balloon.maxNumberOfBalloons(testText));
    }

    @Test
    public void noMatchesTest() {
        String testText = "leetcode";
        Assert.assertEquals(0, Balloon.maxNumberOfBalloons(testText));
    }
}
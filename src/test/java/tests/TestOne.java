package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by bionic on 10/22/14.
 */
public class TestOne {
    @Test
    public void firstTest()
    {
        System.out.print("New print");
        Assert.assertTrue(true);
    }
}

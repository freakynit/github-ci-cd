package com.freakynit.tutorials.githubcicd;

import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    @Test
    public void testDemo(){
        int result = 10;
        int computed = 1 * 10;
        Assert.assertEquals("Computed value should match expected one", result, computed);
    }
}

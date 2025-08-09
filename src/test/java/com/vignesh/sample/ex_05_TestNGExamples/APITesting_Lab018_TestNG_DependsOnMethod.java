package com.vignesh.sample.ex_05_TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_Lab018_TestNG_DependsOnMethod {
    @Test
    public void serverStartedOk()
    {
        System.out.println("Server Started");
        Assert.assertTrue(true);
    }
    @Test (dependsOnMethods = "serverStartedOk")
    public void testcase1()
    {
        System.out.println("Test case 1 executed");
    }
    @Test (dependsOnMethods = "serverStartedOk")
    public void testcase2()
    {
        System.out.println("Test case 2 executed");
    }
}

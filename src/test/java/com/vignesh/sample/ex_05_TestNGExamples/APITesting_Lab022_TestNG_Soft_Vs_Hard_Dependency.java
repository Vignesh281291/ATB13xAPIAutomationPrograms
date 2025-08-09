package com.vignesh.sample.ex_05_TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_Lab022_TestNG_Soft_Vs_Hard_Dependency {
    @Test
    public void Login()
    {
        System.out.println("Login Successful");
        Assert.assertTrue(true);
    }
    @Test (dependsOnMethods = "Login") //placeOrder will run only if the login is passed - Hard dependency
    public void placeOrder()
    {
        System.out.println("Placed Order");
    }
    @Test (dependsOnMethods = "Login", alwaysRun = true) //even if login fails, closeBrowser will be executed - Soft Dependency
    public void closeBrowser()
    {
        System.out.println("Browser closed successfully");
    }
}

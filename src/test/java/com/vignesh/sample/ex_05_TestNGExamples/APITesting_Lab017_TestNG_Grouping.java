package com.vignesh.sample.ex_05_TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_Lab017_TestNG_Grouping {

    @Test (groups = {"Regression"})
    public void Regression()
    {
        System.out.println("Regression Testing");
    }
    @Test (groups = {"Sanity","Regression"})
    public void Sanity()
    {
        System.out.println("Sanity Testing");
    }
    @Test (groups = {"Smoke","Regression"})
    public void Smoke()
    {
        System.out.println("Smoke Testing");
    }
}

package com.vignesh.sample.ex_05_TestNGExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting_Lab019_TestNG_Parameters {

    @Parameters ("Browser")
    @Test
    public void demoTest(String value)
    {
        System.out.println("Demo Test is Started");
        if(value.equalsIgnoreCase("Chrome"))
            System.out.println("Chrome is running");
        if(value.equalsIgnoreCase("Firefox"))
            System.out.println("Firefox is running");
        if(value.equalsIgnoreCase("Safari"))
            System.out.println("Test case can't be run on Safari");
    }
}

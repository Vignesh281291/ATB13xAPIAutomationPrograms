package com.vignesh.sample.ex_05_TestNGExamples;

import org.testng.annotations.Test;

public class APITesting_Lab021_TestNG_AlwaysRun {
    @Test
    public void TC1()
    {
        System.out.println("Execute TC1");
    }
    @Test (alwaysRun = true)
    public void TC2()
    {
        System.out.println("Execute TC2");
    }
    @Test
    public void TC3()
    {
        System.out.println("Execute TC3");
    }
}

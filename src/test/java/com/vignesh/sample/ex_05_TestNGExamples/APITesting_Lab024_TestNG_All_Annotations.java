package com.vignesh.sample.ex_05_TestNGExamples;

import org.testng.annotations.*;

public class APITesting_Lab024_TestNG_All_Annotations {

    @BeforeSuite
    public void TC1()
    {
        System.out.println("Before Suite");
    }
    @BeforeTest
    public void TC2()
    {
        System.out.println("Before Test");
    }
    @BeforeClass
    public void TC3()
    {
        System.out.println("Before Class");
    }
    @BeforeMethod
    public void TC4()
    {
        System.out.println("Before Method");
    }
    @Test
    public void TC5()
    {
        System.out.println("Test");
    }

    @AfterMethod
    public void TC6()
    {
        System.out.println("After Method");
    }
    @AfterClass
    public void TC7()
    {
        System.out.println("After Class");
    }
    @AfterTest
    public void TC8()
    {
        System.out.println("After Test");
    }
    @AfterSuite
    public void TC9()
    {
        System.out.println("After Suite");
    }
}

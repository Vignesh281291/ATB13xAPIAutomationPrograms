package com.vignesh.sample.ex_05_TestNGExamples;

import org.testng.annotations.Test;

public class APITesting_Lab014_TestNG_Ex1 {

    public void TestCase1()
    {
        System.out.println("This is a normal function");
    }

    @Test
    public void TestCase2()
    {
        System.out.println("This is TestNG Testcase");
    }
}

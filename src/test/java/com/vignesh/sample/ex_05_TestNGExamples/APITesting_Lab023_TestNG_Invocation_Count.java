package com.vignesh.sample.ex_05_TestNGExamples;

import org.testng.annotations.Test;

public class APITesting_Lab023_TestNG_Invocation_Count {
    @Test(invocationCount = 2)
    public void testFunc1()
    {
        System.out.println("Want to run this test case 2 times");
    }
    @Test (invocationCount = 3)
    public void testFunc2()
    {
        System.out.println("Want to run this test case 3 times");
    }
}

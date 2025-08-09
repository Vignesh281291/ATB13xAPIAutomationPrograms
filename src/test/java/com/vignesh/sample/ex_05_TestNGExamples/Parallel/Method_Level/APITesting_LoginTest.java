package com.vignesh.sample.ex_05_TestNGExamples.Parallel.Method_Level;

import org.testng.annotations.Test;

public class APITesting_LoginTest {

    @Test
    public void validLogin()
    {
        System.out.println("Valid Login Thread ID = " + Thread.currentThread().getId());
    }

    @Test
    public void invalidLogin()
    {
        System.out.println("Invalid Login Thread ID = " + Thread.currentThread().getId());
    }
}

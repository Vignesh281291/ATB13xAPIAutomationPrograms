package com.vignesh.sample.ex_05_TestNGExamples.Parallel.Class_Level;

import org.testng.annotations.Test;

public class APITesting_ChromeTest {

    @Test
    public void TC1()
    {
        System.out.println("Chrome-1");
        System.out.println(Thread.currentThread().getId());
    }
}

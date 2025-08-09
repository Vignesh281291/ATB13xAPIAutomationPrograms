package com.vignesh.sample.ex_05_TestNGExamples.Parallel.Class_Level;

import org.testng.annotations.Test;

public class APITesting_FirefoxTest {
    @Test
    public void TC2()
    {
        System.out.println("Firefox-1");
        System.out.println(Thread.currentThread().getId());
    }
}

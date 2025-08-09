package com.vignesh.sample.ex_05_TestNGExamples.Parallel.Test_Level;

import org.testng.annotations.Test;

public class APITesting_APISmokeTest {

    @Test
    public void  APISmoke()
    {
        System.out.println("Smoke Testing - API");
        System.out.println(Thread.currentThread().getId());
    }
}

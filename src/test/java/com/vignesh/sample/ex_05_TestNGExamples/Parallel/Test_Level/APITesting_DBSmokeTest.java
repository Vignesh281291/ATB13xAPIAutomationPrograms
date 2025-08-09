package com.vignesh.sample.ex_05_TestNGExamples.Parallel.Test_Level;

import org.testng.annotations.Test;

public class APITesting_DBSmokeTest {
    @Test
    public void DBSmoke()
    {
        System.out.println("Smoke Testing - DB");
        System.out.println(Thread.currentThread().getId());
    }
}

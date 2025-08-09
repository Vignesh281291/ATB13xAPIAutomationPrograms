package com.vignesh.sample.ex_05_TestNGExamples.Parallel.Test_Level;

import org.testng.annotations.Test;

public class APITesting_UISmokeTest {
    @Test
    public void UISmoke()
    {
        System.out.println("Smoke Testing - UI");
        System.out.println(Thread.currentThread().getId());
    }
}

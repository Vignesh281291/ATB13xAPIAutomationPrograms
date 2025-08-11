package com.vignesh.sample.ex_06_Test_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APITesting_Lab026_TestNG_Assertions {

//    @Test
//    public void test_Hard_Assertion()
//    {
//        System.out.println("Start of the Program");
//        Assert.assertEquals("Vignesh","vignesh");
//        System.out.println("End of the Program");
//    }
    @Test
    public void test_Soft_Assertion()
    {
        SoftAssert sa = new SoftAssert();
        System.out.println("Start of the Program");
        sa.assertEquals("Vihaana", "vihaana");
        System.out.println("End of the Program");

    }
}

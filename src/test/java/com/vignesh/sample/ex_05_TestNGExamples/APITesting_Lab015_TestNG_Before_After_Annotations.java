package com.vignesh.sample.ex_05_TestNGExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting_Lab015_TestNG_Before_After_Annotations {
    //Ex: PUT Request
    //Get Token
    //Get Booking Id
    //PUT Request
    //Close All

    @BeforeTest
    public void getToken()
    {
        System.out.println("Get Token");
    }
    @BeforeTest
    public void getBookingId()   //different functions on BeforeTest Annotations
    //So natural ordering will be considered for order of execution
    {
        System.out.println("Get Booking Id");
    }
    @Test
    public void putRequest()
    {
        System.out.println("Request PUT");
    }
    @AfterTest
    public void closeAll()
    {
        System.out.println("Close All");
    }
}

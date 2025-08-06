package com.vignesh.sample.ex_04_ResrAssured_HTTPMethods.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab006_GET_BDDStyle {

    @Test
    public void test_GET_Request()
    {
        String Pincode = "560048";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + Pincode)
                .when().log().all().get()
                .then().log().all().statusCode(200);
    }
}

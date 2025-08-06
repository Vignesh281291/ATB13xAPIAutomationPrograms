package com.vignesh.sample.ex_04_ResrAssured_HTTPMethods.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab007_GET_NonBDDStyle {
    RequestSpecification r; //Pre request - part 1 - given()
    Response response; //HTTP Methods - part 2 - when()
    ValidatableResponse vr; //Post request - Validation - part 3 - then()
    String pincode;
    @Test
    public void test_GET_NonBDD_Positive()
    {
        pincode = "560048";
        //Part 1
        r= RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);

        //Part 2
                response = r.when().log().all().get();

        //Part 3
                vr = response.then().log().all();
                vr.statusCode(200);
    }

    @Test
    public void test_GET_NonBDD_Negative()
    {
     pincode = "@";
        //Part 1
        r= RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);

        //Part 2
        response = r.when().log().all().get();
        System.out.println(response.asString());

        //Part 3
        vr = response.then().log().all();
        vr.statusCode(404);
    }
}

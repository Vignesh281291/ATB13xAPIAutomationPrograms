package com.vignesh.sample.ex_04_ResrAssured_HTTPMethods.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab012_DELETE_NonBDDStyle {

    //PATCH
    //Token , Booking Id
    //public void gettoken(){}
    //public void getbookingId(){}

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    @Test
    public void test_DELETE_NonBDD()
    {
        String bookingId = "324";
        String token = "41f12cfc313dfbb";

        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+bookingId);
        r.contentType(ContentType.JSON);
        //r.header("cookie", "token=" +token);
        r.cookie("token",token);
        r.log().all();


        response=r.when().log().all().delete();

        vr=response.then().log().all().statusCode(201);
    }
}

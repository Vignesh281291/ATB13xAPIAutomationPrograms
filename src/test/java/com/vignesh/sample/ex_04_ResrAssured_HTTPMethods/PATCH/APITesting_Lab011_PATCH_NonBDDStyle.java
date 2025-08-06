package com.vignesh.sample.ex_04_ResrAssured_HTTPMethods.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab011_PATCH_NonBDDStyle {

    //PATCH
    //Token , Booking Id
    //public void gettoken(){}
    //public void getbookingId(){}

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    @Test
    public void test_PATCH_NonBDD()
    {
        String bookingId = "1550";
        String token = "3b4ae729c4ad160";
        String payload = "{\n" +
                "    \"firstname\" : \"Vicky\",\n" +
                "    \"lastname\" : \"Vignesh\"\n" +
                "}";

        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+bookingId);
        r.contentType(ContentType.JSON);
        //r.header("cookie", "token=" +token);
        r.cookie("token",token);
        r.body(payload);
        r.log().all();


        response=r.when().log().all().patch();

        vr=response.then().log().all().statusCode(200);
    }
}

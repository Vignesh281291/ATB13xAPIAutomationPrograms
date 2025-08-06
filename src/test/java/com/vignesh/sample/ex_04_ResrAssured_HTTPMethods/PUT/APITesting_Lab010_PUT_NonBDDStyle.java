package com.vignesh.sample.ex_04_ResrAssured_HTTPMethods.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab010_PUT_NonBDDStyle {

    //PUT
    //Token , Booking Id
    //public void gettoken(){}
    //public void getbookingId(){}

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    @Test
    public void test_PUT_NonBDD()
    {
        String bookingId = "3967";
        String token = "b8c974be8b3e4e5";
        String payload = "{\n" +
                "    \"firstname\" : \"Vicky\",\n" +
                "    \"lastname\" : \"Vihaana\",\n" +
                "    \"totalprice\" : 333,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2025-08-01\",\n" +
                "        \"checkout\" : \"2025-08-02\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+bookingId);
        r.contentType(ContentType.JSON);
        //r.header("cookie", "token=" +token);
        r.cookie("token",token);
        r.body(payload);
        r.log().all();


        response=r.when().log().all().put();

        vr=response.then().log().all().statusCode(200);
    }
}

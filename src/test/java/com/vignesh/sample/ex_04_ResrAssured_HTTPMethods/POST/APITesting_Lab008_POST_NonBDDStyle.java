package com.vignesh.sample.ex_04_ResrAssured_HTTPMethods.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab008_POST_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test

    public void test_POST_NonBDD_CreateToken()
    {
        //URL - https://restful-booker.herokuapp.com
        //Payload - {
        //    "username" : "admin",
        //    "password" : "password123"
        //}
        //Auth? - NA
        //Cookie? - NA
        //Header - application/json
        //Validate - 200 ok
        //Verify Token is generated or not?
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        System.out.println("-------Part 1-------");
        //Pre request - Given - URL, Header, Body...
        r=RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth/");
        r.contentType(ContentType.JSON);
        r.body(payload);
        r.log().all();
//        r.header("Content-Length", "1000");
//        r.auth().basic("admin", "password123");
//        r.auth().oauth2("egjdgsjdgisdi");
//        r.header("Authorization","Bearer etuweiiweuiu");


        System.out.println("------Part 2-------");
        //Making Request
        response=r.when().log().all().post();
        //System.out.println("Response" + response.asString());


        System.out.println("------Part 3-------");
        //Making Request
        vr=response.then().log().all();
        vr.statusCode(200);
    }
}

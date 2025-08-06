package com.vignesh.sample.ex_04_ResrAssured_HTTPMethods.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITesting_Lab009_POST_BDDStyle {
String payload = "{\n" +
        "    \"username\" : \"admin\",\n" +
        "    \"password\" : \"password123\"\n" +
        "}";
@Test
    public void test_POST_BDD_CreateToken() {
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth/")
                .contentType(ContentType.JSON)
                .log().all()
                .body(payload)

                .when()
                .log().all()
                .post()


                .then().log().all()
                .statusCode(200);
    }
}

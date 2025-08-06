package com.vignesh.sample.ex_01_RA_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class APITesting_Lab002_RA {
    public static void main(String[] args) {

//        Gherkin
//                Given - Pre Req - URL, Headers etc
//                When - HTTP Methods - GET, POST, PATCH, PUT etc
//                Then - Validate Response - Status Code 200, 201 etc

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Pincode: ");
        String pincode = s.next();

        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when().log().all().get()
                .then().log().all().statusCode(200);
    }
}

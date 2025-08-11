package com.vignesh.sample.ex_06_Test_Assertions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.assertj.core.api.Assertions;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class APITesting_Lab027_RestAssured_TestNG_Assertj_Assertions {
    RequestSpecification requestSpecification; //given
    Response response; //when
    ValidatableResponse vr; //then
    String request_payload;
    Integer Bookingid;
    @Test
    public void createBooking()
    {
        //Get the payload
        request_payload = "{\n" +
                "    \"firstname\" : \"Vignesh\",\n" +
                "    \"lastname\" : \"S\",\n" +
                "    \"totalprice\" : 1000,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2025-07-30\",\n" +
                "        \"checkout\" : \"2025-08-02\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(request_payload);
        requestSpecification.log().all();

        response = requestSpecification.when().log().all().post();

        vr = response.then().log().all();
        vr.statusCode(200);

        //What to validate - Status code = 200, BookingId != Null, FirstName == Vignesh

        //Extract the response
        //System.out.println(response.asString());

        System.out.println("------RestAssured Assertions-------");
        //RestAssured Assertions

        vr.body("bookingid", Matchers.notNullValue());
        vr.body("booking.firstname",Matchers.equalTo("Vignesh"));
        vr.body("booking.depositpaid",Matchers.equalTo(true));



        //Extracting the data
        //Direct method
        Bookingid = response.then().extract().path("bookingid");
        String FirstName = response.then().extract().path("booking.firstname");
        String LastName = response.then().extract().path("booking.lastname");

        //Another method to extract data is JSON Path
        JsonPath jp = new JsonPath(response.asString());
        String Bookingid1 = jp.getString("bookingid");


        System.out.println("------TestNG Assertions-------");
        //TestNG Assertions
        Assert.assertNotNull(Bookingid);
        Assert.assertEquals(FirstName,"Vignesh");
        Assert.assertEquals(LastName, "S");

        if(!FirstName.contains("Vignesh"))
        {
            Assert.fail("Not match");
        }

        System.out.println("------Assertj Assertions-------");
        //Assertj Assertions
        assertThat(Bookingid).isNotZero().isNotNull().isPositive();
        assertThat(FirstName).isNotNull().isNotEmpty().isNotBlank().isEqualTo("Vignesh");
    }
}

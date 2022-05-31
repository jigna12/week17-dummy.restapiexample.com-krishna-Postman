package com.restapiexample.dummy.restapiexampleinfo;


import com.restapiexample.dummy.RestApiPojo;
import com.restapiexample.dummy.RestPutPojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestApiPutTest extends TestBase {

    @Test
    public void createRestApiExampleupdate() {
        RestPutPojo restPutPojo = new RestPutPojo();
        restPutPojo.setEmployee_name("Meena Patel");
        restPutPojo.setEmployee_salary("50000");
        restPutPojo.setEmployee_age("25");
        restPutPojo.setProfile_image("Beautiful");

        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 7403)
                .body(restPutPojo)
                .when()
                .put("/update/{id}");
        response.prettyPrint();
        response.then().statusCode(200);



    }
    }
package com.restapiexample.dummy.restapiexampleinfo;


import com.restapiexample.dummy.RestApiPojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestApiPostTest extends TestBase {

    @Test
    public void createEmployeeTest() {
        RestApiPojo restApiPojo = new RestApiPojo();
        restApiPojo.setName("Meena Patel");
        restApiPojo.setSalary("50000");
        restApiPojo.setAge("25");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(restApiPojo)
                .when()
                .post("/create");
        response.prettyPrint();
        response.then().statusCode(200);

    }
}


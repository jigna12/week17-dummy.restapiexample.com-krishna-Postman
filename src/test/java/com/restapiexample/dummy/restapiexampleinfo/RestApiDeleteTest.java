package com.restapiexample.dummy.restapiexampleinfo;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestApiDeleteTest extends TestBase {

    @Test
    public void deleteRestApi() {
        Response response = given()
                .pathParam("id",7403)
                .when()
                .delete("/delete/{id}");
        response.prettyPrint();
        response.then().statusCode(200);

    }

}




package ApiTests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class SpartanTests {

    String spartanBaseUrl = "http://54.167.157.13:8000";
    @Test
    public void viewSpartanTest1 (){

        Response response = RestAssured.get(spartanBaseUrl + "/api/spartans" );

        System.out.println(response.statusCode());

        System.out.println(response.body().prettyPrint());
        //System.out.println(response.body().asString());
    }


}

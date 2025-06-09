package stepDefinations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RoomBookingSteps {

    private String endpoint;
    private io.restassured.response.Response response;



@Given("I set the Post endpoint {string}")
public void i_set_the_post_endpoint(String url) {
    
	endpoint = url;
}

@When("I send a POST HTTP request")
public void i_send_a_post_http_request() {
	  String requestBody = "{\n    \"messageid\": 13,\n    \"name\": \"Samy\",\n    \"email\": \"alice@example.com\",\n    \"phone\": \"00000999000\",\n    \"subject\": \"General Query\",\n    \"description\": \"I would like to know more about your services.\"\n}";
	  
	  response = given()
	            .header("Content-Type", "application/json")
	            .body(requestBody)
	        .when()
	            .post(endpoint);
	  
	  System.out.println("Response body:"+response.asPrettyString());
	  
	    }
	  

@Then("the response status code should be {int}")
public void the_response_status_code_should_be(Integer statusCode) {
    
	 response.then().statusCode(statusCode);
}



@Then("the response body should contain {string}")
public void the_response_body_should_contain(String key) {
    response.then().body(key, notNullValue());
    
    
}
}

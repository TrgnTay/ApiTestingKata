package stepDefinations;
import io.cucumber.java.en.*;
import static io.restassured.RestAssured.*;

public class validateMessageSubmitted {
	
	private String endpoint;
    private io.restassured.response.Response response;

	    @Given("I set the GET endpoint {string}")
	    public void i_set_the_get_endpoint(String url) {
	        endpoint = url;
	    }

	    @When("I send a GET HTTP request")
	    public void i_send_a_get_http_request() {
	        response = given()
	            .header("Content-Type", "application/json")
	        .when()
	            .get(endpoint);
	    }

	    @Then("the GET response status code should be {int}")
	    public void the_GET_response_status_code_should_be(Integer statusCode) {
	        // Write code here that turns the phrase above into concrete actions
	    	 response.then().statusCode(statusCode);
	    }


	

}

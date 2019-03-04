package steps_api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static io.restassured.RestAssured.when;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import utils.PropertiesUtils;

public class Api_Common_Steps {
	PropertiesUtils propUtil = new PropertiesUtils();
	static String uri;
	static Response apiResponse;

	@Given("^I have the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_have_the_and(String baseURL, String endPoint) throws Throwable {
		String url = propUtil.getAPIPropValue(baseURL);
		String endPt = propUtil.getAPIPropValue(endPoint);
		assertNotNull(url);
		assertNotNull(endPt);
		uri = url + endPt;
		System.out.println("the uri is " + uri);
	}

	@When("^i make a call to the REST API GET request$")
	public void i_make_a_call_to_the_REST_API_GET_request() throws Throwable {
		apiResponse = when().get(uri);
	}

	@Then("^the HTTP status code from the response should be \"([^\"]*)\"$")
	public void the_HTTP_status_code_from_the_response_should_be(String status) throws Throwable {
	
		assertEquals("the status code are not equal", Integer.parseInt(status), apiResponse.statusCode());		
	}
	
	
}

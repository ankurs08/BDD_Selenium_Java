package steps_api;

import static io.restassured.RestAssured.when;
import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import steps_api.Api_Common_Steps;

public class ErgastDev_Steps {
	
	
	@Then("^the circuit numbers is equal to \"([^\"]*)\"$")
	public void the_circuit_numbers_is_equal_to(String noOfCircuits) throws Throwable {
			System.out.println(Api_Common_Steps.apiResponse.getBody().asString());
			System.out.println("*************************************************************");
			System.out.println(Api_Common_Steps.apiResponse.then().extract().path("MRData.CircuitTable.Circuits.circuitId[0]"));
			
	}
}

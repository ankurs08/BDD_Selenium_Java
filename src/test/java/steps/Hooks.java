package steps;

import java.io.IOException;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.WebUtils;

public class Hooks {
	WebUtils webUtils = new WebUtils();
	
@Before
public void beforeFunction() throws IOException {
	webUtils.initiateDriver();
}

@After
public void afterFunction() {
	System.out.println("tear down function");
	webUtils.tearDown();
}
}

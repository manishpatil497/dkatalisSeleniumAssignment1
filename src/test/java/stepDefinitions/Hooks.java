package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.After;

public class Hooks {
	
	TestContext testContext;
	
	public Hooks(TestContext context) {
		testContext = context;
	}
	

	@After(order = 0)
	public void AfterSteps() {
		testContext.getWebDriverManager().quitDriver();
	}

}
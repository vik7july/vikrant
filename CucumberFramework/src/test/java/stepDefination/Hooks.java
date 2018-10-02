package stepDefination;

import cucumber.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;

//@Before hook is executed before any scenario  
//@After hook is executed after scenario
public class Hooks {

	TestContext testContext;

	public Hooks(TestContext context) {
		testContext = context;
	}

	@Before
	public void BeforeSteps() {
		/*
		 * What all you can perform here Starting a webdriver Setting up DB connections
		 * Setting up test data Setting up browser cookies Navigating to certain page or
		 * anything before the test
		 */
	}

	@After
	public void AfterSteps() {
		testContext.getWebDriverManager().quitDriver();
	}
//Even if testcase fails after hooks is executed
}

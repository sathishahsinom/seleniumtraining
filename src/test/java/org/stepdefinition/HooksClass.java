package org.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {
	
	@Before
	private void preCondition() {
		launchBrowser();
		windowMaximize();
		

	}
	@After
	private void postCondition() {
		closeEntireBrowser();

	}

}

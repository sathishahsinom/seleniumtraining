package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends BaseClass {
	@Given("User has to launch the browser and mazimise the window")
	public void user_has_to_launch_the_browser_and_mazimise_the_window() {
		launchBrowser();
		windowMaximize();
	    
	}

	@When("User has to hit the facebook url")
	public void user_has_to_hit_the_facebook_url() {
		launchUrl("https://en-gb.facebook.com/");
	   
	}

	@When("User has to pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys(em);
	   
	}

	@When("User has to pass the data {string} in password field")
	public void user_has_to_pass_the_data_in_password_field(String pass) {
		WebElement passWrd = driver.findElement(By.name("pass"));
		passWrd.sendKeys(pass);
	    
	}

	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() {
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();
	    
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
		closeEntireBrowser();
	    
	}

}

package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveandNegativeofFb extends BaseClass {
	@Given("To launch the chromebrowser and maximise the window")
	public void to_launch_the_chromebrowser_and_maximise_the_window() {
		launchBrowser();
		windowMaximize();
	   
	}

	@When("To launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
		launchUrl("https://en-gb.facebook.com/");
	}

	@When("To pass the valid username in email field")
	public void to_pass_the_valid_username_in_email_field(String em) {
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys(em);
	    
	}

	@When("To pass the invalid password in password field")
	public void to_pass_the_invalid_password_in_password_field(String pass) {
		WebElement passWrd = driver.findElement(By.name("pass"));
		passWrd.sendKeys(pass);
	
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();
	   
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	  
	}

}

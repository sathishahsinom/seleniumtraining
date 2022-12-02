package org.stepdefinition;

import io.cucumber.datatable.*;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class FbRegistration extends BaseClass {
	@Given("To launch the browser and mazimise the window")
	public void to_launch_the_browser_and_mazimise_the_window() {
		launchBrowser();
		windowMaximize();
	   
	}

	@When("To launch the url of fb application")
	public void to_launch_the_url_of_fb_application() {
		launchUrl("https://en-gb.facebook.com/");
	    
	}

	@When("To click the new account creation button")
	public void to_click_the_new_account_creation_button() {
		WebElement crtNewAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
        crtNewAcc.click();
	}

	@When("To pass the firstname in firstname textbox")
	public void to_pass_the_firstname_in_firstname_textbox(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		
		Map<Object, Object> m = d.asMap(String.class, String.class);
		WebElement firstBox = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	   firstBox.sendKeys((CharSequence[]) m.get("firstname3"));
	}

	@When("To pass the lastname in lastname textbox")
	public void to_pass_the_lastname_in_lastname_textbox() {
		WebElement lastBox = driver.findElement(By.name("lastname"));
	     lastBox.sendKeys("kumar");
	}

	@When("To pass the mobileno or email in email textbox")
	public void to_pass_the_mobileno_or_email_in_email_textbox(DataTable d) {
		List<Map<String, String>> m = d.asMaps();
		WebElement mailOrNo = driver.findElement(By.name("reg_email__"));
	   mailOrNo.sendKeys(m.get(1).get("password1"));
	}

	@When("To create new password using new password textbox")
	public void to_create_new_password_using_new_password_textbox() {
	   WebElement newPass = driver.findElement(By.name("reg_passwd__"));
	   newPass.sendKeys("dondondon");
	}

}

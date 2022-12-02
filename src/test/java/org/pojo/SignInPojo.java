package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.BaseClass;

public class SignInPojo extends BaseClass {
	
	public SignInPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Create New Account']")
	private WebElement createNewAcc;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement firstNameBox;
	
	@FindBy(name = "lastname")
	private WebElement lastNameBox;
	
	@FindBy(name = "reg_email__")
	private WebElement emailOrNo;
	
	@FindBy(name = "reg_passwd__")
	private WebElement newPass;

}

package com.auto.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.auto.qa.constant.GenericConstant;


public class AuthenticationPage {
	
	@FindBy(how = How.XPATH, using = "//button[@id='SubmitCreate']")
	WebElement creatAccountBtn;
	@FindBy(how = How.XPATH, using = "//input[@id='email_create']")
	WebElement newEmail;

	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement existingEmail;
	@FindBy(how = How.XPATH, using = "//input[@id='passwd']")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[@id='SubmitLogin']")
	WebElement signInButton;

	@FindBy(how = How.XPATH, using = "//div[@id = 'create_account_error']")
	WebElement errorMessage;

	
	public void createAccount() {
			creatAccountBtn.click();	
	}

	
	public void enterEmail() {
		newEmail.sendKeys(GenericConstant.EMAIL);
	}

	
	public void existingEmail() {
		existingEmail.sendKeys(GenericConstant.EMAIL);
	}

	
	public void password() {
		password.sendKeys(GenericConstant.PASSWORD);
	}

	
	public void submitAccount() {
		signInButton.click();
	}

	
}

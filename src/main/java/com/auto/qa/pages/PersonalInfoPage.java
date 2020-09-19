package com.auto.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.auto.qa.constant.GenericConstant;


public class PersonalInfoPage {

	
	@FindBy(how = How.XPATH, using = "//input[@id = 'id_gender1']")
	WebElement titleRadio;
	@FindBy(how = How.XPATH, using = "//input[@id = 'customer_firstname']")
	WebElement firstName;
	@FindBy(how = How.XPATH, using = "//input[@id = 'customer_lastname']")
	WebElement lastName;
	@FindBy(how = How.XPATH, using = "//input[@id = 'email']")
	WebElement email;
	@FindBy(how = How.XPATH, using = "//input[@id = 'passwd']")
	WebElement password;

	@FindBy(how = How.XPATH, using = "//input[@id = 'address1']")
	WebElement address;
	@FindBy(how = How.XPATH, using = "//input[@id = 'city']")
	WebElement city;
	@FindBy(how = How.XPATH, using = "//select[@id = 'id_state']")
	WebElement state;
	@FindBy(how = How.XPATH, using = "//input[@id = 'postcode']")
	WebElement zipcode;
	@FindBy(how = How.XPATH, using = "//select[@id = 'id_country']")
	WebElement country;
	@FindBy(how = How.XPATH, using = "//input[@id = 'phone_mobile']")
	WebElement phoneMobile;
	@FindBy(how = How.XPATH, using = "//button[@id = 'submitAccount']")
	WebElement registerButton;

	public void clickTitle() {
		titleRadio.click();
	}

	public void firstName() {
		firstName.sendKeys(GenericConstant.FIRST_NAME);
	}

	
	public void lastName() {
		lastName.sendKeys(GenericConstant.LAST_NAME);
	}

	
	public void password() {
		password.sendKeys(GenericConstant.PASSWORD);
	}

	
	public void address() {
		address.sendKeys(GenericConstant.ADDRESS);
	}

	public void city() {
		city.sendKeys(GenericConstant.CITY);
	}

	
	public void state() {
		Select type = new Select(state);
		type.selectByVisibleText("Alabama");

	}


	public void zip() {
		zipcode.sendKeys(GenericConstant.Zinpcode);
	}


	public void country() {
		Select type = new Select(country);
		type.selectByVisibleText("United States");

	}

	

	public void mobileNo() {
		phoneMobile.sendKeys(GenericConstant.MOBILE_NO);
	}

	
	public void register() {
		registerButton.click();
	}
}

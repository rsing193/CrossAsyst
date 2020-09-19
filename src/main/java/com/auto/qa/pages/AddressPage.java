package com.auto.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AddressPage {

	
	@FindBy(how = How.XPATH, using = "//button[@name= 'processAddress']")
	WebElement checkout;

	public void chkBtn() {
		checkout.click();
	}
}

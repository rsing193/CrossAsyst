package com.auto.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShippingPage {
	
	@FindBy(how= How.XPATH, using ="//input[@name= 'cgv']") WebElement acceptCheckbox;
	@FindBy(how= How.XPATH, using ="//button[@name= 'processCarrier']") WebElement submitBtn;
	
	
	
	public void chkBtn() {
		submitBtn.click();	
	}
	
	
	public void checkTermOfService() {
		acceptCheckbox.click();	
	}

}

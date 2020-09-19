package com.auto.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class PaymentPage {
	

	@FindBy(how = How.XPATH, using = "//a[@title= 'Pay by bank wire']")
	WebElement payWireBtn;
	@FindBy(how = How.XPATH, using = "//button[@type= 'submit' and @class ='button btn btn-default button-medium']")
	WebElement submitBtn;
	@FindBy(how = How.XPATH, using = "//strong[text() = 'Your order on My Store is complete.']")
	WebElement confirmationText;

	
	public void paymentviaPayWire() {
		payWireBtn.click();
	}

	
	public void confirmationText() {
		confirmationText.getText();
	}

	
	public void OrderCorfirm() {
		submitBtn.click();
	}

}

package com.auto.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ProductCheckoutPopup {
	
	@FindBy(how= How.XPATH, using ="//a[@title= 'Proceed to checkout']") WebElement checkout;
	
	
	
	public void checkoutButton() {
		checkout.click();
	}

}

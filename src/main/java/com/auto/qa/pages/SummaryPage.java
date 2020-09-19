package com.auto.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SummaryPage {
	
	

	@FindBy(how= How.XPATH, using ="//span[text()= 'Proceed to checkout']") WebElement checkout;
	
	
	public void chkBtn() {
		checkout.click();	
	}
}

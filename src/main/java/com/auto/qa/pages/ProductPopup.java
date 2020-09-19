package com.auto.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPopup {
	
	@FindBy(how= How.XPATH, using ="//i[@class= 'icon-plus']") WebElement plusIcon;
	@FindBy(how= How.XPATH, using ="//input[@name='qty']") WebElement quantityText;
	@FindBy(how= How.XPATH, using ="//button[@name= 'Submit']") WebElement addToCart;
	
	
	
	public void qtyAdd() {
		plusIcon.click();
	}

	
	public void submitButton() {
		addToCart.click();
	}

	
}

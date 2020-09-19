package com.auto.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	
	@FindBy(how = How.XPATH, using = "//a[@title= 'Log in to your customer account']")
	WebElement signIn;
	@FindBy(how = How.XPATH, using = "//a[@title= 'Log me out']")
	WebElement signOut;
	@FindBy(how = How.XPATH, using = "//a[@title= 'Women']")
	WebElement womenSection;
	@FindBy(how = How.XPATH, using = "//img[@alt= 'Blouse']")
	WebElement quickView;

	@FindBy(how = How.XPATH, using = "//a[@title= 'Orders']")
	WebElement orderHistory;
	@FindBy(how = How.XPATH, using = "//a[@title= 'View my customer account']")
	WebElement userLink;

	
	public void clickSignIn() {
		signIn.click();
	}

	public void womenSection() {
		womenSection.click();
	}

	public void clickSignOut() {
		signOut.click();
	}

	
	public void itemSelection() {
		quickView.click();
	}

	
	public void clickUserAccount() {
		userLink.click();
	}

	
	public void clickOrderHistory() {
		orderHistory.click();
	}
}

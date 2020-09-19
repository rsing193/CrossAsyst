package com.auto.qa.pageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.auto.qa.base.BaseTest;
import com.auto.qa.pages.AddressPage;
import com.auto.qa.pages.AuthenticationPage;
import com.auto.qa.pages.HomePage;
import com.auto.qa.pages.MyAccountPage;
import com.auto.qa.pages.PaymentPage;
import com.auto.qa.pages.ProductCheckoutPopup;
import com.auto.qa.pages.ProductPopup;
import com.auto.qa.pages.ShippingPage;
import com.auto.qa.pages.SummaryPage;

public class HomePageTest extends BaseTest {

	
	@Test
	public void AccountSign() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		AuthenticationPage authenticationPage = PageFactory.initElements(driver, AuthenticationPage.class);
		homePage.clickSignIn();
		authenticationPage.existingEmail();
		authenticationPage.password();
		authenticationPage.submitAccount();
	}
	
	
	@Test
	public void addApparels() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		ProductPopup productPop = PageFactory.initElements(driver, ProductPopup.class);
		ProductCheckoutPopup chkPop = PageFactory.initElements(driver, ProductCheckoutPopup.class);
		SummaryPage smry = PageFactory.initElements(driver, SummaryPage.class);
		AddressPage addrs = PageFactory.initElements(driver, AddressPage.class);
		ShippingPage shpg = PageFactory.initElements(driver, ShippingPage.class);
		PaymentPage payPage = PageFactory.initElements(driver, PaymentPage.class);

		homePage.womenSection();
		homePage.itemSelection();
		 WebElement abc = driver.findElement(By.className("fancybox-iframe"));
		driver.switchTo().frame(abc);
		productPop.qtyAdd();
		productPop.submitButton();
		driver.switchTo().parentFrame();
		chkPop.checkoutButton();
		smry.chkBtn();
		addrs.chkBtn();
		shpg.checkTermOfService();
		shpg.chkBtn();
		payPage.paymentviaPayWire();
		payPage.OrderCorfirm();
		
			  
	  }
	 
	
	
	@Test
	public void getOrderHistory() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		MyAccountPage myAccount = PageFactory.initElements(driver, MyAccountPage.class);
		homePage.clickUserAccount();
		homePage.clickOrderHistory();
		myAccount.getOrderAmount();
	}
	 
}

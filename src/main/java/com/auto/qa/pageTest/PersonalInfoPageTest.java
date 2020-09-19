package com.auto.qa.pageTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.auto.qa.base.BaseTest;
import com.auto.qa.pages.AuthenticationPage;
import com.auto.qa.pages.HomePage;
import com.auto.qa.pages.PersonalInfoPage;


public class PersonalInfoPageTest extends BaseTest {

	
	@Test
	public void CreateAccount() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		PersonalInfoPage personalInfo = PageFactory.initElements(driver, PersonalInfoPage.class);
		AuthenticationPage authenticationPage = PageFactory.initElements(driver, AuthenticationPage.class);
		homePage.clickSignIn();
		authenticationPage.enterEmail();
		authenticationPage.createAccount();
		personalInfo.clickTitle();
		personalInfo.firstName();
		personalInfo.lastName();
		personalInfo.password();
		personalInfo.address();
		personalInfo.city();
		personalInfo.state();
		personalInfo.zip();
		personalInfo.country();
		personalInfo.mobileNo();
		personalInfo.register();
		homePage.clickSignOut();
		
	}
}

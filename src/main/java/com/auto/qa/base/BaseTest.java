package com.auto.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseTest {
	public static WebDriver driver = null;

	
	@BeforeSuite
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "src/main/java/com/auto/qa/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	
	  @AfterSuite public void closeBrowser() {
	  
	  driver.quit(); }
	 
		 
}

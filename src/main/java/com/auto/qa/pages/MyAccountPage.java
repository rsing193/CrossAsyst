package com.auto.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.auto.qa.constant.GenericConstant;


public class MyAccountPage {
	
	@FindBy(how = How.XPATH, using = "//a[@title= 'Orders']")
	WebElement orderHistory;
	@FindBy(how = How.XPATH, using = "//*[@id=\"order-list\"]/tbody/tr[1]/td[3]")
	WebElement historyPrice;
	@FindBy(how = How.XPATH, using = "//p[text()='You have not placed any orders.']")
	WebElement noOrder;

	@FindBy(how = How.XPATH, using = "//table[@id='order-list']")
	WebElement table;

	
	public void getOrderAmount() {

		try {
			WebElement body = table.findElement(By.tagName("tbody"));
			List<WebElement> allRows = body.findElements(By.tagName("tr"));
			int totalRow = allRows.size();
			Assert.assertEquals(totalRow, 1);
			if (totalRow > 0) {
				Assert.assertEquals(historyPrice.getText(), GenericConstant.TOTAL_AMOUNT);
			}
		} catch (NoSuchElementException e) {
			String expected = "You have not placed any orders.";

			Assert.assertEquals(noOrder.getText(), expected);
		}

	}

}

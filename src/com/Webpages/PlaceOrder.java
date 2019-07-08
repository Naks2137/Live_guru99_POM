package com.Webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Config.Config;

public class PlaceOrder {

	@FindBy(how=How.XPATH,using="//button[@title='Place Order']")
	WebElement order;
	
	
	public void loadPage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	public void clickOnPlaceOrder() throws InterruptedException
	{
		Thread.sleep(2000);
		order.click();
	}
	
}

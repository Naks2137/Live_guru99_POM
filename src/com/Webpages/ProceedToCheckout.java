package com.Webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Config.Config;

public class ProceedToCheckout {

	@FindBy(how=How.XPATH,using="//button[@title='Proceed to Checkout']")
	WebElement proceed;
	
	
	public void loadPage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	public void clickOnProceedToCheckout()
	{
		proceed.click();
	}
}

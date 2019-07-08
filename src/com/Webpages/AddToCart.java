package com.Webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Config.Config;

public class AddToCart {

	@FindBy(how=How.XPATH,using="//button[@title='Add to Cart']")
	WebElement add;
	
	
	public void loadPage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	public void clickOnAddtoCart()
	{
		add.click();
	}
}

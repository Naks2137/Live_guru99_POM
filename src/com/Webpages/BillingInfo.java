package com.Webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Config.Config;

public class BillingInfo {

	@FindBy(how=How.XPATH,using="//button[@title='Continue']")
	WebElement cont;
	@FindBy(how=How.XPATH,using="//button[@onclick='shippingMethod.save()']")
	WebElement cont1;
	@FindBy(how=How.XPATH,using="//input[@title='Check / Money order']")
	WebElement radio;
	@FindBy(how=How.XPATH,using="//button[@onclick='payment.save()']")
	WebElement cont2;
	
	
	public void loadPage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	public void clickOnContinue()
	{
		cont.click();
	}
	public void clickOnContinue1() throws InterruptedException
	{
		Thread.sleep(2000);
		cont1.click();
	}
	public void clickOnRadioButton() throws InterruptedException
	{
		Thread.sleep(2000);
		radio.click();
	}
	public void clickOnContinue2() throws InterruptedException
	{
		Thread.sleep(2000);
		cont2.click();
	}
}

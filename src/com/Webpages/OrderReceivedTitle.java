package com.Webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Config.Config;
import com.Utility.LaunchApp;

public class OrderReceivedTitle {

	@FindBy(how=How.XPATH,using="//div[@class='page-title']")
	WebElement title;
	
	
	public void loadPage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	public void verifyTitle() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertTrue(title.isDisplayed());
		System.out.println("Order placed successfully");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		LaunchApp la=new LaunchApp();
		la.openBrowser("G:\\Software\\Selenium\\chromedriver_74\\chromedriver_win32\\chromedriver.exe   ");
		la.enterUrl("http://live.guru99.com/index.php/");
		la.maximizeBrowser();
		
		Signup s=new Signup();
		s.loadPage();
		s.clickOnAcc();
		s.clickOnLogin();
		s.enterMailId("nagesh.raut1993@gmail.com");
		s.enterPasswd("Naks2137");
		s.clickOnSubmit();
		s.clickOnMobile();
		
		AddToCart a=new AddToCart();
		a.loadPage();
		a.clickOnAddtoCart();
		
		ProceedToCheckout p=new ProceedToCheckout();
		p.loadPage();
		p.clickOnProceedToCheckout();
		
		BillingInfo b=new BillingInfo();
		b.loadPage();
		b.clickOnContinue();
		b.clickOnContinue1();
		b.clickOnRadioButton();
		b.clickOnContinue2();
		
		PlaceOrder po=new PlaceOrder();
		po.loadPage();
		po.clickOnPlaceOrder();
		
		OrderReceivedTitle o=new OrderReceivedTitle();
		o.loadPage();
		o.verifyTitle();
	}
}

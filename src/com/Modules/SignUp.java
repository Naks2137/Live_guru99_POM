package com.Modules;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Utility.LaunchApp;
import com.Webpages.AddToCart;
import com.Webpages.BillingInfo;
import com.Webpages.OrderReceivedTitle;
import com.Webpages.PlaceOrder;
import com.Webpages.ProceedToCheckout;
import com.Webpages.Signup;

public class SignUp {

	@Parameters({"path","url"})
	@Test(priority=1)
	public void executeBrowser(String path,String url)
	{
		LaunchApp la=new LaunchApp();
		la.openBrowser(path);
		la.enterUrl(url);
		la.maximizeBrowser();
		
	}
	@Parameters({"email","passwd"})
	@Test(priority=2)
	public void verifyOrderPlace(String email,String passwd) throws InterruptedException
	{
		Signup s=new Signup();
		s.loadPage();
		s.clickOnAcc();
		s.clickOnLogin();
		s.enterMailId(email);
		s.enterPasswd(passwd);
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

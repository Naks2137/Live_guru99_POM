package com.Webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import com.Config.Config;
import com.Utility.LaunchApp;

public class Signup {

	@FindBy(how=How.XPATH,using="//a[@class='skip-link skip-account']")
	WebElement account;
	@FindBy(how=How.XPATH,using="//a[@title='Log In']")
	WebElement login;
	@FindBy(how=How.NAME,using="login[username]")
	WebElement email;
	@FindBy(how=How.NAME,using="login[password]")
	WebElement passwd;
	@FindBy(how=How.NAME,using="send")
	WebElement submit;
	@FindBy(how=How.CSS,using="a[class='level0 ']")
	WebElement mobile;
	
	
	
	public void loadPage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	public void clickOnAcc()
	{
		account.click();
	}
	public void clickOnLogin() throws InterruptedException
	{
		Thread.sleep(2000);
		login.click();
	}
	public void enterMailId(String mail) throws InterruptedException
	{
		Thread.sleep(2000);
		email.sendKeys(mail);
	}
	public void enterPasswd(String pw)
	{
		passwd.sendKeys(pw);
	}
	public void clickOnSubmit()
	{
		submit.click();
	}
	
	public void clickOnMobile()
	{
		mobile.click();
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
		
	}
}
